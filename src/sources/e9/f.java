package e9;

import androidx.media3.common.ParserException;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.w f25221a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25224d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x7.e0 f25227g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y6.p f25232l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25233n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25228h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f25236q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f25222b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25234o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25235p = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25225e = "video/mp2t";

    public f(String str, int i11, int i12) {
        this.f25221a = new b7.w(new byte[i12]);
        this.f25223c = str;
        this.f25224d = i11;
    }

    @Override // e9.h
    public final void a() {
        this.f25228h = 0;
        this.f25229i = 0;
        this.f25230j = 0;
        this.f25236q = -9223372036854775807L;
        this.f25222b.set(0);
    }

    public final boolean b(b7.w wVar, byte[] bArr, int i11) {
        int iMin = Math.min(wVar.a(), i11 - this.f25229i);
        wVar.h(bArr, this.f25229i, iMin);
        int i12 = this.f25229i + iMin;
        this.f25229i = i12;
        return i12 == i11;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0480  */
    /* JADX WARN: Code duplicated, block: B:181:0x0488  */
    /* JADX WARN: Code duplicated, block: B:183:0x048b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x048d  */
    /* JADX WARN: Code duplicated, block: B:187:0x049d  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:190:0x04ba  */
    @Override // e9.h
    public final void c(b7.w wVar) throws ParserException {
        int i11;
        int i12;
        byte b3;
        boolean z11;
        int i13;
        int i14;
        byte b11;
        int i15;
        byte b12;
        int i16;
        byte b13;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        long jR;
        int i24;
        long jR2;
        int i25;
        int i26;
        int i27;
        int i28;
        b7.a.k(this.f25227g);
        while (wVar.a() > 0) {
            int i29 = this.f25228h;
            int i30 = 8;
            b7.w wVar2 = this.f25221a;
            switch (i29) {
                case 0:
                    while (wVar.a() > 0) {
                        int i31 = this.f25230j << 8;
                        this.f25230j = i31;
                        int iW = i31 | wVar.w();
                        this.f25230j = iW;
                        if (iW == 2147385345 || iW == -25230976 || iW == 536864768 || iW == -14745368) {
                            i11 = 1;
                        } else if (iW == 1683496997 || iW == 622876772) {
                            i11 = 2;
                        } else if (iW == 1078008818 || iW == -233094848) {
                            i11 = 3;
                        } else {
                            i11 = (iW == 1908687592 || iW == -398277519) ? 4 : 0;
                        }
                        this.f25233n = i11;
                        if (i11 != 0) {
                            byte[] bArr = wVar2.f4039a;
                            bArr[0] = (byte) ((iW >> 24) & 255);
                            bArr[1] = (byte) ((iW >> 16) & 255);
                            bArr[2] = (byte) ((iW >> 8) & 255);
                            bArr[3] = (byte) (iW & 255);
                            this.f25229i = 4;
                            this.f25230j = 0;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    this.f25228h = 1;
                                } else {
                                    this.f25228h = 2;
                                }
                            }
                            this.f25228h = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(wVar, wVar2.f4039a, 18)) {
                        byte[] bArr2 = wVar2.f4039a;
                        if (this.f25232l == null) {
                            String str = this.f25226f;
                            b7.v vVarJ = x7.a.j(bArr2);
                            vVarJ.t(60);
                            int i32 = x7.a.f55822j[vVarJ.i(6)];
                            int i33 = x7.a.f55823k[vVarJ.i(4)];
                            int i34 = vVarJ.i(5);
                            int i35 = i34 >= 29 ? -1 : (x7.a.f55824l[i34] * 1000) / 2;
                            vVarJ.t(10);
                            int i36 = i32 + (vVarJ.i(2) > 0 ? 1 : 0);
                            y6.o oVar = new y6.o();
                            oVar.f57253a = str;
                            oVar.f57264l = y6.d0.o(this.f25225e);
                            oVar.m = y6.d0.o("audio/vnd.dts");
                            oVar.f57260h = i35;
                            oVar.E = i36;
                            oVar.F = i33;
                            oVar.f57268q = null;
                            oVar.f57256d = this.f25223c;
                            oVar.f57258f = this.f25224d;
                            y6.p pVar = new y6.p(oVar);
                            this.f25232l = pVar;
                            this.f25227g.b(pVar);
                        }
                        byte b14 = bArr2[0];
                        if (b14 != -2) {
                            if (b14 == -1) {
                                i16 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b13 = bArr2[9];
                            } else if (b14 != 31) {
                                i12 = ((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b3 = bArr2[7];
                            } else {
                                i16 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b13 = bArr2[8];
                            }
                            i13 = (i16 | ((b13 & 60) >> 2)) + 1;
                            z11 = true;
                            if (z11) {
                                i13 = (i13 * 16) / 14;
                            }
                            this.m = i13;
                            if (b14 != -2) {
                                if (b14 != -1) {
                                    i14 = (bArr2[4] & 7) << 4;
                                    b12 = bArr2[7];
                                } else if (b14 != 31) {
                                    i14 = (bArr2[4] & 1) << 6;
                                    b11 = bArr2[5];
                                } else {
                                    i14 = (bArr2[5] & 7) << 4;
                                    b12 = bArr2[6];
                                }
                                i15 = b12 & 60;
                                this.f25231k = Ints.b(b7.f0.P(this.f25232l.G, (((i15 >> 2) | i14) + 1) * 32));
                                wVar2.I(0);
                                this.f25227g.a(wVar2, 18, 0);
                                this.f25228h = 6;
                            } else {
                                i14 = (bArr2[5] & 1) << 6;
                                b11 = bArr2[4];
                            }
                            i15 = b11 & 252;
                            this.f25231k = Ints.b(b7.f0.P(this.f25232l.G, (((i15 >> 2) | i14) + 1) * 32));
                            wVar2.I(0);
                            this.f25227g.a(wVar2, 18, 0);
                            this.f25228h = 6;
                        } else {
                            i12 = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                            b3 = bArr2[6];
                        }
                        i13 = (i12 | ((b3 & 240) >> 4)) + 1;
                        z11 = false;
                        if (z11) {
                            i13 = (i13 * 16) / 14;
                        }
                        this.m = i13;
                        if (b14 != -2) {
                            if (b14 != -1) {
                                i14 = (bArr2[4] & 7) << 4;
                                b12 = bArr2[7];
                            } else if (b14 != 31) {
                                i14 = (bArr2[4] & 1) << 6;
                                b11 = bArr2[5];
                            } else {
                                i14 = (bArr2[5] & 7) << 4;
                                b12 = bArr2[6];
                            }
                            i15 = b12 & 60;
                            this.f25231k = Ints.b(b7.f0.P(this.f25232l.G, (((i15 >> 2) | i14) + 1) * 32));
                            wVar2.I(0);
                            this.f25227g.a(wVar2, 18, 0);
                            this.f25228h = 6;
                        } else {
                            i14 = (bArr2[5] & 1) << 6;
                            b11 = bArr2[4];
                        }
                        i15 = b11 & 252;
                        this.f25231k = Ints.b(b7.f0.P(this.f25232l.G, (((i15 >> 2) | i14) + 1) * 32));
                        wVar2.I(0);
                        this.f25227g.a(wVar2, 18, 0);
                        this.f25228h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (b(wVar, wVar2.f4039a, 7)) {
                        b7.v vVarJ2 = x7.a.j(wVar2.f4039a);
                        vVarJ2.t(42);
                        this.f25234o = vVarJ2.i(vVarJ2.h() ? 12 : 8) + 1;
                        this.f25228h = 3;
                    }
                    break;
                case 3:
                    if (b(wVar, wVar2.f4039a, this.f25234o)) {
                        b7.v vVarJ3 = x7.a.j(wVar2.f4039a);
                        vVarJ3.t(40);
                        int i37 = vVarJ3.i(2);
                        if (vVarJ3.h()) {
                            i17 = 20;
                            i18 = 12;
                        } else {
                            i17 = 16;
                            i18 = 8;
                        }
                        vVarJ3.t(i18);
                        int i38 = vVarJ3.i(i17) + 1;
                        boolean zH = vVarJ3.h();
                        if (zH) {
                            i19 = vVarJ3.i(2);
                            i21 = (vVarJ3.i(3) + 1) * 512;
                            if (vVarJ3.h()) {
                                vVarJ3.t(36);
                            }
                            int i39 = vVarJ3.i(3) + 1;
                            int i40 = vVarJ3.i(3) + 1;
                            if (i39 != 1 || i40 != 1) {
                                throw ParserException.c("Multiple audio presentations or assets not supported");
                            }
                            int i41 = i37 + 1;
                            int i42 = vVarJ3.i(i41);
                            int i43 = 0;
                            while (i43 < i41) {
                                if (((i42 >> i43) & 1) == 1) {
                                    vVarJ3.t(i30);
                                }
                                i43++;
                                i30 = 8;
                            }
                            if (vVarJ3.h()) {
                                vVarJ3.t(2);
                                int i44 = (vVarJ3.i(2) + 1) << 2;
                                int i45 = vVarJ3.i(2) + 1;
                                for (int i46 = 0; i46 < i45; i46++) {
                                    vVarJ3.t(i44);
                                }
                            }
                        } else {
                            i19 = -1;
                            i21 = 0;
                        }
                        vVarJ3.t(i17);
                        vVarJ3.t(12);
                        if (zH) {
                            if (vVarJ3.h()) {
                                vVarJ3.t(4);
                            }
                            if (vVarJ3.h()) {
                                vVarJ3.t(24);
                            }
                            if (vVarJ3.h()) {
                                vVarJ3.u(vVarJ3.i(10) + 1);
                            }
                            vVarJ3.t(5);
                            i23 = x7.a.m[vVarJ3.i(4)];
                            i22 = vVarJ3.i(8) + 1;
                        } else {
                            i22 = -1;
                            i23 = -2147483647;
                        }
                        if (zH) {
                            if (i19 == 0) {
                                i24 = 32000;
                            } else if (i19 == 1) {
                                i24 = 44100;
                            } else {
                                if (i19 != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + i19);
                                }
                                i24 = 48000;
                            }
                            String str2 = b7.f0.f3975a;
                            jR = b7.f0.R(i21, 1000000L, i24, RoundingMode.DOWN);
                        } else {
                            jR = -9223372036854775807L;
                        }
                        g(new com.android.billingclient.api.i(i22, i23, i38, jR, "audio/vnd.dts.hd;profile=lbr"));
                        this.m = i38;
                        this.f25231k = jR == -9223372036854775807L ? 0L : jR;
                        wVar2.I(0);
                        this.f25227g.a(wVar2, this.f25234o, 0);
                        this.f25228h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (b(wVar, wVar2.f4039a, 6)) {
                        b7.v vVarJ4 = x7.a.j(wVar2.f4039a);
                        vVarJ4.t(32);
                        int iQ = x7.a.q(vVarJ4, x7.a.f55829r) + 1;
                        this.f25235p = iQ;
                        int i47 = this.f25229i;
                        if (i47 > iQ) {
                            int i48 = i47 - iQ;
                            this.f25229i = i47 - i48;
                            wVar.I(wVar.f4040b - i48);
                        }
                        this.f25228h = 5;
                    }
                    break;
                case 5:
                    if (b(wVar, wVar2.f4039a, this.f25235p)) {
                        byte[] bArr3 = wVar2.f4039a;
                        b7.v vVarJ5 = x7.a.j(bArr3);
                        int i49 = vVarJ5.i(32) == 1078008818 ? 1 : 0;
                        int iQ2 = x7.a.q(vVarJ5, x7.a.f55825n);
                        int i50 = iQ2 + 1;
                        if (i49 == 0) {
                            jR2 = -9223372036854775807L;
                            i25 = -2147483647;
                        } else {
                            if (!vVarJ5.h()) {
                                throw ParserException.c("Only supports full channel mask-based audio presentation");
                            }
                            int i51 = iQ2 - 1;
                            int i52 = ((bArr3[i51] << 8) & 65535) | (bArr3[iQ2] & 255);
                            String str3 = b7.f0.f3975a;
                            int i53 = 65535;
                            for (int i54 = 0; i54 < i51; i54++) {
                                byte b15 = bArr3[i54];
                                int i55 = (((i53 >> 12) & 255) ^ ((b15 & 255) >> 4)) & 255;
                                int i56 = (i53 << 4) & 65535;
                                int[] iArr = b7.f0.f3985k;
                                int i57 = (iArr[i55] ^ i56) & 65535;
                                i53 = (((i57 << 4) & 65535) ^ iArr[((b15 & 15) ^ ((i57 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i52 != i53) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int i58 = vVarJ5.i(2);
                            if (i58 != 0) {
                                if (i58 == 1) {
                                    i27 = 480;
                                } else {
                                    if (i58 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + i58);
                                    }
                                    i27 = 384;
                                }
                                i26 = 3;
                            } else {
                                i26 = 3;
                                i27 = 512;
                            }
                            int i59 = (vVarJ5.i(i26) + 1) * i27;
                            int i60 = vVarJ5.i(2);
                            if (i60 == 0) {
                                i28 = 32000;
                            } else if (i60 == 1) {
                                i28 = 44100;
                            } else {
                                if (i60 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + i60);
                                }
                                i28 = 48000;
                            }
                            if (vVarJ5.h()) {
                                vVarJ5.t(36);
                            }
                            int i61 = i28 * (1 << vVarJ5.i(2));
                            jR2 = b7.f0.R(i59, 1000000L, i28, RoundingMode.DOWN);
                            i25 = i61;
                        }
                        int iQ3 = 0;
                        for (int i62 = 0; i62 < i49; i62++) {
                            iQ3 += x7.a.q(vVarJ5, x7.a.f55826o);
                        }
                        AtomicInteger atomicInteger = this.f25222b;
                        if (i49 != 0) {
                            atomicInteger.set(x7.a.q(vVarJ5, x7.a.f55827p));
                        }
                        int iQ4 = iQ3 + (atomicInteger.get() != 0 ? x7.a.q(vVarJ5, x7.a.f55828q) : 0) + i50;
                        long j11 = jR2;
                        com.android.billingclient.api.i iVar = new com.android.billingclient.api.i(2, i25, iQ4, j11, "audio/vnd.dts.uhd;profile=p2");
                        if (this.f25233n == 3) {
                            g(iVar);
                        }
                        this.m = iQ4;
                        this.f25231k = j11 == -9223372036854775807L ? 0L : j11;
                        wVar2.I(0);
                        this.f25227g.a(wVar2, this.f25235p, 0);
                        this.f25228h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(wVar.a(), this.m - this.f25229i);
                    this.f25227g.a(wVar, iMin, 0);
                    int i63 = this.f25229i + iMin;
                    this.f25229i = i63;
                    if (i63 == this.m) {
                        b7.a.j(this.f25236q != -9223372036854775807L);
                        this.f25227g.d(this.f25236q, this.f25233n == 4 ? 0 : 1, this.m, 0, null);
                        this.f25236q += this.f25231k;
                        this.f25228h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25226f = (String) bVar.f3850e;
        bVar.j();
        this.f25227g = oVar.v(bVar.f3848c, 1);
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.f25236q = j11;
    }

    public final void g(com.android.billingclient.api.i iVar) {
        int i11 = iVar.f7515a;
        String str = iVar.f7517c;
        int i12 = iVar.f7516b;
        if (i11 == -2147483647 || i12 == -1) {
            return;
        }
        y6.p pVar = this.f25232l;
        if (pVar != null && i12 == pVar.F && i11 == pVar.G && str.equals(pVar.f57291n)) {
            return;
        }
        y6.p pVar2 = this.f25232l;
        y6.o oVar = pVar2 == null ? new y6.o() : pVar2.a();
        oVar.f57253a = this.f25226f;
        oVar.f57264l = y6.d0.o(this.f25225e);
        oVar.m = y6.d0.o(str);
        oVar.E = i12;
        oVar.F = i11;
        oVar.f57256d = this.f25223c;
        oVar.f57258f = this.f25224d;
        y6.p pVar3 = new y6.p(oVar);
        this.f25232l = pVar3;
        this.f25227g.b(pVar3);
    }

    @Override // e9.h
    public final void e(boolean z11) {
    }
}
