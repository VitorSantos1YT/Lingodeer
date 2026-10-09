package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class IterableByteBufferInputStream extends InputStream {
    public int H;
    public long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f21287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f21288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21292f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f21293t;

    public final boolean a() {
        this.f21290d++;
        Iterator it = this.f21287a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f21288b = byteBuffer;
        this.f21291e = byteBuffer.position();
        if (this.f21288b.hasArray()) {
            this.f21292f = true;
            this.f21293t = this.f21288b.array();
            this.H = this.f21288b.arrayOffset();
        } else {
            this.f21292f = false;
            this.K = UnsafeUtil.b(this.f21288b);
            this.f21293t = null;
        }
        return true;
    }

    public final void b(int i11) {
        int i12 = this.f21291e + i11;
        this.f21291e = i12;
        if (i12 == this.f21288b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f21290d == this.f21289c) {
            return -1;
        }
        if (this.f21292f) {
            int i11 = this.f21293t[this.f21291e + this.H] & 255;
            b(1);
            return i11;
        }
        int iF = UnsafeUtil.f21417c.f(((long) this.f21291e) + this.K) & 255;
        b(1);
        return iF;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        if (this.f21290d == this.f21289c) {
            return -1;
        }
        int iLimit = this.f21288b.limit();
        int i13 = this.f21291e;
        int i14 = iLimit - i13;
        if (i12 > i14) {
            i12 = i14;
        }
        if (this.f21292f) {
            System.arraycopy(this.f21293t, i13 + this.H, bArr, i11, i12);
            b(i12);
            return i12;
        }
        int iPosition = this.f21288b.position();
        this.f21288b.position(this.f21291e);
        this.f21288b.get(bArr, i11, i12);
        this.f21288b.position(iPosition);
        b(i12);
        return i12;
    }
}
