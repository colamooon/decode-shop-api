package com.colamooon.shop.api.product.view

import com.colamooon.shop.api.media.MediaRes
import com.fasterxml.jackson.annotation.JsonInclude
import java.time.Instant

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ProductRes(
    var id: Long? = -1,
    var name: String? = null,
    var description: String? = null,
    var hashTags: String? = null,
    var medias: MutableList<MediaRes>? = mutableListOf()
)
