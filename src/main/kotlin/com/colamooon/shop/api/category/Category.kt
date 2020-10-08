package com.colamooon.shop.api.category

import com.colamooon.shop.api.model.BaseEntity
import javax.persistence.*

@Entity
data class Category(
    @Column(name = "parent_id", nullable = true)
    var parentId: Long? = null,
    var name: String,
    var sortPosition: Int = 0,
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "parent_id", referencedColumnName = "id", nullable = true, insertable = false, updatable = false)
    @OrderBy(value = "sort_position ASC")
    var categorys: MutableList<CategorySub> = mutableListOf()
) : BaseEntity()
