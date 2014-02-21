package com.youloft.cards;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class CardActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new CardFragment()).commitAllowingStateLoss();
        }
    }


}
