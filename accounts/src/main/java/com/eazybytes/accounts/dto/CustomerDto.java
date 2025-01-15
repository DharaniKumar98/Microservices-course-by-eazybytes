package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer & Account information"
)
public class CustomerDto {

    @Schema(
        description = "Name of the customer",
        example = "John Doe"
    )
    @NotEmpty(message = "Name should not be null nor empty")
    @Size(min = 5, max = 30, message = "Name should be at least 5 characters")
    private String name;

    @Schema(
        description = "Email of the customer",
        example = "0ZBt9@example.com"
    )
    @NotEmpty(message = "Email should not be null nor empty")
    @Email(message = "Email should be valid")
    private String email;


    @Schema(
        description = "Mobile number of the customer",
        example = "1234567890"
    )
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number should be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
