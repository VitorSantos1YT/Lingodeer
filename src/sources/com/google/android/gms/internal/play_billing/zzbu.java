package com.google.android.gms.internal.play_billing;

import defpackage.e;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12264c;

    public zzbu(Object obj, Object obj2, Object obj3) {
        this.f12262a = obj;
        this.f12263b = obj2;
        this.f12264c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f12262a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f12263b);
        return new IllegalArgumentException(p.u(e.s("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f12264c)));
    }
}
