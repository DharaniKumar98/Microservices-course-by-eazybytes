package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(
        name = "Card",
        description = "Schema to hold Card information"
)
public class CardDto {

    @NotEmpty(message = "Mobile number should not be null nor empty")
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number should be 10 digits")
    @Schema(
            description = "Mobile number of the customer",
            example = "1234567890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card number should not be null nor empty")
    @Pattern(regexp="(^$|[0-9]{12})",message = "CardNumber must be 12 digits")
    @Schema(
            description = "Card number of the customer",
            example = "123456789012"
    )
    private String cardNumber;

    @NotEmpty(message = "Card type should not be null nor empty")
    @Schema(
            description = "Card type of the customer",
            example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total card limit should be positive")
    @Schema(
            description = "Total amount limit available against a card",
            example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Total amount used by a Customer",
            example = "10000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Total amount available amount against a card",
            example = "90000"
    )
    private int availableAmount;
}
