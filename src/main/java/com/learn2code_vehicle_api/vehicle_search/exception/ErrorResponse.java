package com.learn2code_vehicle_api.vehicle_search.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private HttpStatus httpStatus;
    String message;

}
