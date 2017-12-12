package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.tempDao;
import ssm.model.temp;
import ssm.service.TempService;

import java.util.List;

/**
 * Created by chenjy on 2017-12-12.
 */
@Service
public class TempServiceImpl implements TempService{
    @Autowired
    private tempDao tempdao;
    @Override
    public temp selectTempbyid(String id) {
        return tempdao.selectTempbyid(id);
    }

    @Override
    public List<temp> selectTempbyday(String day) {
        return tempdao.selectTempbyday(day);
    }
}
