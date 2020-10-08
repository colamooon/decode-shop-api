package com.colamooon.shop.api.media

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class MediaRes(
    var id: Long = -1,
    var mediaUuid: String? = "",
    var url: String? = "",
    var isDefault: Boolean = false,
    var mediaType: MediaType = MediaType.IMAGE,
    var originName: String? = "",
    var modifyName: String? = "",
    var sortPosition: Int = 0,
    var pathS3: String? = "",
    var imageExt: String? = "",
    var mediaKey: String? = ""
)



