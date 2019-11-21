package com.sebookstore.demo.Service.Impl;

import com.sebookstore.demo.Entity.JSUser;
import com.sebookstore.demo.Repository.JSRepository;
import com.sebookstore.demo.Service.JSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JSServiceImpl implements JSService {

    @Autowired
    private JSRepository jsRepository;
    @Override
    public JSUser findByJsName(String jsName)
    {
        return  jsRepository.findByJsName(jsName);
    }
    @Override
    public List<JSUser> findAll(){return  jsRepository.findAll();}
}
