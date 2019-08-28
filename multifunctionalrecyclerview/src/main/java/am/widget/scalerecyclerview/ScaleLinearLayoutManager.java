/*
 * Copyright (C) 2017 AlexMofer
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

package am.widget.scalerecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import am.widget.multifunctionalrecyclerview.layoutmanager.PagingLayoutManager;
import androidx.annotation.NonNull;

/**
 * 可缩放的线性布局
 * Created by Alex on 2017/11/11.
 */
public class ScaleLinearLayoutManager extends PagingLayoutManager {

    private float mChildScale = 1f;

    public ScaleLinearLayoutManager(Context context) {
        super(context);
    }

    public ScaleLinearLayoutManager(Context context, int orientation,
                                    boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public ScaleLinearLayoutManager(Context context, AttributeSet attrs, int defStyleAttr,
                                    int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void measureChild(@NonNull View child, int widthUsed, int heightUsed) {
        ScaleRecyclerView.setScale(child);
        super.measureChild(child, widthUsed, heightUsed);
    }

    @Override
    public void measureChildWithMargins(@NonNull View child, int widthUsed, int heightUsed) {
        ScaleRecyclerView.setScale(child);
        super.measureChildWithMargins(child, widthUsed, heightUsed);
    }

    @Override
    protected int getChildMaxWidth(int width) {
        return Math.round(width * mChildScale);
    }

    @Override
    protected int getChildMaxHeight(int height) {
        return Math.round(height * mChildScale);
    }

    void setChildScale(float scale) {
        if (mChildScale == scale)
            return;
        mChildScale = scale;
    }

    @Override
    protected int computeAnotherDirectionMaxScrollOffset() {
        return super.computeAnotherDirectionMaxScrollOffset();
    }
}
