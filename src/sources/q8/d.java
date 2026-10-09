package q8;

import b7.f0;
import b7.w;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.math.RoundingMode;
import l8.i;
import x7.e0;
import x7.l;
import x7.m;
import x7.n;
import x7.o;
import x7.t;
import y6.b0;
import y6.c0;
import y6.d0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f47564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f47565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f47566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f47567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f47569j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f47571l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f47572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f47574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f47575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f47576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f47577s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f47560a = new w(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7.w f47561b = new x7.w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f47562c = new t();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f47570k = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tp.e f47563d = new tp.e(4);

    public d() {
        l lVar = new l();
        this.f47564e = lVar;
        this.f47567h = lVar;
        this.f47572n = -1L;
    }

    public final void a() {
        f fVar = this.f47574p;
        if ((fVar instanceof a) && ((a) fVar).d()) {
            long j11 = this.f47572n;
            if (j11 == -1 || j11 == this.f47574p.a()) {
                return;
            }
            a aVar = (a) this.f47574p;
            this.f47574p = new a(this.f47572n, aVar.f47552h, aVar.f47553i, aVar.f47554j, aVar.f47555k);
            o oVar = this.f47565f;
            oVar.getClass();
            oVar.q(this.f47574p);
            this.f47566g.getClass();
            this.f47574p.k();
        }
    }

    public final boolean b(n nVar) {
        f fVar = this.f47574p;
        if (fVar != null) {
            long jA = fVar.a();
            if (jA == -1 || nVar.i() <= jA - 4) {
            }
            return true;
        }
        try {
            return !nVar.f(this.f47560a.f4039a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    @Override // x7.m
    public final boolean c(n nVar) {
        return d(nVar, true);
    }

    public final boolean d(n nVar, boolean z11) throws Throwable {
        int i11;
        int i12;
        int iH;
        int i13 = z11 ? 32768 : OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        nVar.r();
        if (nVar.getPosition() == 0) {
            w wVar = (w) this.f47563d.f52454b;
            int i14 = 0;
            c0 c0VarN = null;
            while (true) {
                try {
                    nVar.A(wVar.f4039a, 0, 10);
                    wVar.I(0);
                    if (wVar.z() != 4801587) {
                        break;
                    }
                    wVar.J(3);
                    int iV = wVar.v();
                    int i15 = iV + 10;
                    if (c0VarN == null) {
                        byte[] bArr = new byte[i15];
                        System.arraycopy(wVar.f4039a, 0, bArr, 0, 10);
                        nVar.A(bArr, 10, iV);
                        c0VarN = new i(null).N(bArr, i15);
                    } else {
                        nVar.k(iV);
                    }
                    i14 += i15;
                } catch (EOFException unused) {
                }
            }
            nVar.r();
            nVar.k(i14);
            this.f47569j = c0VarN;
            if (c0VarN != null) {
                this.f47562c.b(c0VarN);
            }
            i11 = (int) nVar.i();
            if (!z11) {
                nVar.s(i11);
            }
            i12 = 0;
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i16 = i12;
        int i17 = i16;
        while (true) {
            if (b(nVar)) {
                if (i16 > 0) {
                    break;
                }
                a();
                throw new EOFException();
            }
            w wVar2 = this.f47560a;
            wVar2.I(0);
            int iJ = wVar2.j();
            if ((i12 == 0 || ((-128000) & iJ) == (((long) i12) & (-128000))) && (iH = x7.a.h(iJ)) != -1) {
                i16++;
                if (i16 != 1) {
                    if (i16 == 4) {
                        break;
                    }
                } else {
                    this.f47561b.a(iJ);
                    i12 = iJ;
                }
                nVar.k(iH - 4);
            } else {
                int i18 = i17 + 1;
                if (i17 == i13) {
                    if (z11) {
                        return false;
                    }
                    a();
                    throw new EOFException();
                }
                if (z11) {
                    nVar.r();
                    nVar.k(i11 + i18);
                } else {
                    nVar.s(1);
                }
                i16 = 0;
                i17 = i18;
                i12 = 0;
            }
        }
        if (z11) {
            nVar.s(i11 + i17);
        } else {
            nVar.r();
        }
        this.f47568i = i12;
        return true;
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f47565f = oVar;
        e0 e0VarV = oVar.v(0, 1);
        this.f47566g = e0VarV;
        this.f47567h = e0VarV;
        this.f47565f.o();
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f47568i = 0;
        this.f47570k = -9223372036854775807L;
        this.f47571l = 0L;
        this.f47573o = 0;
        this.f47577s = j12;
        if (this.f47574p instanceof b) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x024d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0259  */
    /* JADX WARN: Code duplicated, block: B:117:0x026d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0273  */
    /* JADX WARN: Code duplicated, block: B:121:0x0277  */
    /* JADX WARN: Code duplicated, block: B:122:0x0281  */
    /* JADX WARN: Code duplicated, block: B:128:0x029a  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02af  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:209:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:210:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:213:0x04be  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b7 A[LOOP:4: B:80:0x01b5->B:81:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01df  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws Throwable {
        x7.w wVar;
        Throwable th2;
        int i11;
        int i12;
        long j11;
        w wVar2;
        int iC;
        int i13;
        int i14;
        int iJ;
        int iJ2;
        int iA;
        long jY;
        long[] jArr;
        w wVar3;
        int i15;
        int i16;
        long j12;
        int i17;
        int i18;
        int i19;
        long position;
        int i21;
        long length;
        long jP;
        long j13;
        f aVar;
        long jP2;
        int i22;
        long[] jArr2;
        int i23;
        c cVar;
        f aVar2;
        long jK;
        long jMax;
        int i24;
        int iW;
        b7.a.k(this.f47566g);
        String str = f0.f3975a;
        int i25 = this.f47568i;
        x7.w wVar4 = this.f47561b;
        if (i25 == 0) {
            try {
                d(nVar, false);
            } catch (EOFException unused) {
                wVar = wVar4;
                th2 = null;
                i11 = -1;
                i12 = -1;
                j11 = 1000000;
            }
        }
        f fVar = this.f47574p;
        w wVar5 = this.f47560a;
        if (fVar == null) {
            w wVar6 = new w(wVar4.f55950b);
            j11 = 1000000;
            nVar.A(wVar6.f4039a, 0, wVar4.f55950b);
            if ((wVar4.f55949a & 1) != 0) {
                if (wVar4.f55952d != 1) {
                    i14 = 36;
                } else {
                    i14 = 21;
                }
            } else if (wVar4.f55952d != 1) {
                i14 = 21;
            } else {
                i14 = 13;
            }
            th2 = null;
            if (wVar6.f4041c >= i14 + 4) {
                wVar6.I(i14);
                iJ = wVar6.j();
                if (iJ != 1483304551 && iJ != 1231971951) {
                    if (wVar6.f4041c >= 40) {
                        wVar6.I(36);
                        if (wVar6.j() == 1447187017) {
                            iJ = 1447187017;
                        } else {
                            iJ = 0;
                        }
                    } else {
                        iJ = 0;
                    }
                }
            } else if (wVar6.f4041c >= 40) {
                wVar6.I(36);
                if (wVar6.j() == 1447187017) {
                    iJ = 1447187017;
                } else {
                    iJ = 0;
                }
            } else {
                iJ = 0;
            }
            t tVar = this.f47562c;
            if (iJ == 1231971951) {
                wVar = wVar4;
                iJ2 = wVar6.j();
                if ((iJ2 & 1) != 0) {
                    iA = wVar6.A();
                } else {
                    iA = -1;
                }
                if ((iJ2 & 2) != 0) {
                    jY = wVar6.y();
                } else {
                    jY = -1;
                }
                if ((iJ2 & 4) == 4) {
                    jArr2 = new long[100];
                    i23 = 0;
                    for (i22 = 100; i23 < i22; i22 = 100) {
                        jArr2[i23] = wVar6.w();
                        i23++;
                        wVar5 = wVar5;
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                wVar3 = wVar5;
                if ((iJ2 & 8) != 0) {
                    wVar6.J(4);
                }
                if (wVar6.a() >= 24) {
                    wVar6.J(21);
                    int iZ = wVar6.z();
                    i16 = (16773120 & iZ) >> 12;
                    i15 = iZ & 4095;
                } else {
                    i15 = -1;
                    i16 = -1;
                }
                j12 = iA;
                i17 = wVar.f55950b;
                int i26 = wVar.f55951c;
                i18 = wVar.f55953e;
                i19 = wVar.f55954f;
                if ((tVar.f55930a != -1 || tVar.f55931b == -1) && i16 != -1 && i15 != -1) {
                    tVar.f55930a = i16;
                    tVar.f55931b = i15;
                }
                position = nVar.getPosition();
                if (nVar.getLength() != -1 || jY == -1) {
                    i21 = i19;
                } else {
                    i21 = i19;
                    long j14 = position + jY;
                    if (nVar.getLength() != j14) {
                        b7.a.u("Data size mismatch between stream (" + nVar.getLength() + ") and Xing frame (" + j14 + "), using Xing value.");
                    }
                }
                nVar.s(wVar.f55950b);
                if (iJ == 1483304551) {
                    if (j12 != -1 || j12 == 0) {
                        jP2 = -9223372036854775807L;
                    } else {
                        jP2 = f0.P(i26, (j12 * ((long) i21)) - 1);
                    }
                    if (jP2 == -9223372036854775807L) {
                        aVar = null;
                    } else {
                        aVar = new h(position, i17, jP2, i18, jY, jArr);
                    }
                } else {
                    length = nVar.getLength();
                    if (j12 != -1 || j12 == 0) {
                        jP = -9223372036854775807L;
                    } else {
                        jP = f0.P(i26, (((long) i21) * j12) - 1);
                    }
                    if (jP != -9223372036854775807L) {
                        if (jY != -1) {
                            length = position + jY;
                            j13 = jY - ((long) i17);
                        } else if (length != -1) {
                            j13 = (length - position) - ((long) i17);
                        } else {
                            aVar = null;
                        }
                        long j15 = length;
                        long j16 = j13;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        aVar = new a(j15, position + ((long) i17), Ints.b(f0.R(j16, 8000000L, jP, roundingMode)), Ints.b(LongMath.b(j16, j12, roundingMode)), false);
                    } else {
                        aVar = null;
                    }
                }
            } else {
                if (iJ == 1447187017) {
                    long length2 = nVar.getLength();
                    long position2 = nVar.getPosition();
                    wVar6.J(6);
                    int iJ3 = wVar6.j();
                    long j17 = position2 + ((long) wVar4.f55950b);
                    long j18 = j17 + ((long) iJ3);
                    int iJ4 = wVar6.j();
                    if (iJ4 > 0) {
                        long jP3 = f0.P(wVar4.f55951c, (((long) iJ4) * ((long) wVar4.f55954f)) - 1);
                        int iC2 = wVar6.C();
                        int iC3 = wVar6.C();
                        int iC4 = wVar6.C();
                        wVar6.J(2);
                        long j19 = position2 + ((long) wVar4.f55950b);
                        long[] jArr3 = new long[iC2];
                        long[] jArr4 = new long[iC2];
                        int i27 = 0;
                        while (true) {
                            if (i27 >= iC2) {
                                long j21 = jP3;
                                long j22 = j19;
                                if (length2 == -1 || length2 == j18) {
                                    jMax = j18;
                                } else {
                                    StringBuilder sbJ = w4.c.j(length2, "VBRI data size mismatch: ", ", ");
                                    jMax = j18;
                                    sbJ.append(jMax);
                                    b7.a.B(sbJ.toString());
                                }
                                if (jMax != j22) {
                                    StringBuilder sbJ2 = w4.c.j(jMax, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                    sbJ2.append(j22);
                                    sbJ2.append("\nSeeking will be inaccurate.");
                                    b7.a.B(sbJ2.toString());
                                    jMax = Math.max(jMax, j22);
                                }
                                wVar = wVar4;
                                aVar = new g(jArr3, jArr4, j21, j17, jMax, wVar.f55953e);
                                break;
                            }
                            long j23 = j19;
                            long j24 = jP3;
                            jArr3[i27] = (((long) i27) * jP3) / ((long) iC2);
                            jArr4[i27] = j23;
                            if (iC4 != 1) {
                                i24 = i27;
                                if (iC4 == 2) {
                                    iW = wVar6.C();
                                } else if (iC4 == 3) {
                                    iW = wVar6.z();
                                } else {
                                    if (iC4 != 4) {
                                        aVar = null;
                                        wVar = wVar4;
                                        break;
                                    }
                                    iW = wVar6.A();
                                }
                            } else {
                                i24 = i27;
                                iW = wVar6.w();
                            }
                            j19 = (((long) iW) * ((long) iC3)) + j23;
                            i27 = i24 + 1;
                            jP3 = j24;
                        }
                    } else {
                        aVar = null;
                        wVar = wVar4;
                    }
                    nVar.s(wVar.f55950b);
                } else if (iJ != 1483304551) {
                    nVar.r();
                    aVar = null;
                    wVar = wVar4;
                } else {
                    wVar = wVar4;
                    iJ2 = wVar6.j();
                    if ((iJ2 & 1) != 0) {
                        iA = wVar6.A();
                    } else {
                        iA = -1;
                    }
                    if ((iJ2 & 2) != 0) {
                        jY = wVar6.y();
                    } else {
                        jY = -1;
                    }
                    if ((iJ2 & 4) == 4) {
                        jArr2 = new long[100];
                        i23 = 0;
                        while (i23 < i22) {
                            jArr2[i23] = wVar6.w();
                            i23++;
                            wVar5 = wVar5;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    wVar3 = wVar5;
                    if ((iJ2 & 8) != 0) {
                        wVar6.J(4);
                    }
                    if (wVar6.a() >= 24) {
                        wVar6.J(21);
                        int iZ2 = wVar6.z();
                        i16 = (16773120 & iZ2) >> 12;
                        i15 = iZ2 & 4095;
                    } else {
                        i15 = -1;
                        i16 = -1;
                    }
                    j12 = iA;
                    i17 = wVar.f55950b;
                    int i28 = wVar.f55951c;
                    i18 = wVar.f55953e;
                    i19 = wVar.f55954f;
                    if (tVar.f55930a != -1) {
                        tVar.f55930a = i16;
                        tVar.f55931b = i15;
                    } else {
                        tVar.f55930a = i16;
                        tVar.f55931b = i15;
                    }
                    position = nVar.getPosition();
                    if (nVar.getLength() != -1) {
                        i21 = i19;
                    } else {
                        i21 = i19;
                    }
                    nVar.s(wVar.f55950b);
                    if (iJ == 1483304551) {
                        if (j12 != -1) {
                            jP2 = -9223372036854775807L;
                        } else {
                            jP2 = -9223372036854775807L;
                        }
                        if (jP2 == -9223372036854775807L) {
                            aVar = null;
                        } else {
                            aVar = new h(position, i17, jP2, i18, jY, jArr);
                        }
                    } else {
                        length = nVar.getLength();
                        if (j12 != -1) {
                            jP = -9223372036854775807L;
                        } else {
                            jP = -9223372036854775807L;
                        }
                        if (jP != -9223372036854775807L) {
                            if (jY != -1) {
                                length = position + jY;
                                j13 = jY - ((long) i17);
                            } else if (length != -1) {
                                j13 = (length - position) - ((long) i17);
                            } else {
                                aVar = null;
                            }
                            long j110 = length;
                            long j111 = j13;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            aVar = new a(j110, position + ((long) i17), Ints.b(f0.R(j111, 8000000L, jP, roundingMode2)), Ints.b(LongMath.b(j111, j12, roundingMode2)), false);
                        } else {
                            aVar = null;
                        }
                    }
                }
                wVar3 = wVar5;
            }
            c0 c0Var = this.f47569j;
            long position3 = nVar.getPosition();
            if (c0Var == null) {
                cVar = null;
                break;
            }
            b0[] b0VarArr = c0Var.f57178a;
            int length3 = b0VarArr.length;
            int i29 = 0;
            while (true) {
                if (i29 >= length3) {
                    cVar = null;
                    break;
                }
                b0 b0Var = b0VarArr[i29];
                if (b0Var instanceof l8.m) {
                    l8.m mVar = (l8.m) b0Var;
                    int[] iArr = mVar.f39833e;
                    if (c0Var == null) {
                        jK = -9223372036854775807L;
                        break;
                    }
                    b0[] b0VarArr2 = c0Var.f57178a;
                    int length4 = b0VarArr2.length;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= length4) {
                            jK = -9223372036854775807L;
                            break;
                        }
                        b0 b0Var2 = b0VarArr2[i30];
                        if (b0Var2 instanceof l8.o) {
                            l8.o oVar = (l8.o) b0Var2;
                            if (oVar.f39825a.equals("TLEN")) {
                                jK = f0.K(Long.parseLong((String) oVar.f39838c.get(0)));
                                break;
                            }
                        }
                        i30++;
                    }
                    int length5 = iArr.length;
                    int i31 = length5 + 1;
                    long[] jArr5 = new long[i31];
                    long[] jArr6 = new long[i31];
                    jArr5[0] = position3;
                    jArr6[0] = 0;
                    long j25 = 0;
                    int i32 = 1;
                    while (i32 <= length5) {
                        int i33 = i32 - 1;
                        position3 += (long) (mVar.f39831c + iArr[i33]);
                        j25 += (long) (mVar.f39832d + mVar.f39834f[i33]);
                        jArr5[i32] = position3;
                        jArr6[i32] = j25;
                        i32++;
                        length5 = length5;
                        iArr = iArr;
                    }
                    cVar = new c(jK, jArr5, jArr6);
                    break;
                }
                i29++;
            }
            if (this.f47575q) {
                aVar2 = new e(-9223372036854775807L);
                wVar2 = wVar3;
            } else {
                if (cVar != null) {
                    aVar = cVar;
                } else if (aVar == null) {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.d();
                }
                if (aVar != null) {
                    aVar.d();
                    aVar2 = aVar;
                    wVar2 = wVar3;
                } else {
                    wVar2 = wVar3;
                    nVar.A(wVar2.f4039a, 0, 4);
                    wVar2.I(0);
                    wVar.a(wVar2.j());
                    aVar2 = new a(nVar.getLength(), nVar.getPosition(), wVar.f55953e, wVar.f55950b, false);
                }
                e0 e0Var = this.f47566g;
                aVar2.k();
                e0Var.getClass();
            }
            this.f47574p = aVar2;
            this.f47565f.q(aVar2);
            y6.o oVar2 = new y6.o();
            oVar2.f57264l = d0.o("audio/mpeg");
            oVar2.m = d0.o((String) wVar.f55955g);
            oVar2.f57265n = 4096;
            oVar2.E = wVar.f55952d;
            oVar2.F = wVar.f55951c;
            oVar2.H = tVar.f55930a;
            oVar2.I = tVar.f55931b;
            oVar2.f57263k = this.f47569j;
            if (this.f47574p.j() != -2147483647) {
                oVar2.f57260h = this.f47574p.j();
            }
            this.f47567h.b(new p(oVar2));
            this.m = nVar.getPosition();
        } else {
            wVar = wVar4;
            wVar2 = wVar5;
            th2 = null;
            j11 = 1000000;
            if (this.m != 0) {
                long position4 = nVar.getPosition();
                long j26 = this.m;
                if (position4 < j26) {
                    nVar.s((int) (j26 - position4));
                }
            }
        }
        if (this.f47573o == 0) {
            nVar.r();
            if (b(nVar)) {
                i11 = -1;
            } else {
                wVar2.I(0);
                int iJ5 = wVar2.j();
                if (((-128000) & iJ5) != (((long) this.f47568i) & (-128000)) || x7.a.h(iJ5) == -1) {
                    nVar.s(1);
                    this.f47568i = 0;
                } else {
                    wVar.a(iJ5);
                    if (this.f47570k == -9223372036854775807L) {
                        this.f47570k = this.f47574p.b(nVar.getPosition());
                    }
                    this.f47573o = wVar.f55950b;
                    this.f47572n = nVar.getPosition() + ((long) wVar.f55950b);
                    if (this.f47574p instanceof b) {
                        long j27 = ((this.f47571l + ((long) wVar.f55954f)) * j11) / ((long) wVar.f55951c);
                        throw th2;
                    }
                    iC = this.f47567h.c(nVar, this.f47573o, true);
                    if (iC == -1) {
                        i11 = -1;
                    } else {
                        i13 = this.f47573o - iC;
                        this.f47573o = i13;
                        if (i13 <= 0) {
                            this.f47567h.d(((this.f47571l * j11) / ((long) wVar.f55951c)) + this.f47570k, 1, wVar.f55950b, 0, null);
                            this.f47571l += (long) wVar.f55954f;
                            this.f47573o = 0;
                            i11 = 0;
                        }
                    }
                }
                i11 = 0;
            }
        } else {
            iC = this.f47567h.c(nVar, this.f47573o, true);
            if (iC == -1) {
                i11 = -1;
            } else {
                i13 = this.f47573o - iC;
                this.f47573o = i13;
                if (i13 <= 0) {
                    i11 = 0;
                } else {
                    this.f47567h.d(((this.f47571l * j11) / ((long) wVar.f55951c)) + this.f47570k, 1, wVar.f55950b, 0, null);
                    this.f47571l += (long) wVar.f55954f;
                    this.f47573o = 0;
                    i11 = 0;
                }
            }
        }
        i12 = -1;
        if (i11 == i12) {
            f fVar2 = this.f47574p;
            if (fVar2 instanceof b) {
                if (fVar2.k() != ((this.f47571l * j11) / ((long) wVar.f55951c)) + this.f47570k) {
                    ((b) this.f47574p).getClass();
                    throw th2;
                }
            }
        }
        return i11;
    }

    @Override // x7.m
    public final void release() {
    }
}
