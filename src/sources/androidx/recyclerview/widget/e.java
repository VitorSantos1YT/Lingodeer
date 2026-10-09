package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x7.n, x7.o, i7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2444c;

    public /* synthetic */ e(long j11, Object obj, int i11) {
        this.f2442a = i11;
        this.f2443b = j11;
        this.f2444c = obj;
    }

    @Override // x7.n
    public void A(byte[] bArr, int i11, int i12) {
        ((x7.n) this.f2444c).A(bArr, i11, i12);
    }

    public long B(s2.t tVar, float f5) {
        long jH = f2.b.h(this.f2443b, f2.b.g(tVar.f51345c, tVar.f51349g));
        this.f2443b = jH;
        f0.h1 h1Var = (f0.h1) this.f2444c;
        if ((h1Var == null ? f2.b.d(jH) : Math.abs(H(jH))) < f5) {
            return 9205357640488583168L;
        }
        if (h1Var == null) {
            long j11 = this.f2443b;
            return f2.b.g(this.f2443b, f2.b.i(f2.b.b(j11, f2.b.d(j11)), f5));
        }
        float fH = H(this.f2443b) - (Math.signum(H(this.f2443b)) * f5);
        long j12 = this.f2443b;
        f0.h1 h1Var2 = f0.h1.Horizontal;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h1Var == h1Var2 ? j12 & 4294967295L : j12 >> 32));
        if (h1Var == h1Var2) {
            return (((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
    }

    public void C(int i11) {
        if (i11 < 64) {
            this.f2443b &= ~(1 << i11);
            return;
        }
        e eVar = (e) this.f2444c;
        if (eVar != null) {
            eVar.C(i11 - 64);
        }
    }

    public int D(int i11) {
        e eVar = (e) this.f2444c;
        if (eVar == null) {
            return i11 >= 64 ? Long.bitCount(this.f2443b) : Long.bitCount(this.f2443b & ((1 << i11) - 1));
        }
        if (i11 < 64) {
            return Long.bitCount(this.f2443b & ((1 << i11) - 1));
        }
        return Long.bitCount(this.f2443b) + eVar.D(i11 - 64);
    }

    public void E() {
        if (((e) this.f2444c) == null) {
            this.f2444c = new e();
        }
    }

    public boolean F(int i11) {
        if (i11 < 64) {
            return (this.f2443b & (1 << i11)) != 0;
        }
        E();
        return ((e) this.f2444c).F(i11 - 64);
    }

    public void G(int i11, boolean z11) {
        if (i11 >= 64) {
            E();
            ((e) this.f2444c).G(i11 - 64, z11);
            return;
        }
        long j11 = this.f2443b;
        boolean z12 = (Long.MIN_VALUE & j11) != 0;
        long j12 = (1 << i11) - 1;
        this.f2443b = ((j11 & (~j12)) << 1) | (j11 & j12);
        if (z11) {
            K(i11);
        } else {
            C(i11);
        }
        if (z12 || ((e) this.f2444c) != null) {
            E();
            ((e) this.f2444c).G(0, z12);
        }
    }

    public float H(long j11) {
        return Float.intBitsToFloat((int) (((f0.h1) this.f2444c) == f0.h1.Horizontal ? j11 >> 32 : j11 & 4294967295L));
    }

    public boolean I(int i11) {
        if (i11 >= 64) {
            E();
            return ((e) this.f2444c).I(i11 - 64);
        }
        long j11 = 1 << i11;
        long j12 = this.f2443b;
        boolean z11 = (j12 & j11) != 0;
        long j13 = j12 & (~j11);
        this.f2443b = j13;
        long j14 = j11 - 1;
        this.f2443b = (j13 & j14) | Long.rotateRight((~j14) & j13, 1);
        e eVar = (e) this.f2444c;
        if (eVar != null) {
            if (eVar.F(0)) {
                K(63);
            }
            ((e) this.f2444c).I(0);
        }
        return z11;
    }

    public void J() {
        this.f2443b = 0L;
        e eVar = (e) this.f2444c;
        if (eVar != null) {
            eVar.J();
        }
    }

    public void K(int i11) {
        if (i11 < 64) {
            this.f2443b |= 1 << i11;
        } else {
            E();
            ((e) this.f2444c).K(i11 - 64);
        }
    }

    @Override // x7.n
    public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
        return ((x7.n) this.f2444c).a(bArr, 0, i12, z11);
    }

    @Override // i7.h
    public long b(long j11) {
        return ((x7.i) this.f2444c).f55896e[(int) j11] - this.f2443b;
    }

    @Override // x7.n
    public boolean d(int i11, boolean z11) {
        return ((x7.n) this.f2444c).d(i11, true);
    }

    @Override // i7.h
    public long e(long j11, long j12) {
        return ((x7.i) this.f2444c).f55895d[(int) j11];
    }

    @Override // x7.n
    public boolean f(byte[] bArr, int i11, int i12, boolean z11) {
        return ((x7.n) this.f2444c).f(bArr, 0, i12, z11);
    }

    @Override // i7.h
    public long g(long j11, long j12) {
        return 0L;
    }

    @Override // x7.n
    public long getLength() {
        return ((x7.n) this.f2444c).getLength() - this.f2443b;
    }

    @Override // x7.n
    public long getPosition() {
        return ((x7.n) this.f2444c).getPosition() - this.f2443b;
    }

    @Override // i7.h
    public long h(long j11, long j12) {
        return -9223372036854775807L;
    }

    @Override // x7.n
    public long i() {
        return ((x7.n) this.f2444c).i() - this.f2443b;
    }

    @Override // i7.h
    public j7.j j(long j11) {
        x7.i iVar = (x7.i) this.f2444c;
        int i11 = (int) j11;
        return new j7.j(null, iVar.f55894c[i11], iVar.f55893b[i11]);
    }

    @Override // x7.n
    public void k(int i11) {
        ((x7.n) this.f2444c).k(i11);
    }

    @Override // i7.h
    public long l(long j11, long j12) {
        return b7.f0.d(((x7.i) this.f2444c).f55896e, j11 + this.f2443b, true);
    }

    @Override // x7.n
    public int m(int i11) {
        return ((x7.n) this.f2444c).m(i11);
    }

    @Override // x7.n
    public int n(byte[] bArr, int i11, int i12) {
        return ((x7.n) this.f2444c).n(bArr, i11, i12);
    }

    @Override // x7.o
    public void o() {
        ((x7.o) this.f2444c).o();
    }

    @Override // x7.o
    public void q(x7.y yVar) {
        ((x7.o) this.f2444c).q(new f8.c(this, yVar, yVar));
    }

    @Override // x7.n
    public void r() {
        ((x7.n) this.f2444c).r();
    }

    @Override // y6.h
    public int read(byte[] bArr, int i11, int i12) {
        return ((x7.n) this.f2444c).read(bArr, i11, i12);
    }

    @Override // x7.n
    public void readFully(byte[] bArr, int i11, int i12) {
        ((x7.n) this.f2444c).readFully(bArr, i11, i12);
    }

    @Override // x7.n
    public void s(int i11) {
        ((x7.n) this.f2444c).s(i11);
    }

    @Override // i7.h
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f2442a) {
            case 0:
                if (((e) this.f2444c) == null) {
                    return Long.toBinaryString(this.f2443b);
                }
                return ((e) this.f2444c).toString() + "xx" + Long.toBinaryString(this.f2443b);
            default:
                return super.toString();
        }
    }

    @Override // x7.o
    public x7.e0 v(int i11, int i12) {
        return ((x7.o) this.f2444c).v(i11, i12);
    }

    @Override // i7.h
    public long w() {
        return 0L;
    }

    @Override // i7.h
    public long y(long j11) {
        return ((x7.i) this.f2444c).f55892a;
    }

    @Override // i7.h
    public long z(long j11, long j12) {
        return ((x7.i) this.f2444c).f55892a;
    }

    public /* synthetic */ e(Object obj, long j11, int i11) {
        this.f2442a = i11;
        this.f2444c = obj;
        this.f2443b = j11;
    }

    public e(x7.n nVar, long j11) {
        this.f2442a = 3;
        this.f2444c = nVar;
        b7.a.d(nVar.getPosition() >= j11);
        this.f2443b = j11;
    }

    public e() {
        this.f2442a = 0;
        this.f2443b = 0L;
    }
}
