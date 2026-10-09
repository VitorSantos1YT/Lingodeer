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
final class zzeb extends i implements e {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ s zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, s sVar, long j11, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
        this.zzc = sVar;
        this.zzd = j11;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e8;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            try {
                com.bumptech.glide.e.F(obj);
                zzebVar = this;
            } catch (zzbd e10) {
                zzbdVar = e10;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((t) zzebVar.zzc).X(zzbdVar);
            }
        } else {
            com.bumptech.glide.e.F(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (zzbd e11) {
                    e8 = e11;
                    zzbdVar = e8;
                    zzebVar.zzb.zzf = zzcm.zzd;
                    ((t) zzebVar.zzc).X(zzbdVar);
                }
            } catch (zzbd e12) {
                e8 = e12;
                zzebVar = this;
                zzbdVar = e8;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((t) zzebVar.zzc).X(zzbdVar);
            }
        }
        ((Boolean) obj).getClass();
        return qy.b0.f48488a;
    }
}
