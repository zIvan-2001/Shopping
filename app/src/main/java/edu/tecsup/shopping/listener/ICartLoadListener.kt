package edu.tecsup.shopping.listener

import android.webkit.ConsoleMessage
import edu.tecsup.shopping.model.CartModel

interface ICartLoadListener {
    fun onLoadCartSuccess(cartModelList: List<CartModel>)
    fun onLoadCartFailed(message: String?)
}