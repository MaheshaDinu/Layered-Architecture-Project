package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SqlUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImpl();
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {

        return customerDAO.getAll();
    }


    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return customerDAO.add(dto);

    }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return customerDAO.update(dto);

    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {

        return customerDAO.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {

        return customerDAO.generateNewID();
    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {

        return customerDAO.delete(id);

    }


    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {

        return customerDAO.search(id);
    }
}
