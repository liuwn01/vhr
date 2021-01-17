package org.spt.firstmybatissinglesource.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.spt.firstmybatissinglesource.Entity.Fortest;
import org.spt.firstmybatissinglesource.Mapper.FortestMapper;

@Service
public class FortestService {
    @Autowired
    FortestMapper fortestMapper;

    public Fortest insertft(String name){
        Fortest ft = new Fortest();
        ft.setName(name);
        fortestMapper.insert(ft);
        return ft;
    }
}
