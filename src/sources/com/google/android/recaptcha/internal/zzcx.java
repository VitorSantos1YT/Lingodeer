package com.google.android.recaptcha.internal;

import qy.o;
import vy.d;
import wy.a;
import xy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcx extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo208executegIAlus = this.zzb.mo208executegIAlus(null, this);
        return objMo208executegIAlus == a.COROUTINE_SUSPENDED ? objMo208executegIAlus : new o(objMo208executegIAlus);
    }
}
