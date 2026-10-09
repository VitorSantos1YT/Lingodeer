package com.lingo.lingoskill.vtskill.ui.syllable.ui;

import android.os.Bundle;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import ji.b;
import sq.u;
import sq.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class VTSyllableTestActivity extends b {
    public static final /* synthetic */ int P = 0;

    public VTSyllableTestActivity() {
        super(BuildConfig.VERSION_NAME, u.f51751a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        pq.b bVar = (pq.b) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(INTENTS.EXTRA_OBJECT, bVar);
        v vVar = new v();
        vVar.setArguments(bundle2);
        h.A(this, vVar);
    }
}
