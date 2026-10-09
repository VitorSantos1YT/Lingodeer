package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamx implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f10209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzamt f10211c;

    public zzamx(zzamt zzamtVar, Comparable comparable, Object obj) {
        this.f10211c = zzamtVar;
        this.f10209a = comparable;
        this.f10210b = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f10209a.compareTo(((zzamx) obj).f10209a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f10209a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f10210b;
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
        return this.f10209a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10210b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f10209a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10210b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i11 = zzamt.f10195t;
        this.f10211c.h();
        Object obj2 = this.f10210b;
        this.f10210b = obj;
        return obj2;
    }

    public final String toString() {
        return a.D(String.valueOf(this.f10209a), "=", String.valueOf(this.f10210b));
    }
}
