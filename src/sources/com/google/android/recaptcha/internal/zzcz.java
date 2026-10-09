package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import fz.e;
import qy.b0;
import qy.o;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcz extends i implements e {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j11, RecaptchaAction recaptchaAction, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzdcVar;
        this.zzc = j11;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (d) obj2)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        com.bumptech.glide.e.F(obj);
        if (i11 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j11 = this.zzc;
            zzcn zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j11, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new o((String) obj);
    }
}
