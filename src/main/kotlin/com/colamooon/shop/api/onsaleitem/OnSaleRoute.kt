package com.colamooon.shop.api.onsaleitem

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class OnSaleRouter {
    val basePath = "/api/v1/onsale"

    @Bean
    fun onsaleRoute(handler: OnSaleHandler) = coRouter {
        path(basePath).nest {
            GET("", handler::listOnSales)
            GET("/{id}", handler::getOnSale)
        }
    }
}