package appjam.themanual

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_manual.*
import kotlinx.android.synthetic.main.activity_manual_add.*

class ManualAddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_add)


        //리사이클러에 받아올
        val datas = arrayListOf<InvitedPersonDataModel>(
                InvitedPersonDataModel(1, "홍길준", "kim123@gmail.com"),
                InvitedPersonDataModel(2, "홍길만", "abc123@gmail.com")
        )

        manualadd_recycler_view.setHasFixedSize(true)
        val adapter = InvitedPersonAdapter(this, datas);
        manualadd_recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        manualadd_recycler_view.adapter = adapter

    }
}
