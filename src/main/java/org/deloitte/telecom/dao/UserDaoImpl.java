package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.MobileUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements IUserDao {

    private Map<String,MobileUser>store=new HashMap<>();

    public UserDaoImpl(){
        store.put("7654",new MobileUser("7654","ha12","Haritha", 876));
        store.put("5432",new MobileUser("5432","pr12", "pranav",765));

    }

    @Override
    public boolean credentialsCorrect(String mobileno ,String password){
        MobileUser user=store.get(mobileno);
        if(user==null){
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public MobileUser findUserByMobileNo(String mobileno){
        MobileUser user=store.get(mobileno);
        return user;
    }
}
