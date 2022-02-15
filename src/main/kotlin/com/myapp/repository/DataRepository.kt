package com.myapp.repository

import com.myapp.entity.Account
import com.myapp.entity.Data
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.Repository
import java.util.*


interface DataRepository : PagingAndSortingRepository<Data, UUID>{

}