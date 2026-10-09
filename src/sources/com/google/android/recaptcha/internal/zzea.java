package com.google.android.recaptcha.internal;

import com.bumptech.glide.e;
import fz.c;
import qy.b0;
import rz.s;
import rz.t;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzea extends i implements c {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ s zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j11, s sVar, d dVar) {
        super(1, dVar);
        this.zzc = zzecVar;
        this.zzd = j11;
        this.zze = sVar;
    }

    @Override // xy.a
    public final d create(d dVar) {
        return new zzea(this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // fz.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((d) obj)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        zzbd e8;
        zzen zzenVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zzb;
        if (i11 == 0) {
            e.F(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j11 = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j11, this);
                if (objZzo != aVar) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return aVar;
            } catch (zzbd e10) {
                zzenVar = zzenVarZzf;
                e8 = e10;
                this.zzc.zzd = e8;
                zzenVar.zzb(e8);
                throw e8;
            }
        }
        if (i11 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                e.F(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(((t) this.zze).J(b0.f48488a));
            } catch (zzbd e11) {
                e8 = e11;
                this.zzc.zzd = e8;
                zzenVar.zzb(e8);
                throw e8;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            e.F(obj);
        } catch (zzbd e12) {
            e8 = e12;
            zzenVar = zzenVar2;
            this.zzc.zzd = e8;
            zzenVar.zzb(e8);
            throw e8;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j12 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j12, this) != aVar) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((t) this.zze).J(b0.f48488a));
        }
        return aVar;
    }
}
