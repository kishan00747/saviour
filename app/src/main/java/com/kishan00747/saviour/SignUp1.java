package com.kishan00747.saviour;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SignUp1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SignUp1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignUp1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_sign_up1, container, false);

        return rootView;
    }
}
