package e9;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f25242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f25243g;

    public g(List list) {
        this.f25237a = 0;
        this.f25242f = list;
        this.f25243g = new x7.e0[list.size()];
        this.f25239c = -9223372036854775807L;
    }

    @Override // e9.h
    public final void a() {
        switch (this.f25237a) {
            case 0:
                this.f25238b = false;
                this.f25239c = -9223372036854775807L;
                break;
            default:
                this.f25238b = false;
                this.f25239c = -9223372036854775807L;
                break;
        }
    }

    @Override // e9.h
    public final void c(b7.w wVar) {
        boolean z11;
        boolean z12;
        switch (this.f25237a) {
            case 0:
                if (this.f25238b) {
                    if (this.f25240d == 2) {
                        if (wVar.a() == 0) {
                            z12 = false;
                        } else {
                            if (wVar.w() != 32) {
                                this.f25238b = false;
                            }
                            this.f25240d--;
                            z12 = this.f25238b;
                        }
                        if (!z12) {
                        }
                    }
                    if (this.f25240d == 1) {
                        if (wVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (wVar.w() != 0) {
                                this.f25238b = false;
                            }
                            this.f25240d--;
                            z11 = this.f25238b;
                        }
                        if (!z11) {
                        }
                    }
                    int i11 = wVar.f4040b;
                    int iA = wVar.a();
                    for (x7.e0 e0Var : (x7.e0[]) this.f25243g) {
                        wVar.I(i11);
                        e0Var.a(wVar, iA, 0);
                    }
                    this.f25241e += iA;
                }
                break;
            default:
                b7.w wVar2 = (b7.w) this.f25242f;
                b7.a.k((x7.e0) this.f25243g);
                if (this.f25238b) {
                    int iA2 = wVar.a();
                    int i12 = this.f25241e;
                    if (i12 < 10) {
                        int iMin = Math.min(iA2, 10 - i12);
                        System.arraycopy(wVar.f4039a, wVar.f4040b, wVar2.f4039a, this.f25241e, iMin);
                        if (this.f25241e + iMin == 10) {
                            wVar2.I(0);
                            if (73 == wVar2.w() && 68 == wVar2.w() && 51 == wVar2.w()) {
                                wVar2.J(3);
                                this.f25240d = wVar2.v() + 10;
                            } else {
                                b7.a.B("Discarding invalid ID3 tag");
                                this.f25238b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f25240d - this.f25241e);
                    ((x7.e0) this.f25243g).a(wVar, iMin2, 0);
                    this.f25241e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        switch (this.f25237a) {
            case 0:
                x7.e0[] e0VarArr = (x7.e0[]) this.f25243g;
                for (int i11 = 0; i11 < e0VarArr.length; i11++) {
                    e0 e0Var = (e0) ((List) this.f25242f).get(i11);
                    bVar.d();
                    bVar.j();
                    x7.e0 e0VarV = oVar.v(bVar.f3848c, 3);
                    y6.o oVar2 = new y6.o();
                    bVar.j();
                    oVar2.f57253a = (String) bVar.f3850e;
                    oVar2.f57264l = y6.d0.o("video/mp2t");
                    oVar2.m = y6.d0.o("application/dvbsubs");
                    oVar2.f57267p = Collections.singletonList(e0Var.f25220b);
                    oVar2.f57256d = e0Var.f25219a;
                    nv.p.D(oVar2, e0VarV);
                    e0VarArr[i11] = e0VarV;
                }
                break;
            default:
                bVar.d();
                bVar.j();
                x7.e0 e0VarV2 = oVar.v(bVar.f3848c, 5);
                this.f25243g = e0VarV2;
                y6.o oVar3 = new y6.o();
                bVar.j();
                oVar3.f57253a = (String) bVar.f3850e;
                oVar3.f57264l = y6.d0.o("video/mp2t");
                oVar3.m = y6.d0.o("application/id3");
                nv.p.D(oVar3, e0VarV2);
                break;
        }
    }

    @Override // e9.h
    public final void e(boolean z11) {
        int i11;
        switch (this.f25237a) {
            case 0:
                if (this.f25238b) {
                    b7.a.j(this.f25239c != -9223372036854775807L);
                    for (x7.e0 e0Var : (x7.e0[]) this.f25243g) {
                        e0Var.d(this.f25239c, 1, this.f25241e, 0, null);
                    }
                    this.f25238b = false;
                }
                break;
            default:
                b7.a.k((x7.e0) this.f25243g);
                if (this.f25238b && (i11 = this.f25240d) != 0 && this.f25241e == i11) {
                    b7.a.j(this.f25239c != -9223372036854775807L);
                    ((x7.e0) this.f25243g).d(this.f25239c, 1, this.f25240d, 0, null);
                    this.f25238b = false;
                    break;
                }
                break;
        }
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        switch (this.f25237a) {
            case 0:
                if ((i11 & 4) != 0) {
                    this.f25238b = true;
                    this.f25239c = j11;
                    this.f25241e = 0;
                    this.f25240d = 2;
                    break;
                }
                break;
            default:
                if ((i11 & 4) != 0) {
                    this.f25238b = true;
                    this.f25239c = j11;
                    this.f25240d = 0;
                    this.f25241e = 0;
                    break;
                }
                break;
        }
    }

    public g() {
        this.f25237a = 1;
        this.f25242f = new b7.w(10);
        this.f25239c = -9223372036854775807L;
    }
}
