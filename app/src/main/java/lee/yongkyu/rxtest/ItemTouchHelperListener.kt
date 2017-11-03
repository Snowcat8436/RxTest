package lee.yongkyu.rxtest

/**
 * Created by yongkyu0920.lee on 2017-11-03.
 */
interface ItemTouchHelperListener {
    fun onItemMove(fromPosition: Int, toPosition: Int): Boolean
    fun onItemSwipe(position: Int)
}