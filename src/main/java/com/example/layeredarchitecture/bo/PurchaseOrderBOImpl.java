package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SqlUtil;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PurchaseOrderBOImpl implements PurchaeOrderBO{
    OrderDAO orderDAO = new OrderDAOImpl();

    public String generateNewID() throws SQLException, ClassNotFoundException {
       return orderDAO.generateNewID();
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.delete(id);
    }

    @Override
    public OrderDTO search(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.search(id);
    }

    public boolean exist(String orderId) throws SQLException, ClassNotFoundException {

        return orderDAO.exist(orderId);
    }

    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return orderDAO.getAll();
    }

    public boolean add(OrderDTO dto) throws SQLException, ClassNotFoundException {
       return orderDAO.add(dto);
    }

    @Override
    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.update(dto);
    }

}
