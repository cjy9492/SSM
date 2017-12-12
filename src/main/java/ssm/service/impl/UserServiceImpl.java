package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.userdao;
import ssm.model.user;
import ssm.service.UserService;

/**
 * Created by chenjy on 2017-12-12.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private userdao userdao;
    @Override
    public user selectUser(Long userId) {
        return userdao.selectUser(userId);
    }
}
