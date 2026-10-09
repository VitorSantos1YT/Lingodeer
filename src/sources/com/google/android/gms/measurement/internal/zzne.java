package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzne implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f13470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznf f13471b;

    public zzne(zznf zznfVar, ConnectionResult connectionResult) {
        this.f13470a = connectionResult;
        this.f13471b = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.f13471b.f13474c;
        zznlVar.f13489d = null;
        if (this.f13470a.f8631b != 7777) {
            zznlVar.v();
            return;
        }
        if (zznlVar.f13492g == null) {
            zznlVar.f13492g = Executors.newScheduledThreadPool(1);
        }
        zznlVar.f13492g.schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznc
            @Override // java.lang.Runnable
            public final void run() {
                final zznl zznlVar2 = this.f13468a.f13471b.f13474c;
                zzhz zzhzVar = zznlVar2.f13202a.f13100g;
                zzic.m(zzhzVar);
                zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zznlVar2.m();
                    }
                });
            }
        }, ((Long) zzfy.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
