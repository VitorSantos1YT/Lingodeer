package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10215c;

    public zzan(Object obj, Object obj2, Object obj3) {
        this.f10213a = obj;
        this.f10214b = obj2;
        this.f10215c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f10213a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f10214b);
        return new IllegalArgumentException(p.u(e.s("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f10215c)));
    }
}
