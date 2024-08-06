package com.martins.eduinvest.dto.requestdto;

import com.martins.eduinvest.enums.IdentificationType;
import lombok.Data;

@Data
public class AdminAgentApprovalDto {
    private Integer referralCount;
    private Integer pointsEarned;
    private Integer idNumber;
    private double conversionRate;
    private double availableBalance;
    private String referralCode;
    private String dob;
    private String countryOfOrigin;
    private String streetNameAndNumber;
    private String city;
    private String state;
    private String bankName;
    private String accountNumber;
    private String accountName;
    private boolean status;
    private boolean enable2FA;
    private IdentificationType identificationType;
}
