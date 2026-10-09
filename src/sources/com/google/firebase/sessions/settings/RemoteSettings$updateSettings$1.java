package com.google.firebase.sessions.settings;

import a00.a;
import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
final class RemoteSettings$updateSettings$1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f21062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RemoteSettings f21064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$1(RemoteSettings remoteSettings, c cVar) {
        super(cVar);
        this.f21064c = remoteSettings;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f21063b = obj;
        this.f21065d |= Integer.MIN_VALUE;
        return this.f21064c.d(this);
    }
}
