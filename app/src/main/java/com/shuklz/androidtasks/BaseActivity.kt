package com.shuklz.androidtasks

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.shuklz.androidtasks.R.id.tv_name
import kotlinx.android.synthetic.main.buttons_all.*

open class BaseActivity: AppCompatActivity() {
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        tv_name.text = this.localClassName
    }
    fun gotoA(view: View){
        startActivity(Intent(this, ActivityA::class.java))
    }
    fun gotoB(view: View){
        startActivity(Intent(this, ActivityB::class.java))
    }
    fun gotoC(view: View){
        startActivity(Intent(this, ActivityC::class.java))
    }

}