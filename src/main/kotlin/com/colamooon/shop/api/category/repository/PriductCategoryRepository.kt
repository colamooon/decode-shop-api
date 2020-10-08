package com.colamooon.shop.api.category.repository

import com.colamooon.shop.api.category.ProductCategory
import org.springframework.data.jpa.repository.JpaRepository

interface PriductCategoryRepository : JpaRepository<ProductCategory, Long>