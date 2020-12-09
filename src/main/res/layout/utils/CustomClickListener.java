package com.gui.utils;

import android.view.View;

public interface CustomClickListener {

    void onItemSingleClick(View view, int position);
    void onItemLongClick(View view, int position);

    void onCheckBoxToggle(boolean tick);
}
