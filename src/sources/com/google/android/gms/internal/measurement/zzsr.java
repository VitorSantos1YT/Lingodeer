package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsr implements zzrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11955a = false;

    static {
        new AtomicInteger();
    }

    private zzsr() {
    }

    public static zzsr b() {
        return new zzsr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) throws IOException {
        if (this.f11955a) {
            if (zzrsVar.f11921b.isEmpty()) {
                return zzrsVar.f11920a.c(zzrsVar.f11923d);
            }
            throw new zzsk("Short circuit would skip transforms.");
        }
        InputStream inputStreamC = zzst.c(zzrsVar);
        zzsj zzsjVar = new zzsj(inputStreamC);
        try {
            if (!(inputStreamC instanceof zzsf)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((zzsf) inputStreamC).zza();
            zzsjVar.close();
            return fileZza;
        } catch (Throwable th2) {
            try {
                zzsjVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
