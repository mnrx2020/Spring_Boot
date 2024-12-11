package com.james.example.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository repository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository repository, StudentMapper studentMapper) {
        this.repository = repository;
        this.studentMapper = studentMapper;
    }

    public StudentResponseDto saveStudent(
            StudentDto dto
    ) {
        var student = studentMapper.toStudent(dto);
        var savedStudent =  repository.save(student);
        return studentMapper.studentResponseDto(savedStudent);
    }

    public List<StudentResponseDto> findAllStudents() {

        return repository.findAll()
                .stream()
                .map(studentMapper::studentResponseDto)
                .collect(Collectors.toList());
    }

    public StudentResponseDto findStudentById(Integer id) {
        return repository.findById(id)
                .map(studentMapper::studentResponseDto)
                .orElse(null);

    }

    public List<StudentResponseDto> findStudentsByName(String name) {
        return repository.findAllByFirstnameContaining(name)
                .stream()
                .map(studentMapper::studentResponseDto)
                .collect(Collectors.toList());
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
