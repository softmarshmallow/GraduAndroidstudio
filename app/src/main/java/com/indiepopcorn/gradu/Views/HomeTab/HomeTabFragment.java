package com.indiepopcorn.gradu.Views.HomeTab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.indiepopcorn.gradu.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeTabFragment extends Fragment {


        @BindView(R.id.collegeRecyclerView)
        RecyclerView collegeRecyclerView;
        @BindView(R.id.diplomaRecyclerview)
        RecyclerView diplomaRecyclerview;
        Unbinder unbinder;

        public HomeTabFragment() {
                // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                // Inflate the layout for this fragment
                View view = inflater.inflate(R.layout.fragment_home_tab, container, false);
                unbinder = ButterKnife.bind(this, view);
                return view;
        }





        @Override
        public void onDestroyView() {
                super.onDestroyView();
                unbinder.unbind();
        }
}
