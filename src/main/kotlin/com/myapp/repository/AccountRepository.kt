package com.myapp.repository

import com.myapp.entity.Account
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import java.util.*
import javax.persistence.Entity


interface AccountRepository : PagingAndSortingRepository<Account, UUID>{
    fun existsByUsername(username: String):Boolean
    fun existsByEmail(email: String):Boolean
    fun findByUsername(username: String) : Optional<Account>
}