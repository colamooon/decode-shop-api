package com.cucurbita.api.category

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class CategoryRes(
    var id: Long? = -1,
    var name: String? = null,
    var parentId: Long? = null,
    var sortPosition: Int = 0,
)

data class CategoryList(
    var content: MutableList<CategoryRes> = mutableListOf()
)

data class MentoItemCategoryRes(
    var category: CategoryRes? = null
)