package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import bp.g3;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ji.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MedalActivity extends b {
    public MedalActivity() {
        super(BuildConfig.VERSION_NAME, g3.f4601a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        getIntent().getIntExtra(INTENTS.EXTRA_INT, 0);
    }
}
