package com.example.femaleshoppingui

import androidx.annotation.DrawableRes

object Data {
    class Demo(
        @DrawableRes var img:Int,
        var name:String,
        var disp:String,
        var price:String
    )

    var datalist=listOf(
   Demo(
       R.drawable.a,
       name="The Dress",
       disp="The ever best dress in the market",
       price="$23"
   ), Demo(
           R.drawable.b,
        name="The Dress",
        disp="The ever best dress in the market",
        price="$26"
    ),
                Demo(
                R.drawable.a,
        name="The Dress",
        disp="The ever best dress in the market",
        price="$23"
    ), Demo(
    R.drawable.b,
    name="The Dress",
    disp="The ever best dress in the market",
    price="$26"
    ),
        Demo(
            R.drawable.a,
            name="The Dress",
            disp="The ever best dress in the market",
            price="$23"
        ), Demo(
            R.drawable.b,
            name="The Dress",
            disp="The ever best dress in the market",
            price="$26" ),
                    Demo(
                    R.drawable.a,
            name="The Dress",
            disp="The ever best dress in the market",
            price="$23"
        ), Demo(
            R.drawable.b,
            name="The Dress",
            disp="The ever best dress in the market",
            price="$26"   )
    )
}