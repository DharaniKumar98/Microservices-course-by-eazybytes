package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(description = "API Path of the request")
    private String apiPath;
    @Schema(description = "Status code of the response")
    private HttpStatus errorCode;
    @Schema(description = "Error message of the response")
    private String errorMessage;
    @Schema(description = "Error time of the response")
    private LocalDateTime errorTime;


    public ErrorResponseDto(String apiPath, HttpStatus errorCode, String errorMessage, LocalDateTime errorTime) {
        this.apiPath = apiPath;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }
}
