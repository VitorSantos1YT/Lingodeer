package com.google.firebase.database.connection.util;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class StringListReader extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19174b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19175c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19177e = this.f19175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19176d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19178f = this.f19176d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19179t = false;

    public StringListReader() {
        this.f19173a = null;
        this.f19173a = new ArrayList();
    }

    public final long a(long j11) {
        long j12 = 0;
        while (this.f19176d < this.f19173a.size() && j12 < j11) {
            String strC = c();
            long j13 = j11 - j12;
            long length = strC == null ? 0 : strC.length() - this.f19175c;
            if (j13 < length) {
                this.f19175c = (int) (((long) this.f19175c) + j13);
                j12 += j13;
            } else {
                j12 += length;
                this.f19175c = 0;
                this.f19176d++;
            }
        }
        return j12;
    }

    public final void b() throws IOException {
        if (this.f19174b) {
            throw new IOException("Stream already closed");
        }
        if (!this.f19179t) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    public final String c() {
        int i11 = this.f19176d;
        ArrayList arrayList = this.f19173a;
        if (i11 < arrayList.size()) {
            return (String) arrayList.get(this.f19176d);
        }
        return null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b();
        this.f19174b = true;
    }

    @Override // java.io.Reader
    public final void mark(int i11) throws IOException {
        b();
        this.f19177e = this.f19175c;
        this.f19178f = this.f19176d;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) throws IOException {
        b();
        int iRemaining = charBuffer.remaining();
        String strC = c();
        int i11 = 0;
        while (iRemaining > 0 && strC != null) {
            int iMin = Math.min(strC.length() - this.f19175c, iRemaining);
            String str = (String) this.f19173a.get(this.f19176d);
            int i12 = this.f19175c;
            charBuffer.put(str, i12, i12 + iMin);
            iRemaining -= iMin;
            i11 += iMin;
            a(iMin);
            strC = c();
        }
        if (i11 > 0 || strC != null) {
            return i11;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        b();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f19175c = this.f19177e;
        this.f19176d = this.f19178f;
    }

    @Override // java.io.Reader
    public final long skip(long j11) throws IOException {
        b();
        return a(j11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f19173a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            sb2.append((String) obj);
        }
        return sb2.toString();
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        b();
        String strC = c();
        if (strC == null) {
            return -1;
        }
        char cCharAt = strC.charAt(this.f19175c);
        a(1L);
        return cCharAt;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i11, int i12) throws IOException {
        b();
        String strC = c();
        int i13 = 0;
        while (strC != null && i13 < i12) {
            String strC2 = c();
            int iMin = Math.min(strC2 == null ? 0 : strC2.length() - this.f19175c, i12 - i13);
            int i14 = this.f19175c;
            strC.getChars(i14, i14 + iMin, cArr, i11 + i13);
            i13 += iMin;
            a(iMin);
            strC = c();
        }
        if (i13 > 0 || strC != null) {
            return i13;
        }
        return -1;
    }
}
