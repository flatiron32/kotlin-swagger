package com.shoprunner

import com.google.common.collect.Lists.newArrayList
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMethod
import springfox.documentation.builders.ParameterBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.builders.ResponseMessageBuilder
import springfox.documentation.schema.ModelRef
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.time.LocalDate

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = ["com.shoprunner"])
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

@Bean
fun petApi(): Docket {
    return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build()
}