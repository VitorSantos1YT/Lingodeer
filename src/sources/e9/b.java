package e9;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.v f25149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x7.e0 f25155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25159l;
    public y6.p m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25161o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(null, 0, 0, str);
        this.f25148a = 0;
    }

    private final void b(boolean z11) {
    }

    private final void g(boolean z11) {
    }

    @Override // e9.h
    public final void a() {
        switch (this.f25148a) {
            case 0:
                this.f25156i = 0;
                this.f25157j = 0;
                this.f25158k = false;
                this.f25161o = -9223372036854775807L;
                break;
            default:
                this.f25156i = 0;
                this.f25157j = 0;
                this.f25158k = false;
                this.f25161o = -9223372036854775807L;
                break;
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        switch (this.f25148a) {
            case 0:
                bVar.d();
                bVar.j();
                this.f25154g = (String) bVar.f3850e;
                bVar.j();
                this.f25155h = oVar.v(bVar.f3848c, 1);
                break;
            default:
                bVar.d();
                bVar.j();
                this.f25154g = (String) bVar.f3850e;
                bVar.j();
                this.f25155h = oVar.v(bVar.f3848c, 1);
                break;
        }
    }

    @Override // e9.h
    public final void e(boolean z11) {
        int i11 = this.f25148a;
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        switch (this.f25148a) {
            case 0:
                this.f25161o = j11;
                break;
            default:
                this.f25161o = j11;
                break;
        }
    }

    public b(String str, int i11, int i12, String str2) {
        this.f25148a = i12;
        switch (i12) {
            case 1:
                b7.v vVar = new b7.v(new byte[16], 16);
                this.f25149b = vVar;
                this.f25150c = new b7.w(vVar.f4032b);
                this.f25156i = 0;
                this.f25157j = 0;
                this.f25158k = false;
                this.f25161o = -9223372036854775807L;
                this.f25151d = str;
                this.f25152e = i11;
                this.f25153f = str2;
                break;
            default:
                b7.v vVar2 = new b7.v(new byte[128], 128);
                this.f25149b = vVar2;
                this.f25150c = new b7.w(vVar2.f4032b);
                this.f25156i = 0;
                this.f25161o = -9223372036854775807L;
                this.f25151d = str;
                this.f25152e = i11;
                this.f25153f = str2;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x033f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0381  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e9.h
    public final void c(b7.w wVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        byte b3;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        switch (this.f25148a) {
            case 0:
                b7.a.k(this.f25155h);
                while (wVar.a() > 0) {
                    int i29 = this.f25156i;
                    b7.w wVar2 = this.f25150c;
                    if (i29 == 0) {
                        while (wVar.a() > 0) {
                            if (this.f25158k) {
                                int iW = wVar.w();
                                if (iW == 119) {
                                    this.f25158k = false;
                                    this.f25156i = 1;
                                    byte[] bArr = wVar2.f4039a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f25157j = 2;
                                }
                                this.f25158k = iW == 11;
                            } else {
                                this.f25158k = wVar.w() == 11;
                            }
                            break;
                        }
                    } else if (i29 == 1) {
                        byte[] bArr2 = wVar2.f4039a;
                        int iMin = Math.min(wVar.a(), 128 - this.f25157j);
                        wVar.h(bArr2, this.f25157j, iMin);
                        int i30 = this.f25157j + iMin;
                        this.f25157j = i30;
                        if (i30 == 128) {
                            b7.v vVar = this.f25149b;
                            vVar.q(0);
                            int[] iArr = x7.a.f55818f;
                            int[] iArr2 = x7.a.f55816d;
                            int iG = vVar.g();
                            vVar.t(40);
                            Object[] objArr = vVar.i(5) > 10;
                            vVar.q(iG);
                            if (objArr == true) {
                                vVar.t(16);
                                int i31 = vVar.i(2);
                                if (i31 == 0) {
                                    b3 = 0;
                                } else if (i31 != 1) {
                                    b3 = i31 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b3 = 1;
                                }
                                vVar.t(3);
                                i14 = (vVar.i(11) + 1) * 2;
                                int i32 = vVar.i(2);
                                if (i32 == 3) {
                                    i15 = x7.a.f55817e[vVar.i(2)];
                                    i17 = 3;
                                    i18 = 6;
                                } else {
                                    int i33 = vVar.i(2);
                                    int i34 = x7.a.f55815c[i33];
                                    i15 = iArr2[i32];
                                    i17 = i33;
                                    i18 = i34;
                                }
                                i16 = i18 * 256;
                                int i35 = (i14 * i15) / (i18 * 32);
                                int i36 = vVar.i(3);
                                boolean zH = vVar.h();
                                i13 = iArr[i36] + (zH ? 1 : 0);
                                vVar.t(10);
                                if (vVar.h()) {
                                    vVar.t(8);
                                }
                                if (i36 == 0) {
                                    vVar.t(5);
                                    if (vVar.h()) {
                                        vVar.t(8);
                                    }
                                }
                                if (b3 == 1 && vVar.h()) {
                                    vVar.t(16);
                                }
                                if (vVar.h()) {
                                    if (i36 > 2) {
                                        vVar.t(2);
                                    }
                                    if ((i36 & 1) == 0 || i36 <= 2) {
                                        i24 = 6;
                                    } else {
                                        i24 = 6;
                                        vVar.t(6);
                                    }
                                    if ((i36 & 4) != 0) {
                                        vVar.t(i24);
                                    }
                                    if (zH && vVar.h()) {
                                        vVar.t(5);
                                    }
                                    if (b3 != 0) {
                                        i19 = i17;
                                    } else {
                                        if (vVar.h()) {
                                            i25 = 6;
                                            vVar.t(6);
                                        } else {
                                            i25 = 6;
                                        }
                                        if (i36 == 0 && vVar.h()) {
                                            vVar.t(i25);
                                        }
                                        if (vVar.h()) {
                                            vVar.t(i25);
                                        }
                                        int i37 = vVar.i(2);
                                        if (i37 == 1) {
                                            vVar.t(5);
                                            i27 = 2;
                                        } else {
                                            if (i37 == 2) {
                                                vVar.t(12);
                                            } else if (i37 == 3) {
                                                int i38 = vVar.i(5);
                                                if (vVar.h()) {
                                                    vVar.t(5);
                                                    if (vVar.h()) {
                                                        i28 = 4;
                                                        vVar.t(4);
                                                    } else {
                                                        i28 = 4;
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.t(i28);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.t(i28);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.t(i28);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.t(i28);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.t(i28);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.t(i28);
                                                    }
                                                    if (vVar.h()) {
                                                        if (vVar.h()) {
                                                            vVar.t(i28);
                                                        }
                                                        if (vVar.h()) {
                                                            vVar.t(i28);
                                                        }
                                                    }
                                                }
                                                if (vVar.h()) {
                                                    vVar.t(5);
                                                    if (vVar.h()) {
                                                        vVar.t(7);
                                                        if (vVar.h()) {
                                                            i26 = 8;
                                                            vVar.t(8);
                                                        } else {
                                                            i26 = 8;
                                                        }
                                                    } else {
                                                        i26 = 8;
                                                    }
                                                } else {
                                                    i26 = 8;
                                                }
                                                i27 = 2;
                                                vVar.t((i38 + 2) * i26);
                                                vVar.c();
                                            }
                                            i27 = 2;
                                        }
                                        if (i36 < i27) {
                                            if (vVar.h()) {
                                                vVar.t(14);
                                            }
                                            if (i36 == 0 && vVar.h()) {
                                                vVar.t(14);
                                            }
                                        }
                                        if (vVar.h()) {
                                            i19 = i17;
                                            if (i19 == 0) {
                                                vVar.t(5);
                                            } else {
                                                for (int i39 = 0; i39 < i18; i39++) {
                                                    if (vVar.h()) {
                                                        vVar.t(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i19 = i17;
                                        }
                                    }
                                } else {
                                    i19 = i17;
                                }
                                if (vVar.h()) {
                                    vVar.t(5);
                                    if (i36 == 2) {
                                        vVar.t(4);
                                    }
                                    if (i36 >= 6) {
                                        vVar.t(2);
                                    }
                                    if (vVar.h()) {
                                        i23 = 8;
                                        vVar.t(8);
                                    } else {
                                        i23 = 8;
                                    }
                                    if (i36 == 0 && vVar.h()) {
                                        vVar.t(i23);
                                    }
                                    i21 = 3;
                                    if (i32 < 3) {
                                        vVar.s();
                                    }
                                } else {
                                    i21 = 3;
                                }
                                if (b3 == 0 && i19 != i21) {
                                    vVar.s();
                                }
                                if (b3 == 2 && (i19 == i21 || vVar.h())) {
                                    i22 = 6;
                                    vVar.t(6);
                                } else {
                                    i22 = 6;
                                }
                                str = (vVar.h() && vVar.i(i22) == 1 && vVar.i(8) == 1) ? MzwEyWCkjXL.Pbn : "audio/eac3";
                                i11 = i35;
                            } else {
                                vVar.t(32);
                                int i40 = vVar.i(2);
                                String str2 = i40 == 3 ? null : "audio/ac3";
                                int i41 = vVar.i(6);
                                i11 = x7.a.f55819g[i41 / 2] * 1000;
                                int iF = x7.a.f(i40, i41);
                                vVar.t(8);
                                int i42 = vVar.i(3);
                                if ((i42 & 1) == 0 || i42 == 1) {
                                    i12 = 2;
                                } else {
                                    i12 = 2;
                                    vVar.t(2);
                                }
                                if ((i42 & 4) != 0) {
                                    vVar.t(i12);
                                }
                                if (i42 == i12) {
                                    vVar.t(i12);
                                }
                                int i43 = i40 < 3 ? iArr2[i40] : -1;
                                i13 = iArr[i42] + (vVar.h() ? 1 : 0);
                                i14 = iF;
                                i15 = i43;
                                i16 = 1536;
                                str = str2;
                            }
                            y6.p pVar = this.m;
                            if (pVar == null || i13 != pVar.F || i15 != pVar.G || !Objects.equals(str, pVar.f57291n)) {
                                y6.o oVar = new y6.o();
                                oVar.f57253a = this.f25154g;
                                oVar.f57264l = y6.d0.o(this.f25153f);
                                oVar.m = y6.d0.o(str);
                                oVar.E = i13;
                                oVar.F = i15;
                                oVar.f57256d = this.f25151d;
                                oVar.f57258f = this.f25152e;
                                oVar.f57261i = i11;
                                if ("audio/ac3".equals(str)) {
                                    oVar.f57260h = i11;
                                }
                                y6.p pVar2 = new y6.p(oVar);
                                this.m = pVar2;
                                this.f25155h.b(pVar2);
                            }
                            this.f25160n = i14;
                            this.f25159l = (((long) i16) * 1000000) / ((long) this.m.G);
                            wVar2.I(0);
                            this.f25155h.a(wVar2, 128, 0);
                            this.f25156i = 2;
                        }
                    } else if (i29 == 2) {
                        int iMin2 = Math.min(wVar.a(), this.f25160n - this.f25157j);
                        this.f25155h.a(wVar, iMin2, 0);
                        int i44 = this.f25157j + iMin2;
                        this.f25157j = i44;
                        if (i44 == this.f25160n) {
                            b7.a.j(this.f25161o != -9223372036854775807L);
                            this.f25155h.d(this.f25161o, 1, this.f25160n, 0, null);
                            this.f25161o += this.f25159l;
                            this.f25156i = 0;
                        }
                    }
                }
                break;
            default:
                b7.a.k(this.f25155h);
                while (wVar.a() > 0) {
                    int i45 = this.f25156i;
                    b7.w wVar3 = this.f25150c;
                    if (i45 == 0) {
                        while (wVar.a() > 0) {
                            if (this.f25158k) {
                                int iW2 = wVar.w();
                                this.f25158k = iW2 == 172;
                                if (iW2 == 64 || iW2 == 65) {
                                    Object[] objArr2 = iW2 == 65;
                                    this.f25156i = 1;
                                    byte[] bArr3 = wVar3.f4039a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f25157j = 2;
                                }
                            } else {
                                this.f25158k = wVar.w() == 172;
                            }
                            break;
                        }
                    } else if (i45 == 1) {
                        byte[] bArr4 = wVar3.f4039a;
                        int iMin3 = Math.min(wVar.a(), 16 - this.f25157j);
                        wVar.h(bArr4, this.f25157j, iMin3);
                        int i46 = this.f25157j + iMin3;
                        this.f25157j = i46;
                        if (i46 == 16) {
                            b7.v vVar2 = this.f25149b;
                            vVar2.q(0);
                            c7.j jVarM = x7.a.m(vVar2);
                            int i47 = jVarM.f6660a;
                            y6.p pVar3 = this.m;
                            if (pVar3 == null || 2 != pVar3.F || i47 != pVar3.G || !"audio/ac4".equals(pVar3.f57291n)) {
                                y6.o oVar2 = new y6.o();
                                oVar2.f57253a = this.f25154g;
                                oVar2.f57264l = y6.d0.o(this.f25153f);
                                oVar2.m = y6.d0.o("audio/ac4");
                                oVar2.E = 2;
                                oVar2.F = i47;
                                oVar2.f57256d = this.f25151d;
                                oVar2.f57258f = this.f25152e;
                                y6.p pVar4 = new y6.p(oVar2);
                                this.m = pVar4;
                                this.f25155h.b(pVar4);
                            }
                            this.f25160n = jVarM.f6661b;
                            this.f25159l = (((long) jVarM.f6662c) * 1000000) / ((long) this.m.G);
                            wVar3.I(0);
                            this.f25155h.a(wVar3, 16, 0);
                            this.f25156i = 2;
                        }
                    } else if (i45 == 2) {
                        int iMin4 = Math.min(wVar.a(), this.f25160n - this.f25157j);
                        this.f25155h.a(wVar, iMin4, 0);
                        int i48 = this.f25157j + iMin4;
                        this.f25157j = i48;
                        if (i48 == this.f25160n) {
                            b7.a.j(this.f25161o != -9223372036854775807L);
                            this.f25155h.d(this.f25161o, 1, this.f25160n, 0, null);
                            this.f25161o += this.f25159l;
                            this.f25156i = 0;
                        }
                    }
                }
                break;
        }
    }
}
