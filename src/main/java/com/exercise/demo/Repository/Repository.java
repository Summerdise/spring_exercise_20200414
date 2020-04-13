package com.exercise.demo.Repository;

import com.exercise.demo.Entities.*;

import java.util.*;

public class Repository {
    private Map<String, Student> nameToStudent;

    public Repository() {
        this.nameToStudent = new HashMap();
    }

    public String addStudent(Student student) {
        if (queryByName(student.getName()) == null) {
            this.nameToStudent.put(student.getName(), student);
            return "添加成功";
        }
        return "姓名重复";
    }

    public List<Student> queryAll() {
        List<Student> students = new ArrayList<>();
        for(String stuName: nameToStudent.keySet()){
            students.add(nameToStudent.get(stuName));
        }
        return students;
    }

    public Student queryByName(String name) {
        return this.nameToStudent.get(name);
    }

    public String deleteByName(String name) {
        if (queryByName(name) == null) {
            return "该学生不存在";
        }
        this.nameToStudent.remove(name);
        return "删除成功";
    }

}
