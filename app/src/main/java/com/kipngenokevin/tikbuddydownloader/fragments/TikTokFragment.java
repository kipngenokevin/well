package com.kipngenokevin.tikbuddydownloader.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import com.kipngenokevin.tikbuddydownloader.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TikTokFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TikTokFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TikTokFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SmsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TikTokFragment newInstance(String param1, String param2) {
        TikTokFragment fragment = new TikTokFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //Declaring Variables

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        //Webview


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tiktok, container, false);
        WebView myWebView = (WebView) view.findViewById(R.id.webviewTikTok);
        myWebView.getSettings().setJavaScriptEnabled(true);//Enable Javascript
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://ttonlineviewer.com/");
        /*String unencodedHtml =
                "&lt;html&gt;&lt;body&gt;'%23' is the percent code for ‘#‘ &lt;/body&gt;&lt;/html&gt;";
        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(),
                Base64.NO_PADDING);
        myWebView.loadData(encodedHtml, "text/html", "base64");*/


        return view;
        //return inflater.inflate(R.layout.fragment_tiktok, container, false);

    }

}