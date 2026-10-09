package com.google.common.io;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class AppendableWriter extends Writer {
    public final void a() throws IOException {
        throw new IOException("Cannot write to a closed writer.");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c11) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i11, int i12) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c11) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(int i11) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        str.getClass();
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i11, int i12) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(String str, int i11, int i12) throws IOException {
        str.getClass();
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
