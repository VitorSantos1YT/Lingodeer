package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzbs f13042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzhj f13043b;

    public zzhi(zzhj zzhjVar, com.google.android.gms.internal.measurement.zzbs zzbsVar, zzhj zzhjVar2) {
        this.f13042a = zzbsVar;
        this.f13043b = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhj zzhjVar = this.f13043b;
        zzic zzicVar = zzhjVar.f13045b.f13046a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", zzhjVar.f13044a);
        try {
            if (this.f13042a.Z(bundle) == null) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.a("Install Referrer Service returned a null response");
            }
        } catch (Exception e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8.getMessage(), "Exception occurred while retrieving the Install Referrer");
        }
        zzhz zzhzVar2 = zzicVar.f13100g;
        zzic.m(zzhzVar2);
        zzhzVar2.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
