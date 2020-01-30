package com.example.validation.validation.service;

import com.example.validation.validation.entity.StudentEntity;
import com.example.validation.validation.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository theStudentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        theStudentRepository=studentRepository;
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return theStudentRepository.findAll();
    }

    @Override
    public void deleteStudentById(int studentId) {
        theStudentRepository.deleteById(studentId);
    }

    @Override
    public void saveStudent(StudentEntity theStudentEntity) {
        theStudentRepository.save(theStudentEntity);
    }

    @Override
    public StudentEntity findStudentById(int theId) {
        return theStudentRepository.findById(theId).get();
    }
}
