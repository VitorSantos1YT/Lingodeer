package com.google.firebase.sessions.settings;

import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
final class RemoteSettings$updateSettings$2$2 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21069a;

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, dVar);
        remoteSettings$updateSettings$2$2.f21069a = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = (RemoteSettings$updateSettings$2$2) create((String) obj, (d) obj2);
        b0 b0Var = b0.f48488a;
        remoteSettings$updateSettings$2$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return b0.f48488a;
    }
}
