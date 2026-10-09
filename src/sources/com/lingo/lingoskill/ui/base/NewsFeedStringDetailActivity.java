package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import bp.x3;
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
public final class NewsFeedStringDetailActivity extends b {
    public String P;
    public String Q;

    public NewsFeedStringDetailActivity() {
        super(BuildConfig.VERSION_NAME, x3.f4900a);
        this.P = BuildConfig.VERSION_NAME;
        this.Q = BuildConfig.VERSION_NAME;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        String str = BuildConfig.VERSION_NAME;
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.P = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(INTENTS.EXTRA_STRING_2);
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.Q = str;
        String titleString = this.P;
        m.f(titleString, "titleString");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(titleString);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        String str2 = this.Q;
        ((g0) j()).f32592c.setVisibility(0);
        ((g0) j()).f32591b.setVisibility(8);
        ((g0) j()).f32593d.setText(str2);
        ((g0) j()).f32594e.setVisibility(8);
    }
}
