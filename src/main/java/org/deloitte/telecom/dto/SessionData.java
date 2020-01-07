package org.deloitte.telecom.dto;

import org.deloitte.telecom.entities.MobileUser;
import org.springframework.stereotype.Component;

public class SessionData {

    private MobileUser user;

    public void setUser(MobileUser user){
        this.user=user;
    }

    public MobileUser getUser(){
        return user;
    }




}
