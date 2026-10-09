package com.lingo.fluent.ui.game;

import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import ji.b;
import qh.c0;
import qh.e;
import qh.k0;
import qh.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WordGameActivity extends b {
    public WordGameActivity() {
        super(BuildConfig.VERSION_NAME, s.f47782a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        long j11 = ((o0) l()).j();
        if (j11 == 3) {
            h.A(this, new e());
        } else if (j11 == 2) {
            h.A(this, new k0());
        } else if (j11 == 1) {
            h.A(this, new c0());
        }
    }
}
