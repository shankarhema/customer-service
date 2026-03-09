package hema.service.customerService;

import hema.service.customerService.client.MovieClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.web.client.RestClient;

@Import(TestcontainersConfiguration.class)
@MockitoBean(extraInterfaces = RestClient.class, types = MovieClient.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerServiceApplicationTests {

//	@Test
//	void contextLoads() {
//	}

}
