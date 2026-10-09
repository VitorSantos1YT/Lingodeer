package com.google.android.gms.internal.measurement;

import aj.uZCn.evRpcb;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzag implements zzao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzao f11343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11344b;

    public zzag() {
        this.f11343a = zzao.f11445j;
        this.f11344b = "return";
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao b() {
        return new zzag(this.f11344b, this.f11343a.b());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.f11344b.equals(zzagVar.f11344b) && this.f11343a.equals(zzagVar.f11343a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao g(String str, zzg zzgVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.f11343a.hashCode() + (this.f11344b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    public zzag(String str) {
        this.f11343a = zzao.f11445j;
        this.f11344b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        throw new IllegalStateException(evRpcb.uJo);
    }

    public zzag(String str, zzao zzaoVar) {
        this.f11343a = zzaoVar;
        this.f11344b = str;
    }
}
