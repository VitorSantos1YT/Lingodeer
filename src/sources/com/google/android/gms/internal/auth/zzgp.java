package com.google.android.gms.internal.auth;

import ep.a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzgp implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f9546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzgv f9548c;

    public zzgp(zzgv zzgvVar, Comparable comparable, Object obj) {
        this.f9548c = zzgvVar;
        this.f9546a = comparable;
        this.f9547b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9546a.compareTo(((zzgp) obj).f9546a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9546a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f9547b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f9546a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9547b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9546a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9547b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i11 = zzgv.f9554t;
        this.f9548c.f();
        Object obj2 = this.f9547b;
        this.f9547b = obj;
        return obj2;
    }

    public final String toString() {
        return a.D(String.valueOf(this.f9546a), "=", String.valueOf(this.f9547b));
    }
}
