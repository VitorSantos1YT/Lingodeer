package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AsyncCallable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AsyncCallable f12060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f12061b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f12060a = null;
        this.f12061b = null;
    }
}
