package com.xl.module_service;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.orhanobut.logger.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import com.xl.module_library.Base.BaseFragment;



/**
 * Created by ADMIN on 2017/11/11.
 */

public class ServiceFragment extends BaseFragment {

    private View view;
    private ImageView imageView;


    public ServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_service, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        imageView = view.findViewById(R.id.imageview);
        String url = "https://gss0.bdstatic.com/-4o3dSag_xI4khGkpoWK1HF6hhy/baike/s%3D220/sign=76d69eb61adfa9ecf92e511552d1f754/023b5bb5c9ea15ceb2d61ca3bd003af33a87b264.jpg";
        Target target = new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                Logger.i("onBitmapLoaded");
                imageView.setImageBitmap(bitmap);
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {
                Logger.i("onBitmapFailed");
            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {
                Logger.i("onPrepareLoad");
            }
        };
        Picasso.with(getContext().getApplicationContext()).load(url).into(target);
    }
}
