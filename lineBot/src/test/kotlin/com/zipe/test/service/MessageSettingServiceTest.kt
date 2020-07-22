package com.zipe.test.service

import com.zipe.repository.IMessageSettingRepository
import com.zipe.service.IMessageSettingService
import com.zipe.test.base.TestBase
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.net.URI

class MessageSettingServiceTest : TestBase() {

    @Autowired
    lateinit var messageSettingService: IMessageSettingService

    @Test
    fun findBykey() {
        val productList = messageSettingService.findBykey("抽")
        println(productList)
    }

    private fun createUri(path: String): URI? {
        return ServletUriComponentsBuilder.fromHttpUrl("http://test.zipe.idv.tw")
                .path(path).build()
                .toUri()
    }
}
