package cn.zmlio.tinycms2.service.impl;

import cn.zmlio.tinycms2.dao.UserRepository;
import cn.zmlio.tinycms2.entity.User;
import cn.zmlio.tinycms2.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zml on 2017/1/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
