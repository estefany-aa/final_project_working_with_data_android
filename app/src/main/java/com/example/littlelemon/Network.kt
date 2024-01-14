package com.example.littlelemon

import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    // add code here
    // Add properties to match the structure of the JSON dictionary representing the menu
    val menu: List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(
    //add code here
    // Add properties to match the structure of the JSON dictionary representing the menu items
    val id: Int,
    val title: String,
    val price: Double

) {
    fun toMenuItemRoom() = MenuItemRoom(
        // add code here
        // Use all of the properties of the MenuItemNetwork
        id,
        title,
        price
    )
}
