package br.com.ligianedomingos.jdbcjavafx.model.dao;

import br.com.ligianedomingos.jdbcjavafx.db.DB;
import br.com.ligianedomingos.jdbcjavafx.model.dao.impl.DepartmentDaoJDBC;
import br.com.ligianedomingos.jdbcjavafx.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
