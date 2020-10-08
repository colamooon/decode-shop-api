package com.colamooon.shop.api.category.service.impl

import com.colamooon.shop.api.category.service.CategoryService
import com.cucurbita.api.category.CategoryList
import com.cucurbita.api.category.CategoryRes
import com.colamooon.shop.api.category.repository.CategoryRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityNotFoundException

@Service
class CategiryServiceImpl(
    private val categoryRepository: CategoryRepository
) : CategoryService {
    @Transactional(readOnly = true)
    override fun findAllRoots(): CategoryList {
        val categories = categoryRepository.findAllByActiveAndParentIdIsNull(true)
            ?: throw EntityNotFoundException("not found root categories")
        return CategoryList(
            content = categories.map {
                CategoryRes(
                    id = it.id,
                    name = it.name
                )
            }.toMutableList()
        )
    }

    @Transactional(readOnly = true)
    override fun findAllSubs(rootId: Long): CategoryList {
        val categories = categoryRepository.findAllByParentIdAndActive(rootId, true)
            ?: throw EntityNotFoundException("not found sub categories")
        return CategoryList(
            content = categories.map {
                CategoryRes(
                    id = it.id,
                    name = it.name
                )
            }.toMutableList()
        )
    }

}