package com.common;

public class MemberDTO {
    private int secuence;
    private String id;
    private String name;
    private String pwd;

    public MemberDTO() {
    }

    public MemberDTO(int secuence, String id, String name, String pwd) {
        this.secuence = secuence;
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getSecuence() {
        return secuence;
    }

    public void setSecuence(int secuence) {
        this.secuence = secuence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "secuence=" + secuence +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
