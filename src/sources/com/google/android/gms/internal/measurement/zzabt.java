package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabt implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f11191b = new zzabs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11192a = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i11 = this.f11192a;
        if (i11 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f11192a = i11 - 1;
    }
}
