package cn.itheima.service.impl;

import cn.itheima.mapper.UserMapper;
import cn.itheima.service.UserService;
import cn.itheima.ssm.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.findAll();
        return userList;
    }
}
