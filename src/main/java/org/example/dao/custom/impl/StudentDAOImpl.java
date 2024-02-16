package org.example.dao.custom.impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.StudentDAO;
import org.example.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean save(Student entity) throws SQLException {
        return SQLUtil.execute("Insert INTO student(studentId,name,address) VALUES(?,?,?)",
                entity.getStudentId(),entity.getName(),entity.getAddress());
    }

    @Override
    public boolean update(Student entity) throws SQLException {
        return SQLUtil.execute("UPDATE Student SET name=?, address=? WHERE studentId=?",
                entity.getStudentId(),entity.getName(),entity.getAddress());
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return SQLUtil.execute("DELETE FROM Student WHERE studentId=?");
    }

    @Override
    public Student search(String id) throws SQLException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Student where studentId=?",id);
        rst.next();
        return new Student(id+" ", rst.getString("name"), rst.getString("address"));
    }

}
