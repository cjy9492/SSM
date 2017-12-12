package ssm.service;

import ssm.model.user;

/**
 * Created by chenjy on 2017-12-11.
 */
public interface  UserService {
    public user selectUser(Long userId);
}
