package ssm.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.dao.userdao;
import ssm.model.*;
import ssm.service.TempService;
import ssm.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenjy on 2017-12-11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class test {

    @Autowired
    public TempService bbb;

    @Test
    public void testSelectUser() throws Exception {
        String id = "2017-11-27";
        List<temp> user = bbb.selectTempbyday(id);
        System.out.println(111);
    }



}
