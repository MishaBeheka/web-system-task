package web.system.task.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import web.system.task.dao.SolutionDao;
import web.system.task.model.SolutionModel;
import web.system.task.util.HibernateUtil;

@Repository
public class SolutionDaoImpl implements SolutionDao {

    @Override
    public SolutionModel create(SolutionModel solutionModel) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Long rowId = (Long) session.save(solutionModel);
            transaction.commit();
            solutionModel.setId(rowId);
            return solutionModel;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert a solution ", e);
        }
    }
}
