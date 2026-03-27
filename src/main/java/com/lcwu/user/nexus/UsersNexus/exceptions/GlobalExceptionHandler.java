package com.lcwu.user.nexus.UsersNexus.exceptions;

import com.lcwu.user.nexus.UsersNexus.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex){
       String errorMessage = ex.getMessage();
      /* ApiResponse apiResponse = new ApiResponse();
       apiResponse.setMessage(errorMessage);
       apiResponse.setSuccess(false);
       apiResponse.setHttpStatus(HttpStatus.NOT_FOUND);
       return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);*/
       ApiResponse apiResponse = ApiResponse.builder().message(errorMessage).isSuccess(false).httpStatus(HttpStatus.NOT_FOUND).build();
       return  new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
    }
}
