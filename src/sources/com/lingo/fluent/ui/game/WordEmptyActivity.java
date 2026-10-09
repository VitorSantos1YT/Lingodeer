package com.lingo.fluent.ui.game;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import ji.b;
import l.a;
import qh.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordEmptyActivity extends b {
    public WordEmptyActivity() {
        super(BuildConfig.VERSION_NAME, r.f47781a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(BuildConfig.VERSION_NAME);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
    }
}
