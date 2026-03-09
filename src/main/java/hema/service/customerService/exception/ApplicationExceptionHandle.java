package hema.service.customerService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandle {

    @ExceptionHandler(CustomerNotFoundException.class)
private ProblemDetail HandleException(CustomerNotFoundException customerNotFoundException){
 var problem=ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND,customerNotFoundException.getMessage());
return  problem;
}


}
