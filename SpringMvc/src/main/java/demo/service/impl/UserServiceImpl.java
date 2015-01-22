package demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.entity.User;
import demo.mapper.UserMapper;
import demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource(name = "userMapper")
	UserMapper userMapper;


	public User getUserById( Long id ) {
		return userMapper.selectById(id);
	}

}
