package com.google.android.gms.internal.measurement;

import androidx.drawerlayout.widget.ktFt.FpIL;
import b7.e0;
import com.google.common.collect.ImmutableSet;
import defpackage.e;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableSet f11124d = ImmutableSet.l(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11127c;

    public zzaa(String str, long j11, HashMap map) {
        this.f11125a = str;
        this.f11126b = j11;
        HashMap map2 = new HashMap();
        this.f11127c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f11124d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.f11125a, this.f11126b, new HashMap(this.f11127c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.f11126b == zzaaVar.f11126b && this.f11125a.equals(zzaaVar.f11125a)) {
            return this.f11127c.equals(zzaaVar.f11127c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11125a.hashCode() * 31;
        long j11 = this.f11126b;
        return this.f11127c.hashCode() + ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f11125a;
        String string = this.f11127c.toString();
        int length = String.valueOf(str).length();
        long j11 = this.f11126b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j11).length() + 9 + string.length() + 1);
        e.C(sb2, FpIL.mpmu, str, "', timestamp=");
        e0.w(j11, ", params=", string, sb2);
        sb2.append("}");
        return sb2.toString();
    }
}
