package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Account details of the customer"
)
public class AccountsDto {

    @Schema(
            description = "Account number of the customer"
    )
    @NotEmpty
    @Pattern(regexp = "^\\d{10}$", message = "AccountNumber should be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of the customer",
            example = "Savings"
    )
    @NotEmpty(message = "Account type should not be null nor empty")
    private String accountType;

    @Schema(
            description = "Branch address of the customer"
    )
    @NotEmpty(message = "Branch address should not be null nor empty")
    private String branchAddress;
}
