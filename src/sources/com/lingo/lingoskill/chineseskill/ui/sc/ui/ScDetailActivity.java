package com.lingo.lingoskill.chineseskill.ui.sc.ui;

import android.os.Bundle;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ej.g;
import ff.h;
import ji.b;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ScDetailActivity extends b {
    public static final /* synthetic */ int P = 0;

    public ScDetailActivity() {
        super(BuildConfig.VERSION_NAME, ej.b.f25680a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        TravelCategory travelCategory = (TravelCategory) getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
        m.c(travelCategory);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(INTENTS.EXTRA_OBJECT, travelCategory);
        g gVar = new g();
        gVar.setArguments(bundle2);
        h.A(this, gVar);
    }
}
