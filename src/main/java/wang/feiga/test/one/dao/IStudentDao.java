package wang.feiga.test.one.dao;

import wang.feiga.test.one.entity.Student;

/**
 * 内容概要：Student 持久层
 * 作者：姜 昊
 * 版本号： v1.0
 * 完成时间： 2018年1月12日  上午9:59:57
 */
public interface IStudentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}