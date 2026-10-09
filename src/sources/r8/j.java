package r8;

import androidx.media3.common.ParserException;
import b7.f0;
import b7.w;
import com.google.common.collect.ImmutableList;
import hh.p0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ko.Zea.ealNNtLp;
import x7.c0;
import x7.e0;
import x7.t;
import x7.x;
import x7.y;
import x7.z;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements x7.m, y {
    public i[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public m8.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.i f48908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f48910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f48911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f48912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f48913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f48914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f48915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f48916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImmutableList f48917j = ImmutableList.s();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48919l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f48920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f48921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f48922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f48923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f48924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f48925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f48926t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f48927u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f48928v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f48929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f48930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f48931y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x7.o f48932z;

    public j(u8.i iVar, int i11) {
        this.f48908a = iVar;
        this.f48909b = i11;
        this.f48918k = (i11 & 4) != 0 ? 3 : 0;
        this.f48915h = new l();
        this.f48916i = new ArrayList();
        this.f48913f = new w(16);
        this.f48914g = new ArrayDeque();
        this.f48910c = new w(c7.q.f6709a);
        this.f48911d = new w(6);
        this.f48912e = new w();
        this.f48922p = -1;
        this.f48932z = x7.o.I;
        this.A = new i[0];
    }

    @Override // x7.m
    public final boolean c(x7.n nVar) {
        c0 c0VarL = m.l(nVar, false, (this.f48909b & 2) != 0);
        this.f48917j = c0VarL != null ? ImmutableList.u(c0VarL) : ImmutableList.s();
        return c0VarL == null;
    }

    @Override // x7.y
    public final boolean d() {
        return true;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        if ((this.f48909b & 16) == 0) {
            oVar = new bq.f(oVar, this.f48908a);
        }
        this.f48932z = oVar;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f48914g.clear();
        this.f48920n = 0;
        this.f48922p = -1;
        this.f48923q = 0;
        this.f48924r = 0;
        this.f48925s = 0;
        this.f48926t = false;
        if (j11 == 0) {
            if (this.f48918k != 3) {
                this.f48918k = 0;
                this.f48920n = 0;
                return;
            } else {
                l lVar = this.f48915h;
                lVar.f48937a.clear();
                lVar.f48938b = 0;
                this.f48916i.clear();
                return;
            }
        }
        for (i iVar : this.A) {
            q qVar = iVar.f48904b;
            int iD = f0.d(qVar.f48979f, j12, false);
            while (true) {
                if (iD < 0) {
                    iD = -1;
                    break;
                } else if ((qVar.f48980g[iD] & 1) != 0) {
                    break;
                } else {
                    iD--;
                }
            }
            if (iD == -1) {
                iD = qVar.a(j12);
            }
            iVar.f48907e = iD;
            x7.f0 f0Var = iVar.f48906d;
            if (f0Var != null) {
                f0Var.f55882b = false;
                f0Var.f55883c = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:261:0x051a  */
    /* JADX WARN: Code duplicated, block: B:266:0x052e  */
    /* JADX WARN: Code duplicated, block: B:287:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:290:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:297:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:300:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:315:0x060f  */
    /* JADX WARN: Code duplicated, block: B:367:0x06da  */
    /* JADX WARN: Code duplicated, block: B:372:0x0707  */
    /* JADX WARN: Code duplicated, block: B:373:0x070b  */
    /* JADX WARN: Code duplicated, block: B:384:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0716 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x015a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // x7.m
    public final int g(x7.n nVar, kw.b bVar) throws ParserException {
        char c11;
        int i11;
        int i12;
        int i13;
        int i14;
        int iD;
        int i15;
        byte b3;
        char c12;
        int i16;
        ArrayList arrayList;
        List listE;
        int i17;
        List listE2;
        boolean z11;
        boolean z12;
        long j11;
        long length;
        c7.d dVar;
        long j12;
        int i18;
        int i19;
        boolean z13;
        long j13;
        long j14;
        long j15;
        boolean z14;
        while (true) {
            int i21 = this.f48918k;
            ArrayDeque arrayDeque = this.f48914g;
            int i22 = this.f48909b;
            w wVar = this.f48912e;
            int i23 = 4;
            int i24 = 2;
            if (i21 == 0) {
                int i25 = this.f48920n;
                w wVar2 = this.f48913f;
                if (i25 != 0) {
                    j11 = this.m;
                    if (j11 == 1) {
                        nVar.readFully(wVar2.f4039a, 8, 8);
                        this.f48920n += 8;
                        this.m = wVar2.B();
                    } else if (j11 == 0) {
                        length = nVar.getLength();
                        if (length == -1 && (dVar = (c7.d) arrayDeque.peek()) != null) {
                            length = dVar.f6647c;
                        }
                        if (length != -1) {
                            this.m = (length - nVar.getPosition()) + ((long) this.f48920n);
                        }
                    }
                    j12 = this.m;
                    i18 = this.f48920n;
                    if (j12 >= i18) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    i19 = this.f48919l;
                    if (i19 != 1836019574 || i19 == 1953653099 || i19 == 1835297121 || i19 == 1835626086 || i19 == 1937007212 || i19 == 1701082227 || i19 == 1835365473 || i19 == 1635284069) {
                        z13 = true;
                        long position = nVar.getPosition();
                        j13 = this.m;
                        j14 = this.f48920n;
                        j15 = (position + j13) - j14;
                        if (j13 != j14 && this.f48919l == 1835365473) {
                            wVar.F(8);
                            nVar.A(wVar.f4039a, 0, 8);
                            c.a(wVar);
                            nVar.s(wVar.f4040b);
                            nVar.r();
                        }
                        arrayDeque.push(new c7.d(this.f48919l, j15));
                        if (this.m == this.f48920n) {
                            l(j15);
                        } else {
                            this.f48918k = 0;
                            this.f48920n = 0;
                        }
                    } else if (i19 == 1835296868 || i19 == 1836476516 || i19 == 1751411826 || i19 == 1937011556 || i19 == 1937011827 || i19 == 1937011571 || i19 == 1668576371 || i19 == 1701606260 || i19 == 1937011555 || i19 == 1937011578 || i19 == 1937013298 || i19 == 1937007471 || i19 == 1668232756 || i19 == 1953196132 || i19 == 1718909296 || i19 == 1969517665 || i19 == 1801812339 || i19 == 1768715124) {
                        b7.a.j(i18 == 8);
                        b7.a.j(this.m <= 2147483647L);
                        w wVar3 = new w((int) this.m);
                        System.arraycopy(wVar2.f4039a, 0, wVar3.f4039a, 0, 8);
                        this.f48921o = wVar3;
                        z13 = true;
                        this.f48918k = 1;
                    } else {
                        long position2 = nVar.getPosition();
                        long j16 = this.f48920n;
                        long j17 = position2 - j16;
                        if (this.f48919l == 1836086884) {
                            this.F = new m8.a(0L, j17, -9223372036854775807L, j17 + j16, this.m - j16);
                        }
                        this.f48921o = null;
                        this.f48918k = 1;
                        z13 = true;
                    }
                    z14 = z13;
                } else if (nVar.a(wVar2.f4039a, 0, 8, true)) {
                    this.f48920n = 8;
                    wVar2.I(0);
                    this.m = wVar2.y();
                    this.f48919l = wVar2.j();
                    j11 = this.m;
                    if (j11 == 1) {
                        nVar.readFully(wVar2.f4039a, 8, 8);
                        this.f48920n += 8;
                        this.m = wVar2.B();
                    } else if (j11 == 0) {
                        length = nVar.getLength();
                        if (length == -1) {
                            length = dVar.f6647c;
                        }
                        if (length != -1) {
                            this.m = (length - nVar.getPosition()) + ((long) this.f48920n);
                        }
                    }
                    j12 = this.m;
                    i18 = this.f48920n;
                    if (j12 >= i18) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    i19 = this.f48919l;
                    if (i19 != 1836019574) {
                        z13 = true;
                        long position3 = nVar.getPosition();
                        j13 = this.m;
                        j14 = this.f48920n;
                        j15 = (position3 + j13) - j14;
                        if (j13 != j14) {
                            wVar.F(8);
                            nVar.A(wVar.f4039a, 0, 8);
                            c.a(wVar);
                            nVar.s(wVar.f4040b);
                            nVar.r();
                        }
                        arrayDeque.push(new c7.d(this.f48919l, j15));
                        if (this.m == this.f48920n) {
                            l(j15);
                        } else {
                            this.f48918k = 0;
                            this.f48920n = 0;
                        }
                    } else {
                        z13 = true;
                        long position4 = nVar.getPosition();
                        j13 = this.m;
                        j14 = this.f48920n;
                        j15 = (position4 + j13) - j14;
                        if (j13 != j14) {
                            wVar.F(8);
                            nVar.A(wVar.f4039a, 0, 8);
                            c.a(wVar);
                            nVar.s(wVar.f4040b);
                            nVar.r();
                        }
                        arrayDeque.push(new c7.d(this.f48919l, j15));
                        if (this.m == this.f48920n) {
                            l(j15);
                        } else {
                            this.f48918k = 0;
                            this.f48920n = 0;
                        }
                    }
                    z14 = z13;
                } else {
                    if (this.E == 2 && (i22 & 2) != 0) {
                        e0 e0VarV = this.f48932z.v(0, 4);
                        m8.a aVar = this.F;
                        y6.c0 c0Var = aVar == null ? null : new y6.c0(aVar);
                        y6.o oVar = new y6.o();
                        oVar.f57263k = c0Var;
                        nv.p.D(oVar, e0VarV);
                        this.f48932z.o();
                        this.f48932z.q(new x7.q(-9223372036854775807L));
                    }
                    z14 = false;
                }
                if (!z14) {
                    return -1;
                }
            } else {
                if (i21 != 1) {
                    if (i21 == 2) {
                        long position5 = nVar.getPosition();
                        if (this.f48922p == -1) {
                            int i26 = 0;
                            int i27 = -1;
                            int i28 = -1;
                            boolean z15 = true;
                            boolean z16 = true;
                            long j18 = Long.MAX_VALUE;
                            long j19 = Long.MAX_VALUE;
                            long j21 = Long.MAX_VALUE;
                            while (true) {
                                i[] iVarArr = this.A;
                                if (i26 >= iVarArr.length) {
                                    break;
                                }
                                i iVar = iVarArr[i26];
                                int i29 = iVar.f48907e;
                                q qVar = iVar.f48904b;
                                if (i29 != qVar.f48975b) {
                                    long j22 = qVar.f48976c[i29];
                                    long[][] jArr = this.B;
                                    String str = f0.f3975a;
                                    long j23 = jArr[i26][i29];
                                    long j24 = j22 - position5;
                                    boolean z17 = j24 < 0 || j24 >= 262144;
                                    if ((!z17 && z16) || (z17 == z16 && j24 < j21)) {
                                        i28 = i26;
                                        z16 = z17;
                                        j21 = j24;
                                        j19 = j23;
                                    }
                                    if (j23 < j18) {
                                        i27 = i26;
                                        z15 = z17;
                                        j18 = j23;
                                    }
                                }
                                i26++;
                            }
                            if (j18 == Long.MAX_VALUE || !z15 || j19 < j18 + 10485760) {
                                i27 = i28;
                            }
                            this.f48922p = i27;
                            if (i27 == -1) {
                                return -1;
                            }
                        }
                        i iVar2 = this.A[this.f48922p];
                        e0 e0Var = iVar2.f48905c;
                        q qVar2 = iVar2.f48904b;
                        n nVar2 = iVar2.f48903a;
                        int i30 = iVar2.f48907e;
                        long[] jArr2 = qVar2.f48976c;
                        int[] iArr = qVar2.f48977d;
                        long j25 = jArr2[i30] + this.f48931y;
                        int i31 = iArr[i30];
                        x7.f0 f0Var = iVar2.f48906d;
                        long j26 = (j25 - position5) + ((long) this.f48923q);
                        if (j26 < 0 || j26 >= 262144) {
                            bVar.f38845a = j25;
                            return 1;
                        }
                        int i32 = nVar2.f48948h;
                        int i33 = nVar2.f48951k;
                        y6.p pVar = nVar2.f48947g;
                        if (i32 == 1) {
                            j26 += 8;
                            i31 -= 8;
                        }
                        int i34 = i31;
                        nVar.s((int) j26);
                        String str2 = pVar.f57291n;
                        String str3 = pVar.f57291n;
                        if (!Objects.equals(str2, "video/avc") ? !Objects.equals(str3, "video/hevc") || (i22 & 128) == 0 : (i22 & 32) == 0) {
                            c11 = 1;
                            this.f48926t = true;
                        } else {
                            c11 = 1;
                        }
                        if (i33 != 0) {
                            w wVar4 = this.f48911d;
                            byte[] bArr = wVar4.f4039a;
                            bArr[0] = 0;
                            bArr[c11] = 0;
                            bArr[2] = 0;
                            int i35 = 4 - i33;
                            int i36 = i34 + i35;
                            while (this.f48924r < i36) {
                                int i37 = this.f48925s;
                                if (i37 == 0) {
                                    if (this.f48926t || c7.q.d(pVar) + i33 > iArr[i30] - this.f48923q) {
                                        i14 = i33;
                                        iD = 0;
                                    } else {
                                        iD = c7.q.d(pVar);
                                        i14 = i33 + iD;
                                    }
                                    nVar.readFully(bArr, i35, i14);
                                    i12 = i36;
                                    this.f48923q += i14;
                                    wVar4.I(0);
                                    int iJ = wVar4.j();
                                    if (iJ < 0) {
                                        throw ParserException.a(null, "Invalid NAL length");
                                    }
                                    this.f48925s = iJ - iD;
                                    w wVar5 = this.f48910c;
                                    wVar5.I(0);
                                    i13 = i35;
                                    e0Var.a(wVar5, 4, 0);
                                    this.f48924r += 4;
                                    if (iD > 0) {
                                        e0Var.a(wVar4, iD, 0);
                                        int i38 = iD;
                                        this.f48924r += i38;
                                        if (c7.q.c(bArr, i38, pVar)) {
                                            this.f48926t = true;
                                        }
                                    }
                                } else {
                                    i12 = i36;
                                    i13 = i35;
                                    int iC = e0Var.c(nVar, i37, false);
                                    this.f48923q += iC;
                                    this.f48924r += iC;
                                    this.f48925s -= iC;
                                }
                                i36 = i12;
                                i35 = i13;
                            }
                            i11 = i36;
                        } else {
                            if ("audio/ac4".equals(str3)) {
                                if (this.f48924r == 0) {
                                    x7.a.g(i34, wVar);
                                    e0Var.a(wVar, 7, 0);
                                    this.f48924r += 7;
                                }
                                i34 += 7;
                            } else if (f0Var != null) {
                                f0Var.c(nVar);
                            }
                            while (true) {
                                int i39 = this.f48924r;
                                if (i39 >= i34) {
                                    break;
                                }
                                int iC2 = e0Var.c(nVar, i34 - i39, false);
                                this.f48923q += iC2;
                                this.f48924r += iC2;
                                this.f48925s -= iC2;
                            }
                            i11 = i34;
                        }
                        long j27 = qVar2.f48979f[i30];
                        int i40 = qVar2.f48980g[i30];
                        if (!this.f48926t) {
                            i40 |= 67108864;
                        }
                        int i41 = i40;
                        if (f0Var != null) {
                            f0Var.b(e0Var, j27, i41, i11, 0, null);
                            if (i30 + 1 == qVar2.f48975b) {
                                f0Var.a(e0Var, null);
                            }
                        } else {
                            e0Var.d(j27, i41, i11, 0, null);
                        }
                        iVar2.f48907e++;
                        this.f48922p = -1;
                        this.f48923q = 0;
                        this.f48924r = 0;
                        this.f48925s = 0;
                        this.f48926t = false;
                        return 0;
                    }
                    if (i21 != 3) {
                        throw new IllegalStateException();
                    }
                    l lVar = this.f48915h;
                    ArrayList arrayList2 = lVar.f48937a;
                    int i42 = lVar.f48938b;
                    if (i42 != 0) {
                        if (i42 != 1) {
                            short s3 = 2817;
                            int i43 = 8;
                            short s11 = 2192;
                            if (i42 == 2) {
                                long length2 = nVar.getLength();
                                int i44 = lVar.f48939c - 20;
                                w wVar6 = new w(i44);
                                nVar.readFully(wVar6.f4039a, 0, i44);
                                int i45 = 0;
                                while (i45 < i44 / 12) {
                                    wVar6.J(i24);
                                    byte[] bArr2 = wVar6.f4039a;
                                    int i46 = wVar6.f4040b;
                                    int i47 = i24;
                                    int i48 = i46 + 1;
                                    wVar6.f4040b = i48;
                                    int i49 = bArr2[i46] & 255;
                                    wVar6.f4040b = i46 + 2;
                                    short s12 = (short) (i49 | ((bArr2[i48] & 255) << 8));
                                    if (s12 != s11 && s12 != 2816 && s12 != s3) {
                                        if (s12 != 2819 && s12 != 2820) {
                                            wVar6.J(i43);
                                        }
                                        i45++;
                                        i44 = i44;
                                        i24 = i47;
                                        s11 = 2192;
                                        s3 = 2817;
                                        i43 = 8;
                                    }
                                    arrayList2.add(new k((length2 - ((long) lVar.f48939c)) - ((long) wVar6.l()), wVar6.l()));
                                    i45++;
                                    i44 = i44;
                                    i24 = i47;
                                    s11 = 2192;
                                    s3 = 2817;
                                    i43 = 8;
                                }
                                if (arrayList2.isEmpty()) {
                                    bVar.f38845a = 0L;
                                } else {
                                    lVar.f48938b = 3;
                                    bVar.f38845a = ((k) arrayList2.get(0)).f48933a;
                                }
                            } else {
                                if (i42 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position6 = nVar.getPosition();
                                int length3 = (int) ((nVar.getLength() - nVar.getPosition()) - ((long) lVar.f48939c));
                                w wVar7 = new w(length3);
                                nVar.readFully(wVar7.f4039a, 0, length3);
                                int i50 = 0;
                                while (i50 < arrayList2.size()) {
                                    k kVar = (k) arrayList2.get(i50);
                                    wVar7.I((int) (kVar.f48933a - position6));
                                    wVar7.J(i23);
                                    int iL = wVar7.l();
                                    Charset charset = StandardCharsets.UTF_8;
                                    String strU = wVar7.u(iL, charset);
                                    switch (strU.hashCode()) {
                                        case -1711564334:
                                            if (strU.equals("SlowMotion_Data")) {
                                                b3 = 0;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c12 = 2192;
                                                    break;
                                                case 1:
                                                    c12 = 2819;
                                                    break;
                                                case 2:
                                                    c12 = 2816;
                                                    break;
                                                case 3:
                                                    c12 = 2820;
                                                    break;
                                                case 4:
                                                    c12 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            i16 = kVar.f48934b - (iL + 8);
                                            if (c12 != 2192) {
                                                arrayList = new ArrayList();
                                                listE = l.f48936e.e(wVar7.u(i16, charset));
                                                for (i17 = 0; i17 < listE.size(); i17++) {
                                                    listE2 = l.f48935d.e((CharSequence) listE.get(i17));
                                                    if (listE2.size() == 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    try {
                                                        arrayList.add(new m8.b(Long.parseLong((String) listE2.get(0)), 1 << (Integer.parseInt((String) listE2.get(2)) - 1), Long.parseLong((String) listE2.get(1))));
                                                    } catch (NumberFormatException e8) {
                                                        throw ParserException.a(e8, null);
                                                    }
                                                }
                                                this.f48916i.add(new m8.c(arrayList));
                                            } else if (c12 != 2816 && c12 != 2817 && c12 != 2819 && c12 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i50++;
                                            i23 = 4;
                                            break;
                                        case -1332107749:
                                            if (strU.equals("Super_SlowMotion_Edit_Data")) {
                                                b3 = 1;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c12 = 2192;
                                                    break;
                                                case 1:
                                                    c12 = 2819;
                                                    break;
                                                case 2:
                                                    c12 = 2816;
                                                    break;
                                                case 3:
                                                    c12 = 2820;
                                                    break;
                                                case 4:
                                                    c12 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            i16 = kVar.f48934b - (iL + 8);
                                            if (c12 != 2192) {
                                                arrayList = new ArrayList();
                                                listE = l.f48936e.e(wVar7.u(i16, charset));
                                                while (i17 < listE.size()) {
                                                    listE2 = l.f48935d.e((CharSequence) listE.get(i17));
                                                    if (listE2.size() == 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    arrayList.add(new m8.b(Long.parseLong((String) listE2.get(0)), 1 << (Integer.parseInt((String) listE2.get(2)) - 1), Long.parseLong((String) listE2.get(1))));
                                                }
                                                this.f48916i.add(new m8.c(arrayList));
                                            } else if (c12 != 2816) {
                                                continue;
                                            }
                                            i50++;
                                            i23 = 4;
                                            break;
                                        case -1251387154:
                                            if (strU.equals("Super_SlowMotion_Data")) {
                                                b3 = 2;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c12 = 2192;
                                                    break;
                                                case 1:
                                                    c12 = 2819;
                                                    break;
                                                case 2:
                                                    c12 = 2816;
                                                    break;
                                                case 3:
                                                    c12 = 2820;
                                                    break;
                                                case 4:
                                                    c12 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            i16 = kVar.f48934b - (iL + 8);
                                            if (c12 != 2192) {
                                                arrayList = new ArrayList();
                                                listE = l.f48936e.e(wVar7.u(i16, charset));
                                                while (i17 < listE.size()) {
                                                    listE2 = l.f48935d.e((CharSequence) listE.get(i17));
                                                    if (listE2.size() == 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    arrayList.add(new m8.b(Long.parseLong((String) listE2.get(0)), 1 << (Integer.parseInt((String) listE2.get(2)) - 1), Long.parseLong((String) listE2.get(1))));
                                                }
                                                this.f48916i.add(new m8.c(arrayList));
                                            } else if (c12 != 2816) {
                                                continue;
                                            }
                                            i50++;
                                            i23 = 4;
                                            break;
                                        case -830665521:
                                            if (strU.equals("Super_SlowMotion_Deflickering_On")) {
                                                b3 = 3;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c12 = 2192;
                                                    break;
                                                case 1:
                                                    c12 = 2819;
                                                    break;
                                                case 2:
                                                    c12 = 2816;
                                                    break;
                                                case 3:
                                                    c12 = 2820;
                                                    break;
                                                case 4:
                                                    c12 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            i16 = kVar.f48934b - (iL + 8);
                                            if (c12 != 2192) {
                                                arrayList = new ArrayList();
                                                listE = l.f48936e.e(wVar7.u(i16, charset));
                                                while (i17 < listE.size()) {
                                                    listE2 = l.f48935d.e((CharSequence) listE.get(i17));
                                                    if (listE2.size() == 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    arrayList.add(new m8.b(Long.parseLong((String) listE2.get(0)), 1 << (Integer.parseInt((String) listE2.get(2)) - 1), Long.parseLong((String) listE2.get(1))));
                                                }
                                                this.f48916i.add(new m8.c(arrayList));
                                            } else if (c12 != 2816) {
                                                continue;
                                            }
                                            i50++;
                                            i23 = 4;
                                            break;
                                        case 1760745220:
                                            if (strU.equals("Super_SlowMotion_BGM")) {
                                                b3 = 4;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    c12 = 2192;
                                                    break;
                                                case 1:
                                                    c12 = 2819;
                                                    break;
                                                case 2:
                                                    c12 = 2816;
                                                    break;
                                                case 3:
                                                    c12 = 2820;
                                                    break;
                                                case 4:
                                                    c12 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            i16 = kVar.f48934b - (iL + 8);
                                            if (c12 != 2192) {
                                                arrayList = new ArrayList();
                                                listE = l.f48936e.e(wVar7.u(i16, charset));
                                                while (i17 < listE.size()) {
                                                    listE2 = l.f48935d.e((CharSequence) listE.get(i17));
                                                    if (listE2.size() == 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    arrayList.add(new m8.b(Long.parseLong((String) listE2.get(0)), 1 << (Integer.parseInt((String) listE2.get(2)) - 1), Long.parseLong((String) listE2.get(1))));
                                                }
                                                this.f48916i.add(new m8.c(arrayList));
                                            } else if (c12 != 2816) {
                                                continue;
                                            }
                                            i50++;
                                            i23 = 4;
                                            break;
                                    }
                                    b3 = -1;
                                    switch (b3) {
                                        case 0:
                                            c12 = 2192;
                                            break;
                                        case 1:
                                            c12 = 2819;
                                            break;
                                        case 2:
                                            c12 = 2816;
                                            break;
                                        case 3:
                                            c12 = 2820;
                                            break;
                                        case 4:
                                            c12 = 2817;
                                            break;
                                        default:
                                            throw ParserException.a(null, "Invalid SEF name");
                                    }
                                    i16 = kVar.f48934b - (iL + 8);
                                    if (c12 != 2192) {
                                        arrayList = new ArrayList();
                                        listE = l.f48936e.e(wVar7.u(i16, charset));
                                        while (i17 < listE.size()) {
                                            listE2 = l.f48935d.e((CharSequence) listE.get(i17));
                                            if (listE2.size() == 3) {
                                                throw ParserException.a(null, null);
                                            }
                                            arrayList.add(new m8.b(Long.parseLong((String) listE2.get(0)), 1 << (Integer.parseInt((String) listE2.get(2)) - 1), Long.parseLong((String) listE2.get(1))));
                                        }
                                        this.f48916i.add(new m8.c(arrayList));
                                    } else if (c12 != 2816) {
                                        continue;
                                    }
                                    i50++;
                                    i23 = 4;
                                }
                                bVar.f38845a = 0L;
                            }
                        } else {
                            w wVar8 = new w(8);
                            nVar.readFully(wVar8.f4039a, 0, 8);
                            lVar.f48939c = wVar8.l() + 8;
                            if (wVar8.j() != 1397048916) {
                                bVar.f38845a = 0L;
                            } else {
                                bVar.f38845a = nVar.getPosition() - ((long) (lVar.f48939c - 12));
                                lVar.f48938b = 2;
                            }
                        }
                        i15 = 1;
                    } else {
                        long length4 = nVar.getLength();
                        bVar.f38845a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        i15 = 1;
                        lVar.f48938b = 1;
                    }
                    if (bVar.f38845a != 0) {
                        return i15;
                    }
                    this.f48918k = 0;
                    this.f48920n = 0;
                    return i15;
                }
                long j28 = this.m - ((long) this.f48920n);
                long position7 = nVar.getPosition() + j28;
                w wVar9 = this.f48921o;
                if (wVar9 != null) {
                    nVar.readFully(wVar9.f4039a, this.f48920n, (int) j28);
                    if (this.f48919l == 1718909296) {
                        this.f48927u = true;
                        wVar9.I(8);
                        int iJ2 = wVar9.j();
                        int i51 = iJ2 != 1751476579 ? iJ2 != 1903435808 ? 0 : 1 : 2;
                        if (i51 == 0) {
                            wVar9.J(4);
                            do {
                                if (wVar9.a() <= 0) {
                                    i51 = 0;
                                    break;
                                }
                                int iJ3 = wVar9.j();
                                i51 = iJ3 != 1751476579 ? iJ3 != 1903435808 ? 0 : 1 : 2;
                            } while (i51 == 0);
                        }
                        this.E = i51;
                    } else if (!arrayDeque.isEmpty()) {
                        ((c7.d) arrayDeque.peek()).f6648d.add(new c7.e(this.f48919l, wVar9));
                    }
                } else {
                    if (!this.f48927u && this.f48919l == 1835295092) {
                        this.E = 1;
                    }
                    if (j28 < 262144) {
                        nVar.s((int) j28);
                    } else {
                        bVar.f38845a = nVar.getPosition() + j28;
                        z11 = true;
                    }
                    l(position7);
                    if (this.f48928v) {
                        this.f48930x = true;
                        bVar.f38845a = this.f48929w;
                        this.f48928v = false;
                        z11 = true;
                    }
                    if (z11 || this.f48918k == 2) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        return 1;
                    }
                }
                z11 = false;
                l(position7);
                if (this.f48928v) {
                    this.f48930x = true;
                    bVar.f38845a = this.f48929w;
                    this.f48928v = false;
                    z11 = true;
                }
                if (z11) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return 1;
                }
            }
        }
    }

    @Override // x7.m
    public final List h() {
        return this.f48917j;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[LOOP:2: B:37:0x0087->B:41:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc A[LOOP:3: B:51:0x00b2->B:55:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ba A[EDGE_INSN: B:81:0x00ba->B:54:0x00ba BREAK  A[LOOP:3: B:51:0x00b2->B:55:0x00bc], SYNTHETIC] */
    @Override // x7.y
    public final x i(long j11) {
        long j12;
        long j13;
        long j14;
        int i11;
        long jMin;
        i[] iVarArr;
        int i12;
        q qVar;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iD;
        int iA;
        int iD2;
        int iA2;
        i[] iVarArr2 = this.A;
        int length = iVarArr2.length;
        z zVar = z.f55958c;
        if (length == 0) {
            return new x(zVar, zVar);
        }
        int i13 = this.C;
        boolean z11 = false;
        int i14 = -1;
        long jMin2 = -1;
        if (i13 != -1) {
            q qVar2 = iVarArr2[i13].f48904b;
            long[] jArr3 = qVar2.f48979f;
            int iD3 = f0.d(jArr3, j11, false);
            while (true) {
                if (iD3 < 0) {
                    iD3 = -1;
                    break;
                }
                if ((qVar2.f48980g[iD3] & 1) != 0) {
                    break;
                }
                iD3--;
            }
            if (iD3 == -1) {
                iD3 = qVar2.a(j11);
            }
            long[] jArr4 = qVar2.f48976c;
            if (iD3 == -1) {
                return new x(zVar, zVar);
            }
            j13 = jArr3[iD3];
            j12 = jArr4[iD3];
            if (j13 < j11 && iD3 < qVar2.f48975b - 1 && (iA2 = qVar2.a(j11)) != -1 && iA2 != iD3) {
                j14 = jArr3[iA2];
                jMin2 = jArr4[iA2];
            }
            i11 = 0;
            jMin = j12;
            while (true) {
                iVarArr = this.A;
                if (i11 < iVarArr.length) {
                    break;
                }
                if (i11 != this.C) {
                    qVar = iVarArr[i11].f48904b;
                    jArr = qVar.f48976c;
                    iArr = qVar.f48980g;
                    jArr2 = qVar.f48979f;
                    iD = f0.d(jArr2, j13, z11);
                    while (true) {
                        if (iD >= 0) {
                            iA = i14;
                            break;
                        }
                        if ((iArr[iD] & 1) != 0) {
                            iA = iD;
                            break;
                        }
                        iD--;
                    }
                    if (iA == i14) {
                        iA = qVar.a(j13);
                    }
                    if (iA == i14) {
                        jMin = Math.min(jArr[iA], jMin);
                    }
                    if (j14 != -9223372036854775807L) {
                        z11 = false;
                        iD2 = f0.d(jArr2, j14, false);
                        while (true) {
                            if (iD2 >= 0) {
                                iD2 = -1;
                                break;
                            }
                            if ((iArr[iD2] & 1) != 0) {
                                break;
                            }
                            iD2--;
                        }
                        i12 = -1;
                        if (iD2 == -1) {
                            iD2 = qVar.a(j14);
                        }
                        if (iD2 == -1) {
                            jMin2 = jMin2;
                        } else {
                            jMin2 = Math.min(jArr[iD2], jMin2);
                        }
                    } else {
                        jMin2 = jMin2;
                        z11 = false;
                        i12 = -1;
                    }
                } else {
                    i12 = i14;
                }
                i11++;
                i14 = i12;
            }
            z zVar2 = new z(j13, jMin);
            return j14 == -9223372036854775807L ? new x(zVar2, zVar2) : new x(zVar2, new z(j14, jMin2));
        }
        j12 = Long.MAX_VALUE;
        j13 = j11;
        j14 = -9223372036854775807L;
        i11 = 0;
        jMin = j12;
        while (true) {
            iVarArr = this.A;
            if (i11 < iVarArr.length) {
                break;
                break;
            }
            if (i11 != this.C) {
                qVar = iVarArr[i11].f48904b;
                jArr = qVar.f48976c;
                iArr = qVar.f48980g;
                jArr2 = qVar.f48979f;
                iD = f0.d(jArr2, j13, z11);
                while (true) {
                    if (iD >= 0) {
                        iA = i14;
                        break;
                    }
                    if ((iArr[iD] & 1) != 0) {
                        iA = iD;
                        break;
                    }
                    iD--;
                }
                if (iA == i14) {
                    iA = qVar.a(j13);
                }
                if (iA == i14) {
                    jMin = Math.min(jArr[iA], jMin);
                }
                if (j14 != -9223372036854775807L) {
                    z11 = false;
                    iD2 = f0.d(jArr2, j14, false);
                    while (true) {
                        if (iD2 >= 0) {
                            iD2 = -1;
                            break;
                        }
                        if ((iArr[iD2] & 1) != 0) {
                            break;
                            break;
                        }
                        iD2--;
                    }
                    i12 = -1;
                    if (iD2 == -1) {
                        iD2 = qVar.a(j14);
                    }
                    if (iD2 == -1) {
                        jMin2 = jMin2;
                    } else {
                        jMin2 = Math.min(jArr[iD2], jMin2);
                    }
                } else {
                    jMin2 = jMin2;
                    z11 = false;
                    i12 = -1;
                }
            } else {
                i12 = i14;
            }
            i11++;
            i14 = i12;
        }
        z zVar3 = new z(j13, jMin);
        if (j14 == -9223372036854775807L) {
        }
    }

    @Override // x7.y
    public final long k() {
        return this.D;
    }

    @Override // x7.m
    public final void release() {
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0002 A[SYNTHETIC] */
    public final void l(long j11) {
        y6.c0 c0VarF;
        ArrayDeque arrayDeque;
        y6.c0 c0VarK;
        int i11;
        String str;
        y6.c0 c0Var;
        y6.c0 c0Var2;
        ArrayList arrayList;
        int i12;
        int i13;
        c7.b bVarB;
        int i14;
        while (true) {
            ArrayDeque arrayDeque2 = this.f48914g;
            if (arrayDeque2.isEmpty() || ((c7.d) arrayDeque2.peek()).f6647c != j11) {
                break;
            }
            c7.d dVar = (c7.d) arrayDeque2.pop();
            if (dVar.f6652b == 1836019574) {
                c7.d dVarN = dVar.n(1835365473);
                ArrayList arrayList2 = new ArrayList();
                int i15 = this.f48909b;
                if (dVarN != null) {
                    c0VarF = c.f(dVarN);
                    if (this.f48930x) {
                        b7.a.k(c0VarF);
                        c7.b bVarB2 = m.b(c0VarF, "auxiliary.tracks.interleaved");
                        if (bVarB2 != null && bVarB2.f6643b[0] == 0) {
                            this.f48931y = this.f48929w + 16;
                        }
                        c7.b bVarB3 = m.b(c0VarF, "auxiliary.tracks.map");
                        b7.a.k(bVarB3);
                        ArrayList arrayListD = bVarB3.d();
                        ArrayList arrayList3 = new ArrayList(arrayListD.size());
                        for (int i16 = 0; i16 < arrayListD.size(); i16++) {
                            int iIntValue = ((Integer) arrayListD.get(i16)).intValue();
                            if (iIntValue == 0) {
                                i14 = 1;
                            } else if (iIntValue != 1) {
                                i14 = 3;
                                if (iIntValue != 2) {
                                    i14 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i14 = 2;
                            }
                            arrayList3.add(Integer.valueOf(i14));
                        }
                        arrayList2 = arrayList3;
                    } else {
                        if (c0VarF != null && (i15 & 64) != 0 && (bVarB = m.b(c0VarF, "auxiliary.tracks.offset")) != null) {
                            long jB = new w(bVarB.f6643b).B();
                            if (jB > 0) {
                                this.f48929w = jB;
                                this.f48928v = true;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        arrayDeque.clear();
                        if (!this.f48928v) {
                            this.f48918k = 2;
                        }
                    }
                } else {
                    c0VarF = null;
                }
                ArrayList arrayList4 = new ArrayList();
                boolean z11 = this.E == 1;
                ArrayList arrayList5 = arrayList2;
                t tVar = new t();
                c7.e eVarO = dVar.o(1969517665);
                if (eVarO != null) {
                    c0VarK = c.k(eVarO);
                    tVar.b(c0VarK);
                } else {
                    c0VarK = null;
                }
                c7.e eVarO2 = dVar.o(1836476516);
                eVarO2.getClass();
                y6.c0 c0Var3 = new y6.c0(c.g(eVarO2.f6650c));
                y6.c0 c0Var4 = c0VarK;
                ArrayList arrayListJ = c.j(dVar, tVar, -9223372036854775807L, null, (i15 & 1) != 0, z11, new a7.c(10));
                if (this.f48930x) {
                    boolean z12 = arrayList5.size() == arrayListJ.size();
                    Locale locale = Locale.US;
                    b7.a.i(p0.l("The number of auxiliary track types from metadata (", arrayList5.size(), ealNNtLp.tJrmcVKzWhk, arrayListJ.size(), ")"), z12);
                }
                String strC = m.c(arrayListJ);
                ArrayList arrayList6 = arrayList4;
                int size = -1;
                int i17 = 0;
                int i18 = 0;
                long jMax = -9223372036854775807L;
                while (i17 < arrayListJ.size()) {
                    q qVar = (q) arrayListJ.get(i17);
                    int i19 = qVar.f48975b;
                    int i21 = qVar.f48978e;
                    if (i19 == 0) {
                        str = strC;
                        i11 = i18;
                        arrayList = arrayList6;
                        c0Var2 = c0Var3;
                        c0Var = c0VarF;
                    } else {
                        n nVar = qVar.f48974a;
                        x7.o oVar = this.f48932z;
                        i11 = i18 + 1;
                        int i22 = nVar.f48942b;
                        str = strC;
                        y6.p pVar = nVar.f48947g;
                        e0 e0VarV = oVar.v(i18, i22);
                        i iVar = new i(nVar, qVar, e0VarV);
                        c0Var = c0VarF;
                        long j12 = nVar.f48945e;
                        if (j12 == -9223372036854775807L) {
                            j12 = qVar.f48981h;
                        }
                        e0VarV.getClass();
                        jMax = Math.max(jMax, j12);
                        int i23 = "audio/true-hd".equals(pVar.f57291n) ? i21 * 16 : i21 + 30;
                        y6.o oVarA = pVar.a();
                        oVarA.f57265n = i23;
                        if (i22 == 2) {
                            int i24 = pVar.f57284f;
                            if ((i15 & 8) != 0) {
                                i24 |= size == -1 ? 1 : 2;
                            }
                            if (this.f48930x) {
                                i24 |= 32768;
                                oVarA.f57259g = ((Integer) arrayList5.get(i17)).intValue();
                            }
                            oVarA.f57258f = i24;
                        }
                        if (i22 == 1 && (i12 = tVar.f55930a) != -1 && (i13 = tVar.f55931b) != -1) {
                            oVarA.H = i12;
                            oVarA.I = i13;
                        }
                        y6.c0 c0Var5 = pVar.f57290l;
                        ArrayList arrayList7 = this.f48916i;
                        y6.c0 c0Var6 = arrayList7.isEmpty() ? null : new y6.c0(arrayList7);
                        c0Var2 = c0Var3;
                        m.k(i22, c0Var, oVarA, c0Var5, c0Var6, c0Var4, c0Var2);
                        oVarA.f57264l = d0.o(str);
                        nv.p.D(oVarA, e0VarV);
                        if (i22 == 2 && size == -1) {
                            size = arrayList6.size();
                        }
                        arrayList = arrayList6;
                        arrayList.add(iVar);
                    }
                    i17++;
                    arrayList6 = arrayList;
                    c0Var3 = c0Var2;
                    c0VarF = c0Var;
                    arrayDeque2 = arrayDeque2;
                    i18 = i11;
                    arrayListJ = arrayListJ;
                    strC = str;
                }
                arrayDeque = arrayDeque2;
                this.C = size;
                this.D = jMax;
                i[] iVarArr = (i[]) arrayList6.toArray(new i[0]);
                this.A = iVarArr;
                long[][] jArr = new long[iVarArr.length][];
                int[] iArr = new int[iVarArr.length];
                long[] jArr2 = new long[iVarArr.length];
                boolean[] zArr = new boolean[iVarArr.length];
                for (int i25 = 0; i25 < iVarArr.length; i25++) {
                    jArr[i25] = new long[iVarArr[i25].f48904b.f48975b];
                    jArr2[i25] = iVarArr[i25].f48904b.f48979f[0];
                }
                int i26 = 0;
                long j13 = 0;
                while (i26 < iVarArr.length) {
                    long j14 = Long.MAX_VALUE;
                    int i27 = -1;
                    for (int i28 = 0; i28 < iVarArr.length; i28++) {
                        if (!zArr[i28]) {
                            long j15 = jArr2[i28];
                            if (j15 <= j14) {
                                i27 = i28;
                                j14 = j15;
                            }
                        }
                    }
                    int i29 = iArr[i27];
                    long[] jArr3 = jArr[i27];
                    jArr3[i29] = j13;
                    q qVar2 = iVarArr[i27].f48904b;
                    j13 += (long) qVar2.f48977d[i29];
                    int i30 = i29 + 1;
                    iArr[i27] = i30;
                    if (i30 < jArr3.length) {
                        jArr2[i27] = qVar2.f48979f[i30];
                    } else {
                        zArr[i27] = true;
                        i26++;
                    }
                }
                this.B = jArr;
                this.f48932z.o();
                this.f48932z.q(this);
                arrayDeque.clear();
                if (!this.f48928v) {
                    this.f48918k = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((c7.d) arrayDeque2.peek()).f6649e.add(dVar);
            }
        }
        if (this.f48918k != 2) {
            this.f48918k = 0;
            this.f48920n = 0;
        }
    }
}
