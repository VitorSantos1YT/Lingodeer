package i7;

import b7.f0;
import java.util.List;
import y6.m0;
import y6.n0;
import y6.o0;
import y6.t;
import y6.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f34188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f34189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j7.c f34190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f34191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f34192k;

    public d(long j11, long j12, long j13, int i11, long j14, long j15, long j16, j7.c cVar, x xVar, t tVar) {
        b7.a.j(cVar.f36101d == (tVar != null));
        this.f34183b = j11;
        this.f34184c = j12;
        this.f34185d = j13;
        this.f34186e = i11;
        this.f34187f = j14;
        this.f34188g = j15;
        this.f34189h = j16;
        this.f34190i = cVar;
        this.f34191j = xVar;
        this.f34192k = tVar;
    }

    @Override // y6.o0
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f34186e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // y6.o0
    public final m0 f(int i11, m0 m0Var, boolean z11) {
        b7.a.g(i11, h());
        j7.c cVar = this.f34190i;
        String str = z11 ? cVar.a(i11).f36131a : null;
        Integer numValueOf = z11 ? Integer.valueOf(this.f34186e + i11) : null;
        long jC = cVar.c(i11);
        long jK = f0.K(cVar.a(i11).f36132b - cVar.a(0).f36132b) - this.f34187f;
        m0Var.getClass();
        m0Var.h(str, numValueOf, 0, jC, jK, y6.b.f57174c, false);
        return m0Var;
    }

    @Override // y6.o0
    public final int h() {
        return this.f34190i.m.size();
    }

    @Override // y6.o0
    public final Object l(int i11) {
        b7.a.g(i11, h());
        return Integer.valueOf(this.f34186e + i11);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    @Override // y6.o0
    public final n0 m(int i11, n0 n0Var, long j11) {
        boolean z11;
        long j12;
        long j13;
        boolean z12;
        long j14;
        h hVarC;
        b7.a.g(i11, 1);
        j7.c cVar = this.f34190i;
        boolean z13 = cVar.f36101d;
        long jB = this.f34189h;
        if (z13 && cVar.f36102e != -9223372036854775807L && cVar.f36099b == -9223372036854775807L) {
            long j15 = 0;
            if (j11 > 0) {
                jB += j11;
                if (jB > this.f34188g) {
                    z11 = true;
                    j13 = -9223372036854775807L;
                    j12 = -9223372036854775807L;
                }
                Object obj = n0.f57236q;
                if (cVar.f36101d || cVar.f36102e == j12 || cVar.f36099b != j12) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                n0Var.b(this.f34191j, cVar, this.f34183b, this.f34184c, this.f34185d, true, z12, this.f34192k, j13, this.f34188g, h() - 1, this.f34187f);
                return n0Var;
            }
            long j16 = this.f34187f + jB;
            long jC = cVar.c(0);
            int i12 = 0;
            while (i12 < cVar.m.size() - 1 && j16 >= jC) {
                j16 -= jC;
                i12++;
                jC = cVar.c(i12);
            }
            j7.h hVarA = cVar.a(i12);
            List list = hVarA.f36133c;
            z11 = true;
            int size = list.size();
            j12 = -9223372036854775807L;
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    j14 = j15;
                    i13 = -1;
                    break;
                }
                j14 = j15;
                if (((j7.a) list.get(i13)).f36089b == 2) {
                    break;
                }
                i13++;
                j15 = j14;
            }
            if (i13 != -1 && (hVarC = ((j7.m) ((j7.a) hVarA.f36133c.get(i13)).f36090c.get(0)).c()) != null && hVarC.y(jC) != j14) {
                jB = (hVarC.b(hVarC.l(j16, jC)) + jB) - j16;
            }
        } else {
            z11 = true;
            j12 = -9223372036854775807L;
        }
        j13 = jB;
        Object obj2 = n0.f57236q;
        if (cVar.f36101d) {
            z12 = false;
        } else {
            z12 = false;
        }
        n0Var.b(this.f34191j, cVar, this.f34183b, this.f34184c, this.f34185d, true, z12, this.f34192k, j13, this.f34188g, h() - 1, this.f34187f);
        return n0Var;
    }

    @Override // y6.o0
    public final int o() {
        return 1;
    }
}
