package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.dto.StudentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO extends SuperBO {
        boolean deleteStudent(String studentId) throws SQLException;
        boolean saveStudent(StudentDTO dto) throws SQLException;
        boolean updateStudent(StudentDTO studentDTO) throws SQLException;
        StudentDTO searchStudent(String studentId) throws SQLException;

        //ArrayList<StudentDTO> getAllCustomer() throws SQLException;

}
