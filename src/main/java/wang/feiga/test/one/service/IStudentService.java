package wang.feiga.test.one.service;

import wang.feiga.test.one.entity.Student;
/**
 * 内容概要：Student 接口
 * 作者：姜 昊
 * 版本号： v1.0
 * 完成时间： 2018年1月12日  上午9:55:14
 */
public interface IStudentService {
	/**
	 * 根据id查找
	 * @param id
	 * @return	Student
	 */
	Student selectStudentById(int id);

	
}
