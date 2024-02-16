package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.dto.StudentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO extends SuperBO {
        //boolean deleteCustomer(String customerId) throws SQLException;
        boolean saveStudent(StudentDTO dto) throws SQLException;
        //boolean updateCustomer(CustomerDTO customerDTO) throws SQLException;
        //CustomerDTO searchCustomer(String customerId) throws SQLException;

        //ArrayList<StudentDTO> getAllCustomer() throws SQLException;

}
