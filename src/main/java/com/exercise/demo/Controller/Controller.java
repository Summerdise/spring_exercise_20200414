package com.exercise.demo.Controller;

import com.exercise.demo.Entities.*;
import com.exercise.demo.Repository.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/student")
public class Controller {
    private Controller controller;

    @PostMapping("/add")
    public String addStudent(Student student){
        return new Repository().addStudent(student);
    }

    @GetMapping("/get")
    public Student queryByName(@RequestParam String name){
        return new Repository().queryByName(name);
    }

    @GetMapping("/getAll")
    public List<Student> queryAll(){
        return new Repository().queryAll();
    }

    @DeleteMapping("/delete")
    public String deleteByName(String name){
        return new Repository().deleteByName(name);
    }
}
