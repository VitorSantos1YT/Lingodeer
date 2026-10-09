package com.google.android.recaptcha.internal;

import fz.e;
import qy.o;
import rz.b0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzj extends i implements e {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j11, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = j11;
        this.zzd = zzscVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objZze;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        com.bumptech.glide.e.F(obj);
        if (i11 != 0) {
            objZze = ((o) obj).f48498a;
        } else {
            zze zzeVar = this.zzb;
            long j11 = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j11, zzscVar, this);
            if (objZze == aVar) {
                return aVar;
            }
        }
        return new o(objZze);
    }
}
