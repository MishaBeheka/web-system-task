package web.system.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.system.task.dto.SolutionModelRequestDto;
import web.system.task.dto.SolutionModelResponseDto;
import web.system.task.model.SolutionModel;
import web.system.task.service.SolutionService;

@Controller
public class SolutionController {

    @Autowired
    private SolutionService solutionService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createSolution(SolutionModelRequestDto requestDto, Model model) {
        if (requestDto.getA() == 0) {
            return "errorFirstValueZero";
        }

        SolutionModel solutionModel = solutionService.create(parseToSolutionModel(requestDto));
        SolutionModelResponseDto responseDto = parseToResponseDto(solutionModel);
        if (responseDto.getD() < 0) {
            return "notFoundSolution";
        }

        model.addAttribute("resp", responseDto);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showResultSolution() {
        return "showResult";
    }

    private SolutionModelResponseDto parseToResponseDto(SolutionModel solutionModel) {
        SolutionModelResponseDto responseDto = new SolutionModelResponseDto();
        responseDto.setA(solutionModel.getA());
        responseDto.setB(solutionModel.getB());
        responseDto.setC(solutionModel.getC());
        responseDto.setD(solutionModel.getDiscriminant());
        responseDto.setX1(solutionModel.getX1());
        responseDto.setX2(solutionModel.getX2());
        return responseDto;
    }

    private SolutionModel parseToSolutionModel(SolutionModelRequestDto requestDto) {
        SolutionModel solutionModel = new SolutionModel();
        solutionModel.setA(requestDto.getA());
        solutionModel.setB(requestDto.getB());
        solutionModel.setC(requestDto.getC());
        return solutionModel;
    }
}
