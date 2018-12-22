package appjam.themanual

import android.support.v7.widget.RecyclerView

/**
 * Created by 김예원 on 2018-12-23.
 */

interface ItemDragListener {
    fun onStartDrag(viewHolder: RecyclerView.ViewHolder)
}