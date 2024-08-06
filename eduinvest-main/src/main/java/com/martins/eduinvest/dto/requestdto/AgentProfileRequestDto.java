package com.martins.eduinvest.dto.requestdto;

import com.martins.eduinvest.enums.IdentificationType;
import jakarta.validation.constraints.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class AgentProfileRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    @NotNull
    @Size(min = 5, max = 400, message = "The address should be between 5 and 400 characters.")
    private String address;

    @NotNull
    @Size(max = 20, message = "Location details cannot exceed 20 characters.")
    private String location; // Location details

    @NotNull(message = "Date of birth must be provided")
    @Past(message = "Date of birth must be in the past")
    private Date dob;

    @NotNull(message = "NIN Number must be provided")
    @Pattern(regexp = "^[A-Za-z0-9]{6,15}$", message = "NIN Number must be between 6 and 15 alphanumeric characters.")
    private String ninNumber;

    @NotNull(message = "Bank name must be provided")
    @Size(max = 50, message = "Bank name cannot exceed 50 characters.")
    private String bankName;

    @NotNull(message = "Account number must be provided")
    @Pattern(regexp = "^[0-9]{10,12}$", message = "Account number must be between 10 and 12 numeric characters.")
    private String accountNumber;

    @NotNull(message = "Identification type must be provided")
    private IdentificationType identificationType;

    @NotNull(message = "Media file must be provided")
    @Size(max = 5 * 1024 * 1024, message = "File size must not exceed 5MB")
    private MultipartFile idUpload; // Adjust max size as necessary

}
