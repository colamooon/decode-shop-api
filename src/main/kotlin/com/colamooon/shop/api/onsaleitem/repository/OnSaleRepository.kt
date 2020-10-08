package com.colamooon.shop.api.onsaleitem.repository

import com.colamooon.shop.api.onsaleitem.OnSale
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface OnSaleRepository : JpaRepository<OnSale, Long> {
    fun findAllByActive(pageable: Pageable, active: Boolean): Page<OnSale>
    fun findByIdAndActive(id: Long, active: Boolean): OnSale?
}