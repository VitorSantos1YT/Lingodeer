package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgz implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f12430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzhd f12432c;

    public zzgz(zzhd zzhdVar, Comparable comparable, Object obj) {
        this.f12432c = zzhdVar;
        this.f12430a = comparable;
        this.f12431b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f12430a.compareTo(((zzgz) obj).f12430a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f12430a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f12431b;
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
        return this.f12430a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12431b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f12430a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f12431b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i11 = zzhd.f12442t;
        this.f12432c.h();
        Object obj2 = this.f12431b;
        this.f12431b = obj;
        return obj2;
    }

    public final String toString() {
        return ep.a.D(String.valueOf(this.f12430a), "=", String.valueOf(this.f12431b));
    }
}
