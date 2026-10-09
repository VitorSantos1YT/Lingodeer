package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzap implements zzao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11453b;

    public zzap(ArrayList arrayList, String str) {
        this.f11452a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f11453b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzapVar = (zzap) obj;
        String str = zzapVar.f11452a;
        String str2 = this.f11452a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f11453b.equals(zzapVar.f11453b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao g(String str, zzg zzgVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f11452a;
        return this.f11453b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao b() {
        return this;
    }
}
