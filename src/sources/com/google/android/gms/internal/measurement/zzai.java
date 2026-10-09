package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzai implements zzao, zzak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11407b = new HashMap();

    public zzai(String str) {
        this.f11406a = str;
    }

    public abstract zzao a(zzg zzgVar, List list);

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao d(String str) {
        HashMap map = this.f11407b;
        return map.containsKey(str) ? (zzao) map.get(str) : zzao.f11445j;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void e(String str, zzao zzaoVar) {
        HashMap map = this.f11407b;
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
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.f11406a;
        if (str != null) {
            return str.equals(zzaiVar.f11406a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao g(String str, zzg zzgVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(this.f11406a) : zzak.f(this, new zzas(str), zzgVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean h(String str) {
        return this.f11407b.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f11406a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.f11406a;
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
        return new zzaj(this.f11407b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public zzao b() {
        return this;
    }
}
