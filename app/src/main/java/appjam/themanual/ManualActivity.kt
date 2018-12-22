package appjam.themanual

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_manual.*

class ManualActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)

        //리사이클러에 받아올
        val datas = arrayListOf<ManualDataModel>(
                ManualDataModel("리사이클러뷰", 1, 3),
                ManualDataModel("리스트뷰", 2, 55)
        )

        manual_recycler_view.setHasFixedSize(true)
        val adapter = ManualAdapter(this, datas)
        manual_recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        manual_recycler_view.adapter = adapter

        floatingbtn_manual_add.setOnClickListener {
            val intent = Intent(applicationContext, ManualAddActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.fade_in)
        }



    }
}
