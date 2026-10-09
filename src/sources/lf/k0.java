package lf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f40055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f40056b;

    public k0(FileOutputStream fileOutputStream, n0 n0Var) {
        this.f40055a = fileOutputStream;
        this.f40056b = n0Var;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n0 n0Var = this.f40056b;
        try {
            this.f40055a.close();
        } finally {
            n0Var.a();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f40055a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i11, int i12) throws IOException {
        kotlin.jvm.internal.m.f(buffer, "buffer");
        this.f40055a.write(buffer, i11, i12);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) throws IOException {
        kotlin.jvm.internal.m.f(buffer, "buffer");
        this.f40055a.write(buffer);
    }

    @Override // java.io.OutputStream
    public final void write(int i11) throws IOException {
        this.f40055a.write(i11);
    }
}
