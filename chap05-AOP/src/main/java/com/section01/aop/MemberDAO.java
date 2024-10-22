package com.section01.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Repository
public class MemberDAO {
    private final Map<Integer,MemberDTO> memberMap;

    public MemberDAO(){
        memberMap = new HashMap<>();
        memberMap.put(1,new MemberDTO(1,"용용"));
        memberMap.put(2,new MemberDTO(2,"왕왕"));
    }
    public Map<Integer,MemberDTO> selectMembers(){
        return memberMap;
    }
    public  MemberDTO selectMember(int id){
        MemberDTO returnMember = memberMap.get(id);
        if(Objects.isNull(returnMember)){
            throw new RuntimeException("해당 id를 가진 회원은 없음");
        }
        return returnMember;
    }
}
