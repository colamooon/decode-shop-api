package com.colamooon.shop.api.onsaleitem.repository

import com.colamooon.shop.api.onsaleitem.OnSaleItem
import org.springframework.data.jpa.repository.JpaRepository

interface OnSaleItemRepository : JpaRepository<OnSaleItem, Long>