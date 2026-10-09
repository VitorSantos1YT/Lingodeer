package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f13395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zznl f13398f;

    public zzmc(zznl zznlVar, String str, String str2, zzr zzrVar, boolean z11, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.f13393a = str;
        this.f13394b = str2;
        this.f13395c = zzrVar;
        this.f13396d = z11;
        this.f13397e = zzcsVar;
        this.f13398f = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e8;
        String str = this.f13393a;
        com.google.android.gms.internal.measurement.zzcs zzcsVar = this.f13397e;
        zznl zznlVar = this.f13398f;
        Bundle bundle2 = new Bundle();
        try {
            zzgb zzgbVar = zznlVar.f13489d;
            zzic zzicVar = zznlVar.f13202a;
            String str2 = this.f13394b;
            if (zzgbVar == null) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.c(str, str2, "Failed to get user properties; not connected to service");
                zzpp zzppVar = zzicVar.f13102i;
                zzic.k(zzppVar);
                zzppVar.Z(zzcsVar, bundle2);
                return;
            }
            List<zzpl> listR0 = zzgbVar.R0(str, str2, this.f13396d, this.f13395c);
            bundle = new Bundle();
            if (listR0 != null) {
                for (zzpl zzplVar : listR0) {
                    String str3 = zzplVar.f13637e;
                    String str4 = zzplVar.f13634b;
                    if (str3 != null) {
                        bundle.putString(str4, str3);
                    } else {
                        Long l9 = zzplVar.f13636d;
                        if (l9 != null) {
                            bundle.putLong(str4, l9.longValue());
                        } else {
                            Double d5 = zzplVar.f13639t;
                            if (d5 != null) {
                                bundle.putDouble(str4, d5.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    zznlVar.t();
                    zzpp zzppVar2 = zzicVar.f13102i;
                    zzic.k(zzppVar2);
                    zzppVar2.Z(zzcsVar, bundle);
                } catch (RemoteException e10) {
                    e8 = e10;
                    zzgu zzguVar2 = zznlVar.f13202a.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.c(str, e8, "Failed to get user properties; remote exception");
                    zzpp zzppVar3 = zznlVar.f13202a.f13102i;
                    zzic.k(zzppVar3);
                    zzppVar3.Z(zzcsVar, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                zzpp zzppVar4 = zznlVar.f13202a.f13102i;
                zzic.k(zzppVar4);
                zzppVar4.Z(zzcsVar, bundle2);
                throw th;
            }
        } catch (RemoteException e11) {
            bundle = bundle2;
            e8 = e11;
        } catch (Throwable th3) {
            th = th3;
            zzpp zzppVar5 = zznlVar.f13202a.f13102i;
            zzic.k(zzppVar5);
            zzppVar5.Z(zzcsVar, bundle2);
            throw th;
        }
    }
}
