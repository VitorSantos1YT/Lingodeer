package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import fz.e;
import qy.o;
import rz.b0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzda extends i implements e {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j11, d dVar) {
        super(2, dVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j11;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objZzf;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        com.bumptech.glide.e.F(obj);
        if (i11 != 0) {
            objZzf = ((o) obj).f48498a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j11 = this.zzd;
            this.zza = 1;
            objZzf = zzdcVar.zzf(recaptchaAction, j11, this);
            if (objZzf == aVar) {
                return aVar;
            }
        }
        com.bumptech.glide.e.F(objZzf);
        return objZzf;
    }
}
