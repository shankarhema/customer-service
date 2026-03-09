package hema.service.customerService.config;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Slf4j
@Configuration
public class RestConfiquration {


    @Bean
    public RestClient buildRestClient(@Value("${movie.service.url}") String baseUrl){
        log.info("baseUrl movieService {} ",baseUrl);
      return  RestClient.builder().baseUrl(baseUrl).build();
    }
}
