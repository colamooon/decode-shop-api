package com.colamooon.shop.api.onsaleitem.service.impl

import com.colamooon.shop.api.onsaleitem.repository.OnEventItemRepository
import com.colamooon.shop.api.onsaleitem.repository.OnSaleRepository
import com.colamooon.shop.api.onsaleitem.service.OnSaleService
import com.colamooon.shop.api.onsaleitem.view.OnEventItemRes
import com.colamooon.shop.api.onsaleitem.view.OnSaleRes
import mu.KotlinLogging
import org.modelmapper.ModelMapper
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityNotFoundException

private val log = KotlinLogging.logger {}

@Service
class MentoItemServiceImpl(
    private val onSaleRepository: OnSaleRepository,
    private val onEventItemRepository: OnEventItemRepository,
    private var modelMapper: ModelMapper
) : OnSaleService {
    @Transactional(readOnly = true)
    override fun findAll(pageable: Pageable): Page<OnSaleRes> {
        val onSales = onSaleRepository.findAllByActive(pageable, true)
        return onSales.map {
            modelMapper.map(it, OnSaleRes::class.java)
        }
    }

    @Transactional(readOnly = true)
    override fun findById(id: Long): OnSaleRes {
        val onSale = onSaleRepository.findByIdAndActive(id, true)
            ?: throw EntityNotFoundException("not found a OnSale(id = ${id})")
        return modelMapper.map(onSale, OnSaleRes::class.java).also {
            it.onEventItem = onEventItemRepository.findByOnSaleIdAndActive(id, true)?.let { onEventItem -> modelMapper.map(onEventItem, OnEventItemRes::class.java) }
        }
    }
}