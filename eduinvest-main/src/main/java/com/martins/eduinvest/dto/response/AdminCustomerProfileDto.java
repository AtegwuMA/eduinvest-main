package com.martins.eduinvest.dto.response;

import com.martins.eduinvest.enums.IdentificationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminCustomerProfileDto {

    private Date signupDate;
    private Integer idNumber;
    private String emailAddress;
    private String customerName;
    private String DOB;
    private String countryOfOrigin;
    private String mobileNumber;
    private String streetNameAndNumber;
    private String city;
    private String state;
    private String bankName;
    private String accountNumber;
    private String accountName;
    private boolean verificationStatus;
    private boolean enable2FA;
    private IdentificationType identificationType;

}
