package com.google.android.gms.internal.p002firebaseauthapi;

import hh.p0;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbk extends zzbc implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzbf f10257b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10258a;

    static {
        new zzbk(0);
        new zzbk(zzbh.f10256a);
    }

    public zzbk(int i11) {
        this.f10258a = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzbk) && this.f10258a == ((zzbk) obj).f10258a;
    }

    public final int hashCode() {
        return zzbk.class.hashCode() ^ this.f10258a;
    }

    public final String toString() {
        return p0.h(this.f10258a, "Hashing.murmur3_128(", ")");
    }
}
