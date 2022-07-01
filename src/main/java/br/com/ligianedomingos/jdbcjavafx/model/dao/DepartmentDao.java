package br.com.ligianedomingos.jdbcjavafx.model.dao;

import br.com.ligianedomingos.jdbcjavafx.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
