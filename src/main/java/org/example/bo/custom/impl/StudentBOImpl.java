package org.example.bo.custom.impl;

import org.example.bo.custom.StudentBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.StudentDAO;
import org.example.dto.StudentDTO;
import org.example.entity.Student;

import java.sql.SQLException;

public class StudentBOImpl implements StudentBO {
    StudentDAO studentDAO= (StudentDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.STUDENT);
    @Override
    public boolean saveStudent(StudentDTO dto) throws SQLException {
        return studentDAO.save(new Student(dto.getStudentId(),dto.getName(),dto.getAddress()));
    }
}
