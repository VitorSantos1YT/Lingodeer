package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbf f13423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f13424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zznl f13425e;

    public zzmo(zznl zznlVar, zzr zzrVar, boolean z11, zzbf zzbfVar, Bundle bundle) {
        this.f13421a = zzrVar;
        this.f13422b = z11;
        this.f13423c = zzbfVar;
        this.f13424d = bundle;
        Objects.requireNonNull(zznlVar);
        this.f13425e = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zznl zznlVar = this.f13425e;
        zzgb zzgbVar = zznlVar.f13489d;
        zzic zzicVar = zznlVar.f13202a;
        if (zzgbVar == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Failed to send default event parameters to service");
            return;
        }
        boolean zR = zzicVar.f13097d.r(null, zzfy.W0);
        zzr zzrVar = this.f13421a;
        if (zR) {
            zznlVar.y(zzgbVar, this.f13422b ? null : this.f13423c, zzrVar);
            return;
        }
        try {
            zzgbVar.z0(this.f13424d, zzrVar);
            zznlVar.t();
        } catch (RemoteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8, "Failed to send default event parameters to service");
        }
    }
}
