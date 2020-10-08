package com.colamooon.shop.api.category.service

import com.cucurbita.api.category.CategoryList

interface CategoryService {
    fun findAllRoots(): CategoryList
    fun findAllSubs(rootId: Long): CategoryList
}