/*
 * Copyright (C) 2015 AlexMofer
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

package am.util.viewpager.adapter;

import android.content.res.Configuration;
import android.view.ConfigurationHelper;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/**
 * ViewsPagerAdapter
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class ViewsPagerAdapter extends PagerAdapter {
    private List<View> mListViews;

    public ViewsPagerAdapter() {
    }

    public ViewsPagerAdapter(View... views) {
        if (views == null || views.length <= 0)
            return;
        setViews(Arrays.asList(views));
    }

    public ViewsPagerAdapter(List<View> views) {
        setViews(views);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(mListViews.get(position));
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mListViews.get(position), 0);
        return mListViews.get(position);
    }

    @Override
    public int getCount() {
        return mListViews == null ? 0 : mListViews.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public final int getItemPosition(@NonNull Object object) {
        if (mListViews == null || mListViews.size() <= 0)
            return POSITION_NONE;
        //noinspection SuspiciousMethodCalls
        return mListViews.contains(object) ? POSITION_UNCHANGED : POSITION_NONE;
    }

    @SuppressWarnings("deprecation")
    @Override
    @Deprecated
    public void destroyItem(@NonNull View container, int position, @NonNull Object object) {
        destroyItem((ViewPager) container, position, object);
    }

    @SuppressWarnings("deprecation")
    @NonNull
    @Override
    @Deprecated
    public Object instantiateItem(@NonNull View container, int position) {
        return instantiateItem((ViewPager) container, position);
    }

    public void setViews(List<View> views) {
        mListViews = views;
        notifyDataSetChanged();
    }

    public void addView(View view) {
        if (mListViews == null)
            mListViews = new ArrayList<>();
        mListViews.add(view);
        notifyDataSetChanged();
    }

    public void addView(int position, View view) {
        if (mListViews == null)
            mListViews = new ArrayList<>();
        mListViews.add(position, view);
        notifyDataSetChanged();
    }

    public void removeView(View view) {
        if (mListViews == null || mListViews.size() <= 0)
            return;
        if (mListViews.remove(view)) {
            notifyDataSetChanged();
        }
    }

    public void removeView(int position) {
        if (mListViews == null || mListViews.size() <= 0)
            return;
        if (position >= 0 && position < mListViews.size()) {
            mListViews.remove(position);
            notifyDataSetChanged();
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        if (mListViews == null || mListViews.isEmpty())
            return;
        for (View view : mListViews) {
            if (view == null)
                continue;
            ConfigurationHelper.onConfigurationChanged(view, newConfig);
        }
    }
}
