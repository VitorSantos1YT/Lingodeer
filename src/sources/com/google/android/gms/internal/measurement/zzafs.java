package com.google.android.gms.internal.measurement;

import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafs implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f11329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzafv f11331c;

    public zzafs(zzafv zzafvVar, Comparable comparable, Object obj) {
        this.f11331c = zzafvVar;
        this.f11329a = comparable;
        this.f11330b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f11329a.compareTo(((zzafs) obj).f11329a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f11329a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f11330b;
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
        return this.f11329a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11330b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f11329a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f11330b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f11331c.g();
        Object obj2 = this.f11330b;
        this.f11330b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11329a);
        String strValueOf2 = String.valueOf(this.f11330b);
        return p.u(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
