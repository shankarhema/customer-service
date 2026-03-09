package hema.service.customerService.dtos;


import lombok.Builder;

@Builder
public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
