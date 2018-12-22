package appjam.themanual

/**
 * Created by 김예원 on 2018-12-23.
 */

interface ItemActionListener {
    fun onItemMoved(from: Int, to: Int)
    fun onItemSwiped(position: Int)
}