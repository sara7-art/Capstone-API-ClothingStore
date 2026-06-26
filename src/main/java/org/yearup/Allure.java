package org.yearup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Allure {

    public static void main(String[] args) {
//        String dbName = System.getenv("DB_NAME");
//        if (dbName != null && !dbName.isBlank()) {
//            String bannerResource = "classpath:banner-" + dbName.toLowerCase() + ".txt";
//            System.setProperty("spring.banner.location", bannerResource);

        System.out.print("\u001B[38;2;255;253;208m");

        System.out.println("""
                 █████╗ ██╗     ██╗     ██╗   ██╗██████╗ ███████╗
                ██╔══██╗██║     ██║     ██║   ██║██╔══██╗██╔════╝
                ███████║██║     ██║     ██║   ██║██████╔╝█████╗
                ██╔══██║██║     ██║     ██║   ██║██╔══██╗██╔══╝
                ██║  ██║███████╗███████╗╚██████╔╝██║  ██║███████╗
                ╚═╝  ╚═╝╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝
                """);

        System.out.print("\u001B[0m");

        SpringApplication.run(Allure.class, args);
    }
}


