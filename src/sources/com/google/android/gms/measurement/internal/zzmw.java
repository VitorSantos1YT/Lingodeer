package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f13450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zznl f13452e;

    public zzmw(zznl zznlVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.f13448a = str;
        this.f13449b = str2;
        this.f13450c = zzrVar;
        this.f13451d = zzcsVar;
        this.f13452e = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpp zzppVar;
        com.google.android.gms.internal.measurement.zzcs zzcsVar = this.f13451d;
        String str = this.f13449b;
        String str2 = this.f13448a;
        zznl zznlVar = this.f13452e;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzgb zzgbVar = zznlVar.f13489d;
                if (zzgbVar == null) {
                    zzic zzicVar = zznlVar.f13202a;
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12942f.c(str2, str, "Failed to get conditional properties; not connected to service");
                    zzppVar = zzicVar.f13102i;
                } else {
                    arrayList = zzpp.b0(zzgbVar.Z0(str2, str, this.f13450c));
                    zznlVar.t();
                    zzppVar = zznlVar.f13202a.f13102i;
                }
            } catch (RemoteException e8) {
                zzgu zzguVar2 = zznlVar.f13202a.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.d("Failed to get conditional properties; remote exception", str2, str, e8);
            }
            zzic.k(zzppVar);
            zzppVar.a0(zzcsVar, arrayList);
        } catch (Throwable th2) {
            zzpp zzppVar2 = zznlVar.f13202a.f13102i;
            zzic.k(zzppVar2);
            zzppVar2.a0(zzcsVar, arrayList);
            throw th2;
        }
    }
}
