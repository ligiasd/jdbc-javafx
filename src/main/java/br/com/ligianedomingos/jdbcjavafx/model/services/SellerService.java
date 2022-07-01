package br.com.ligianedomingos.jdbcjavafx.model.services;

import br.com.ligianedomingos.jdbcjavafx.Seller;
import br.com.ligianedomingos.jdbcjavafx.model.dao.DaoFactory;
import br.com.ligianedomingos.jdbcjavafx.model.dao.SellerDao;

import java.util.List;

public class SellerService {
    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {

        return dao.findAll();
    }

    public void saveOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }

    public void remove(Seller obj) {
        dao.deleteById(obj.getId());
    }
}
