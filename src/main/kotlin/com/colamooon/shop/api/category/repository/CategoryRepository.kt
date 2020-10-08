package com.colamooon.shop.api.category.repository

import com.colamooon.shop.api.category.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long> {
    fun findAllByActive(active: Boolean): List<Category>?
    fun findAllByParentIdAndActive(id: Long, active: Boolean): List<Category>?
    fun findAllByActiveAndParentIdIsNull(active: Boolean): List<Category>?
    fun findByIdAndActive(id: Long, active: Boolean): Category?
}