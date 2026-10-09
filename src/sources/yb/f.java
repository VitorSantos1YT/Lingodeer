package yb;

import java.io.EOFException;
import java.io.IOException;
import m00.h0;
import m00.i;
import m00.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f57585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57586c;

    public f(h0 h0Var, a aVar) {
        super(h0Var);
        this.f57585b = aVar;
    }

    @Override // m00.q, m00.h0
    public final void K0(i iVar, long j11) throws EOFException {
        if (this.f57586c) {
            iVar.skip(j11);
            return;
        }
        try {
            super.K0(iVar, j11);
        } catch (IOException e8) {
            this.f57586c = true;
            this.f57585b.invoke(e8);
        }
    }

    @Override // m00.q, m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e8) {
            this.f57586c = true;
            this.f57585b.invoke(e8);
        }
    }

    @Override // m00.q, m00.h0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e8) {
            this.f57586c = true;
            this.f57585b.invoke(e8);
        }
    }
}
