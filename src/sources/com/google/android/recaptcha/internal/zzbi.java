package com.google.android.recaptcha.internal;

import ew.a;
import java.util.concurrent.Executors;
import rz.a1;
import rz.b0;
import rz.b2;
import rz.e0;
import rz.o0;
import wz.d;
import wz.m;
import yz.e;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi {
    private final b0 zza;
    private final b0 zzb;
    private final b0 zzc;
    private final b0 zzd;

    public zzbi() {
        b2 b2VarE = e0.e();
        f fVar = o0.f50940a;
        this.zza = new d(a.w(b2VarE, m.f55536a));
        d dVarC = e0.c(new a1(Executors.newSingleThreadExecutor()));
        e0.B(dVarC, null, null, new zzbh(null), 3);
        this.zzb = dVarC;
        this.zzc = e0.c(e.f58387a);
        d dVarC2 = e0.c(new a1(Executors.newSingleThreadExecutor()));
        e0.B(dVarC2, null, null, new zzbg(null), 3);
        this.zzd = dVarC2;
    }

    public final b0 zza() {
        return this.zzc;
    }

    public final b0 zzb() {
        return this.zza;
    }

    public final b0 zzc() {
        return this.zzd;
    }

    public final b0 zzd() {
        return this.zzb;
    }
}
