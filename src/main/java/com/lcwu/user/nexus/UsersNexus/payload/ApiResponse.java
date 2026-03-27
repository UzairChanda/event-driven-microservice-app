package com.lcwu.user.nexus.UsersNexus.payload;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {

    private String message;
    private boolean isSuccess;
    private HttpStatus httpStatus;
}
