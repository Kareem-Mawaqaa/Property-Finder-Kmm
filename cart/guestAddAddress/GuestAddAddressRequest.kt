package org.example.library.data.model.cart.guestAddAddress


import kotlinx.serialization.SerialName

data class GuestAddAddressRequest(
	@SerialName("message")
	var message : String? = null,
) 