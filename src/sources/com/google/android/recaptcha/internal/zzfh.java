package com.google.android.recaptcha.internal;

import fz.e;
import rz.b0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfh extends i implements e {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, d dVar) {
        super(2, dVar);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzfh(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        zzew zzewVarZza = null;
        try {
            try {
                zzewVarZza = zzfj.zza(this.zza).zza(this.zzb.zzd());
                zzewVarZza.zzc();
                zzewVarZza.zze(this.zzc.zzd());
                zzsr zzsrVar = (zzsr) zzewVarZza.zza(zzsr.zzi());
                zzewVarZza.zzd();
                return zzsrVar;
            } catch (zzbd e8) {
                throw e8;
            } catch (Exception e10) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e10.getMessage());
            }
        } catch (Throwable th2) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th2;
        }
    }
}
