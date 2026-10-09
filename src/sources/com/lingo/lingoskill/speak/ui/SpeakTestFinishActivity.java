package com.lingo.lingoskill.speak.ui;

import android.os.Bundle;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import ji.b;
import nv.p;
import oo.v;
import oo.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpeakTestFinishActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public int P;

    public SpeakTestFinishActivity() {
        super(BuildConfig.VERSION_NAME, v.f45706a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = getIntent().getIntExtra(INTENTS.EXTRA_INT, 1);
        Bundle bundleD = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, getIntent().getLongExtra(INTENTS.EXTRA_LONG, 1L));
        y yVar = new y();
        yVar.setArguments(bundleD);
        h.A(this, yVar);
    }
}
