package hema.service.customerService;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

	@Bean
	@ServiceConnection
	PostgreSQLContainer postgresContainer() {

	//	return new PostgreSQLContainer(DockerImageName.parse("postgres:latest"));
		var dockerImage = DockerImageName.parse("public.ecr.aws/docker/library/postgres:18").asCompatibleSubstituteFor("postgres");
		return new PostgreSQLContainer(dockerImage).withDatabaseName("customer")
				.withInitScript("init-db.sql");
	}

}
