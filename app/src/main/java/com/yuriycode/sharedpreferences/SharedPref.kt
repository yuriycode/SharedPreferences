package com.yuriycode.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class SharedPref {

    companion object{

        fun setValue(context: Context, value: Int){
            val sharedPref: SharedPreferences = context.getSharedPreferences("test", Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor = sharedPref.edit()
            editor.putInt("saveText", value)
            editor.apply()
        }

        fun getValue(context: Context): Int{
            val sharedPref: SharedPreferences = context.getSharedPreferences("test", Context.MODE_PRIVATE)
            return sharedPref.getInt("saveText", 0)
        }

    }

}