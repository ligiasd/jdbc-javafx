package br.com.ligianedomingos.jdbcjavafx.model.services;

import br.com.ligianedomingos.jdbcjavafx.model.dao.DaoFactory;
import br.com.ligianedomingos.jdbcjavafx.model.dao.DepartmentDao;
import br.com.ligianedomingos.jdbcjavafx.Department;

import java.util.List;

public class DepartmentService {
    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {

        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }
}
