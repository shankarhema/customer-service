package hema.service.customerService.dtos;

import lombok.Builder;

import java.util.List;

@Builder
public record CustomerDto(

        Integer id,String name, Genre favoriteGenre,
        List<MovieDto> recomendedMovies
) {
}
