package com.google.firebase.inappmessaging.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements yw.b, yw.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f20090a;

    @Override // yw.b
    public void accept(Object obj) {
        this.f20090a.setResult(obj);
    }

    @Override // yw.c
    public Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        boolean z11 = th2 instanceof Exception;
        TaskCompletionSource taskCompletionSource = this.f20090a;
        if (z11) {
            taskCompletionSource.setException((Exception) th2);
        } else {
            taskCompletionSource.setException(new RuntimeException(th2));
        }
        return fx.e.f28235a;
    }
}
