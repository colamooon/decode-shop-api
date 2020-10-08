package com.colamooon.shop.api.onsaleitem.repository

import com.colamooon.shop.api.onsaleitem.OnEventItem
import org.springframework.data.jpa.repository.JpaRepository

interface OnEventItemRepository : JpaRepository<OnEventItem, Long> {
    fun findByOnSaleIdAndActive(onSaleId: Long, active: Boolean): OnEventItem?
}