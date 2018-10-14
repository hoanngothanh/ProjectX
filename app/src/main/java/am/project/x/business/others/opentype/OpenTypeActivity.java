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
package am.project.x.business.others.opentype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import am.project.x.R;
import am.project.x.base.BaseActivity;

/**
 * OpenType
 */
public class OpenTypeActivity extends BaseActivity {

    private static final String EXTRA_PATH = "am.project.x.business.others.opentype.OpenTypeActivity.EXTRA_PATH";

    public static void start(Context context, String path) {
        context.startActivity(
                new Intent(context, OpenTypeActivity.class).putExtra(EXTRA_PATH, path));
    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_opentype;
    }

    @Override
    protected void initializeActivity(@Nullable Bundle savedInstanceState) {
        setSupportActionBar(R.id.ot_toolbar);
        final String path = getIntent().getStringExtra(EXTRA_PATH);
        Toast.makeText(this, path, Toast.LENGTH_SHORT).show();
    }
}