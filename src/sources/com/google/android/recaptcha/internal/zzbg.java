package com.google.android.recaptcha.internal;

import fz.e;
import rz.b0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbg extends i implements e {
    public zzbg(d dVar) {
        super(2, dVar);
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzbg(dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbg) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        Thread.currentThread().setPriority(8);
        return qy.b0.f48488a;
    }
}
