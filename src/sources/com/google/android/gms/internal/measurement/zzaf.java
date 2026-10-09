package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaf implements zzao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11297a;

    public zzaf(Boolean bool) {
        this.f11297a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao b() {
        return new zzaf(Boolean.valueOf(this.f11297a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.f11297a == ((zzaf) obj).f11297a;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao g(String str, zzg zzgVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z11 = this.f11297a;
        if (zEquals) {
            return new zzas(Boolean.toString(z11));
        }
        throw new IllegalArgumentException(p.r(Boolean.toString(z11), ".", str, " is not a function."));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f11297a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f11297a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return Boolean.toString(this.f11297a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return Double.valueOf(true != this.f11297a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(this.f11297a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }
}
