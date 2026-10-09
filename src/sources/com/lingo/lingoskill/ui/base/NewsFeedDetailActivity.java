package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import androidx.appcompat.widget.Toolbar;
import bp.v3;
import bp.w3;
import com.lingo.lingoskill.http.object.NewsFeed;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import hj.g0;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class NewsFeedDetailActivity extends b {
    public static final /* synthetic */ int P = 0;

    public NewsFeedDetailActivity() {
        super(BuildConfig.VERSION_NAME, v3.f4856a);
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        m.f(event, "event");
        if (event.getKeyCode() == 4) {
            if (((g0) j()).f32594e.canGoBack()) {
                ((g0) j()).f32594e.goBack();
                return true;
            }
            super.onBackPressed();
        }
        return super.onKeyDown(i11, event);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        NewsFeed newsFeed = (NewsFeed) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        if (newsFeed != null) {
            String feedTitle = newsFeed.getFeedTitle();
            m.e(feedTitle, "getFeedTitle(...)");
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(feedTitle);
            setSupportActionBar(toolbar);
            a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
            }
            toolbar.setNavigationOnClickListener(new bq.a(this, 0));
            String feedURL = newsFeed.getFeedURL();
            if (feedURL == null || feedURL.length() == 0) {
                String feedContent = newsFeed.getFeedContent();
                m.e(feedContent, "getFeedContent(...)");
                ((g0) j()).f32592c.setVisibility(0);
                ((g0) j()).f32591b.setVisibility(8);
                ((g0) j()).f32593d.setText(feedContent);
                ((g0) j()).f32594e.setVisibility(8);
                return;
            }
            String feedURL2 = newsFeed.getFeedURL();
            m.e(feedURL2, "getFeedURL(...)");
            ((g0) j()).f32592c.setVisibility(8);
            ((g0) j()).f32594e.setVisibility(0);
            ((g0) j()).f32594e.getSettings().setJavaScriptEnabled(true);
            ((g0) j()).f32594e.getSettings().setDomStorageEnabled(true);
            ((g0) j()).f32594e.setWebViewClient(new w3(this, 0));
            ((g0) j()).f32594e.setWebChromeClient(new WebChromeClient());
            ((g0) j()).f32594e.loadUrl(feedURL2);
        }
    }
}
