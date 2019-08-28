/*
 * Copyright (C) 2018 AlexMofer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.project.x.business.main.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import am.project.x.R;
import am.project.x.base.BaseFragment;
import am.project.x.business.widgets.circleprogressbar.CircleProgressBarActivity;
import am.project.x.business.widgets.drawableratingbar.DrawableRatingBarActivity;
import am.project.x.business.widgets.gradienttabstrip.GradientTabStripActivity;
import am.project.x.business.widgets.headerfootergridview.HeaderFooterGridViewActivity;
import am.project.x.business.widgets.indicatortabstrip.IndicatorTabStripActivity;
import am.project.x.business.widgets.multiactiontextview.MultiActionTextViewActivity;
import am.project.x.business.widgets.multifunctionalimageview.MultifunctionalImageViewActivity;
import am.project.x.business.widgets.multifunctionalrecyclerview.MultifunctionalRecyclerViewActivity;
import am.project.x.business.widgets.recyclepager.RecyclePagerActivity;
import am.project.x.business.widgets.smoothinputlayout.SmoothInputLayoutActivity;
import am.project.x.business.widgets.statelayout.StateLayoutActivity;
import am.project.x.business.widgets.tagtabstrip.TagTabStripActivity;
import am.project.x.business.widgets.wraplayout.WrapLayoutActivity;
import am.project.x.business.widgets.zxingscanview.ZxingScanViewActivity;

public class WidgetsFragment extends BaseFragment implements View.OnClickListener {

    public static WidgetsFragment newInstance() {
        return new WidgetsFragment();
    }

    @Override
    protected int getContentViewLayout(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        return R.layout.fragment_main_widgets;
    }

    @Override
    protected void initializeFragment(Activity activity, @Nullable Bundle savedInstanceState) {
        findViewById(R.id.widget_btn_gradienttabstrip).setOnClickListener(this);
        findViewById(R.id.widget_btn_tagtabstrip).setOnClickListener(this);
        findViewById(R.id.widget_btn_indicatortabstrip).setOnClickListener(this);
        findViewById(R.id.widget_btn_shapeimageview).setOnClickListener(this);
        findViewById(R.id.widget_btn_statelayout).setOnClickListener(this);
        findViewById(R.id.widget_btn_wraplayout).setOnClickListener(this);
        findViewById(R.id.widget_btn_drawableratingbar).setOnClickListener(this);
        findViewById(R.id.widget_btn_headerfootergridview).setOnClickListener(this);
        findViewById(R.id.widget_btn_multiactiontextview).setOnClickListener(this);
        findViewById(R.id.widget_btn_recyclepager).setOnClickListener(this);
        findViewById(R.id.widget_btn_circleprogressbar).setOnClickListener(this);
        findViewById(R.id.widget_btn_zxingscanview).setOnClickListener(this);
        findViewById(R.id.widget_btn_smoothinputlayout).setOnClickListener(this);
        findViewById(R.id.widget_btn_multifunctionalrecyclerview).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.widget_btn_gradienttabstrip:
                GradientTabStripActivity.start(getActivity());
                break;
            case R.id.widget_btn_tagtabstrip:
                TagTabStripActivity.start(getActivity());
                break;
            case R.id.widget_btn_indicatortabstrip:
                IndicatorTabStripActivity.start(getActivity());
                break;
            case R.id.widget_btn_shapeimageview:
                MultifunctionalImageViewActivity.start(getActivity());
                break;
            case R.id.widget_btn_statelayout:
                StateLayoutActivity.start(getActivity());
                break;
            case R.id.widget_btn_wraplayout:
                WrapLayoutActivity.start(getActivity());
                break;
            case R.id.widget_btn_drawableratingbar:
                DrawableRatingBarActivity.start(getActivity());
                break;
            case R.id.widget_btn_headerfootergridview:
                HeaderFooterGridViewActivity.start(getActivity());
                break;
            case R.id.widget_btn_multiactiontextview:
                MultiActionTextViewActivity.start(getActivity());
                break;
            case R.id.widget_btn_recyclepager:
                RecyclePagerActivity.start(getActivity());
                break;
            case R.id.widget_btn_circleprogressbar:
                CircleProgressBarActivity.start(getActivity());
                break;
            case R.id.widget_btn_zxingscanview:
                ZxingScanViewActivity.start(getActivity());
                break;
            case R.id.widget_btn_smoothinputlayout:
                SmoothInputLayoutActivity.start(getActivity());
                break;
            case R.id.widget_btn_multifunctionalrecyclerview:
                MultifunctionalRecyclerViewActivity.start(getActivity());
                break;
        }
    }
}
