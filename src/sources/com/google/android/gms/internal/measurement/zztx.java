package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.Futures;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zztx extends zzuw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzuw f12000a = new zztx();

    private zztx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    public final void a(zzti zztiVar) {
        zztiVar.getClass();
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    public final zzui b(zztr zztrVar, String str, Executor executor, zzru zzruVar, zzti zztiVar) {
        zzadf zzadfVarA;
        zztiVar.getClass();
        zzte zzteVar = (zzte) zztrVar;
        if (zzteVar.f11975f) {
            zzadfVarA = zzadf.a();
        } else {
            zzadf zzadfVar = zzadf.f11253b;
            int i11 = zzacf.f11197a;
            zzadfVarA = zzadf.f11254c;
        }
        return new zzui(str, Futures.g(zzteVar.f11970a), new zzvd(zzteVar.f11971b, zzadfVarA), executor, zzruVar, zzteVar.f11972c, new zzwa());
    }
}
