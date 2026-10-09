package y7;

import androidx.media3.common.ParserException;
import b7.f0;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kw.b;
import nv.p;
import x7.e0;
import x7.l;
import x7.m;
import x7.n;
import x7.o;
import x7.q;
import x7.v;
import x7.y;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f57410q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f57411r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f57412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f57413t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f57415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f57417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57419f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f57422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f57423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f57424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f57425l;
    public y m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f57426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f57427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f57428p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f57414a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57420g = -1;

    static {
        String str = f0.f3975a;
        Charset charset = StandardCharsets.UTF_8;
        f57412s = "#!AMR\n".getBytes(charset);
        f57413t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        l lVar = new l();
        this.f57415b = lVar;
        this.f57425l = lVar;
    }

    public final int a(n nVar) throws ParserException {
        boolean z11;
        nVar.r();
        byte[] bArr = this.f57414a;
        nVar.A(bArr, 0, 1);
        byte b3 = bArr[0];
        if ((b3 & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b3));
        }
        int i11 = (b3 >> 3) & 15;
        if (i11 >= 0 && i11 <= 15 && (((z11 = this.f57416c) && (i11 < 10 || i11 > 13)) || (!z11 && (i11 < 12 || i11 > 14)))) {
            return z11 ? f57411r[i11] : f57410q[i11];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f57416c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i11);
        throw ParserException.a(null, sb2.toString());
    }

    public final boolean b(n nVar) {
        nVar.r();
        byte[] bArr = f57412s;
        byte[] bArr2 = new byte[bArr.length];
        nVar.A(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f57416c = false;
            nVar.s(bArr.length);
            return true;
        }
        nVar.r();
        byte[] bArr3 = f57413t;
        byte[] bArr4 = new byte[bArr3.length];
        nVar.A(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f57416c = true;
        nVar.s(bArr3.length);
        return true;
    }

    @Override // x7.m
    public final boolean c(n nVar) {
        return b(nVar);
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f57423j = oVar;
        e0 e0VarV = oVar.v(0, 1);
        this.f57424k = e0VarV;
        this.f57425l = e0VarV;
        oVar.o();
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f57417d = 0L;
        this.f57418e = 0;
        this.f57419f = 0;
        this.f57427o = j12;
        y yVar = this.m;
        if (!(yVar instanceof v)) {
            if (j11 == 0 || !(yVar instanceof q8.a)) {
                this.f57422i = 0L;
                return;
            } else {
                q8.a aVar = (q8.a) yVar;
                this.f57422i = (Math.max(0L, j11 - aVar.f47546b) * 8000000) / ((long) aVar.f47549e);
                return;
            }
        }
        v vVar = (v) yVar;
        b7.o oVar = vVar.f55947b;
        long jD = oVar.f4013b == 0 ? -9223372036854775807L : oVar.d(f0.b(vVar.f55946a, j11));
        this.f57422i = jD;
        if (Math.abs(this.f57427o - jD) < 20000) {
            return;
        }
        this.f57426n = true;
        this.f57425l = this.f57415b;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00eb A[PHI: r4
      0x00eb: PHI (r4v1 x7.n) = (r4v0 x7.n), (r4v5 x7.n) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    @Override // x7.m
    public final int g(n nVar, b bVar) throws ParserException {
        n nVar2;
        int iC;
        int i11;
        b7.a.k(this.f57424k);
        String str = f0.f3975a;
        if (nVar.getPosition() == 0 && !b(nVar)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.f57428p) {
            this.f57428p = true;
            boolean z11 = this.f57416c;
            String str2 = z11 ? "audio/amr-wb" : "audio/amr";
            String str3 = z11 ? "audio/amr-wb" : "audio/3gpp";
            int i12 = z11 ? 16000 : 8000;
            int i13 = z11 ? f57411r[8] : f57410q[7];
            e0 e0Var = this.f57424k;
            y6.o oVar = new y6.o();
            oVar.f57264l = d0.o(str2);
            oVar.m = d0.o(str3);
            oVar.f57265n = i13;
            oVar.E = 1;
            oVar.F = i12;
            p.D(oVar, e0Var);
        }
        int i14 = 0;
        if (this.f57419f == 0) {
            try {
                int iA = a(nVar);
                this.f57418e = iA;
                this.f57419f = iA;
                if (this.f57420g == -1) {
                    nVar.getPosition();
                    this.f57420g = this.f57418e;
                }
                if (this.f57420g == this.f57418e) {
                    this.f57421h++;
                }
                y yVar = this.m;
                if (yVar instanceof v) {
                    v vVar = (v) yVar;
                    long j11 = this.f57422i + this.f57417d + 20000;
                    long position = nVar.getPosition() + ((long) this.f57418e);
                    b7.o oVar2 = vVar.f55947b;
                    int i15 = oVar2.f4013b;
                    if (i15 == 0 || j11 - oVar2.d(i15 - 1) >= 100000) {
                        b7.o oVar3 = vVar.f55946a;
                        b7.o oVar4 = vVar.f55947b;
                        if (oVar4.f4013b == 0 && j11 > 0) {
                            oVar3.a(0L);
                            oVar4.a(0L);
                        }
                        oVar3.a(position);
                        oVar4.a(j11);
                    }
                    if (this.f57426n && Math.abs(this.f57427o - j11) < 20000) {
                        this.f57426n = false;
                        this.f57425l = this.f57424k;
                    }
                }
                nVar2 = nVar;
                iC = this.f57425l.c(nVar2, this.f57419f, true);
                if (iC == -1) {
                    i14 = -1;
                } else {
                    i11 = this.f57419f - iC;
                    this.f57419f = i11;
                    if (i11 <= 0) {
                        this.f57425l.d(this.f57417d + this.f57422i, 1, this.f57418e, 0, null);
                        this.f57417d += 20000;
                    }
                }
            } catch (EOFException unused) {
                nVar2 = nVar;
            }
        } else {
            nVar2 = nVar;
            iC = this.f57425l.c(nVar2, this.f57419f, true);
            if (iC == -1) {
                i14 = -1;
            } else {
                i11 = this.f57419f - iC;
                this.f57419f = i11;
                if (i11 <= 0) {
                    this.f57425l.d(this.f57417d + this.f57422i, 1, this.f57418e, 0, null);
                    this.f57417d += 20000;
                }
            }
        }
        nVar2.getLength();
        if (this.m == null) {
            q qVar = new q(-9223372036854775807L);
            this.m = qVar;
            this.f57423j.q(qVar);
        }
        if (i14 == -1) {
            y yVar2 = this.m;
            if (yVar2 instanceof v) {
                ((v) yVar2).f55948c = this.f57422i + this.f57417d;
                this.f57423j.q(yVar2);
                this.f57424k.getClass();
            }
        }
        return i14;
    }

    @Override // x7.m
    public final void release() {
    }
}
