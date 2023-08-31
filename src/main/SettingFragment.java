package com.example.school;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        String[] values = {"마이페이지", "도움말", "버전 정보", "로그아웃"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent;
        switch (position){
            case 0:
                intent = new Intent(getActivity(), MypageActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(getActivity(), HelpActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(getActivity(), VersionInfoActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(getActivity(), LogoutActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
//        String strText = (String) l.getItemAtPosition(position);
//        Toast.makeText(this.getContext(), "클릭: "+ position + " " + strText, Toast.LENGTH_SHORT).show();
    }
}