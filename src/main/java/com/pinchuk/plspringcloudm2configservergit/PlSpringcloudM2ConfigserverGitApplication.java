package com.pinchuk.plspringcloudm2configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PlSpringcloudM2ConfigserverGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlSpringcloudM2ConfigserverGitApplication.class, args);
    }

}
