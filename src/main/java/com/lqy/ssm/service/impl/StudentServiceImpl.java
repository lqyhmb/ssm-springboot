package com.lqy.ssm.service.impl;

import com.lqy.ssm.dao.StudentDao;
import com.lqy.ssm.entity.Student;
import com.lqy.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rodriguez
 * 2018/6/25 16:09
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public Student findById(Integer id) {
        return studentDao.findById(id);
    }
}
