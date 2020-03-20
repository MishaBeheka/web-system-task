package web.system.task.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.system.task.dao.SolutionDao;
import web.system.task.model.SolutionModel;
import web.system.task.service.SolutionService;

@Service
public class SolutionServiceImpl implements SolutionService {

    @Autowired
    private SolutionDao solutionDao;

    @Override
    public SolutionModel create(SolutionModel solutionModel) {
        solutionModel.setDiscriminant(findDiscriminant(
                solutionModel.getA(),
                solutionModel.getB(),
                solutionModel.getC()));

        findSolution(solutionModel);
        return solutionDao.create(solutionModel);
    }

    private Double findDiscriminant(Double a, Double b, Double c) {
        return b * b - 4 * a * c;
    }

    private SolutionModel findSolution(SolutionModel solutionModel) {
        Double a = solutionModel.getA();
        Double b = solutionModel.getB();
        Double discriminant = solutionModel.getDiscriminant();
        Double x1 = 0.0;
        Double x2 = 0.0;
        if (discriminant > 0) {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        }
        if (discriminant == 0) {
            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
        }
        solutionModel.setX1(x1);
        solutionModel.setX2(x2);
        return solutionModel;
    }
}
