package d8;

import androidx.media3.common.ParserException;
import b7.w;
import com.android.billingclient.api.i;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nv.p;
import x7.e0;
import x7.j;
import x7.l;
import x7.m;
import x7.n;
import x7.o;
import x7.q;
import x7.v;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f23264a = new w(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f23265b = new w(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f23266c = new w(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f23267d = new w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f23268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f23269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23275l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f23277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f23278p;

    public b() {
        c cVar = new c(new l(), 2);
        cVar.f23279c = -9223372036854775807L;
        cVar.f23280d = new long[0];
        cVar.f23281e = new long[0];
        this.f23268e = cVar;
        this.f23270g = 1;
    }

    public final w a(n nVar) {
        int i11 = this.f23275l;
        w wVar = this.f23267d;
        byte[] bArr = wVar.f4039a;
        if (i11 > bArr.length) {
            wVar.G(new byte[Math.max(bArr.length * 2, i11)], 0);
        } else {
            wVar.I(0);
        }
        wVar.H(this.f23275l);
        nVar.readFully(wVar.f4039a, 0, this.f23275l);
        return wVar;
    }

    @Override // x7.m
    public final boolean c(n nVar) throws EOFException, InterruptedIOException {
        w wVar = this.f23264a;
        j jVar = (j) nVar;
        jVar.f(wVar.f4039a, 0, 3, false);
        wVar.I(0);
        if (wVar.z() == 4607062) {
            jVar.f(wVar.f4039a, 0, 2, false);
            wVar.I(0);
            if ((wVar.C() & 250) == 0) {
                jVar.f(wVar.f4039a, 0, 4, false);
                wVar.I(0);
                int iJ = wVar.j();
                jVar.f55903f = 0;
                jVar.b(iJ, false);
                jVar.f(wVar.f4039a, 0, 4, false);
                wVar.I(0);
                if (wVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f23269f = oVar;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        if (j11 == 0) {
            this.f23270g = 1;
            this.f23271h = false;
        } else {
            this.f23270g = 3;
        }
        this.f23273j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:186:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws ParserException {
        long j11;
        long j12;
        int i11;
        int i12;
        long j13;
        boolean z11;
        boolean z12;
        boolean z13;
        long j14;
        b7.a.k(this.f23269f);
        while (true) {
            int i13 = this.f23270g;
            if (i13 == 1) {
                w wVar = this.f23265b;
                if (!nVar.a(wVar.f4039a, 0, 9, true)) {
                    return -1;
                }
                wVar.I(0);
                wVar.J(4);
                int iW = wVar.w();
                boolean z14 = (iW & 4) != 0;
                boolean z15 = (iW & 1) != 0;
                if (z14 && this.f23277o == null) {
                    this.f23277o = new a(this.f23269f.v(8, 1), 2);
                }
                if (z15 && this.f23278p == null) {
                    this.f23278p = new d(this.f23269f.v(9, 2));
                }
                this.f23269f.o();
                this.f23273j = wVar.j() - 5;
                this.f23270g = 2;
            } else if (i13 == 2) {
                nVar.s(this.f23273j);
                this.f23273j = 0;
                this.f23270g = 3;
            } else if (i13 == 3) {
                w wVar2 = this.f23266c;
                if (!nVar.a(wVar2.f4039a, 0, 11, true)) {
                    return -1;
                }
                wVar2.I(0);
                this.f23274k = wVar2.w();
                this.f23275l = wVar2.z();
                this.m = wVar2.z();
                this.m = (((long) (wVar2.w() << 24)) | this.m) * 1000;
                wVar2.J(3);
                this.f23270g = 4;
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                boolean z16 = this.f23271h;
                c cVar = this.f23268e;
                if (z16) {
                    j11 = this.f23272i + this.m;
                } else {
                    if (cVar.f23279c == -9223372036854775807L) {
                        j12 = 0;
                    } else {
                        j11 = this.m;
                    }
                    i11 = this.f23274k;
                    if (i11 == 8 || this.f23277o == null) {
                        i12 = 0;
                        if (i11 == 9 || this.f23278p == null) {
                            j13 = -9223372036854775807L;
                            if (i11 == 18 || this.f23276n) {
                                nVar.s(this.f23275l);
                                z11 = false;
                                z12 = false;
                            } else {
                                w wVarA = a(nVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (wVarA.w() == 2 && "onMetaData".equals(c.u0(wVarA)) && wVarA.a() != 0 && wVarA.w() == 8) {
                                    HashMap mapT0 = c.t0(wVarA);
                                    Object obj = mapT0.get("duration");
                                    double d5 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            cVar.f23279c = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapT0.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.f23280d = new long[size];
                                            cVar.f23281e = new long[size];
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj5 = list.get(i14);
                                                Object obj6 = list2.get(i14);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.f23280d = new long[0];
                                                    cVar.f23281e = new long[0];
                                                    break;
                                                }
                                                double d11 = d5;
                                                cVar.f23280d[i14] = (long) (((Double) obj6).doubleValue() * d11);
                                                cVar.f23281e[i14] = ((Double) obj5).longValue();
                                                i14++;
                                                d5 = d11;
                                            }
                                        }
                                    }
                                }
                                long j15 = cVar.f23279c;
                                if (j15 != -9223372036854775807L) {
                                    this.f23269f.q(new v(j15, cVar.f23281e, cVar.f23280d));
                                    this.f23276n = true;
                                }
                                z12 = false;
                            }
                        } else {
                            if (!this.f23276n) {
                                this.f23269f.q(new q(-9223372036854775807L));
                                this.f23276n = true;
                            }
                            d dVar = this.f23278p;
                            w wVarA2 = a(nVar);
                            dVar.getClass();
                            int iW2 = wVarA2.w();
                            int i15 = (iW2 >> 4) & 15;
                            int i16 = iW2 & 15;
                            if (i16 != 7) {
                                final String strJ = p.j(i16, "Video format not supported: ");
                                throw new ParserException(strJ) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            dVar.H = i15;
                            if (i15 != 5) {
                                w wVar3 = dVar.f23282c;
                                e0 e0Var = (e0) dVar.f3561b;
                                w wVar4 = dVar.f23283d;
                                int iW3 = wVarA2.w();
                                byte[] bArr = wVarA2.f4039a;
                                int i17 = wVarA2.f4040b;
                                j13 = -9223372036854775807L;
                                int i18 = i17 + 1;
                                wVarA2.f4040b = i18;
                                int i19 = ((bArr[i17] & 255) << 24) >> 8;
                                int i21 = i17 + 2;
                                wVarA2.f4040b = i21;
                                int i22 = ((bArr[i18] & 255) << 8) | i19;
                                wVarA2.f4040b = i17 + 3;
                                long j16 = (((long) ((bArr[i21] & 255) | i22)) * 1000) + j12;
                                boolean z17 = false;
                                if (iW3 == 0 && !dVar.f23285f) {
                                    byte[] bArr2 = new byte[wVarA2.a()];
                                    w wVar5 = new w(bArr2);
                                    wVarA2.h(bArr2, 0, wVarA2.a());
                                    x7.c cVarA = x7.c.a(wVar5);
                                    dVar.f23284e = cVarA.f55852b;
                                    y6.o oVar = new y6.o();
                                    oVar.f57264l = d0.o("video/x-flv");
                                    oVar.m = d0.o("video/avc");
                                    oVar.f57262j = cVarA.f55862l;
                                    oVar.f57271t = cVarA.f55853c;
                                    oVar.f57272u = cVarA.f55854d;
                                    oVar.f57277z = cVarA.f55861k;
                                    oVar.f57267p = cVarA.f55851a;
                                    p.D(oVar, e0Var);
                                    dVar.f23285f = true;
                                } else if (iW3 == 1 && dVar.f23285f) {
                                    int i23 = dVar.H == 1 ? 1 : 0;
                                    if (dVar.f23286t || i23 != 0) {
                                        byte[] bArr3 = wVar4.f4039a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i24 = 4 - dVar.f23284e;
                                        int i25 = 0;
                                        while (wVarA2.a() > 0) {
                                            wVarA2.h(wVar4.f4039a, i24, dVar.f23284e);
                                            wVar4.I(0);
                                            int iA = wVar4.A();
                                            wVar3.I(0);
                                            e0Var.a(wVar3, 4, 0);
                                            e0Var.a(wVarA2, iA, 0);
                                            i25 = i25 + 4 + iA;
                                        }
                                        ((e0) dVar.f3561b).d(j16, i23, i25, 0, null);
                                        dVar.f23286t = true;
                                        z17 = true;
                                    }
                                }
                                if (z17) {
                                    z13 = true;
                                }
                                z12 = z13;
                            } else {
                                j13 = -9223372036854775807L;
                            }
                            z13 = false;
                            z12 = z13;
                        }
                        z11 = true;
                    } else {
                        if (!this.f23276n) {
                            this.f23269f.q(new q(-9223372036854775807L));
                            this.f23276n = true;
                        }
                        a aVar = this.f23277o;
                        w wVarA3 = a(nVar);
                        e0 e0Var2 = (e0) aVar.f3561b;
                        if (aVar.f23261c) {
                            i12 = 0;
                            wVarA3.J(1);
                        } else {
                            int iW4 = wVarA3.w();
                            int i26 = (iW4 >> 4) & 15;
                            aVar.f23263e = i26;
                            i12 = 0;
                            if (i26 == 2) {
                                int i27 = a.f23260f[(iW4 >> 2) & 3];
                                y6.o oVar2 = new y6.o();
                                oVar2.f57264l = d0.o("video/x-flv");
                                oVar2.m = d0.o("audio/mpeg");
                                oVar2.E = 1;
                                oVar2.F = i27;
                                p.D(oVar2, e0Var2);
                                aVar.f23262d = true;
                            } else if (i26 == 7 || i26 == 8) {
                                String str = i26 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                y6.o oVar3 = new y6.o();
                                oVar3.f57264l = d0.o("video/x-flv");
                                oVar3.m = d0.o(str);
                                oVar3.E = 1;
                                oVar3.F = 8000;
                                p.D(oVar3, e0Var2);
                                aVar.f23262d = true;
                            } else if (i26 != 10) {
                                final String str2 = "Audio format not supported: " + aVar.f23263e;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            aVar.f23261c = true;
                        }
                        e0 e0Var3 = (e0) aVar.f3561b;
                        z12 = false;
                        if (aVar.f23263e == 2) {
                            int iA2 = wVarA3.a();
                            e0Var3.a(wVarA3, iA2, 0);
                            ((e0) aVar.f3561b).d(j12, 1, iA2, 0, null);
                        } else {
                            int iW5 = wVarA3.w();
                            if (iW5 == 0 && !aVar.f23262d) {
                                int iA3 = wVarA3.a();
                                byte[] bArr4 = new byte[iA3];
                                wVarA3.h(bArr4, 0, iA3);
                                i iVarN = x7.a.n(new b7.v(bArr4, iA3), false);
                                y6.o oVar4 = new y6.o();
                                oVar4.f57264l = d0.o("video/x-flv");
                                oVar4.m = d0.o("audio/mp4a-latm");
                                oVar4.f57262j = iVarN.f7517c;
                                oVar4.E = iVarN.f7516b;
                                oVar4.F = iVarN.f7515a;
                                oVar4.f57267p = Collections.singletonList(bArr4);
                                p.D(oVar4, e0Var3);
                                aVar.f23262d = true;
                            } else if (aVar.f23263e != 10 || iW5 == 1) {
                                int iA4 = wVarA3.a();
                                e0Var3.a(wVarA3, iA4, 0);
                                ((e0) aVar.f3561b).d(j12, 1, iA4, 0, null);
                            }
                            z11 = true;
                            j13 = -9223372036854775807L;
                        }
                        z12 = true;
                        z11 = true;
                        j13 = -9223372036854775807L;
                    }
                    if (!this.f23271h && z12) {
                        this.f23271h = true;
                        if (cVar.f23279c == j13) {
                            j14 = -this.m;
                        } else {
                            j14 = 0;
                        }
                        this.f23272i = j14;
                    }
                    this.f23273j = 4;
                    this.f23270g = 2;
                    if (z11) {
                        return i12;
                    }
                }
                j12 = j11;
                i11 = this.f23274k;
                if (i11 == 8) {
                    i12 = 0;
                    if (i11 == 9) {
                        j13 = -9223372036854775807L;
                        if (i11 == 18) {
                        }
                        nVar.s(this.f23275l);
                        z11 = false;
                        z12 = false;
                    } else {
                        j13 = -9223372036854775807L;
                        if (i11 == 18) {
                        }
                        nVar.s(this.f23275l);
                        z11 = false;
                        z12 = false;
                    }
                } else {
                    i12 = 0;
                    if (i11 == 9) {
                        j13 = -9223372036854775807L;
                        if (i11 == 18) {
                        }
                        nVar.s(this.f23275l);
                        z11 = false;
                        z12 = false;
                    } else {
                        j13 = -9223372036854775807L;
                        if (i11 == 18) {
                        }
                        nVar.s(this.f23275l);
                        z11 = false;
                        z12 = false;
                    }
                }
                if (!this.f23271h) {
                    this.f23271h = true;
                    if (cVar.f23279c == j13) {
                        j14 = -this.m;
                    } else {
                        j14 = 0;
                    }
                    this.f23272i = j14;
                }
                this.f23273j = 4;
                this.f23270g = 2;
                if (z11) {
                    return i12;
                }
            }
        }
    }

    @Override // x7.m
    public final void release() {
    }
}
