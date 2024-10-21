package com.section02.annotation.subsection03;

import com.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("poketmonServiceCollection")
public class PoketmainService {

    @Autowired
    private List<Poketmon> poketminList;

    public void poketmonAttack(){
        for(Poketmon poketmon : poketminList){
            poketmon.attack();
        }
    }

}
