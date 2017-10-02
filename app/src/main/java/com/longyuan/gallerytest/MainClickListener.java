package com.longyuan.gallerytest;

import android.view.View;

/**
 * Created by loxu on 02/10/2017.
 */

public interface MainClickListener {

    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
