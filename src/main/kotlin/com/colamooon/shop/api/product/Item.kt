package com.colamooon.shop.api.product

import com.colamooon.shop.api.model.BaseEntity
import java.math.BigDecimal
import java.time.Instant
import javax.persistence.*

@Entity
class Item(
    var title: String,
    var originalPrice: BigDecimal,
    @Enumerated(EnumType.STRING)
    var status: ItemStatus = ItemStatus.INIT,
    var stock: Int,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    var product: Product
) : BaseEntity()

enum class ItemStatus {
    INIT, LISTED
}