package com.colamooon.shop.api.onsaleitem.view

import com.colamooon.shop.api.onsaleitem.SaleStatus
import com.fasterxml.jackson.annotation.JsonInclude
import java.time.Instant

@JsonInclude(JsonInclude.Include.NON_NULL)
data class OnSaleRes(
    var id: Long? = -1,
    var title: String? = null,
    var status: SaleStatus? = null,
    var startedAt: Instant? = null,
    var endedAt: Instant? = null,
    var items: MutableList<OnSaleItemRes>? = mutableListOf(),
    var onEventItem: OnEventItemRes? = null

)
