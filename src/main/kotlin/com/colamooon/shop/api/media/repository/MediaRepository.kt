package com.colamooon.shop.api.media.repository

import com.colamooon.shop.api.media.Media
import org.springframework.data.jpa.repository.JpaRepository

interface MediaRepository : JpaRepository<Media, Long>