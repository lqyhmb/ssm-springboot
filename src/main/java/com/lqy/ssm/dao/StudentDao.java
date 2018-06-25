package com.lqy.ssm.dao;

import com.lqy.ssm.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by Rodriguez
 * 2018/6/25 16:03
 */
@Repository
public interface StudentDao {

    @Select("SELECT * FROM student WHERE id=#{id}")
    Student findById(Integer id);

}
