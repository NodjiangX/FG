package wang.feiga.test.one.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wang.feiga.test.one.dao.IStudentDao;
import wang.feiga.test.one.entity.Student;
import wang.feiga.test.one.service.IStudentService;

/**
 * 内容概要：Student测试，service层
 * 作者：姜 昊
 * 版本号： v1.0
 * 完成时间： 2018年1月12日  上午9:53:36
 */
@Service("StudentService")
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao studentdao;
	
	@Override
	public Student selectStudentById(int id) {
		
		return this.studentdao.selectByPrimaryKey(id);
	}

}
