package com.youloft.cards;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * 卡片
 * <p/>
 * <p/>
 * Created by javen on 14-2-21.
 */
public class CardFragment extends Fragment {


    private ListView mCardList = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cards_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mCardList = (ListView) view.findViewById(R.id.cards_list);
        mCardList.setAdapter(new CardAdapter(getActivity()));
    }


}
