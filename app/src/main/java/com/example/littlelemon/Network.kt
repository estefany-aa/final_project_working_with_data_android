package com.example.littlelemon

import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    val menu: List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(
    val id: Int,
    val title: String,
    val price: Double

) {
    fun toMenuItemRoom() = MenuItemRoom(
        id,
        title,
        price
    )
}
