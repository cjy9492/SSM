package ssm.service;

import ssm.model.temp;

import java.util.List;

/**
 * Created by chenjy on 2017-12-12.
 */
public interface TempService {
    public temp selectTempbyid(String id);
    public List<temp> selectTempbyday(String day);
}
