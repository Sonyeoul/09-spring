package com.section02.annotation.subsection01.primary;

import com.section02.common.Poketmon;
import org.springframework.stereotype.Service;

@Service("poketmonServicePrimary")
public class PoketmainService {
    
    private Poketmon poketmon;

    public PoketmainService(Poketmon poketmon) {

    }


    public void poketmonAttack() {
    }
}
