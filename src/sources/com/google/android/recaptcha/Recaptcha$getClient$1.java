package com.google.android.recaptcha;

import qy.o;
import vy.d;
import wy.a;
import xy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM206getClientBWLJW6A = this.zzb.m206getClientBWLJW6A(null, null, 0L, this);
        return objM206getClientBWLJW6A == a.COROUTINE_SUSPENDED ? objM206getClientBWLJW6A : new o(objM206getClientBWLJW6A);
    }
}
