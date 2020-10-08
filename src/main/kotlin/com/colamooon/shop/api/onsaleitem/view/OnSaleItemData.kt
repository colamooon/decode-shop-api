package com.colamooon.shop.api.onsaleitem.view

import com.colamooon.shop.api.product.view.ItemRes
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class OnSaleItemRes(
    var id: Long? = -1,
    var status: String? = null,
    var item: ItemRes? = null
)
