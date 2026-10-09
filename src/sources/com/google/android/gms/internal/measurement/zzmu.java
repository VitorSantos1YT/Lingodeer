package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmu implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Inflater f11739a = new Inflater(true);

    private zzmu() {
    }

    public static zzmu a() {
        return new zzmu();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11739a.end();
    }
}
