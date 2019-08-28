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
package am.project.x.business.about;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import am.project.x.BuildConfig;
import am.project.x.R;
import am.project.x.base.BaseActivity;
import am.project.x.business.browser.BrowserActivity;
import am.project.x.utils.ViewUtils;
import androidx.annotation.Nullable;

/**
 * 关于
 */
public class AboutActivity extends BaseActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, AboutActivity.class));
    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_about;
    }

    @Override
    protected void initializeActivity(@Nullable Bundle savedInstanceState) {
        ViewUtils.setLayoutFullscreen(getWindow().getDecorView(), false);
        setSupportActionBar(R.id.about_toolbar);
        ((TextView) findViewById(R.id.about_tv_version)).setText(
                getString(R.string.about_version, BuildConfig.VERSION_NAME));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_privacy:
                BrowserActivity.start(this, "file:///android_asset/html/privacy.html");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
