package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsj implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Closeable f11950a;

    public zzsj(InputStream inputStream) {
        this.f11950a = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.f11950a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
