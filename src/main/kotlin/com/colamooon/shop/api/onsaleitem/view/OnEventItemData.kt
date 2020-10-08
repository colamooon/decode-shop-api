package com.colamooon.shop.api.onsaleitem.view

import com.colamooon.shop.api.onsaleitem.EventType
import com.colamooon.shop.api.product.view.ItemRes
import com.fasterxml.jackson.annotation.JsonInclude
import java.math.BigDecimal
import java.time.Instant

@JsonInclude(JsonInclude.Include.NON_NULL)
data class OnEventItemRes(
    var id: Long? = -1,
    var originalPrice: BigDecimal? = null,
    var eventType: EventType? = null,
    var startedAt: Instant? = null,
    var endedAt: Instant? = null,
    var stock: Int? = null,
    var discoutPrice: BigDecimal? = null,
    var discoutRate: BigDecimal? = null,
    var item: ItemRes? = null,
    var sellPrice: BigDecimal? = null,
    var isRequired: Boolean? = null
)
