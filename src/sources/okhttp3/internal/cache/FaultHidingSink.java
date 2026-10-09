package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.m;
import m00.i;
import m00.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class FaultHidingSink extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45213b;

    @Override // m00.q, m00.h0
    public final void K0(i source, long j11) throws EOFException {
        m.f(source, "source");
        if (this.f45213b) {
            source.skip(j11);
            return;
        }
        try {
            super.K0(source, j11);
        } catch (IOException unused) {
            this.f45213b = true;
            throw null;
        }
    }

    @Override // m00.q, m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException unused) {
            this.f45213b = true;
            throw null;
        }
    }

    @Override // m00.q, m00.h0, java.io.Flushable
    public final void flush() {
        if (this.f45213b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f45213b = true;
            throw null;
        }
    }
}
