package appjam.themanual

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val hd = Handler()
        hd.postDelayed(splashhandler(), 2000) // 1초 후에 hd handler 실행  3000ms = 3초

    }

    private inner class splashhandler : Runnable {
        override fun run() {
            startActivity(Intent(application, SignupActivity::class.java))
            this@SplashActivity.finish()
        }
    }

    override fun onBackPressed() {}
}