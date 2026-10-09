package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzlu f13419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznl f13420b;

    public zzmn(zznl zznlVar, zzlu zzluVar) {
        this.f13419a = zzluVar;
        Objects.requireNonNull(zznlVar);
        this.f13420b = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.f13420b;
        zzgb zzgbVar = zznlVar.f13489d;
        zzic zzicVar = zznlVar.f13202a;
        if (zzgbVar == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Failed to send current screen to service");
            return;
        }
        try {
            zzlu zzluVar = this.f13419a;
            if (zzluVar == null) {
                zzgbVar.M(0L, null, null, zzicVar.f13094a.getPackageName());
            } else {
                zzgbVar.M(zzluVar.f13357c, zzluVar.f13355a, zzluVar.f13356b, zzicVar.f13094a.getPackageName());
            }
            zznlVar.t();
        } catch (RemoteException e8) {
            zzgu zzguVar2 = zznlVar.f13202a.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8, "Failed to send current screen to the service");
        }
    }
}
