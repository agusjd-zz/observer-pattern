package com.observpattern.observerpattern.domain;

public class UserConfig {

    private String rol;

    private String email;

    private String phone;

    public UserConfig() {
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }
}
