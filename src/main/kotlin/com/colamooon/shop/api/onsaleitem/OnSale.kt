package com.colamooon.shop.api.onsaleitem

import com.colamooon.shop.api.model.BaseEntity
import java.time.Instant
import javax.persistence.*

@Entity
class OnSale(
    var title: String,
    @Enumerated(EnumType.STRING)
    var status: SaleStatus = SaleStatus.INIT,
    var startedAt: Instant?,
    var endedAt: Instant? = null,

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "on_sale_id", referencedColumnName = "id", insertable = false, updatable = false)
    var items: MutableList<OnSaleItem> = mutableListOf(),
) : BaseEntity()

enum class SaleStatus {
    INIT, LISTED, EXPIRED, REJECTED
}