package com.google.android.recaptcha.internal;

import fz.e;
import kotlin.jvm.internal.y;
import rz.b0;
import rz.e0;
import rz.s;
import rz.t;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzam extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzam(this.zzc, this.zzd, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        y yVar;
        Exception e8;
        Throwable th2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzb != 0) {
            yVar = (y) this.zza;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (Exception e10) {
                e8 = e10;
                s sVarZzf = this.zzc.zzf();
                th2 = (Throwable) yVar.f38361a;
                if (th2 == null) {
                    th2 = e8;
                }
                ((t) sVarZzf).X(th2);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e8.getMessage()));
            }
        } else {
            com.bumptech.glide.e.F(obj);
            y yVar2 = new y();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, yVar2, null);
                this.zza = yVar2;
                this.zzb = 1;
                if (e0.N(60000L, zzalVar, this) == aVar) {
                    return aVar;
                }
            } catch (Exception e11) {
                yVar = yVar2;
                e8 = e11;
                s sVarZzf2 = this.zzc.zzf();
                th2 = (Throwable) yVar.f38361a;
                if (th2 == null) {
                    th2 = e8;
                }
                ((t) sVarZzf2).X(th2);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e8.getMessage()));
            }
        }
        return qy.b0.f48488a;
    }
}
