package e9;

import androidx.media3.common.ParserException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7.v f25367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x7.e0 f25368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y6.p f25370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25375l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f25380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f25381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f25383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f25384v;

    public s(String str, int i11) {
        this.f25364a = str;
        this.f25365b = i11;
        b7.w wVar = new b7.w(1024);
        this.f25366c = wVar;
        byte[] bArr = wVar.f4039a;
        this.f25367d = new b7.v(bArr, bArr.length);
        this.f25375l = -9223372036854775807L;
    }

    @Override // e9.h
    public final void a() {
        this.f25371h = 0;
        this.f25375l = -9223372036854775807L;
        this.m = false;
    }

    @Override // e9.h
    public final void c(b7.w wVar) throws ParserException {
        int i11;
        int i12;
        boolean zH;
        b7.a.k(this.f25368e);
        while (wVar.a() > 0) {
            int i13 = this.f25371h;
            if (i13 != 0) {
                if (i13 != 1) {
                    b7.w wVar2 = this.f25366c;
                    b7.v vVar = this.f25367d;
                    if (i13 == 2) {
                        int iW = ((this.f25374k & (-225)) << 8) | wVar.w();
                        this.f25373j = iW;
                        if (iW > wVar2.f4039a.length) {
                            wVar2.F(iW);
                            byte[] bArr = wVar2.f4039a;
                            vVar.getClass();
                            vVar.p(bArr, bArr.length);
                        }
                        this.f25372i = 0;
                        this.f25371h = 3;
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(wVar.a(), this.f25373j - this.f25372i);
                        wVar.h(vVar.f4032b, this.f25372i, iMin);
                        int i14 = this.f25372i + iMin;
                        this.f25372i = i14;
                        if (i14 == this.f25373j) {
                            vVar.q(0);
                            if (vVar.h()) {
                                if (this.m) {
                                }
                                this.f25371h = 0;
                            } else {
                                this.m = true;
                                int i15 = vVar.i(1);
                                int i16 = i15 == 1 ? vVar.i(1) : 0;
                                this.f25376n = i16;
                                if (i16 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i15 == 1) {
                                    vVar.i((vVar.i(2) + 1) * 8);
                                }
                                if (!vVar.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.f25377o = vVar.i(6);
                                int i17 = vVar.i(4);
                                int i18 = vVar.i(3);
                                if (i17 != 0 || i18 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i15 == 0) {
                                    int iG = vVar.g();
                                    int iB = vVar.b();
                                    com.android.billingclient.api.i iVarN = x7.a.n(vVar, true);
                                    this.f25384v = iVarN.f7517c;
                                    this.f25381s = iVarN.f7515a;
                                    this.f25383u = iVarN.f7516b;
                                    int iB2 = iB - vVar.b();
                                    vVar.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    vVar.j(bArr2, iB2);
                                    y6.o oVar = new y6.o();
                                    oVar.f57253a = this.f25369f;
                                    oVar.f57264l = y6.d0.o("video/mp2t");
                                    oVar.m = y6.d0.o("audio/mp4a-latm");
                                    oVar.f57262j = this.f25384v;
                                    oVar.E = this.f25383u;
                                    oVar.F = this.f25381s;
                                    oVar.f57267p = Collections.singletonList(bArr2);
                                    oVar.f57256d = this.f25364a;
                                    oVar.f57258f = this.f25365b;
                                    y6.p pVar = new y6.p(oVar);
                                    if (!pVar.equals(this.f25370g)) {
                                        this.f25370g = pVar;
                                        this.f25382t = 1024000000 / ((long) pVar.G);
                                        this.f25368e.b(pVar);
                                    }
                                } else {
                                    int i19 = vVar.i((vVar.i(2) + 1) * 8);
                                    int iB3 = vVar.b();
                                    com.android.billingclient.api.i iVarN2 = x7.a.n(vVar, true);
                                    this.f25384v = iVarN2.f7517c;
                                    this.f25381s = iVarN2.f7515a;
                                    this.f25383u = iVarN2.f7516b;
                                    vVar.t(i19 - (iB3 - vVar.b()));
                                }
                                int i21 = vVar.i(3);
                                this.f25378p = i21;
                                if (i21 == 0) {
                                    vVar.t(8);
                                } else if (i21 == 1) {
                                    vVar.t(9);
                                } else if (i21 == 3 || i21 == 4 || i21 == 5) {
                                    vVar.t(6);
                                } else {
                                    if (i21 != 6 && i21 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    vVar.t(1);
                                }
                                boolean zH2 = vVar.h();
                                this.f25379q = zH2;
                                this.f25380r = 0L;
                                if (zH2) {
                                    if (i15 == 1) {
                                        this.f25380r = vVar.i((vVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = vVar.h();
                                            this.f25380r = (this.f25380r << 8) + ((long) vVar.i(8));
                                        } while (zH);
                                    }
                                }
                                if (vVar.h()) {
                                    vVar.t(8);
                                }
                            }
                            if (this.f25376n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f25377o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f25378p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i22 = 0;
                            do {
                                i11 = vVar.i(8);
                                i22 += i11;
                            } while (i11 == 255);
                            int iG2 = vVar.g();
                            if ((iG2 & 7) == 0) {
                                wVar2.I(iG2 >> 3);
                                i12 = 0;
                            } else {
                                vVar.j(wVar2.f4039a, i22 * 8);
                                i12 = 0;
                                wVar2.I(0);
                            }
                            this.f25368e.a(wVar2, i22, i12);
                            b7.a.j(this.f25375l != -9223372036854775807L);
                            this.f25368e.d(this.f25375l, 1, i22, 0, null);
                            this.f25375l += this.f25382t;
                            if (this.f25379q) {
                                vVar.t((int) this.f25380r);
                            }
                            this.f25371h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iW2 = wVar.w();
                    if ((iW2 & 224) == 224) {
                        this.f25374k = iW2;
                        this.f25371h = 2;
                    } else if (iW2 != 86) {
                        this.f25371h = 0;
                    }
                }
            } else if (wVar.w() == 86) {
                this.f25371h = 1;
            }
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25368e = oVar.v(bVar.f3848c, 1);
        bVar.j();
        this.f25369f = (String) bVar.f3850e;
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.f25375l = j11;
    }

    @Override // e9.h
    public final void e(boolean z11) {
    }
}
