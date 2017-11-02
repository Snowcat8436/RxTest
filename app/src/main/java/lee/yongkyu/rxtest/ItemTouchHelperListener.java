package lee.yongkyu.rxtest;

public interface ItemTouchHelperListener {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemSwipe(int position);
}
