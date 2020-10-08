package com.colamooon.shop.api.category

import com.colamooon.shop.api.model.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "category")
data class CategorySub(
    @Column(name = "parent_id")
    var parentId: Long,
    var name: String,
    var sortPosition: Int = 0,
) : BaseEntity()
