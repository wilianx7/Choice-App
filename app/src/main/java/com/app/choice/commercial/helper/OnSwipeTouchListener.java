package com.app.choice.commercial.helper;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.app.choice.commercial.model.CommercialPizzaModel;

public class OnSwipeTouchListener implements View.OnTouchListener {

    ListView listview;
    private GestureDetector gestureDetector;
    private Context context;
    private ArrayAdapter<CommercialPizzaModel> adapter;

    public OnSwipeTouchListener(Context ctx, ListView list, ArrayAdapter adapter) {
        gestureDetector = new GestureDetector(ctx, new GestureListener());
        context = ctx;
        this.listview = list;
        this.adapter = adapter;
    }

    public OnSwipeTouchListener() {
        super();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    public void onSwipeRight(int position) {
        adapter.getItem(position).setAccepted(true);
        adapter.notifyDataSetChanged();
    }

    public void onSwipeLeft(int position) {
        adapter.getItem(position).setAccepted(false);
        adapter.notifyDataSetChanged();
    }

    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {

        private static final int SWIPE_THRESHOLD = 100;
        private static final int SWIPE_VELOCITY_THRESHOLD = 100;

        @Override
        public boolean onDown(MotionEvent e) {
            return true;
        }

        private int getPostion(MotionEvent e1) {
            return listview.pointToPosition((int) e1.getX(), (int) e1.getY());
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2,
                               float velocityX, float velocityY) {
            float distanceX = e2.getX() - e1.getX();
            float distanceY = e2.getY() - e1.getY();
            if (Math.abs(distanceX) > Math.abs(distanceY)
                    && Math.abs(distanceX) > SWIPE_THRESHOLD
                    && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                if (distanceX > 0)
                    onSwipeRight(getPostion(e1));
                else
                    onSwipeLeft(getPostion(e1));
                return true;
            }
            return false;
        }

    }
}