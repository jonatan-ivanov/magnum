package magnum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author Jonatan Ivanov
 */
@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class Magnum {
    public static void main(String[] args) {
        SpringApplication.run(Magnum.class, args);
    }
}
