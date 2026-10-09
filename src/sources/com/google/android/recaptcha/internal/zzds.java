package com.google.android.recaptcha.internal;

import fz.e;
import rz.b0;
import rz.e0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzds extends i implements e {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzds(this.zzb, this.zzc, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        com.bumptech.glide.e.F(obj);
        if (i11 == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = e0.M(zzdtVar.zzi.zza().getCoroutineContext(), new zzdh(zzdtVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
