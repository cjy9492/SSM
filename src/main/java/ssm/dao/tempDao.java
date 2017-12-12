package ssm.dao;

import ssm.model.temp;

import java.util.List;

/**
 * Created by chenjy on 2017-12-12.
 */
public interface tempDao {
    temp selectTempbyid(String id);
    List<temp> selectTempbyday(String day);


}
