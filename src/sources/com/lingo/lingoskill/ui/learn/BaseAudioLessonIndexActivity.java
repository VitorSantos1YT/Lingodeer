package com.lingo.lingoskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.ViewModelLazy;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import hh.y;
import ji.b;
import jp.a0;
import jp.c0;
import jp.h0;
import kotlin.jvm.internal.z;
import lt.AJC.PQgum;
import rp.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseAudioLessonIndexActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public final ViewModelLazy P;

    @Override // ji.b
    public final void r(Bundle bundle) {
        ViewModelLazy viewModelLazy = this.P;
        d dVar = (d) viewModelLazy.getValue();
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        dVar.getClass();
        dVar.f49336a = stringExtra;
        ((d) viewModelLazy.getValue()).f49337b = getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
        h.A(this, new h0());
    }

    public BaseAudioLessonIndexActivity() {
        super(PQgum.UFFRv, a0.f36448a);
        this.P = new ViewModelLazy(z.a(d.class), new c0(this, 0), new y(18), new c0(this, 1));
    }
}
