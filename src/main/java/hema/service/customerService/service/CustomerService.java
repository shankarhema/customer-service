package hema.service.customerService.service;


import hema.service.customerService.client.MovieClient;
import hema.service.customerService.dtos.CustomerDto;
import hema.service.customerService.dtos.Genre;
import hema.service.customerService.dtos.GenreUpdate;
import hema.service.customerService.entity.Customer;
import hema.service.customerService.exception.CustomerNotFoundException;
import hema.service.customerService.mapper.EntityMapper;
import hema.service.customerService.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final MovieClient movieClient;

    private final CustomerRepo repo;

    public CustomerDto getCustomer(Integer id) throws Throwable {

        Customer customer = (Customer) repo.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));

        Genre genre = customer.getFavoriteGenre();

        var movies = movieClient.getMovies(genre);

        return EntityMapper.toDto(customer, movies);
    }

@SneakyThrows
public void  updateCustomerGenre(Integer id, GenreUpdate req){
    Customer customer = (Customer) repo.findById(id)
            .orElseThrow(() -> new CustomerNotFoundException(id));
    customer.setFavoriteGenre(req.favoriteGenre());
    repo.save(customer);
}
}
