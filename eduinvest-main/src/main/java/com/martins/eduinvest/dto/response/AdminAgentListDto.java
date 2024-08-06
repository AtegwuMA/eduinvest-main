package com.martins.eduinvest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminAgentListDto {

    private Integer totalAgents;
    private Integer activeAgents;
    private Integer pendingAgents;
    private Integer blockedAgents;
    private Integer totalList;
    private String firstname;
    private String lastname;
    private String email;
    private String location;
    private String phoneNumber;
    private boolean status;

}