package com.lingo.lingoskill.ui.review;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import hh.p0;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;
import tp.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FlashCardSettingActivity extends b {
    public static final /* synthetic */ int P = 0;

    public FlashCardSettingActivity() {
        super(BuildConfig.VERSION_NAME, y.f52505a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String string = getString(R.string.settings);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        Bundle bundle2 = new Bundle();
        bj.b bVar = new bj.b();
        bVar.setArguments(bundle2);
        h.A(this, bVar);
    }
}
