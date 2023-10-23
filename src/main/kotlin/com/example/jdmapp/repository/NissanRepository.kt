package com.example.jdmapp.repository

import com.example.jdmapp.model.Nissan
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NissanRepository : JpaRepository<Nissan, Long?>{
    fun findById (id: Long?): Nissan?
}