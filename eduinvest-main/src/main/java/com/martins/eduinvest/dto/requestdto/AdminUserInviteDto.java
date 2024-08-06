package com.martins.eduinvest.dto.requestdto;

import com.martins.eduinvest.enums.AdminRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserInviteDto {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
    private AdminRole adminRole;
}