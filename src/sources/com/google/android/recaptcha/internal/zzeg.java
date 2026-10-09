package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.f;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeg {
    private zzeg() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String strQ0 = x.q0("18.6.1", ".", BuildConfig.VERSION_NAME);
        return Integer.parseInt(q.d1(strQ0, "-", strQ0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(q.a1("18.6.1", "-", BuildConfig.VERSION_NAME));
    }

    public /* synthetic */ zzeg(f fVar) {
    }
}
