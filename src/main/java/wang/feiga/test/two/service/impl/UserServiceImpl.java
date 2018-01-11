package wang.feiga.test.two.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wang.feiga.test.two.dao.IUserDao;
import wang.feiga.test.two.pojo.User;
import wang.feiga.test.two.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private IUserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);

	}

}
