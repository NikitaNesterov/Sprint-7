package com.example.demo.persistance

import javax.persistence.*
import javax.persistence.Entity

@Entity
class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    var name: String? = "Nikita"

}