package com.myapp.entity

import java.util.*
import javax.persistence.*

@Entity(name = "data")
class Data (){
    @Id
    var dataId: UUID = UUID.randomUUID()
    lateinit var dataName: String
    lateinit var data: String
}