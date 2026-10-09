package com.google.android.recaptcha.internal;

import fz.e;
import rz.b0;
import rz.s;
import rz.t;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdx extends i implements e {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzdx(this.zzb, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        com.bumptech.glide.e.F(obj);
        if (i11 == 0) {
            s sVar = this.zzb.zzc;
            this.zza = 1;
            if (((t) sVar).o(this) == aVar) {
                return aVar;
            }
        }
        return qy.b0.f48488a;
    }
}
