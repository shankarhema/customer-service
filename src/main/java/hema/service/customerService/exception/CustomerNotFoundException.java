package hema.service.customerService.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;


public class CustomerNotFoundException extends Exception{


    private static   final String MESSAGE="Customer id=%d not found";

    public CustomerNotFoundException(Integer id) {
        super(MESSAGE.formatted(id));
    }


}
