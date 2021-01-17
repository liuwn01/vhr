package org.spt.firstmybatismultisource.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.spt.firstmybatismultisource.Entity.test.T1;
import org.spt.firstmybatismultisource.Entity.vhr.Fortest;
import org.spt.firstmybatismultisource.Mapper.test.T1Mapper;
import org.spt.firstmybatismultisource.Mapper.vhr.FortestMapper;

import java.util.List;

@Service
public class HandleService {

    @Autowired
    FortestMapper fortestMapper;

    @Autowired
    T1Mapper t1Mapper;

    public List<Fortest> getallft(){
        return fortestMapper.selectAll();
    }

    public List<T1> getallt1(){
        return t1Mapper.selectAll();
    }
}
