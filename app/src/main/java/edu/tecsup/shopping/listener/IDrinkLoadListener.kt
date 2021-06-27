package edu.tecsup.shopping.listener

import edu.tecsup.shopping.model.DrinkModel

interface IDrinkLoadListener {
    fun onDrinkLoadSuccess(drinkModelList:List<DrinkModel>?)
    fun onDrinkLoadFailed(message:String?)
}