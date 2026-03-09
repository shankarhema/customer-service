package hema.service.customerService.client;


import hema.service.customerService.dtos.Genre;
import hema.service.customerService.dtos.MovieDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class MovieClient {

    private static final Logger log = LoggerFactory.getLogger(MovieClient.class);


    @Autowired
    private RestClient restClient;

    public List<MovieDto> getMovies(Genre genre) {
       var res= restClient.get()
               .uri("/api/movies/{genre}", genre)
               .retrieve()
               .body(new ParameterizedTypeReference<List<MovieDto>>() {
               });
       log.info("res {}",res);
       return  res;
    }


}

