package c8;

import androidx.media3.common.ParserException;
import b7.f0;
import b7.v;
import b7.w;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import x7.e0;
import x7.j;
import x7.m;
import x7.n;
import x7.o;
import x7.q;
import x7.r;
import x7.y;
import y6.c0;
import y6.d0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f6728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f6729f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f6731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f6732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f6735l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6736n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6724a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f6725b = new w(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6726c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kw.b f6727d = new kw.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6730g = 0;

    @Override // x7.m
    public final boolean c(n nVar) throws Throwable {
        x7.a.s(nVar, false);
        w wVar = new w(4);
        ((j) nVar).f(wVar.f4039a, 0, 4, false);
        return wVar.y() == 1716281667;
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f6728e = oVar;
        this.f6729f = oVar.v(0, 1);
        oVar.o();
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        if (j11 == 0) {
            this.f6730g = 0;
        } else {
            b bVar = this.f6735l;
            if (bVar != null) {
                bVar.d(j12);
            }
        }
        this.f6736n = j12 != 0 ? -1L : 0L;
        this.m = 0;
        this.f6725b.F(0);
    }

    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws Throwable {
        r rVar;
        y qVar;
        long j11;
        long j12;
        boolean zB;
        int i11 = this.f6730g;
        boolean z11 = true;
        int i12 = 0;
        if (i11 == 0) {
            boolean z12 = !this.f6726c;
            nVar.r();
            long jI = nVar.i();
            c0 c0VarS = x7.a.s(nVar, z12);
            nVar.s((int) (nVar.i() - jI));
            this.f6731h = c0VarS;
            this.f6730g = 1;
            return 0;
        }
        byte[] bArr = this.f6724a;
        if (i11 == 1) {
            nVar.A(bArr, 0, bArr.length);
            nVar.r();
            this.f6730g = 2;
            return 0;
        }
        int i13 = 4;
        int i14 = 3;
        if (i11 == 2) {
            w wVar = new w(4);
            nVar.readFully(wVar.f4039a, 0, 4);
            if (wVar.y() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.f6730g = 3;
            return 0;
        }
        int i15 = 7;
        int i16 = 6;
        if (i11 == 3) {
            int i17 = 0;
            r rVar2 = this.f6732i;
            boolean z13 = false;
            while (!z13) {
                nVar.r();
                byte[] bArr2 = new byte[i13];
                v vVar = new v(bArr2, i13);
                int i18 = i17;
                nVar.A(bArr2, i18, i13);
                boolean zH = vVar.h();
                int i19 = vVar.i(i15);
                int i21 = vVar.i(24) + i13;
                if (i19 == 0) {
                    byte[] bArr3 = new byte[38];
                    nVar.readFully(bArr3, i18, 38);
                    rVar2 = new r(bArr3, i13);
                } else {
                    if (rVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    c0 c0Var = rVar2.f55927l;
                    if (i19 == i14) {
                        w wVar2 = new w(i21);
                        nVar.readFully(wVar2.f4039a, i18, i21);
                        rVar2 = new r(rVar2.f55916a, rVar2.f55917b, rVar2.f55918c, rVar2.f55919d, rVar2.f55920e, rVar2.f55922g, rVar2.f55923h, rVar2.f55925j, x7.a.u(wVar2), rVar2.f55927l);
                    } else {
                        if (i19 == i13) {
                            w wVar3 = new w(i21);
                            nVar.readFully(wVar3.f4039a, 0, i21);
                            wVar3.J(i13);
                            c0 c0VarR = x7.a.r(Arrays.asList((String[]) x7.a.v(wVar3, false, false).f50058b));
                            if (c0Var != null) {
                                c0VarR = c0Var.b(c0VarR);
                            }
                            rVar = new r(rVar2.f55916a, rVar2.f55917b, rVar2.f55918c, rVar2.f55919d, rVar2.f55920e, rVar2.f55922g, rVar2.f55923h, rVar2.f55925j, rVar2.f55926k, c0VarR);
                        } else if (i19 == i16) {
                            w wVar4 = new w(i21);
                            nVar.readFully(wVar4.f4039a, 0, i21);
                            wVar4.J(4);
                            c0 c0Var2 = new c0(ImmutableList.u(j8.a.d(wVar4)));
                            if (c0Var != null) {
                                c0Var2 = c0Var.b(c0Var2);
                            }
                            rVar = new r(rVar2.f55916a, rVar2.f55917b, rVar2.f55918c, rVar2.f55919d, rVar2.f55920e, rVar2.f55922g, rVar2.f55923h, rVar2.f55925j, rVar2.f55926k, c0Var2);
                        } else {
                            nVar.s(i21);
                        }
                        rVar2 = rVar;
                    }
                }
                String str = f0.f3975a;
                this.f6732i = rVar2;
                z13 = zH;
                i13 = 4;
                i14 = 3;
                i15 = 7;
                i16 = 6;
                i17 = 0;
            }
            this.f6732i.getClass();
            this.f6733j = Math.max(this.f6732i.f55918c, 6);
            p pVarC = this.f6732i.c(bArr, this.f6731h);
            e0 e0Var = this.f6729f;
            y6.o oVarA = pVarC.a();
            oVarA.f57264l = d0.o("audio/flac");
            nv.p.D(oVarA, e0Var);
            e0 e0Var2 = this.f6729f;
            this.f6732i.b();
            e0Var2.getClass();
            this.f6730g = 4;
            return 0;
        }
        long j13 = 0;
        if (i11 == 4) {
            nVar.r();
            w wVar5 = new w(2);
            nVar.A(wVar5.f4039a, 0, 2);
            int iC = wVar5.C();
            if ((iC >> 2) != 16382) {
                nVar.r();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            nVar.r();
            this.f6734k = iC;
            o oVar = this.f6728e;
            String str2 = f0.f3975a;
            long position = nVar.getPosition();
            long length = nVar.getLength();
            this.f6732i.getClass();
            r rVar3 = this.f6732i;
            qp.b bVar2 = rVar3.f55926k;
            if (bVar2 != null && ((long[]) bVar2.f47832b).length > 0) {
                qVar = new q(rVar3, position, 0);
                i12 = 0;
            } else if (length == -1 || rVar3.f55925j <= 0) {
                i12 = 0;
                qVar = new q(rVar3.b());
            } else {
                int i22 = this.f6734k;
                int i23 = rVar3.f55918c;
                app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(rVar3, 15);
                a aVar2 = new a(rVar3, i22);
                long jB = rVar3.b();
                long j14 = rVar3.f55925j;
                int i24 = rVar3.f55919d;
                if (i24 > 0) {
                    j11 = ((((long) i24) + ((long) i23)) / 2) + 1;
                } else {
                    int i25 = rVar3.f55916a;
                    j11 = 64 + (((((i25 != rVar3.f55917b || i25 <= 0) ? 4096L : i25) * ((long) rVar3.f55922g)) * ((long) rVar3.f55923h)) / 8);
                }
                b bVar3 = new b(aVar, aVar2, jB, j14, position, length, j11, Math.max(6, i23));
                this.f6735l = bVar3;
                qVar = bVar3.f6720a;
            }
            oVar.q(qVar);
            this.f6730g = 5;
            return i12;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f6729f.getClass();
        this.f6732i.getClass();
        b bVar4 = this.f6735l;
        if (bVar4 != null && bVar4.f6722c != null) {
            return bVar4.b(nVar, bVar);
        }
        if (this.f6736n == -1) {
            r rVar4 = this.f6732i;
            nVar.r();
            nVar.k(1);
            byte[] bArr4 = new byte[1];
            nVar.A(bArr4, 0, 1);
            boolean z14 = (bArr4[0] & 1) == 1;
            nVar.k(2);
            i15 = z14 ? 7 : 6;
            w wVar6 = new w(i15);
            byte[] bArr5 = wVar6.f4039a;
            int i26 = 0;
            while (i26 < i15) {
                int iN = nVar.n(bArr5, i26, i15 - i26);
                if (iN == -1) {
                    break;
                }
                i26 += iN;
            }
            wVar6.H(i26);
            nVar.r();
            try {
                long jD = wVar6.D();
                if (!z14) {
                    jD *= (long) rVar4.f55917b;
                }
                j13 = jD;
            } catch (NumberFormatException unused) {
                z11 = false;
            }
            if (!z11) {
                throw ParserException.a(null, null);
            }
            this.f6736n = j13;
        } else {
            w wVar7 = this.f6725b;
            int i27 = wVar7.f4041c;
            if (i27 < 32768) {
                int i28 = nVar.read(wVar7.f4039a, i27, 32768 - i27);
                z11 = i28 == -1;
                if (!z11) {
                    wVar7.H(i27 + i28);
                } else if (wVar7.a() == 0) {
                    long j15 = this.f6736n * 1000000;
                    r rVar5 = this.f6732i;
                    String str3 = f0.f3975a;
                    this.f6729f.d(j15 / ((long) rVar5.f55920e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z11 = false;
            }
            int i29 = wVar7.f4040b;
            int i30 = this.m;
            int i31 = this.f6733j;
            if (i30 < i31) {
                wVar7.J(Math.min(i31 - i30, wVar7.a()));
            }
            this.f6732i.getClass();
            int i32 = wVar7.f4040b;
            while (true) {
                int i33 = wVar7.f4041c - 16;
                kw.b bVar5 = this.f6727d;
                if (i32 > i33) {
                    if (z11) {
                        while (true) {
                            int i34 = wVar7.f4041c;
                            if (i32 <= i34 - this.f6733j) {
                                wVar7.I(i32);
                                try {
                                    zB = x7.a.b(wVar7, this.f6732i, this.f6734k, bVar5);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zB = false;
                                }
                                if (wVar7.f4040b > wVar7.f4041c) {
                                    zB = false;
                                }
                                if (zB) {
                                    wVar7.I(i32);
                                    j12 = bVar5.f38845a;
                                    break;
                                }
                                i32++;
                            } else {
                                wVar7.I(i34);
                            }
                        }
                    } else {
                        wVar7.I(i32);
                    }
                    j12 = -1;
                    break;
                }
                wVar7.I(i32);
                if (x7.a.b(wVar7, this.f6732i, this.f6734k, bVar5)) {
                    wVar7.I(i32);
                    j12 = bVar5.f38845a;
                    break;
                }
                i32++;
            }
            int i35 = wVar7.f4040b - i29;
            wVar7.I(i29);
            this.f6729f.a(wVar7, i35, 0);
            int i36 = this.m + i35;
            this.m = i36;
            if (j12 != -1) {
                long j16 = this.f6736n * 1000000;
                r rVar6 = this.f6732i;
                String str4 = f0.f3975a;
                this.f6729f.d(j16 / ((long) rVar6.f55920e), 1, i36, 0, null);
                this.m = 0;
                this.f6736n = j12;
            }
            int length2 = wVar7.f4039a.length - wVar7.f4041c;
            if (wVar7.a() < 16 && length2 < 16) {
                int iA = wVar7.a();
                byte[] bArr6 = wVar7.f4039a;
                System.arraycopy(bArr6, wVar7.f4040b, bArr6, 0, iA);
                wVar7.I(0);
                wVar7.H(iA);
            }
        }
        return 0;
    }

    @Override // x7.m
    public final void release() {
    }
}
