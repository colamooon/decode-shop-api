package com.colamooon.shop.api.product

import com.colamooon.shop.api.media.Media
import com.colamooon.shop.api.model.BaseEntity
import org.apache.commons.lang3.RandomStringUtils
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
class Product(
    @NotBlank
    var name: String,
    @Lob
    var description: String,
    var hashTags: String? = null,

    @Column(name = "media_uuid", length = 32)
    var mediaUuid: String = DateTimeFormatter.ofPattern("yyyyMMdd").withZone(ZoneId.systemDefault()).format(Instant.now()) + RandomStringUtils.randomAlphabetic(16),
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "media_uuid", referencedColumnName = "media_uuid", insertable = false, updatable = false)
    @OrderBy(value = "sort_position ASC")
    var medias: MutableList<Media> = mutableListOf(),
) : BaseEntity()
