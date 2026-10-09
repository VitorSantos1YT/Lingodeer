package x7;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6.h f55899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55901d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55903f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f55904t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f55902e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f55898a = new byte[4096];

    static {
        y6.y.a("media3.extractor");
    }

    public j(y6.h hVar, long j11, long j12) {
        this.f55899b = hVar;
        this.f55901d = j11;
        this.f55900c = j12;
    }

    @Override // x7.n
    public final void A(byte[] bArr, int i11, int i12) {
        f(bArr, i11, i12, false);
    }

    @Override // x7.n
    public final boolean a(byte[] bArr, int i11, int i12, boolean z11) throws EOFException, InterruptedIOException {
        int iMin;
        int i13 = this.f55904t;
        if (i13 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i13, i12);
            System.arraycopy(this.f55902e, 0, bArr, i11, iMin);
            h(iMin);
        }
        int iG = iMin;
        while (iG < i12 && iG != -1) {
            iG = g(bArr, i11, i12, iG, z11);
        }
        if (iG != -1) {
            this.f55901d += (long) iG;
        }
        return iG != -1;
    }

    public final boolean b(int i11, boolean z11) throws EOFException, InterruptedIOException {
        e(i11);
        int iG = this.f55904t - this.f55903f;
        while (iG < i11) {
            int i12 = i11;
            boolean z12 = z11;
            iG = g(this.f55902e, this.f55903f, i12, iG, z12);
            if (iG == -1) {
                return false;
            }
            this.f55904t = this.f55903f + iG;
            i11 = i12;
            z11 = z12;
        }
        this.f55903f += i11;
        return true;
    }

    @Override // x7.n
    public final boolean d(int i11, boolean z11) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f55904t, i11);
        h(iMin);
        int iG = iMin;
        while (iG < i11 && iG != -1) {
            byte[] bArr = this.f55898a;
            iG = g(bArr, -iG, Math.min(i11, bArr.length + iG), iG, z11);
        }
        if (iG != -1) {
            this.f55901d += (long) iG;
        }
        return iG != -1;
    }

    public final void e(int i11) {
        int i12 = this.f55903f + i11;
        byte[] bArr = this.f55902e;
        if (i12 > bArr.length) {
            this.f55902e = Arrays.copyOf(this.f55902e, b7.f0.g(bArr.length * 2, 65536 + i12, i12 + 524288));
        }
    }

    @Override // x7.n
    public final boolean f(byte[] bArr, int i11, int i12, boolean z11) {
        if (!b(i12, z11)) {
            return false;
        }
        System.arraycopy(this.f55902e, this.f55903f - i12, bArr, i11, i12);
        return true;
    }

    public final int g(byte[] bArr, int i11, int i12, int i13, boolean z11) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i14 = this.f55899b.read(bArr, i11 + i13, i12 - i13);
        if (i14 != -1) {
            return i13 + i14;
        }
        if (i13 == 0 && z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x7.n
    public final long getLength() {
        return this.f55900c;
    }

    @Override // x7.n
    public final long getPosition() {
        return this.f55901d;
    }

    public final void h(int i11) {
        int i12 = this.f55904t - i11;
        this.f55904t = i12;
        this.f55903f = 0;
        byte[] bArr = this.f55902e;
        byte[] bArr2 = i12 < bArr.length - 524288 ? new byte[65536 + i12] : bArr;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        this.f55902e = bArr2;
    }

    @Override // x7.n
    public final long i() {
        return this.f55901d + ((long) this.f55903f);
    }

    @Override // x7.n
    public final void k(int i11) throws EOFException, InterruptedIOException {
        b(i11, false);
    }

    @Override // x7.n
    public final int m(int i11) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin = Math.min(this.f55904t, i11);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f55898a;
            jVar = this;
            iMin = jVar.g(bArr, 0, Math.min(i11, bArr.length), 0, true);
        } else {
            jVar = this;
        }
        if (iMin != -1) {
            jVar.f55901d += (long) iMin;
        }
        return iMin;
    }

    @Override // x7.n
    public final int n(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin;
        e(i12);
        int i13 = this.f55904t;
        int i14 = this.f55903f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            jVar = this;
            iMin = jVar.g(this.f55902e, i14, i12, 0, true);
            if (iMin == -1) {
                return -1;
            }
            jVar.f55904t += iMin;
        } else {
            jVar = this;
            iMin = Math.min(i12, i15);
        }
        System.arraycopy(jVar.f55902e, jVar.f55903f, bArr, i11, iMin);
        jVar.f55903f += iMin;
        return iMin;
    }

    @Override // x7.n
    public final void r() {
        this.f55903f = 0;
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        j jVar;
        int i13 = this.f55904t;
        int iG = 0;
        if (i13 != 0) {
            int iMin = Math.min(i13, i12);
            System.arraycopy(this.f55902e, 0, bArr, i11, iMin);
            h(iMin);
            iG = iMin;
        }
        if (iG == 0) {
            jVar = this;
            iG = jVar.g(bArr, i11, i12, 0, true);
        } else {
            jVar = this;
        }
        if (iG != -1) {
            jVar.f55901d += (long) iG;
        }
        return iG;
    }

    @Override // x7.n
    public final void readFully(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        a(bArr, i11, i12, false);
    }

    @Override // x7.n
    public final void s(int i11) throws EOFException, InterruptedIOException {
        d(i11, false);
    }
}
