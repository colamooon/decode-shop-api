package com.colamooon.shop.api.category

import com.colamooon.shop.api.model.BaseEntity
import com.colamooon.shop.api.product.Product
import javax.persistence.*

@Entity
@Table(uniqueConstraints = [UniqueConstraint(columnNames = ["product_id", "category_id"])])
data class ProductCategory(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    var product: Product,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    var category: Category
) : BaseEntity()
