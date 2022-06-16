package br.com.ligianedomingos.jdbcjavafx.model.dao;

import br.com.ligianedomingos.jdbcjavafx.model.entities.Department;
import br.com.ligianedomingos.jdbcjavafx.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

    List<Seller> findByDepartment(Department department);
}