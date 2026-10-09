package s8;

import androidx.media3.common.ParserException;
import b0.p2;
import b7.f0;
import b7.w;
import java.util.Arrays;
import re.v;
import x7.e0;
import x7.m;
import x7.n;
import x7.o;
import x7.y;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f51484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f51485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51486c;

    public final boolean a(n nVar) {
        boolean zX;
        f fVar = new f();
        if (fVar.a(nVar, true) && (fVar.f51492a & 2) == 2) {
            int iMin = Math.min(fVar.f51496e, 8);
            w wVar = new w(iMin);
            nVar.A(wVar.f4039a, 0, iMin);
            wVar.I(0);
            if (wVar.a() >= 5 && wVar.w() == 127 && wVar.y() == 1179402563) {
                this.f51485b = new c();
                return true;
            }
            wVar.I(0);
            try {
                zX = x7.a.x(1, wVar, true);
            } catch (ParserException unused) {
                zX = false;
            }
            if (zX) {
                this.f51485b = new j();
            } else {
                wVar.I(0);
                if (h.e(wVar, h.f51499o)) {
                    this.f51485b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // x7.m
    public final boolean c(n nVar) {
        try {
            return a(nVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f51484a = oVar;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        i iVar = this.f51485b;
        if (iVar != null) {
            e eVar = iVar.f51502a;
            f fVar = (f) eVar.f51490d;
            fVar.f51492a = 0;
            fVar.f51493b = 0L;
            fVar.f51494c = 0;
            fVar.f51495d = 0;
            fVar.f51496e = 0;
            ((w) eVar.f51491e).F(0);
            eVar.f51487a = -1;
            eVar.f51489c = false;
            if (j11 == 0) {
                iVar.d(!iVar.f51513l);
                return;
            }
            if (iVar.f51509h != 0) {
                long j13 = (((long) iVar.f51510i) * j12) / 1000000;
                iVar.f51506e = j13;
                g gVar = iVar.f51505d;
                String str = f0.f3975a;
                gVar.k(j13);
                iVar.f51509h = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x017a  */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws ParserException {
        byte[] bArr;
        b7.a.k(this.f51484a);
        if (this.f51485b == null) {
            if (!a(nVar)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            nVar.r();
        }
        int i11 = 1;
        if (!this.f51486c) {
            e0 e0VarV = this.f51484a.v(0, 1);
            this.f51484a.o();
            i iVar = this.f51485b;
            iVar.f51504c = this.f51484a;
            iVar.f51503b = e0VarV;
            iVar.d(true);
            this.f51486c = true;
        }
        i iVar2 = this.f51485b;
        e eVar = iVar2.f51502a;
        b7.a.k(iVar2.f51503b);
        String str = f0.f3975a;
        int i12 = iVar2.f51509h;
        long j11 = -1;
        if (i12 != 0) {
            if (i12 == 1) {
                nVar.s((int) iVar2.f51507f);
                iVar2.f51509h = 2;
                return 0;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jF = iVar2.f51505d.f(nVar);
            if (jF >= 0) {
                bVar.f38845a = jF;
                return 1;
            }
            if (jF < -1) {
                iVar2.a(-(jF + 2));
            }
            if (!iVar2.f51513l) {
                y yVarH = iVar2.f51505d.h();
                b7.a.k(yVarH);
                iVar2.f51504c.q(yVarH);
                e0 e0Var = iVar2.f51503b;
                yVarH.k();
                e0Var.getClass();
                iVar2.f51513l = true;
            }
            if (iVar2.f51512k <= 0 && !eVar.d(nVar)) {
                iVar2.f51509h = 3;
                return -1;
            }
            iVar2.f51512k = 0L;
            w wVar = (w) eVar.f51491e;
            long jB = iVar2.b(wVar);
            if (jB >= 0) {
                long j12 = iVar2.f51508g;
                if (j12 + jB >= iVar2.f51506e) {
                    long j13 = (j12 * 1000000) / ((long) iVar2.f51510i);
                    iVar2.f51503b.a(wVar, wVar.f4041c, 0);
                    iVar2.f51503b.d(j13, 1, wVar.f4041c, 0, null);
                    iVar2.f51506e = -1L;
                }
            }
            iVar2.f51508g += jB;
            return 0;
        }
        while (true) {
            boolean zD = eVar.d(nVar);
            w wVar2 = (w) eVar.f51491e;
            if (!zD) {
                iVar2.f51509h = 3;
                return -1;
            }
            long position = nVar.getPosition();
            long j14 = j11;
            long j15 = iVar2.f51507f;
            iVar2.f51512k = position - j15;
            if (!iVar2.c(wVar2, j15, iVar2.f51511j)) {
                p pVar = (p) iVar2.f51511j.f47832b;
                iVar2.f51510i = pVar.G;
                if (!iVar2.m) {
                    iVar2.f51503b.b(pVar);
                    iVar2.m = true;
                }
                p2 p2Var = (p2) iVar2.f51511j.f47833c;
                if (p2Var == null) {
                    if (nVar.getLength() == j14) {
                        iVar2.f51505d = new v(i11);
                    } else {
                        f fVar = (f) eVar.f51490d;
                        iVar2.f51505d = new b(iVar2, iVar2.f51507f, nVar.getLength(), fVar.f51495d + fVar.f51496e, fVar.f51493b, (fVar.f51492a & 4) != 0);
                    }
                    iVar2.f51509h = 2;
                    bArr = wVar2.f4039a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    wVar2.G(Arrays.copyOf(bArr, Math.max(65025, wVar2.f4041c)), wVar2.f4041c);
                    return 0;
                }
                iVar2.f51505d = p2Var;
                iVar2.f51509h = 2;
                bArr = wVar2.f4039a;
                if (bArr.length == 65025) {
                    return 0;
                }
                wVar2.G(Arrays.copyOf(bArr, Math.max(65025, wVar2.f4041c)), wVar2.f4041c);
                return 0;
            }
            iVar2.f51507f = nVar.getPosition();
            j11 = j14;
        }
    }

    @Override // x7.m
    public final void release() {
    }
}
