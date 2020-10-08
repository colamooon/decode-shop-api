package com.colamooon.shop.api.onsaleitem.service

import com.colamooon.shop.api.onsaleitem.view.OnSaleRes
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface OnSaleService {
    fun findAll(pageable: Pageable): Page<OnSaleRes>
    fun findById(id: Long): OnSaleRes
}