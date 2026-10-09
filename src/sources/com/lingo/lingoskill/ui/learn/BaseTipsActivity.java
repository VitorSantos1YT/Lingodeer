package com.lingo.lingoskill.ui.learn;

import android.os.Bundle;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import ji.b;
import jp.s0;
import jp.w0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseTipsActivity extends b {
    public String P;
    public long Q;
    public int R;

    public BaseTipsActivity() {
        super(BuildConfig.VERSION_NAME, s0.f36540a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        this.Q = getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
        this.R = getIntent().getIntExtra(INTENTS.EXTRA_INT, -1);
        String str = this.P;
        m.c(str);
        long j11 = this.Q;
        int i11 = this.R;
        Bundle bundle2 = new Bundle();
        bundle2.putString(INTENTS.EXTRA_STRING, str);
        bundle2.putLong(INTENTS.EXTRA_LONG, j11);
        bundle2.putInt(INTENTS.EXTRA_INT, i11);
        w0 w0Var = new w0();
        w0Var.setArguments(bundle2);
        h.A(this, w0Var);
    }
}
