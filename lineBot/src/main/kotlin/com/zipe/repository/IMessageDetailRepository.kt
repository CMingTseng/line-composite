package com.zipe.repository

import com.zipe.entity.MessageDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IMessageDetailRepository : JpaRepository<MessageDetail, Long> {
    fun findTopByOrderByIdDesc(): MessageDetail?

    fun deleteById(id: String)
}
