package com.shuklz.androidtasks

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.shuklz.androidtasks.R.id.tv_name
import kotlinx.android.synthetic.main.buttons_all.*

open class BaseActivity : AppCompatActivity() {

    val intentMap = mapOf(Intent.FLAG_ACTIVITY_NEW_TASK to "Intent.FLAG_ACTIVITY_NEW_TASK",
            Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT to "Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT",
            Intent.FLAG_ACTIVITY_CLEAR_TASK to "Intent.FLAG_ACTIVITY_CLEAR_TASK",
            Intent.FLAG_ACTIVITY_CLEAR_TOP to "Intent.FLAG_ACTIVITY_CLEAR_TOP")

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        tv_name.text = this.localClassName
    }

    fun gotoA(view: View) {
        startActivity(Intent(this, ActivityA::class.java))
    }

    fun gotoB(view: View) {
        startActivity(Intent(this, ActivityB::class.java))
    }

    fun gotoC(view: View) {
        startActivity(Intent(this, ActivityC::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(this.localClassName, "created")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this.localClassName, "destroyed")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(this.localClassName, "onNewIntent: " + intentMap.get(intent.flags))
    }

}