package com.google.android.recaptcha.internal;

import fz.e;
import java.util.List;
import ry.m;
import rz.b0;
import rz.e0;
import vy.d;
import wy.a;
import xy.f;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfq extends i implements e {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, d dVar) {
        super(2, dVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, dVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        qy.b0 b0Var = qy.b0.f48488a;
        com.bumptech.glide.e.F(obj);
        if (i11 != 0) {
            return b0Var;
        }
        b0 b0Var2 = (b0) this.zze;
        while (true) {
            zzgd zzgdVar = this.zzb;
            if (zzgdVar.zza() < 0) {
                break;
            }
            if (zzgdVar.zza() >= this.zzc.size() || !e0.w(b0Var2)) {
                break;
            }
            zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
            try {
                zzft.zzf(this.zzd, zzufVar, this.zzb);
            } catch (Exception e8) {
                zzufVar.zzk();
                f.a(zzufVar.zzg());
                m.y0(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                zzft zzftVar = this.zzd;
                zzgd zzgdVar2 = this.zzb;
                this.zza = 1;
                if (zzftVar.zzh(e8, zzgdVar2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return b0Var;
    }
}
