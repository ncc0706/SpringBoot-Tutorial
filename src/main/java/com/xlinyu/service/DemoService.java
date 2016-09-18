package com.xlinyu.service;

import com.xlinyu.dao.DemoRepository;
import com.xlinyu.domain.Demo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gavin on 18/09/2016.
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;

    @Transactional
    public void save(Demo demo){
        demoRepository.save(demo);
    }

    @RequestMapping("/demos")
    public List<Demo> demos(){
        List<Demo> all = (List<Demo>)demoRepository.findAll();
        return all;
    }

}
