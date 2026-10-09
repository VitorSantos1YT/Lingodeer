package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzat extends zzbr implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f9644a;

    public zzat(Comparator comparator) {
        comparator.getClass();
        this.f9644a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f9644a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.f9644a.equals(((zzat) obj).f9644a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9644a.hashCode();
    }

    public final String toString() {
        return this.f9644a.toString();
    }
}
