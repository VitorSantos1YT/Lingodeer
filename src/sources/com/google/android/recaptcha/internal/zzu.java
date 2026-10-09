package com.google.android.recaptcha.internal;

import fz.e;
import java.util.Iterator;
import qy.o;
import rz.b0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzu extends i implements e {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, d dVar) {
        super(2, dVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzu(this.zzd, this.zze, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        zzse zzseVarZzj;
        Iterator it;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzseVarZzj = (zzse) this.zza;
            com.bumptech.glide.e.F(obj);
        } else {
            com.bumptech.glide.e.F(obj);
            if (!this.zzd.zzS()) {
                return new o(com.bumptech.glide.e.l(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzseVarZzj = this.zzd.zzj();
            if (zzseVarZzj.zzi().zzd() == 0) {
                return new o(com.bumptech.glide.e.l(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzseVarZzj.zzi();
            it = this.zze.zzb.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzseVarZzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzseVarZzj, this) == aVar) {
                return aVar;
            }
        }
        return new o(qy.b0.f48488a);
    }
}
