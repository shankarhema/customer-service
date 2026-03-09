package hema.service.customerService.mapper;

import hema.service.customerService.dtos.CustomerDto;
import hema.service.customerService.dtos.MovieDto;
import hema.service.customerService.entity.Customer;

import java.util.List;

public class EntityMapper {



    public static CustomerDto toDto(Customer customer, List<MovieDto> list){
        return  CustomerDto.builder()
        .id(customer.getId()).name(customer.getName()).favoriteGenre(customer.getFavoriteGenre()).recomendedMovies(list).build();


    }

}
