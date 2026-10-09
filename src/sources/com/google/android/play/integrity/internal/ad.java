package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ad implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae f16225a;

    public /* synthetic */ ad(ae aeVar) {
        this.f16225a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ae aeVar = this.f16225a;
        aeVar.f16228b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        aeVar.a().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ae aeVar = this.f16225a;
        aeVar.f16228b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        aeVar.a().post(new ab(this));
    }
}
