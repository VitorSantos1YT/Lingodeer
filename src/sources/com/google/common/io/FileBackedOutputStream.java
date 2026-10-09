package com.google.common.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class FileBackedOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f17450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MemoryOutput f17451b;

    /* JADX INFO: renamed from: com.google.common.io.FileBackedOutputStream$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ByteSource {
        public final void finalize() {
            try {
                throw null;
            } catch (Throwable th2) {
                th2.printStackTrace(System.err);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.FileBackedOutputStream$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends ByteSource {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        public final byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    public final void a(int i11) throws IOException {
        MemoryOutput memoryOutput = this.f17451b;
        if (memoryOutput == null || memoryOutput.getCount() + i11 <= 0) {
            return;
        }
        File fileA = TempFileCreator.f17458a.a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            fileOutputStream.write(this.f17451b.a(), 0, this.f17451b.getCount());
            fileOutputStream.flush();
            this.f17450a = fileOutputStream;
            this.f17451b = null;
        } catch (IOException e8) {
            fileA.delete();
            throw e8;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f17450a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        this.f17450a.flush();
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i11) {
        a(1);
        this.f17450a.write(i11);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i11, int i12) {
        a(i12);
        this.f17450a.write(bArr, i11, i12);
    }
}
