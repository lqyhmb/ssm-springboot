package com.lqy.ssm.controller;

import com.lqy.ssm.entity.Student;
import com.lqy.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rodriguez
 * 2018/6/25 16:07
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("findById/{id}")
    @ResponseBody
    public Student findById(@PathVariable(value = "id") Integer id) {
        return studentService.findById(id);
    }

}
