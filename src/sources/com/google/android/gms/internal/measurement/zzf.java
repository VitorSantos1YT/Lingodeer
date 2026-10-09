package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaw f11591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzg f11592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzg f11593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzj f11594d;

    public zzf() {
        zzaw zzawVar = new zzaw();
        this.f11591a = zzawVar;
        zzg zzgVar = new zzg(null, zzawVar);
        this.f11593c = zzgVar;
        this.f11592b = zzgVar.c();
        zzj zzjVar = new zzj();
        this.f11594d = zzjVar;
        zzgVar.e("require", new zzw(zzjVar));
        zzjVar.f11614a.put("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzy();
            }
        });
        zzgVar.e("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzao a(zzg zzgVar, zzje... zzjeVarArr) {
        zzao zzaoVarB = zzao.f11445j;
        for (zzje zzjeVar : zzjeVarArr) {
            zzaoVarB = zzi.b(zzjeVar);
            zzh.k(this.f11593c);
            if ((zzaoVarB instanceof zzap) || (zzaoVarB instanceof zzan)) {
                zzaoVarB = this.f11591a.b(zzgVar, zzaoVarB);
            }
        }
        return zzaoVarB;
    }
}
