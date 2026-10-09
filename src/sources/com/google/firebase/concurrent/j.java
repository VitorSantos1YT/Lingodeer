package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f18201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18202c;

    public /* synthetic */ j(Runnable runnable, Object obj, int i11) {
        this.f18200a = i11;
        this.f18201b = runnable;
        this.f18202c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18200a) {
            case 0:
                this.f18201b.run();
                break;
            default:
                this.f18201b.run();
                break;
        }
        return this.f18202c;
    }
}
