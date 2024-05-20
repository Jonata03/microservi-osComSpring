package io.github.raulcfr112.hellodocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    Logger logger = LoggerFactory.getLogger(DockerController.class);
    @RequestMapping("/hello-docker")
    public HelloDocker greeting(){

        logger.info("Endpoint /hello-docker foi chamado!");

        var hostName = System.getenv("HOSTNAME");

        return new HelloDocker(
                "Hello Docker",
                hostName
        );

    }

}
