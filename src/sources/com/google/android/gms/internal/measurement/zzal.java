package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzal implements zzao, zzak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11441a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao b() {
        zzal zzalVar = new zzal();
        for (Map.Entry entry : this.f11441a.entrySet()) {
            boolean z11 = entry.getValue() instanceof zzak;
            HashMap map = zzalVar.f11441a;
            if (z11) {
                map.put((String) entry.getKey(), (zzao) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((zzao) entry.getValue()).b());
            }
        }
        return zzalVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao d(String str) {
        HashMap map = this.f11441a;
        return map.containsKey(str) ? (zzao) map.get(str) : zzao.f11445j;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void e(String str, zzao zzaoVar) {
        HashMap map = this.f11441a;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzal) {
            return this.f11441a.equals(((zzal) obj).f11441a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public zzao g(String str, zzg zzgVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(toString()) : zzak.f(this, new zzas(str), zzgVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean h(String str) {
        return this.f11441a.containsKey(str);
    }

    public final int hashCode() {
        return this.f11441a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f11441a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaj(this.f11441a.keySet().iterator());
    }
}
