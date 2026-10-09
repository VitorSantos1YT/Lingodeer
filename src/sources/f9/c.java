package f9;

import androidx.media3.common.ParserException;
import b7.f0;
import b7.p;
import java.math.RoundingMode;
import x7.e0;
import x7.n;
import x7.o;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f27005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f27006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f27007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y6.p f27008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27012h;

    public c(o oVar, e0 e0Var, p pVar, String str, int i11) throws ParserException {
        this.f27005a = oVar;
        this.f27006b = e0Var;
        this.f27007c = pVar;
        int i12 = pVar.f4016b;
        int i13 = pVar.f4017c;
        int i14 = (pVar.f4019e * i12) / 8;
        int i15 = pVar.f4018d;
        if (i15 != i14) {
            throw ParserException.a(null, "Expected block size: " + i14 + "; got: " + i15);
        }
        int i16 = i13 * i14;
        int i17 = i16 * 8;
        int iMax = Math.max(i14, i16 / 10);
        this.f27009e = iMax;
        y6.o oVar2 = new y6.o();
        oVar2.f57264l = d0.o("audio/wav");
        oVar2.m = d0.o(str);
        oVar2.f57260h = i17;
        oVar2.f57261i = i17;
        oVar2.f57265n = iMax;
        oVar2.E = i12;
        oVar2.F = i13;
        oVar2.G = i11;
        this.f27008d = new y6.p(oVar2);
    }

    @Override // f9.b
    public final void a(long j11) {
        this.f27010f = j11;
        this.f27011g = 0;
        this.f27012h = 0L;
    }

    @Override // f9.b
    public final void b(int i11, long j11) {
        this.f27005a.q(new g(this.f27007c, 1, i11, j11));
        y6.p pVar = this.f27008d;
        e0 e0Var = this.f27006b;
        e0Var.b(pVar);
        e0Var.getClass();
    }

    @Override // f9.b
    public final boolean c(n nVar, long j11) {
        int i11;
        int i12;
        long j12 = j11;
        while (j12 > 0 && (i11 = this.f27011g) < (i12 = this.f27009e)) {
            int iC = this.f27006b.c(nVar, (int) Math.min(i12 - i11, j12), true);
            if (iC == -1) {
                j12 = 0;
            } else {
                this.f27011g += iC;
                j12 -= (long) iC;
            }
        }
        p pVar = this.f27007c;
        int i13 = pVar.f4018d;
        int i14 = this.f27011g / i13;
        if (i14 > 0) {
            long j13 = this.f27010f;
            long j14 = this.f27012h;
            long j15 = pVar.f4017c;
            String str = f0.f3975a;
            long jR = j13 + f0.R(j14, 1000000L, j15, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.f27011g - i15;
            this.f27006b.d(jR, 1, i15, i16, null);
            this.f27012h += (long) i14;
            this.f27011g = i16;
        }
        return j12 <= 0;
    }
}
