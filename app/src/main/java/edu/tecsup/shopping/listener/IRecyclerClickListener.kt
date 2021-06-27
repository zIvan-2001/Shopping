package edu.tecsup.shopping.listener

import android.view.View
import java.text.ParsePosition

interface IRecyclerClickListener {
    fun onItemClickListener(view: View?, position: Int)
}