package com.section02.annotation.subsection02;

import com.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("poketmonServiceQualifier")
public class PoketmainService {
    @Autowired
    @Qualifier("pikachu")
    private Poketmon poketmon;
    
    public PoketmainService(Poketmon poketmon){
        this.poketmon = poketmon;
    }


    public void poketmonAttack() {
        poketmon.attack();
    }
}
