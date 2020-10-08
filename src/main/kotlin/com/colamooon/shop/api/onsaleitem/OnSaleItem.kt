package com.colamooon.shop.api.onsaleitem

import com.colamooon.shop.api.model.BaseEntity
import com.colamooon.shop.api.product.Item
import javax.persistence.*

@Entity
@Table(uniqueConstraints = [UniqueConstraint(columnNames = ["on_sale_id", "item_id"])])
class OnSaleItem(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "on_sale_id")
    var onSale: OnSale,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    var item: Item
) : BaseEntity()
