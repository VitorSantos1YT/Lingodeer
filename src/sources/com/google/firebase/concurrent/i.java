package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f18199b;

    public /* synthetic */ i(Runnable runnable, int i11) {
        this.f18198a = i11;
        this.f18199b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18198a) {
            case 0:
                this.f18199b.run();
                break;
            default:
                this.f18199b.run();
                break;
        }
        return null;
    }
}
