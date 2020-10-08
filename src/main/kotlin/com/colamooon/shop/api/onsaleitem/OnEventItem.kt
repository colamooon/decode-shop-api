package com.colamooon.shop.api.onsaleitem

import com.colamooon.shop.api.model.BaseEntity
import com.colamooon.shop.api.product.Item
import java.math.BigDecimal
import java.time.Instant
import javax.persistence.*

@Entity
class OnEventItem(
    var title: String,
    @Enumerated(EnumType.STRING)
    var eventType: EventType = EventType.DISCOUNT_RATE,
    var startedAt: Instant?,
    var endedAt: Instant? = null,
    var discoutPrice: BigDecimal,
    var discoutRate: BigDecimal,
    var isRequired: Boolean,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "on_sale_id")
    var onSale: OnSale,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    var item: Item
) : BaseEntity() {
    var sellPrice: BigDecimal = BigDecimal.ZERO
    // TODO: type 에 따른 getter 구현
}

enum class EventType {
    DISCOUNT_RATE, DISCOUNT_PRICE
}