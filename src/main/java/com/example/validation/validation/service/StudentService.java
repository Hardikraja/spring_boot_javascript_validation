package com.example.validation.validation.service;

import com.example.validation.validation.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public List<StudentEntity> getAllStudents();
    public void deleteStudentById(int studentId);

    void saveStudent(StudentEntity theStudentEntity);


    StudentEntity findStudentById(int theId);
}
