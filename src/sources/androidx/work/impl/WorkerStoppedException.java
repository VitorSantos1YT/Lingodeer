package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2800a;

    public WorkerStoppedException(int i11) {
        this.f2800a = i11;
    }
}
