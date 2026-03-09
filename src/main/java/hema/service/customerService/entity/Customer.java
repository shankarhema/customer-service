package hema.service.customerService.entity;

import hema.service.customerService.dtos.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Customer {
    @Id
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Genre favoriteGenre;

}
