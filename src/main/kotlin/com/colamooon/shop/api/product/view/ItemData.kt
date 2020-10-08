package com.colamooon.shop.api.product.view

import com.colamooon.shop.api.product.ItemStatus
import com.fasterxml.jackson.annotation.JsonInclude
import java.math.BigDecimal
import java.time.Instant

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ItemRes(
    var id: Long? = -1,
    var title: String? = null,
    var originalPrice: BigDecimal? = null,
    var status: ItemStatus? = null,
    var stock: Int? = null,
    var product: ProductRes? = null
)
