package appjam.themanual

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*
import kotlinx.android.synthetic.main.activity_signup_email.*

class SignupEmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_email)


        btn_signupemail_reemail.setOnClickListener {
            //이메일 재전송
        }

        btn_signupemail_check.setOnClickListener(){
            //이메일 인증 확인
        }




    }
}
