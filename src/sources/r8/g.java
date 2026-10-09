package r8;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import b7.f0;
import b7.w;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Longs;
import com.lingodeer.data.model.AchievementLevelType;
import e6.i1;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import ob.u;
import x7.c0;
import x7.e0;
import x7.t;
import x7.y;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements x7.m {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final y6.p O;
    public f B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.i f48875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f48877c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f48882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f48883i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e0 f48888o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f48891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f48892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f48893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f48894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w f48895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f48896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f48897x;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f48884j = new u(13);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f48885k = new w(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f48879e = new w(c7.q.f6709a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f48880f = new w(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f48881g = new w();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f48886l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f48878d = new SparseArray();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImmutableList f48890q = ImmutableList.s();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f48899z = -9223372036854775807L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f48898y = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public x7.o H = x7.o.I;
    public e0[] I = new e0[0];
    public e0[] J = new e0[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b7.c f48887n = new b7.c(new hh.c(this, 19));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i1 f48889p = new i1(2);
    public long M = -1;

    static {
        y6.o oVar = new y6.o();
        oVar.m = d0.o("application/x-emsg");
        O = new y6.p(oVar);
    }

    public g(u8.i iVar, int i11, List list, i7.n nVar) {
        this.f48875a = iVar;
        this.f48876b = i11;
        this.f48877c = Collections.unmodifiableList(list);
        this.f48888o = nVar;
        byte[] bArr = new byte[16];
        this.f48882h = bArr;
        this.f48883i = new w(bArr);
    }

    public static y6.l b(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            c7.e eVar = (c7.e) list.get(i11);
            if (eVar.f6652b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.f6650c.f4039a;
                o20.w wVarI = m.i(bArr);
                UUID uuid = wVarI == null ? null : (UUID) wVarI.f44617b;
                if (uuid == null) {
                    b7.a.B("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new y6.k(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new y6.l(null, false, (y6.k[]) arrayList.toArray(new y6.k[0]));
    }

    public static void d(w wVar, int i11, p pVar) throws ParserException {
        wVar.I(i11 + 8);
        int iJ = wVar.j();
        byte[] bArr = c.f48855a;
        if ((iJ & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z11 = (iJ & 2) != 0;
        int iA = wVar.A();
        if (iA == 0) {
            Arrays.fill(pVar.f48969l, 0, pVar.f48962e, false);
            return;
        }
        int i12 = pVar.f48962e;
        w wVar2 = pVar.f48970n;
        if (iA != i12) {
            StringBuilder sbI = w4.c.i(iA, "Senc sample count ", " is different from fragment sample count");
            sbI.append(pVar.f48962e);
            throw ParserException.a(null, sbI.toString());
        }
        Arrays.fill(pVar.f48969l, 0, iA, z11);
        wVar2.F(wVar.a());
        pVar.f48968k = true;
        pVar.f48971o = true;
        wVar.h(wVar2.f4039a, 0, wVar2.f4041c);
        wVar2.I(0);
        pVar.f48971o = false;
    }

    public static Pair i(long j11, w wVar) throws ParserException {
        long jB;
        long jB2;
        w wVar2 = wVar;
        wVar2.I(8);
        int iE = c.e(wVar2.j());
        wVar2.J(4);
        long jY = wVar2.y();
        if (iE == 0) {
            jB = wVar2.y();
            jB2 = wVar2.y();
        } else {
            jB = wVar2.B();
            jB2 = wVar2.B();
        }
        long j12 = jB2 + j11;
        String str = f0.f3975a;
        long jR = f0.R(jB, 1000000L, jY, RoundingMode.DOWN);
        wVar2.J(2);
        int iC = wVar2.C();
        int[] iArr = new int[iC];
        long[] jArr = new long[iC];
        long[] jArr2 = new long[iC];
        long[] jArr3 = new long[iC];
        long j13 = j12;
        long j14 = jR;
        int i11 = 0;
        while (i11 < iC) {
            int iJ = wVar2.j();
            if ((Integer.MIN_VALUE & iJ) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jY2 = wVar2.y();
            iArr[i11] = iJ & Integer.MAX_VALUE;
            jArr[i11] = j13;
            jArr3[i11] = j14;
            jB += jY2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jR2 = f0.R(jB, 1000000L, jY, RoundingMode.DOWN);
            jArr4[i11] = jR2 - jArr5[i11];
            wVar2.J(4);
            j13 += (long) iArr[i11];
            i11++;
            iC = iC;
            wVar2 = wVar;
            j14 = jR2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jR), new x7.i(iArr, jArr, jArr2, jArr3));
    }

    public final void a() {
        this.f48891r = 0;
        this.f48894u = 0;
    }

    @Override // x7.m
    public final boolean c(x7.n nVar) {
        c0 c0VarL = m.l(nVar, true, false);
        this.f48890q = c0VarL != null ? ImmutableList.u(c0VarL) : ImmutableList.s();
        return c0VarL == null;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        int i11;
        int i12 = this.f48876b;
        if ((i12 & 32) == 0) {
            oVar = new bq.f(oVar, this.f48875a);
        }
        this.H = oVar;
        a();
        e0[] e0VarArr = new e0[2];
        this.I = e0VarArr;
        int i13 = 0;
        e0 e0Var = this.f48888o;
        if (e0Var != null) {
            e0VarArr[0] = e0Var;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = 100;
        if ((i12 & 4) != 0) {
            e0VarArr[i11] = this.H.v(100, 5);
            i14 = 101;
            i11++;
        }
        e0[] e0VarArr2 = (e0[]) f0.M(i11, this.I);
        this.I = e0VarArr2;
        for (e0 e0Var2 : e0VarArr2) {
            e0Var2.b(O);
        }
        List list = this.f48877c;
        this.J = new e0[list.size()];
        while (i13 < this.J.length) {
            e0 e0VarV = this.H.v(i14, 3);
            e0VarV.b((y6.p) list.get(i13));
            this.J[i13] = e0VarV;
            i13++;
            i14++;
        }
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        SparseArray sparseArray = this.f48878d;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((f) sparseArray.valueAt(i11)).e();
        }
        this.m.clear();
        this.f48897x = 0;
        ((PriorityQueue) this.f48887n.f3962e).clear();
        this.f48898y = j12;
        this.f48886l.clear();
        a();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0206  */
    /* JADX WARN: Code duplicated, block: B:129:0x025b  */
    /* JADX WARN: Code duplicated, block: B:133:0x026a  */
    /* JADX WARN: Code duplicated, block: B:510:0x027d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.m
    public final int g(x7.n nVar, kw.b bVar) throws ParserException {
        b7.c cVar;
        w wVar;
        ArrayDeque arrayDeque;
        int i11;
        f fVar;
        int i12;
        int i13;
        int i14;
        f fVar2;
        long j11;
        int iD;
        f fVar3;
        int iJ;
        char c11;
        int i15;
        w wVar2;
        byte[] bArr;
        long j12;
        char c12;
        int iC;
        int i16;
        String strR;
        long jR;
        String str;
        long jR2;
        long jY;
        long j13;
        while (true) {
            int i17 = this.f48891r;
            ArrayDeque arrayDeque2 = this.f48886l;
            cVar = this.f48887n;
            wVar = this.f48883i;
            i1 i1Var = this.f48889p;
            SparseArray sparseArray = this.f48878d;
            int i18 = 1;
            if (i17 != 0) {
                arrayDeque = this.m;
                i11 = this.f48876b;
                if (i17 != 1) {
                    long j14 = Long.MAX_VALUE;
                    if (i17 != 2) {
                        fVar = this.B;
                        if (fVar != null) {
                            i12 = 1;
                            i13 = 0;
                            i14 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        f fVar4 = null;
                        int i19 = 0;
                        while (i19 < size) {
                            f fVar5 = (f) sparseArray.valueAt(i19);
                            boolean z11 = fVar5.m;
                            p pVar = fVar5.f48864b;
                            int i21 = i18;
                            if ((z11 || fVar5.f48868f != fVar5.f48866d.f48975b) && (!z11 || fVar5.f48870h != pVar.f48961d)) {
                                long j15 = !z11 ? fVar5.f48866d.f48976c[fVar5.f48868f] : pVar.f48963f[fVar5.f48870h];
                                if (j15 < j14) {
                                    fVar4 = fVar5;
                                    j14 = j15;
                                }
                            }
                            i19++;
                            i18 = i21;
                        }
                        i12 = i18;
                        i13 = 0;
                        i14 = 8;
                        if (fVar4 != null) {
                            int position = (int) ((!fVar4.m ? fVar4.f48866d.f48976c[fVar4.f48868f] : fVar4.f48864b.f48963f[fVar4.f48870h]) - nVar.getPosition());
                            if (position < 0) {
                                b7.a.B("Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            nVar.s(position);
                            this.B = fVar4;
                            fVar = fVar4;
                            break;
                        }
                        int position2 = (int) (this.f48896w - nVar.getPosition());
                        if (position2 < 0) {
                            throw ParserException.a(null, "Offset to end of mdat was negative.");
                        }
                        nVar.s(position2);
                        a();
                    } else {
                        int size2 = sparseArray.size();
                        f fVar6 = null;
                        for (int i22 = 0; i22 < size2; i22++) {
                            p pVar2 = ((f) sparseArray.valueAt(i22)).f48864b;
                            if (pVar2.f48971o) {
                                long j16 = pVar2.f48960c;
                                if (j16 < j14) {
                                    fVar6 = (f) sparseArray.valueAt(i22);
                                    j14 = j16;
                                }
                            }
                        }
                        if (fVar6 == null) {
                            this.f48891r = 3;
                        } else {
                            int position3 = (int) (j14 - nVar.getPosition());
                            if (position3 < 0) {
                                throw ParserException.a(null, "Offset to encryption data was negative.");
                            }
                            nVar.s(position3);
                            p pVar3 = fVar6.f48864b;
                            w wVar3 = pVar3.f48970n;
                            nVar.readFully(wVar3.f4039a, 0, wVar3.f4041c);
                            wVar3.I(0);
                            pVar3.f48971o = false;
                        }
                    }
                } else {
                    int i23 = (int) (this.f48893t - ((long) this.f48894u));
                    w wVar4 = this.f48895v;
                    if (wVar4 != null) {
                        nVar.readFully(wVar4.f4039a, 8, i23);
                        int i24 = this.f48892s;
                        c7.e eVar = new c7.e(i24, wVar4);
                        if (!arrayDeque2.isEmpty()) {
                            ((c7.d) arrayDeque2.peek()).f6648d.add(eVar);
                        } else if (i24 == 1936286840) {
                            Pair pairI = i(nVar.getPosition(), wVar4);
                            i1Var.a((x7.i) pairI.second);
                            if (!this.K) {
                                this.A = ((Long) pairI.first).longValue();
                                this.H.q((y) pairI.second);
                                this.K = true;
                            } else if ((i11 & 256) != 0 && !this.L && i1Var.f24942a.size() > 1) {
                                this.M = nVar.getPosition();
                            }
                        } else if (i24 == 1701671783 && this.I.length != 0) {
                            wVar4.I(8);
                            int iE = c.e(wVar4.j());
                            if (iE == 0) {
                                strR = wVar4.r();
                                strR.getClass();
                                String strR2 = wVar4.r();
                                strR2.getClass();
                                long jY2 = wVar4.y();
                                long jY3 = wVar4.y();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                jR = f0.R(jY3, 1000000L, jY2, roundingMode);
                                long j17 = this.A;
                                long j18 = j17 != -9223372036854775807L ? j17 + jR : -9223372036854775807L;
                                str = strR2;
                                jR2 = f0.R(wVar4.y(), 1000L, jY2, roundingMode);
                                jY = wVar4.y();
                                j13 = j18;
                            } else if (iE != 1) {
                                defpackage.e.y(iE, "Skipping unsupported emsg version: ");
                            } else {
                                long jY4 = wVar4.y();
                                long jB = wVar4.B();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long jR3 = f0.R(jB, 1000000L, jY4, roundingMode2);
                                long jR4 = f0.R(wVar4.y(), 1000L, jY4, roundingMode2);
                                long jY5 = wVar4.y();
                                strR = wVar4.r();
                                strR.getClass();
                                String strR3 = wVar4.r();
                                strR3.getClass();
                                jR2 = jR4;
                                jY = jY5;
                                str = strR3;
                                j13 = jR3;
                                jR = -9223372036854775807L;
                            }
                            String str2 = strR;
                            byte[] bArr2 = new byte[wVar4.a()];
                            wVar4.h(bArr2, 0, wVar4.a());
                            w wVar5 = new w(this.f48884j.o(new i8.a(str2, str, jR2, jY, bArr2)));
                            int iA = wVar5.a();
                            for (e0 e0Var : this.I) {
                                wVar5.I(0);
                                e0Var.a(wVar5, iA, 0);
                            }
                            if (j13 == -9223372036854775807L) {
                                arrayDeque.addLast(new e(iA, jR, true));
                                this.f48897x += iA;
                            } else if (arrayDeque.isEmpty()) {
                                for (e0 e0Var2 : this.I) {
                                    e0Var2.d(j13, 1, iA, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new e(iA, j13, false));
                                this.f48897x += iA;
                            }
                        }
                    } else {
                        nVar.s(i23);
                    }
                    j(nVar.getPosition());
                }
            } else {
                int i25 = this.f48894u;
                long length = 0;
                w wVar6 = this.f48885k;
                if (i25 == 0) {
                    if (!nVar.a(wVar6.f4039a, 0, 8, true)) {
                        long j19 = this.M;
                        if (j19 == -1) {
                            cVar.b(0);
                            return -1;
                        }
                        bVar.f38845a = j19;
                        this.M = -1L;
                        x7.o oVar = this.H;
                        i1Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (x7.i iVar : i1Var.f24942a.values()) {
                            arrayList.add(iVar.f55893b);
                            arrayList2.add(iVar.f55894c);
                            arrayList3.add(iVar.f55895d);
                            arrayList4.add(iVar.f55896e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length += (long) iArr2.length;
                        }
                        int i26 = (int) length;
                        Preconditions.d(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i26));
                        int[] iArr3 = new int[i26];
                        int length2 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
                            length2 += iArr4.length;
                        }
                        oVar.q(new x7.i(iArr3, Longs.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), Longs.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), Longs.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.L = true;
                        return 1;
                    }
                    this.f48894u = 8;
                    wVar6.I(0);
                    this.f48893t = wVar6.y();
                    this.f48892s = wVar6.j();
                }
                long j21 = this.f48893t;
                if (j21 == 1) {
                    nVar.readFully(wVar6.f4039a, 8, 8);
                    this.f48894u += 8;
                    this.f48893t = wVar6.B();
                } else if (j21 == 0) {
                    long length3 = nVar.getLength();
                    if (length3 == -1 && !arrayDeque2.isEmpty()) {
                        length3 = ((c7.d) arrayDeque2.peek()).f6647c;
                    }
                    if (length3 != -1) {
                        this.f48893t = (length3 - nVar.getPosition()) + ((long) this.f48894u);
                    }
                }
                long j22 = this.f48893t;
                long j23 = this.f48894u;
                if (j22 < j23) {
                    throw ParserException.c("Atom size less than header length (unsupported).");
                }
                if (this.M != -1) {
                    if (this.f48892s == 1936286840) {
                        wVar.F((int) j22);
                        System.arraycopy(wVar6.f4039a, 0, wVar.f4039a, 0, 8);
                        nVar.readFully(wVar.f4039a, 8, (int) (this.f48893t - ((long) this.f48894u)));
                        i1Var.a((x7.i) i(nVar.i(), wVar).second);
                    } else {
                        nVar.d((int) (j22 - j23), true);
                    }
                    a();
                } else {
                    long position4 = nVar.getPosition() - ((long) this.f48894u);
                    int i27 = this.f48892s;
                    if ((i27 == 1836019558 || i27 == 1835295092) && !this.K) {
                        this.H.q(new x7.q(this.f48899z, position4));
                        this.K = true;
                    }
                    if (this.f48892s == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            p pVar4 = ((f) sparseArray.valueAt(i28)).f48864b;
                            pVar4.getClass();
                            pVar4.f48960c = position4;
                            pVar4.f48959b = position4;
                        }
                    }
                    int i29 = this.f48892s;
                    if (i29 == 1835295092) {
                        this.B = null;
                        this.f48896w = position4 + this.f48893t;
                        this.f48891r = 2;
                    } else if (i29 == 1836019574 || i29 == 1953653099 || i29 == 1835297121 || i29 == 1835626086 || i29 == 1937007212 || i29 == 1836019558 || i29 == 1953653094 || i29 == 1836475768 || i29 == 1701082227 || i29 == 1835365473) {
                        long position5 = nVar.getPosition();
                        long j24 = this.f48893t;
                        long j25 = (position5 + j24) - 8;
                        if (j24 != this.f48894u && this.f48892s == 1835365473) {
                            wVar.F(8);
                            nVar.A(wVar.f4039a, 0, 8);
                            c.a(wVar);
                            nVar.s(wVar.f4040b);
                            nVar.r();
                        }
                        arrayDeque2.push(new c7.d(this.f48892s, j25));
                        if (this.f48893t == this.f48894u) {
                            j(j25);
                        } else {
                            a();
                        }
                    } else if (i29 == 1751411826 || i29 == 1835296868 || i29 == 1836476516 || i29 == 1936286840 || i29 == 1937011556 || i29 == 1937011827 || i29 == 1668576371 || i29 == 1937011555 || i29 == 1937011578 || i29 == 1937013298 || i29 == 1937007471 || i29 == 1668232756 || i29 == 1937011571 || i29 == 1952867444 || i29 == 1952868452 || i29 == 1953196132 || i29 == 1953654136 || i29 == 1953658222 || i29 == 1886614376 || i29 == 1935763834 || i29 == 1935763823 || i29 == 1936027235 || i29 == 1970628964 || i29 == 1935828848 || i29 == 1936158820 || i29 == 1701606260 || i29 == 1835362404 || i29 == 1701671783 || i29 == 1969517665 || i29 == 1801812339 || i29 == 1768715124) {
                        if (this.f48894u != 8) {
                            throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f48893t > 2147483647L) {
                            throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        w wVar7 = new w((int) this.f48893t);
                        System.arraycopy(wVar6.f4039a, 0, wVar7.f4039a, 0, 8);
                        this.f48895v = wVar7;
                        this.f48891r = 1;
                    } else {
                        if (this.f48893t > 2147483647L) {
                            throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f48895v = null;
                        this.f48891r = 1;
                    }
                }
            }
        }
        e0 e0Var3 = fVar.f48863a;
        p pVar5 = fVar.f48864b;
        if (this.f48891r == 3) {
            this.C = !fVar.m ? fVar.f48866d.f48977d[fVar.f48868f] : pVar5.f48965h[fVar.f48868f];
            y6.p pVar6 = fVar.f48866d.f48974a.f48947g;
            this.F = ((!Objects.equals(pVar6.f57291n, "video/avc") ? !(!Objects.equals(pVar6.f57291n, "video/hevc") || (i11 & 128) == 0) : (i11 & 64) != 0) ? i13 : i12) ^ 1;
            if (fVar.f48868f < fVar.f48871i) {
                nVar.s(this.C);
                o oVarB = fVar.b();
                if (oVarB != null) {
                    w wVar8 = pVar5.f48970n;
                    int i30 = oVarB.f48956d;
                    if (i30 != 0) {
                        wVar8.J(i30);
                    }
                    int i31 = fVar.f48868f;
                    if (pVar5.f48968k && pVar5.f48969l[i31]) {
                        wVar8.J(wVar8.C() * 6);
                    }
                }
                if (!fVar.c()) {
                    this.B = null;
                }
                this.f48891r = 3;
                return i13;
            }
            if (fVar.f48866d.f48974a.f48948h == i12) {
                this.C -= 8;
                nVar.s(i14);
            }
            if ("audio/ac4".equals(fVar.f48866d.f48974a.f48947g.f57291n)) {
                this.D = fVar.d(this.C, 7);
                x7.a.g(this.C, wVar);
                i16 = i13;
                e0Var3.a(wVar, 7, i16);
                this.D += 7;
            } else {
                i16 = i13;
                this.D = fVar.d(this.C, i16);
            }
            this.C += this.D;
            this.f48891r = 4;
            this.E = i16;
        }
        q qVar = fVar.f48866d;
        n nVar2 = qVar.f48974a;
        long j26 = fVar.m ? pVar5.f48966i[fVar.f48868f] : qVar.f48979f[fVar.f48868f];
        int i32 = nVar2.f48951k;
        y6.p pVar7 = nVar2.f48947g;
        if (i32 == 0) {
            fVar2 = fVar;
            j11 = j26;
            while (true) {
                int i33 = this.D;
                int i34 = this.C;
                if (i33 >= i34) {
                    break;
                }
                this.D += e0Var3.c(nVar, i34 - i33, false);
            }
        } else {
            w wVar9 = this.f48880f;
            byte[] bArr3 = wVar9.f4039a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i35 = 4 - i32;
            while (this.D < this.C) {
                int i36 = this.E;
                if (i36 == 0) {
                    if (this.J.length > 0 || !this.F) {
                        iD = c7.q.d(pVar7);
                        fVar3 = fVar;
                        if (i32 + iD > this.C - this.D) {
                        }
                        nVar.readFully(bArr3, i35, i32 + iD);
                        wVar9.I(0);
                        iJ = wVar9.j();
                        if (iJ >= 0) {
                            throw ParserException.a(null, "Invalid NAL length");
                        }
                        this.E = iJ - iD;
                        w wVar10 = this.f48879e;
                        wVar10.I(0);
                        e0Var3.a(wVar10, 4, 0);
                        this.D += 4;
                        this.C += i35;
                        if (this.J.length > 0 || iD <= 0) {
                            c11 = 6;
                        } else {
                            byte b3 = bArr3[4];
                            String str3 = pVar7.f57291n;
                            String str4 = pVar7.f57289k;
                            if (Objects.equals(str3, "video/avc") || d0.b(str4, "video/avc")) {
                                int i37 = b3 & 31;
                                c11 = 6;
                                if (i37 != 6) {
                                }
                                this.G = z;
                                e0Var3.a(wVar9, iD, 0);
                                this.D += iD;
                                if (iD > 0 && !this.F && c7.q.c(bArr3, iD, pVar7)) {
                                    this.F = true;
                                }
                                fVar = fVar3;
                            } else {
                                c11 = 6;
                            }
                            boolean z12 = (Objects.equals(pVar7.f57291n, "video/hevc") || d0.b(str4, "video/hevc")) && ((b3 & 126) >> 1) == 39;
                            this.G = z12;
                            e0Var3.a(wVar9, iD, 0);
                            this.D += iD;
                            if (iD > 0) {
                                this.F = true;
                            }
                            fVar = fVar3;
                        }
                        this.G = z12;
                        e0Var3.a(wVar9, iD, 0);
                        this.D += iD;
                        if (iD > 0) {
                            this.F = true;
                        }
                        fVar = fVar3;
                    } else {
                        fVar3 = fVar;
                    }
                    iD = 0;
                    nVar.readFully(bArr3, i35, i32 + iD);
                    wVar9.I(0);
                    iJ = wVar9.j();
                    if (iJ >= 0) {
                        throw ParserException.a(null, "Invalid NAL length");
                    }
                    this.E = iJ - iD;
                    w wVar11 = this.f48879e;
                    wVar11.I(0);
                    e0Var3.a(wVar11, 4, 0);
                    this.D += 4;
                    this.C += i35;
                    if (this.J.length > 0) {
                        c11 = 6;
                    } else {
                        c11 = 6;
                    }
                    this.G = z12;
                    e0Var3.a(wVar9, iD, 0);
                    this.D += iD;
                    if (iD > 0) {
                        this.F = true;
                    }
                    fVar = fVar3;
                } else {
                    f fVar7 = fVar;
                    if (this.G) {
                        w wVar12 = this.f48881g;
                        wVar12.F(i36);
                        nVar.readFully(wVar12.f4039a, 0, this.E);
                        e0Var3.a(wVar12, this.E, 0);
                        iC = this.E;
                        i15 = i32;
                        int iL = c7.q.l(wVar12.f4039a, wVar12.f4041c);
                        wVar12.I(0);
                        wVar12.H(iL);
                        int i38 = pVar7.f57293p;
                        if (i38 == -1) {
                            if (cVar.f3958a != 0) {
                                cVar.e(0);
                            }
                        } else if (cVar.f3958a != i38) {
                            cVar.e(i38);
                        }
                        wVar2 = wVar9;
                        bArr = bArr3;
                        j12 = j26;
                        cVar.a(j12, wVar12);
                        c12 = 4;
                        if ((fVar7.a() & 4) != 0) {
                            cVar.b(0);
                        }
                    } else {
                        i15 = i32;
                        wVar2 = wVar9;
                        bArr = bArr3;
                        j12 = j26;
                        c12 = 4;
                        iC = e0Var3.c(nVar, i36, false);
                    }
                    this.D += iC;
                    this.E -= iC;
                    j26 = j12;
                    wVar9 = wVar2;
                    bArr3 = bArr;
                    fVar = fVar7;
                    i32 = i15;
                }
            }
            fVar2 = fVar;
            j11 = j26;
        }
        int iA2 = fVar2.a();
        if (!this.F) {
            iA2 |= 67108864;
        }
        int i39 = iA2;
        o oVarB2 = fVar2.b();
        e0Var3.d(j11, i39, this.C, 0, oVarB2 != null ? oVarB2.f48955c : null);
        while (!arrayDeque.isEmpty()) {
            e eVar2 = (e) arrayDeque.removeFirst();
            this.f48897x -= eVar2.f48862c;
            long j27 = eVar2.f48860a;
            if (eVar2.f48861b) {
                j27 += j11;
            }
            long j28 = j27;
            for (e0 e0Var4 : this.I) {
                e0Var4.d(j28, 1, eVar2.f48862c, this.f48897x, null);
            }
        }
        if (!fVar2.c()) {
            this.B = null;
        }
        this.f48891r = 3;
        return 0;
    }

    @Override // x7.m
    public final List h() {
        return this.f48890q;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0420  */
    /* JADX WARN: Code duplicated, block: B:308:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:310:0x0705  */
    /* JADX WARN: Code duplicated, block: B:313:0x071d  */
    /* JADX WARN: Code duplicated, block: B:314:0x0721  */
    /* JADX WARN: Code duplicated, block: B:396:0x0726 A[SYNTHETIC] */
    public final void j(long j11) throws ParserException {
        y6.c0 c0Var;
        int i11;
        n nVar;
        d dVar;
        int i12;
        d dVar2;
        y6.l lVar;
        int i13;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i14;
        int i15;
        int size;
        int i16;
        c7.e eVar;
        w wVar;
        byte[] bArr;
        byte[] bArr2;
        int i17;
        boolean z11;
        while (true) {
            ArrayDeque arrayDeque = this.f48886l;
            if (arrayDeque.isEmpty() || ((c7.d) arrayDeque.peek()).f6647c != j11) {
                break;
            }
            c7.d dVar3 = (c7.d) arrayDeque.pop();
            int i18 = dVar3.f6652b;
            ArrayList arrayList3 = dVar3.f6649e;
            ArrayList arrayList4 = dVar3.f6648d;
            int i19 = this.f48876b;
            int i21 = 12;
            SparseArray sparseArray = this.f48878d;
            if (i18 == 1836019574) {
                y6.l lVarB = b(arrayList4);
                c7.d dVarN = dVar3.n(1836475768);
                dVarN.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList5 = dVarN.f6648d;
                int size2 = arrayList5.size();
                long jY = -9223372036854775807L;
                int i22 = 0;
                while (i22 < size2) {
                    c7.e eVar2 = (c7.e) arrayList5.get(i22);
                    int i23 = eVar2.f6652b;
                    w wVar2 = eVar2.f6650c;
                    if (i23 == 1953654136) {
                        wVar2.I(i21);
                        lVar = lVarB;
                        Pair pairCreate = Pair.create(Integer.valueOf(wVar2.j()), new d(wVar2.j() - 1, wVar2.j(), wVar2.j(), wVar2.j()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (d) pairCreate.second);
                    } else {
                        lVar = lVarB;
                        if (i23 == 1835362404) {
                            wVar2.I(8);
                            jY = c.e(wVar2.j()) == 0 ? wVar2.y() : wVar2.B();
                        }
                    }
                    i22++;
                    lVarB = lVar;
                    i21 = 12;
                }
                y6.l lVar2 = lVarB;
                int i24 = 0;
                c7.d dVarN2 = dVar3.n(1835365473);
                y6.c0 c0VarF = dVarN2 != null ? c.f(dVarN2) : null;
                t tVar = new t();
                c7.e eVarO = dVar3.o(1969517665);
                if (eVarO != null) {
                    y6.c0 c0VarK = c.k(eVarO);
                    tVar.b(c0VarK);
                    c0Var = c0VarK;
                } else {
                    c0Var = null;
                }
                c7.e eVarO2 = dVar3.o(1836476516);
                eVarO2.getClass();
                y6.c0 c0Var2 = new y6.c0(c.g(eVarO2.f6650c));
                ArrayList arrayListJ = c.j(dVar3, tVar, jY, lVar2, (i19 & 16) != 0, false, new com.google.common.graph.b(this, 2));
                int size3 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strC = m.c(arrayListJ);
                    int i25 = 0;
                    while (i25 < size3) {
                        q qVar = (q) arrayListJ.get(i25);
                        n nVar2 = qVar.f48974a;
                        x7.o oVar = this.H;
                        int i26 = nVar2.f48942b;
                        int i27 = nVar2.f48941a;
                        String str = strC;
                        y6.p pVar = nVar2.f48947g;
                        e0 e0VarV = oVar.v(i25, i26);
                        e0VarV.getClass();
                        int i28 = i25;
                        y6.o oVarA = pVar.a();
                        ArrayList arrayList6 = arrayListJ;
                        oVarA.f57264l = d0.o(str);
                        if (i26 == 1) {
                            int i29 = tVar.f55930a;
                            i11 = size3;
                            nVar = nVar2;
                            if (i29 != -1 && (i12 = tVar.f55931b) != -1) {
                                oVarA.H = i29;
                                oVarA.I = i12;
                            }
                        } else {
                            i11 = size3;
                            nVar = nVar2;
                        }
                        m.k(i26, c0VarF, oVarA, pVar.f57290l, c0Var, c0Var2);
                        if (sparseArray2.size() == 1) {
                            dVar = (d) sparseArray2.valueAt(i24);
                        } else {
                            dVar = (d) sparseArray2.get(i27);
                            dVar.getClass();
                        }
                        sparseArray.put(i27, new f(e0VarV, qVar, dVar, new y6.p(oVarA)));
                        this.f48899z = Math.max(this.f48899z, nVar.f48945e);
                        i25 = i28 + 1;
                        strC = str;
                        arrayListJ = arrayList6;
                        size3 = i11;
                        i24 = 0;
                    }
                    this.H.o();
                } else {
                    ArrayList arrayList7 = arrayListJ;
                    b7.a.j(sparseArray.size() == size3);
                    int i30 = 0;
                    while (i30 < size3) {
                        ArrayList arrayList8 = arrayList7;
                        q qVar2 = (q) arrayList8.get(i30);
                        n nVar3 = qVar2.f48974a;
                        f fVar = (f) sparseArray.get(nVar3.f48941a);
                        int i31 = nVar3.f48941a;
                        if (sparseArray2.size() == 1) {
                            dVar2 = (d) sparseArray2.valueAt(0);
                        } else {
                            dVar2 = (d) sparseArray2.get(i31);
                            dVar2.getClass();
                        }
                        fVar.f48866d = qVar2;
                        fVar.f48867e = dVar2;
                        fVar.f48863a.b(fVar.f48872j);
                        fVar.e();
                        i30++;
                        arrayList7 = arrayList8;
                    }
                }
            } else if (i18 == 1836019558) {
                int size4 = arrayList3.size();
                int i32 = 0;
                while (i32 < size4) {
                    c7.d dVar4 = (c7.d) arrayList3.get(i32);
                    if (dVar4.f6652b == 1953653094) {
                        c7.e eVarO3 = dVar4.o(1952868452);
                        ArrayList arrayList9 = dVar4.f6648d;
                        eVarO3.getClass();
                        w wVar3 = eVarO3.f6650c;
                        wVar3.I(8);
                        int iJ = wVar3.j();
                        byte[] bArr3 = c.f48855a;
                        f fVar2 = (f) sparseArray.get(wVar3.j());
                        if (fVar2 == null) {
                            size4 = size4;
                            fVar2 = null;
                        } else {
                            p pVar2 = fVar2.f48864b;
                            if ((iJ & 1) != 0) {
                                long jB = wVar3.B();
                                pVar2.f48959b = jB;
                                pVar2.f48960c = jB;
                            }
                            d dVar5 = fVar2.f48867e;
                            pVar2.f48958a = new d((iJ & 2) != 0 ? wVar3.j() - 1 : dVar5.f48856a, (iJ & 8) != 0 ? wVar3.j() : dVar5.f48857b, (iJ & 16) != 0 ? wVar3.j() : dVar5.f48858c, (iJ & 32) != 0 ? wVar3.j() : dVar5.f48859d);
                        }
                        if (fVar2 != null) {
                            p pVar3 = fVar2.f48864b;
                            long j12 = pVar3.f48972p;
                            boolean z12 = pVar3.f48973q;
                            fVar2.e();
                            fVar2.m = true;
                            c7.e eVarO4 = dVar4.o(1952867444);
                            if (eVarO4 == null || (i19 & 2) != 0) {
                                pVar3.f48972p = j12;
                                pVar3.f48973q = z12;
                            } else {
                                w wVar4 = eVarO4.f6650c;
                                wVar4.I(8);
                                pVar3.f48972p = c.e(wVar4.j()) == 1 ? wVar4.B() : wVar4.y();
                                pVar3.f48973q = true;
                            }
                            int size5 = arrayList9.size();
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            while (true) {
                                i15 = 1953658222;
                                if (i33 >= size5) {
                                    break;
                                }
                                c7.e eVar3 = (c7.e) arrayList9.get(i33);
                                int i36 = i32;
                                if (eVar3.f6652b == 1953658222) {
                                    w wVar5 = eVar3.f6650c;
                                    wVar5.I(12);
                                    int iA = wVar5.A();
                                    if (iA > 0) {
                                        i35 += iA;
                                        i34++;
                                    }
                                }
                                i33++;
                                i32 = i36;
                            }
                            i13 = i32;
                            fVar2.f48870h = 0;
                            fVar2.f48869g = 0;
                            fVar2.f48868f = 0;
                            pVar3.f48961d = i34;
                            pVar3.f48962e = i35;
                            if (pVar3.f48964g.length < i34) {
                                pVar3.f48963f = new long[i34];
                                pVar3.f48964g = new int[i34];
                            }
                            if (pVar3.f48965h.length < i35) {
                                int i37 = (i35 * AchievementLevelType.DAY_STREAK_LV_7) / 100;
                                pVar3.f48965h = new int[i37];
                                pVar3.f48966i = new long[i37];
                                pVar3.f48967j = new boolean[i37];
                                pVar3.f48969l = new boolean[i37];
                            }
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            while (true) {
                                long j13 = 0;
                                if (i38 >= size5) {
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                    i14 = i19;
                                    n nVar4 = fVar2.f48866d.f48974a;
                                    d dVar6 = pVar3.f48958a;
                                    dVar6.getClass();
                                    o oVar2 = nVar4.f48952l[dVar6.f48856a];
                                    c7.e eVarO5 = dVar4.o(1935763834);
                                    if (eVarO5 != null) {
                                        oVar2.getClass();
                                        w wVar6 = eVarO5.f6650c;
                                        int i41 = oVar2.f48956d;
                                        wVar6.I(8);
                                        int iJ2 = wVar6.j();
                                        byte[] bArr4 = c.f48855a;
                                        if ((iJ2 & 1) == 1) {
                                            wVar6.J(8);
                                        }
                                        int iW = wVar6.w();
                                        int iA2 = wVar6.A();
                                        if (iA2 > pVar3.f48962e) {
                                            StringBuilder sbI = w4.c.i(iA2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbI.append(pVar3.f48962e);
                                            throw ParserException.a(null, sbI.toString());
                                        }
                                        if (iW == 0) {
                                            boolean[] zArr = pVar3.f48969l;
                                            i17 = 0;
                                            for (int i42 = 0; i42 < iA2; i42++) {
                                                int iW2 = wVar6.w();
                                                i17 += iW2;
                                                zArr[i42] = iW2 > i41;
                                            }
                                            z11 = false;
                                        } else {
                                            boolean z13 = iW > i41;
                                            i17 = iW * iA2;
                                            z11 = false;
                                            Arrays.fill(pVar3.f48969l, 0, iA2, z13);
                                        }
                                        Arrays.fill(pVar3.f48969l, iA2, pVar3.f48962e, z11);
                                        if (i17 > 0) {
                                            pVar3.f48970n.F(i17);
                                            pVar3.f48968k = true;
                                            pVar3.f48971o = true;
                                        }
                                    }
                                    c7.e eVarO6 = dVar4.o(1935763823);
                                    if (eVarO6 != null) {
                                        w wVar7 = eVarO6.f6650c;
                                        wVar7.I(8);
                                        int iJ3 = wVar7.j();
                                        byte[] bArr5 = c.f48855a;
                                        if ((iJ3 & 1) == 1) {
                                            wVar7.J(8);
                                        }
                                        int iA3 = wVar7.A();
                                        if (iA3 != 1) {
                                            throw ParserException.a(null, "Unexpected saio entry count: " + iA3);
                                        }
                                        pVar3.f48960c += c.e(iJ3) == 0 ? wVar7.y() : wVar7.B();
                                    }
                                    c7.e eVarO7 = dVar4.o(1936027235);
                                    if (eVarO7 != null) {
                                        d(eVarO7.f6650c, 0, pVar3);
                                    }
                                    String str2 = oVar2 != null ? oVar2.f48954b : null;
                                    w wVar8 = null;
                                    w wVar9 = null;
                                    for (int i43 = 0; i43 < arrayList9.size(); i43++) {
                                        c7.e eVar4 = (c7.e) arrayList9.get(i43);
                                        w wVar10 = eVar4.f6650c;
                                        int i44 = eVar4.f6652b;
                                        if (i44 == 1935828848) {
                                            wVar10.I(12);
                                            if (wVar10.j() == 1936025959) {
                                                wVar9 = wVar10;
                                            }
                                        } else if (i44 == 1936158820) {
                                            wVar10.I(12);
                                            if (wVar10.j() == 1936025959) {
                                                wVar8 = wVar10;
                                            }
                                        }
                                    }
                                    if (wVar9 != null && wVar8 != null) {
                                        wVar9.I(8);
                                        int iE = c.e(wVar9.j());
                                        wVar9.J(4);
                                        if (iE == 1) {
                                            wVar9.J(4);
                                        }
                                        if (wVar9.j() != 1) {
                                            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        wVar8.I(8);
                                        int iE2 = c.e(wVar8.j());
                                        wVar8.J(4);
                                        if (iE2 == 1) {
                                            if (wVar8.y() == 0) {
                                                throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE2 >= 2) {
                                            wVar8.J(4);
                                        }
                                        if (wVar8.y() != 1) {
                                            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        wVar8.J(1);
                                        int iW3 = wVar8.w();
                                        int i45 = (iW3 & 240) >> 4;
                                        int i46 = iW3 & 15;
                                        boolean z14 = wVar8.w() == 1;
                                        if (z14) {
                                            int iW4 = wVar8.w();
                                            byte[] bArr6 = new byte[16];
                                            wVar8.h(bArr6, 0, 16);
                                            if (iW4 == 0) {
                                                int iW5 = wVar8.w();
                                                byte[] bArr7 = new byte[iW5];
                                                wVar8.h(bArr7, 0, iW5);
                                                bArr2 = bArr7;
                                            } else {
                                                bArr2 = null;
                                            }
                                            pVar3.f48968k = true;
                                            pVar3.m = new o(z14, str2, iW4, bArr6, i45, i46, bArr2);
                                        }
                                        size = arrayList9.size();
                                        for (i16 = 0; i16 < size; i16++) {
                                            eVar = (c7.e) arrayList9.get(i16);
                                            if (eVar.f6652b == 1970628964) {
                                                wVar = eVar.f6650c;
                                                wVar.I(8);
                                                bArr = this.f48882h;
                                                wVar.h(bArr, 0, 16);
                                                if (!Arrays.equals(bArr, N)) {
                                                    d(wVar, 16, pVar3);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    size = arrayList9.size();
                                    while (i16 < size) {
                                        eVar = (c7.e) arrayList9.get(i16);
                                        if (eVar.f6652b == 1970628964) {
                                            wVar = eVar.f6650c;
                                            wVar.I(8);
                                            bArr = this.f48882h;
                                            wVar.h(bArr, 0, 16);
                                            if (!Arrays.equals(bArr, N)) {
                                                d(wVar, 16, pVar3);
                                            }
                                        }
                                    }
                                    break;
                                    break;
                                }
                                c7.e eVar5 = (c7.e) arrayList9.get(i38);
                                if (eVar5.f6652b == i15) {
                                    int i47 = i39 + 1;
                                    w wVar11 = eVar5.f6650c;
                                    wVar11.I(8);
                                    int iJ4 = wVar11.j();
                                    byte[] bArr8 = c.f48855a;
                                    n nVar5 = fVar2.f48866d.f48974a;
                                    d dVar7 = pVar3.f48958a;
                                    String str3 = f0.f3975a;
                                    pVar3.f48964g[i39] = wVar11.A();
                                    long[] jArr = pVar3.f48963f;
                                    long j14 = pVar3.f48959b;
                                    jArr[i39] = j14;
                                    if ((iJ4 & 1) != 0) {
                                        jArr[i39] = j14 + ((long) wVar11.j());
                                    }
                                    boolean z15 = (iJ4 & 4) != 0;
                                    int iJ5 = dVar7.f48859d;
                                    if (z15) {
                                        iJ5 = wVar11.j();
                                    }
                                    boolean z16 = z15;
                                    boolean z17 = (iJ4 & 256) != 0;
                                    boolean z18 = (iJ4 & 512) != 0;
                                    boolean z19 = (iJ4 & 1024) != 0;
                                    boolean z20 = (iJ4 & 2048) != 0;
                                    boolean z21 = z19;
                                    long[] jArr2 = nVar5.f48949i;
                                    int i48 = iJ5;
                                    long[] jArr3 = nVar5.f48950j;
                                    if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                        long j15 = jArr2[0];
                                        if (j15 == 0) {
                                            j13 = jArr3[0];
                                        } else {
                                            long j16 = nVar5.f48944d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (f0.R(j15, 1000000L, j16, roundingMode) + f0.R(jArr3[0], 1000000L, nVar5.f48943c, roundingMode) >= nVar5.f48945e) {
                                                j13 = jArr3[0];
                                            }
                                        }
                                    }
                                    int[] iArr = pVar3.f48965h;
                                    long[] jArr4 = pVar3.f48966i;
                                    boolean[] zArr2 = pVar3.f48967j;
                                    boolean z22 = nVar5.f48942b == 2 && (i19 & 1) != 0;
                                    int i49 = pVar3.f48964g[i39] + i40;
                                    long j17 = nVar5.f48943c;
                                    long j18 = pVar3.f48972p;
                                    while (i40 < i49) {
                                        int iJ6 = z17 ? wVar11.j() : dVar7.f48857b;
                                        boolean z23 = z22;
                                        if (iJ6 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iJ6);
                                        }
                                        int iJ7 = z18 ? wVar11.j() : dVar7.f48858c;
                                        if (iJ7 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iJ7);
                                        }
                                        int iJ8 = z21 ? wVar11.j() : (i40 == 0 && z16) ? i48 : dVar7.f48859d;
                                        long jR = f0.R((((long) (z20 ? wVar11.j() : 0)) + j18) - j13, 1000000L, j17, RoundingMode.DOWN);
                                        jArr4[i40] = jR;
                                        if (!pVar3.f48973q) {
                                            jArr4[i40] = jR + fVar2.f48866d.f48981h;
                                        }
                                        iArr[i40] = iJ7;
                                        zArr2[i40] = ((iJ8 >> 16) & 1) == 0 && (!z23 || i40 == 0);
                                        j18 += (long) iJ6;
                                        i40++;
                                        z22 = z23;
                                        i49 = i49;
                                        dVar7 = dVar7;
                                    }
                                    pVar3.f48972p = j18;
                                    i39 = i47;
                                    i40 = i49;
                                }
                                i38++;
                                arrayList3 = arrayList3;
                                arrayList4 = arrayList4;
                                size5 = size5;
                                i19 = i19;
                                i15 = 1953658222;
                            }
                        } else {
                            i13 = i32;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            i14 = i19;
                        }
                    } else {
                        size4 = size4;
                        i13 = i32;
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        i14 = i19;
                    }
                    i32 = i13 + 1;
                    size4 = size4;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    i19 = i14;
                }
                y6.l lVarB2 = b(arrayList4);
                if (lVarB2 != null) {
                    int size6 = sparseArray.size();
                    for (int i50 = 0; i50 < size6; i50++) {
                        f fVar3 = (f) sparseArray.valueAt(i50);
                        n nVar6 = fVar3.f48866d.f48974a;
                        d dVar8 = fVar3.f48864b.f48958a;
                        String str4 = f0.f3975a;
                        o oVar3 = nVar6.f48952l[dVar8.f48856a];
                        y6.l lVarA = lVarB2.a(oVar3 != null ? oVar3.f48954b : null);
                        y6.o oVarA2 = fVar3.f48872j.a();
                        oVarA2.f57268q = lVarA;
                        fVar3.f48863a.b(new y6.p(oVarA2));
                    }
                }
                if (this.f48898y != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i51 = 0; i51 < size7; i51++) {
                        f fVar4 = (f) sparseArray.valueAt(i51);
                        long j19 = this.f48898y;
                        int i52 = fVar4.f48868f;
                        while (true) {
                            p pVar4 = fVar4.f48864b;
                            if (i52 >= pVar4.f48962e || pVar4.f48966i[i52] > j19) {
                                break;
                            }
                            if (pVar4.f48967j[i52]) {
                                fVar4.f48871i = i52;
                            }
                            i52++;
                        }
                    }
                    this.f48898y = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((c7.d) arrayDeque.peek()).f6649e.add(dVar3);
            }
        }
        a();
    }

    @Override // x7.m
    public final void release() {
    }
}
