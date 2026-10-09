package com.lingo.lingoskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.ViewModelLazy;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import hh.y;
import ji.b;
import jp.r;
import jp.t;
import kotlin.jvm.internal.z;
import rp.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseAudioLessonActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public final ViewModelLazy P;

    public BaseAudioLessonActivity() {
        super(BuildConfig.VERSION_NAME, r.f36539a);
        this.P = new ViewModelLazy(z.a(d.class), new t(this, 0), new y(16), new t(this, 1));
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        ViewModelLazy viewModelLazy = this.P;
        d dVar = (d) viewModelLazy.getValue();
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        String str = BuildConfig.VERSION_NAME;
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        dVar.getClass();
        dVar.f49336a = stringExtra;
        d dVar2 = (d) viewModelLazy.getValue();
        String stringExtra2 = getIntent().getStringExtra(INTENTS.EXTRA_STRING_2);
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        dVar2.getClass();
        dVar2.f49338c = str;
        ((d) viewModelLazy.getValue()).f49337b = getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
        h.A(this, new jp.z());
    }
}
