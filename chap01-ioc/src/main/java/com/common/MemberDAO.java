package com.common;

import org.springframework.stereotype.Component;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;

@Component //이 클래스를 빈으로 등록
public class MemberDAO {
    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        this.memberMap = new HashMap<>();

        memberMap.put(1,new MemberDTO(1,"user01","김홍","pass01"));
        memberMap.put(2,new MemberDTO(2,"user02","손흥","pass02"));
    }
    //매개변수로 전달 받은 회원 번호를 map에서 조회 후 회원 정보 리턴 메소드
    public MemberDTO selectMember(int seq) {
        return memberMap.get(seq);
    }
    //매개변수로 전달 받은 회원 정보를 map에 추가하고 성공 실패 여부를
    //boolean 형식으로 리턴하는 메서드

    public boolean insertMember(MemberDTO member) {
        int before = memberMap.size();
        memberMap.put(member.getSecuence(),member);
        return memberMap.size() > before? true : false ;
    }
}
