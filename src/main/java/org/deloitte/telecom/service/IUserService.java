package org.deloitte.telecom.service;

import org.deloitte.telecom.entities.MobileUser;

public interface IUserService {
    boolean credentialsCorrect(String mobileno, String password);

    MobileUser findUserByMobileNo(String mobileno);

}
