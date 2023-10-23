package com.example.jdmapp.controller

import com.example.jdmapp.model.Nissan
import com.example.jdmapp.service.NissanService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nissan")   //endpoint
class NissanController {
    @Autowired
    lateinit var nissanService: NissanService
    @GetMapping
    fun list ():List <Nissan>{
        return nissanService.list()
    }
    @PostMapping
    fun save (@RequestBody nissan:Nissan):ResponseEntity<Nissan>{
        return ResponseEntity(nissanService.save(nissan), HttpStatus.OK)
    }
}