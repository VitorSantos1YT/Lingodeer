package com.google.android.recaptcha.internal;

import com.bumptech.glide.e;
import fz.c;
import qy.b0;
import rz.e0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdy extends i implements c {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j11, zzec zzecVar, d dVar) {
        super(1, dVar);
        this.zzb = j11;
        this.zzc = zzecVar;
    }

    @Override // xy.a
    public final d create(d dVar) {
        return new zzdy(this.zzb, this.zzc, dVar);
    }

    @Override // fz.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((d) obj)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        e.F(obj);
        if (i11 == 0) {
            long j11 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (e0.N(j11, zzdxVar, this) == aVar) {
                return aVar;
            }
        }
        return b0.f48488a;
    }
}
