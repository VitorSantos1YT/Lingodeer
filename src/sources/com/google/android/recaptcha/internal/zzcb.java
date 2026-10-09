package com.google.android.recaptcha.internal;

import a00.a;
import a00.e;
import kotlin.jvm.internal.m;
import qy.b0;
import ry.l;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcb {
    private Object zza;
    private final a zzb = new e();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zza(Object obj, d dVar) {
        zzby zzbyVar;
        a aVar;
        zzcb zzcbVar;
        if (dVar instanceof zzby) {
            zzbyVar = (zzby) dVar;
            int i11 = zzbyVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzbyVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzbyVar = new zzby(this, dVar);
            }
        } else {
            zzbyVar = new zzby(this, dVar);
        }
        Object obj2 = zzbyVar.zzb;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = zzbyVar.zzd;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            aVar = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = aVar;
            zzbyVar.zzd = 1;
            if (aVar.b(zzbyVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar3 = (a) zzbyVar.zza;
            zzje zzjeVar = zzbyVar.zzf;
            zzcbVar = zzbyVar.zze;
            com.bumptech.glide.e.F(obj2);
            aVar = aVar3;
            obj = zzjeVar;
        }
        try {
            return Boolean.valueOf(m.a(zzcbVar.zza, obj));
        } finally {
            aVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(Object[] objArr, d dVar) {
        zzbz zzbzVar;
        a aVar;
        zzcb zzcbVar;
        if (dVar instanceof zzbz) {
            zzbzVar = (zzbz) dVar;
            int i11 = zzbzVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzbzVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzbzVar = new zzbz(this, dVar);
            }
        } else {
            zzbzVar = new zzbz(this, dVar);
        }
        Object obj = zzbzVar.zzb;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = zzbzVar.zzd;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            aVar = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = aVar;
            zzbzVar.zzd = 1;
            if (aVar.b(zzbzVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar3 = (a) zzbzVar.zza;
            zzje[] zzjeVarArr = zzbzVar.zzf;
            zzcbVar = zzbzVar.zze;
            com.bumptech.glide.e.F(obj);
            aVar = aVar3;
            objArr = zzjeVarArr;
        }
        try {
            return Boolean.valueOf(l.D(objArr, zzcbVar.zza));
        } finally {
            aVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(Object obj, d dVar) {
        zzca zzcaVar;
        a aVar;
        zzcb zzcbVar;
        if (dVar instanceof zzca) {
            zzcaVar = (zzca) dVar;
            int i11 = zzcaVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, dVar);
            }
        } else {
            zzcaVar = new zzca(this, dVar);
        }
        Object obj2 = zzcaVar.zzb;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = zzcaVar.zzd;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            aVar = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = aVar;
            zzcaVar.zzd = 1;
            if (aVar.b(zzcaVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar3 = (a) zzcaVar.zza;
            zzje zzjeVar = zzcaVar.zzf;
            zzcbVar = zzcaVar.zze;
            com.bumptech.glide.e.F(obj2);
            aVar = aVar3;
            obj = zzjeVar;
        }
        try {
            zzcbVar.zza = obj;
            return b0.f48488a;
        } finally {
            aVar.a(null);
        }
    }
}
