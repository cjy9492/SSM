package ssm.dao;

/**
 * Created by chenjy on 2017-12-11.
 */

import ssm.model.user;
public interface  userdao {
    user selectUser(Long id);
}
