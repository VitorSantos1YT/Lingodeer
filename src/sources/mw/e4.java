package mw;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e4 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f42415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42416d = -1;

    public e4(byte[] bArr, int i11, int i12) {
        Preconditions.e("offset must be >= 0", i11 >= 0);
        Preconditions.e("length must be >= 0", i12 >= 0);
        int i13 = i12 + i11;
        Preconditions.e("offset + length exceeds array boundary", i13 <= bArr.length);
        this.f42415c = bArr;
        this.f42413a = i11;
        this.f42414b = i13;
    }

    @Override // mw.d
    public final void b() {
        this.f42416d = this.f42413a;
    }

    @Override // mw.d
    public final d d(int i11) {
        a(i11);
        int i12 = this.f42413a;
        this.f42413a = i12 + i11;
        return new e4(this.f42415c, i12, i11);
    }

    @Override // mw.d
    public final void e(OutputStream outputStream, int i11) throws IOException {
        a(i11);
        outputStream.write(this.f42415c, this.f42413a, i11);
        this.f42413a += i11;
    }

    @Override // mw.d
    public final void f(ByteBuffer byteBuffer) {
        Preconditions.k(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.f42415c, this.f42413a, iRemaining);
        this.f42413a += iRemaining;
    }

    @Override // mw.d
    public final void h(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f42415c, this.f42413a, bArr, i11, i12);
        this.f42413a += i12;
    }

    @Override // mw.d
    public final int i() {
        a(1);
        int i11 = this.f42413a;
        this.f42413a = i11 + 1;
        return this.f42415c[i11] & 255;
    }

    @Override // mw.d
    public final int p() {
        return this.f42414b - this.f42413a;
    }

    @Override // mw.d
    public final void q(int i11) {
        a(i11);
        this.f42413a += i11;
    }

    @Override // mw.d
    public final void reset() {
        int i11 = this.f42416d;
        if (i11 == -1) {
            throw new InvalidMarkException();
        }
        this.f42413a = i11;
    }
}
