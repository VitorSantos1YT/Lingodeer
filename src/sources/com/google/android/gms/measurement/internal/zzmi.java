package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f13409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zznl f13410c;

    public zzmi(zznl zznlVar, AtomicReference atomicReference, zzr zzrVar) {
        this.f13408a = atomicReference;
        this.f13409b = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.f13410c = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f13408a;
        synchronized (atomicReference2) {
            try {
                try {
                    zznl zznlVar = this.f13410c;
                    zzic zzicVar = zznlVar.f13202a;
                    zzhh zzhhVar = zzicVar.f13098e;
                    zzic.k(zzhhVar);
                    if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                        zzgb zzgbVar = zznlVar.f13489d;
                        if (zzgbVar != null) {
                            atomicReference2.set(zzgbVar.Y0(this.f13409b));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                zzlj zzljVar = zznlVar.f13202a.m;
                                zzic.l(zzljVar);
                                zzljVar.f13328g.set(str);
                                zzhh zzhhVar2 = zzicVar.f13098e;
                                zzic.k(zzhhVar2);
                                zzhhVar2.f13024g.b(str);
                            }
                            zznlVar.t();
                            atomicReference = this.f13408a;
                            atomicReference.notify();
                            return;
                        }
                        zzgu zzguVar = zzicVar.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.a("Failed to get app instance id");
                    } else {
                        zzgu zzguVar2 = zzicVar.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.f12947k.a("Analytics storage consent denied; will not get app instance id");
                        zzlj zzljVar2 = zznlVar.f13202a.m;
                        zzic.l(zzljVar2);
                        zzljVar2.f13328g.set(null);
                        zzhh zzhhVar3 = zzicVar.f13098e;
                        zzic.k(zzhhVar3);
                        zzhhVar3.f13024g.b(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e8) {
                    zzgu zzguVar3 = this.f13410c.f13202a.f13099f;
                    zzic.m(zzguVar3);
                    zzguVar3.f12942f.b(e8, "Failed to get app instance id");
                    atomicReference = this.f13408a;
                }
            } catch (Throwable th2) {
                this.f13408a.notify();
                throw th2;
            }
        }
    }
}
