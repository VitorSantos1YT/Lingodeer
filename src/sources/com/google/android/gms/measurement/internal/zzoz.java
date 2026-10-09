package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoz implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzpg f13576b;

    public zzoz(zzpg zzpgVar, zzr zzrVar) {
        this.f13575a = zzrVar;
        Objects.requireNonNull(zzpgVar);
        this.f13576b = zzpgVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzr zzrVar = this.f13575a;
        String str = zzrVar.f13655a;
        Preconditions.g(str);
        zzpg zzpgVar = this.f13576b;
        zzjl zzjlVarD = zzpgVar.d(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (zzjlVarD.i(zzjkVar) && zzjl.c(100, zzrVar.U).i(zzjkVar)) {
            return zzpgVar.d0(zzrVar).F();
        }
        zzpgVar.b().f12949n.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
