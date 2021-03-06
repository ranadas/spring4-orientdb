package com.hrb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * Created on 08/02/2016.
 */
@Getter
@Setter
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private String phone;
    private Date birthDate;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public boolean isEmailConfigured() {
        return StringUtils.isNotBlank(email);
    }
}
