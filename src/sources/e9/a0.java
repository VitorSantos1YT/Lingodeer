package e9;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements x7.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c8.b f25145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x7.o f25146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25147k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.b0 f25137a = new b7.b0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25139c = new b7.w(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f25138b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f25140d = new y(0);

    @Override // x7.m
    public final boolean c(x7.n nVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        x7.j jVar = (x7.j) nVar;
        jVar.f(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            jVar.b(bArr[13] & 7, false);
            jVar.f(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        this.f25146j = oVar;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        long j13;
        SparseArray sparseArray = this.f25138b;
        b7.b0 b0Var = this.f25137a;
        synchronized (b0Var) {
            j13 = b0Var.f3955b;
        }
        boolean z11 = j13 == -9223372036854775807L;
        if (!z11) {
            long jD = b0Var.d();
            z11 = (jD == -9223372036854775807L || jD == 0 || jD == j12) ? false : true;
        }
        if (z11) {
            b0Var.e(j12);
        }
        c8.b bVar = this.f25145i;
        if (bVar != null) {
            bVar.d(j12);
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            z zVar = (z) sparseArray.valueAt(i11);
            zVar.f25452f = false;
            zVar.f25447a.a();
        }
    }

    @Override // x7.m
    public final int g(x7.n nVar, kw.b bVar) {
        long j11;
        h jVar;
        long j12;
        b7.a.k(this.f25146j);
        long length = nVar.getLength();
        long j13 = -9223372036854775807L;
        y yVar = this.f25140d;
        if (length != -1 && !yVar.f25441d) {
            b7.b0 b0Var = yVar.f25439b;
            b7.w wVar = yVar.f25440c;
            if (!yVar.f25443f) {
                long length2 = nVar.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j14 = length2 - ((long) iMin);
                if (nVar.getPosition() != j14) {
                    bVar.f38845a = j14;
                    return 1;
                }
                wVar.F(iMin);
                nVar.r();
                nVar.A(wVar.f4039a, 0, iMin);
                int i11 = wVar.f4040b;
                for (int i12 = wVar.f4041c - 4; i12 >= i11; i12--) {
                    if (y.b(wVar.f4039a, i12) == 442) {
                        wVar.I(i12 + 4);
                        long jC = y.c(wVar);
                        if (jC != -9223372036854775807L) {
                            j13 = jC;
                            break;
                        }
                    }
                }
                yVar.f25445h = j13;
                yVar.f25443f = true;
                return 0;
            }
            if (yVar.f25445h == -9223372036854775807L) {
                yVar.a(nVar);
                return 0;
            }
            if (yVar.f25442e) {
                long j15 = yVar.f25444g;
                if (j15 == -9223372036854775807L) {
                    yVar.a(nVar);
                    return 0;
                }
                yVar.f25446i = b0Var.c(yVar.f25445h) - b0Var.b(j15);
                yVar.a(nVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, nVar.getLength());
            long j16 = 0;
            if (nVar.getPosition() != j16) {
                bVar.f38845a = j16;
                return 1;
            }
            wVar.F(iMin2);
            nVar.r();
            nVar.A(wVar.f4039a, 0, iMin2);
            int i13 = wVar.f4041c;
            for (int i14 = wVar.f4040b; i14 < i13 - 3; i14++) {
                if (y.b(wVar.f4039a, i14) == 442) {
                    wVar.I(i14 + 4);
                    long jC2 = y.c(wVar);
                    if (jC2 != -9223372036854775807L) {
                        j12 = jC2;
                        yVar.f25444g = j12;
                        yVar.f25442e = true;
                        return 0;
                    }
                }
            }
            j12 = -9223372036854775807L;
            yVar.f25444g = j12;
            yVar.f25442e = true;
            return 0;
        }
        if (!this.f25147k) {
            this.f25147k = true;
            long j17 = yVar.f25446i;
            if (j17 != -9223372036854775807L) {
                c8.b bVar2 = new c8.b(new g0(12), new b1.p(yVar.f25439b), j17, j17 + 1, 0L, length, 188L, 1000);
                this.f25145i = bVar2;
                this.f25146j.q(bVar2.f6720a);
            } else {
                this.f25146j.q(new x7.q(j17));
            }
        }
        c8.b bVar3 = this.f25145i;
        if (bVar3 != null && bVar3.f6722c != null) {
            return bVar3.b(nVar, bVar);
        }
        nVar.r();
        long jI = length != -1 ? length - nVar.i() : -1L;
        if (jI != -1 && jI < 4) {
            return -1;
        }
        b7.w wVar2 = this.f25139c;
        if (!nVar.f(wVar2.f4039a, 0, 4, true)) {
            return -1;
        }
        wVar2.I(0);
        int iJ = wVar2.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            nVar.A(wVar2.f4039a, 0, 10);
            wVar2.I(9);
            nVar.s((wVar2.w() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            nVar.A(wVar2.f4039a, 0, 2);
            wVar2.I(0);
            nVar.s(wVar2.C() + 6);
            return 0;
        }
        if (((iJ & (-256)) >> 8) != 1) {
            nVar.s(1);
            return 0;
        }
        int i15 = iJ & 255;
        SparseArray sparseArray = this.f25138b;
        z zVar = (z) sparseArray.get(i15);
        if (!this.f25141e) {
            if (zVar == null) {
                if (i15 == 189) {
                    jVar = new b("video/mp2p");
                    this.f25142f = true;
                    this.f25144h = nVar.getPosition();
                } else if ((iJ & 224) == 192) {
                    jVar = new t(null, 0, "video/mp2p");
                    this.f25142f = true;
                    this.f25144h = nVar.getPosition();
                } else if ((iJ & 240) == 224) {
                    jVar = new j(null, "video/mp2p");
                    this.f25143g = true;
                    this.f25144h = nVar.getPosition();
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar.d(this.f25146j, new b10.b(i15, 256));
                    zVar = new z(jVar, this.f25137a);
                    sparseArray.put(i15, zVar);
                }
            }
            if (nVar.getPosition() > ((this.f25142f && this.f25143g) ? this.f25144h + 8192 : 1048576L)) {
                this.f25141e = true;
                this.f25146j.o();
            }
        }
        nVar.A(wVar2.f4039a, 0, 2);
        wVar2.I(0);
        int iC = wVar2.C() + 6;
        if (zVar == null) {
            nVar.s(iC);
            return 0;
        }
        wVar2.F(iC);
        nVar.readFully(wVar2.f4039a, 0, iC);
        wVar2.I(6);
        h hVar = zVar.f25447a;
        b7.v vVar = zVar.f25449c;
        wVar2.h(vVar.f4032b, 0, 3);
        vVar.q(0);
        vVar.t(8);
        zVar.f25450d = vVar.h();
        zVar.f25451e = vVar.h();
        vVar.t(6);
        wVar2.h(vVar.f4032b, 0, vVar.i(8));
        vVar.q(0);
        b7.b0 b0Var2 = zVar.f25448b;
        zVar.f25453g = 0L;
        if (zVar.f25450d) {
            vVar.t(4);
            long jI2 = ((long) vVar.i(3)) << 30;
            vVar.t(1);
            long jI3 = jI2 | ((long) (vVar.i(15) << 15));
            vVar.t(1);
            long jI4 = jI3 | ((long) vVar.i(15));
            vVar.t(1);
            if (zVar.f25452f || !zVar.f25451e) {
                j11 = jI4;
            } else {
                vVar.t(4);
                long jI5 = ((long) vVar.i(3)) << 30;
                vVar.t(1);
                long jI6 = ((long) (vVar.i(15) << 15)) | jI5;
                vVar.t(1);
                long jI7 = jI6 | ((long) vVar.i(15));
                vVar.t(1);
                b0Var2.b(jI7);
                zVar.f25452f = true;
                j11 = jI4;
            }
            zVar.f25453g = b0Var2.b(j11);
        }
        hVar.f(4, zVar.f25453g);
        hVar.c(wVar2);
        hVar.e(false);
        wVar2.H(wVar2.f4039a.length);
        return 0;
    }

    @Override // x7.m
    public final void release() {
    }
}
