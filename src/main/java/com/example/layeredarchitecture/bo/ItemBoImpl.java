package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SqlUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBO {
    ItemDAO itemDAO =new ItemDAOImpl();
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    public boolean delete(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(code);

    }

    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException {
        

    }

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {

    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {

    }

    public String generateNewID() throws SQLException, ClassNotFoundException {


    }

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {

    }
}
