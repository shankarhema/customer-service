package hema.service.customerService.controller;


import hema.service.customerService.dtos.CustomerDto;
import hema.service.customerService.dtos.GenreUpdate;
import hema.service.customerService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustmerController {

    @Autowired
    CustomerService service;

    @GetMapping({"/{id}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable Integer id) throws Throwable {
        return ResponseEntity.ok(service.getCustomer(id));
    }

    @PatchMapping("/{id}/genre")
    public ResponseEntity<Void> updateGenre(@PathVariable Integer id, @RequestBody GenreUpdate request) {
        service.updateCustomerGenre(id, request);
        return ResponseEntity.noContent().build();
    }


}
