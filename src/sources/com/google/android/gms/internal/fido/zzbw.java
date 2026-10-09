package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbw extends zzbr implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbr f9676a;

    public zzbw(zzbr zzbrVar) {
        this.f9676a = zzbrVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbr
    public final zzbr a() {
        return this.f9676a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f9676a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbw) {
            return this.f9676a.equals(((zzbw) obj).f9676a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f9676a.hashCode();
    }

    public final String toString() {
        return this.f9676a.toString().concat(".reverse()");
    }
}
