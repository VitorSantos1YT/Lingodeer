package x1;

import java.util.HashMap;
import qp.m4;
import y.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vr.a f55689a = new vr.a(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m4 f55690b = new m4(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f55691c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f55692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f55693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j4.i f55694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ij.d f55695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f55696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f55697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f55698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.a f55699k;

    static {
        j jVar = j.f55681e;
        f55692d = jVar;
        long j11 = 1;
        f55693e = j11 + j11;
        j4.i iVar = new j4.i();
        iVar.f35910c = new long[16];
        iVar.f35911d = new int[16];
        int[] iArr = new int[16];
        int i11 = 0;
        while (i11 < 16) {
            int i12 = i11 + 1;
            iArr[i11] = i12;
            i11 = i12;
        }
        iVar.f35912e = iArr;
        f55694f = iVar;
        ij.d dVar = new ij.d(24, false);
        dVar.f34422c = new int[16];
        dVar.f34423d = new t1.m[16];
        f55695g = dVar;
        ry.r rVar = ry.r.f50854a;
        f55696h = rVar;
        f55697i = rVar;
        long j12 = f55693e;
        f55693e = j11 + j12;
        a aVar = new a(j12, jVar, null, new vr.a(15));
        f55692d = f55692d.g(aVar.f55670b);
        f55698j = aVar;
        f55699k = new t1.a(0);
    }

    public static final void a() {
        e(f55689a);
    }

    public static final HashMap b(long j11, b bVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        int i11;
        int i12;
        a0 a0VarS;
        j0 j0VarX = bVar.x();
        if (j0VarX != null) {
            long jG = bVar.g();
            j jVarF = bVar.d().g(jG).f(bVar.f55645j);
            Object[] objArr = j0VarX.f56721b;
            long[] jArr3 = j0VarX.f56720a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                HashMap map = null;
                while (true) {
                    long j12 = jArr3[i13];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j12 & 255) < 128) {
                                y yVar = (y) objArr[(i13 << 3) + i16];
                                a0 a0VarB = yVar.b();
                                jArr2 = jArr3;
                                i11 = i14;
                                i12 = i16;
                                a0 a0VarS2 = s(a0VarB, j11, jVar);
                                if (a0VarS2 != null && (a0VarS = s(a0VarB, jG, jVarF)) != null && !a0VarS2.equals(a0VarS)) {
                                    a0 a0VarS3 = s(a0VarB, jG, bVar.d());
                                    if (a0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    a0 a0VarD = yVar.d(a0VarS, a0VarS2, a0VarS3);
                                    if (a0VarD == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(a0VarS2, a0VarD);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                i12 = i16;
                            }
                            j12 >>= i11;
                            i16 = i12 + 1;
                            i14 = i11;
                            jArr3 = jArr2;
                            jVarF = jVarF;
                        }
                        jArr = jArr3;
                        jVar2 = jVarF;
                        if (i15 != i14) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = jVarF;
                    }
                    if (i13 == length) {
                        return map;
                    }
                    i13++;
                    jArr3 = jArr;
                    jVarF = jVar2;
                }
            }
        }
        return null;
    }

    public static final void c(f fVar) {
        long j11;
        if (f55692d.e(fVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(fVar.g());
        sb2.append(", disposed=");
        sb2.append(fVar.f55671c);
        sb2.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f55691c) {
            j4.i iVar = f55694f;
            j11 = iVar.f35908a > 0 ? ((long[]) iVar.f35910c)[0] : -1L;
        }
        sb2.append(j11);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final j d(j jVar, long j11, long j12) {
        while (kotlin.jvm.internal.m.i(j11, j12) < 0) {
            jVar = jVar.g(j11);
            j11 += (long) 1;
        }
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object e(fz.c cVar) {
        j0 j0Var;
        Object objV;
        a aVar = f55698j;
        synchronized (f55691c) {
            try {
                j0Var = aVar.f55643h;
                if (j0Var != null) {
                    f55699k.addAndGet(1);
                }
                objV = v(aVar, cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (j0Var != null) {
            try {
                ?? r9 = f55696h;
                int size = r9.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((fz.e) r9.get(i11)).invoke(new n1.h(j0Var), aVar);
                }
                f55699k.addAndGet(-1);
            } catch (Throwable th3) {
                f55699k.addAndGet(-1);
                throw th3;
            }
        }
        synchronized (f55691c) {
            f();
            if (j0Var != null) {
                Object[] objArr = j0Var.f56721b;
                long[] jArr = j0Var.f56720a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j11 = jArr[i12];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                        } else {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((255 & j11) < 128) {
                                    q((y) objArr[(i12 << 3) + i14]);
                                }
                                j11 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                            if (i12 != length) {
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
        }
        return objV;
    }

    public static final void f() {
        ij.d dVar = f55695g;
        int i11 = dVar.f34421b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            t1.m mVar = ((t1.m[]) dVar.f34423d)[i12];
            Object obj = mVar != null ? mVar.get() : null;
            if (obj != null && p((y) obj)) {
                if (i13 != i12) {
                    ((t1.m[]) dVar.f34423d)[i13] = mVar;
                    int[] iArr = (int[]) dVar.f34422c;
                    iArr[i13] = iArr[i12];
                }
                i13++;
            }
            i12++;
        }
        for (int i14 = i13; i14 < i11; i14++) {
            ((t1.m[]) dVar.f34423d)[i14] = null;
            ((int[]) dVar.f34422c)[i14] = 0;
        }
        if (i13 != i11) {
            dVar.f34421b = i13;
        }
    }

    public static final f g(f fVar, fz.c cVar, boolean z11) {
        boolean z12 = fVar instanceof b;
        if (z12 || fVar == null) {
            return new c0(z12 ? (b) fVar : null, cVar, null, false, z11);
        }
        return new d0(fVar, cVar, false, z11);
    }

    public static final a0 h(a0 a0Var) {
        a0 a0VarS;
        f fVarJ = j();
        a0 a0VarS2 = s(a0Var, fVarJ.g(), fVarJ.d());
        if (a0VarS2 != null) {
            return a0VarS2;
        }
        synchronized (f55691c) {
            f fVarJ2 = j();
            a0VarS = s(a0Var, fVarJ2.g(), fVarJ2.d());
        }
        if (a0VarS != null) {
            return a0VarS;
        }
        r();
        throw null;
    }

    public static final a0 i(a0 a0Var, f fVar) {
        a0 a0VarS;
        a0 a0VarS2 = s(a0Var, fVar.g(), fVar.d());
        if (a0VarS2 != null) {
            return a0VarS2;
        }
        synchronized (f55691c) {
            a0VarS = s(a0Var, fVar.g(), fVar.d());
        }
        if (a0VarS != null) {
            return a0VarS;
        }
        r();
        throw null;
    }

    public static final f j() {
        f fVar = (f) f55690b.e();
        return fVar == null ? f55698j : fVar;
    }

    public static final fz.c k(fz.c cVar, fz.c cVar2, boolean z11) {
        if (!z11) {
            cVar2 = null;
        }
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            return cVar == null ? cVar2 : cVar;
        }
        return new k(cVar, cVar2, 0);
    }

    public static final fz.c l(fz.c cVar, fz.c cVar2) {
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            return cVar == null ? cVar2 : cVar;
        }
        return new k(cVar, cVar2, 1);
    }

    public static final a0 m(a0 a0Var, y yVar) {
        long j11 = f55693e;
        j4.i iVar = f55694f;
        if (iVar.f35908a > 0) {
            j11 = ((long[]) iVar.f35910c)[0];
        }
        long j12 = j11 - ((long) 1);
        a0 a0Var2 = null;
        a0 a0Var3 = null;
        for (a0 a0VarB = yVar.b(); a0VarB != null; a0VarB = a0VarB.f55638b) {
            long j13 = a0VarB.f55637a;
            if (j13 != 0) {
                if (j13 != 0 && kotlin.jvm.internal.m.i(j13, j12) <= 0 && !j.f55681e.e(j13)) {
                    if (a0Var3 != null) {
                        if (kotlin.jvm.internal.m.i(a0VarB.f55637a, a0Var3.f55637a) >= 0) {
                            a0Var2 = a0Var3;
                            break;
                        }
                        break;
                    }
                    a0Var3 = a0VarB;
                }
            }
            a0Var2 = a0VarB;
            break;
        }
        if (a0Var2 != null) {
            a0Var2.f55637a = Long.MAX_VALUE;
            return a0Var2;
        }
        a0 a0VarB2 = a0Var.b(Long.MAX_VALUE);
        a0VarB2.f55638b = yVar.b();
        yVar.g(a0VarB2);
        return a0VarB2;
    }

    public static final void n(f fVar, y yVar) {
        fVar.t(fVar.h() + 1);
        fz.c cVarI = fVar.i();
        if (cVarI != null) {
            cVarI.invoke(yVar);
        }
    }

    public static final a0 o(a0 a0Var, z zVar, f fVar, a0 a0Var2) {
        a0 a0VarM;
        if (fVar.f()) {
            fVar.n(zVar);
        }
        long jG = fVar.g();
        if (a0Var2.f55637a == jG) {
            return a0Var2;
        }
        synchronized (f55691c) {
            a0VarM = m(a0Var, zVar);
        }
        a0VarM.f55637a = jG;
        if (a0Var2.f55637a != 1) {
            fVar.n(zVar);
        }
        return a0VarM;
    }

    public static final boolean p(y yVar) {
        a0 a0Var;
        long j11 = f55693e;
        j4.i iVar = f55694f;
        if (iVar.f35908a > 0) {
            j11 = ((long[]) iVar.f35910c)[0];
        }
        a0 a0Var2 = null;
        a0 a0VarB = null;
        int i11 = 0;
        for (a0 a0VarB2 = yVar.b(); a0VarB2 != null; a0VarB2 = a0VarB2.f55638b) {
            long j12 = a0VarB2.f55637a;
            if (j12 != 0) {
                if (kotlin.jvm.internal.m.i(j12, j11) >= 0) {
                    i11++;
                } else if (a0Var2 == null) {
                    i11++;
                    a0Var2 = a0VarB2;
                } else {
                    if (kotlin.jvm.internal.m.i(a0VarB2.f55637a, a0Var2.f55637a) < 0) {
                        a0Var = a0Var2;
                        a0Var2 = a0VarB2;
                    } else {
                        a0Var = a0VarB2;
                    }
                    if (a0VarB == null) {
                        a0VarB = yVar.b();
                        a0 a0Var3 = a0VarB;
                        while (true) {
                            if (a0VarB == null) {
                                a0VarB = a0Var3;
                                break;
                            }
                            if (kotlin.jvm.internal.m.i(a0VarB.f55637a, j11) >= 0) {
                                break;
                            }
                            if (kotlin.jvm.internal.m.i(a0Var3.f55637a, a0VarB.f55637a) < 0) {
                                a0Var3 = a0VarB;
                            }
                            a0VarB = a0VarB.f55638b;
                        }
                    }
                    a0Var2.f55637a = 0L;
                    a0Var2.a(a0VarB);
                    a0Var2 = a0Var;
                }
            }
        }
        return i11 > 1;
    }

    public static final void q(y yVar) {
        if (p(yVar)) {
            ij.d dVar = f55695g;
            int i11 = dVar.f34421b;
            int iIdentityHashCode = System.identityHashCode(yVar);
            int i12 = -1;
            if (i11 > 0) {
                int i13 = dVar.f34421b - 1;
                int i14 = 0;
                while (true) {
                    if (i14 > i13) {
                        i12 = -(i14 + 1);
                        break;
                    }
                    int i15 = (i14 + i13) >>> 1;
                    int i16 = ((int[]) dVar.f34422c)[i15];
                    if (i16 < iIdentityHashCode) {
                        i14 = i15 + 1;
                    } else if (i16 > iIdentityHashCode) {
                        i13 = i15 - 1;
                    } else {
                        t1.m mVar = ((t1.m[]) dVar.f34423d)[i15];
                        if (yVar == (mVar != null ? mVar.get() : null)) {
                            i12 = i15;
                            break;
                        }
                        int i17 = i15 - 1;
                        while (true) {
                            if (-1 >= i17 || ((int[]) dVar.f34422c)[i17] != iIdentityHashCode) {
                                i15++;
                                int i18 = dVar.f34421b;
                                while (true) {
                                    if (i15 >= i18) {
                                        i12 = -(dVar.f34421b + 1);
                                        break;
                                    }
                                    if (((int[]) dVar.f34422c)[i15] != iIdentityHashCode) {
                                        i12 = -(i15 + 1);
                                        break;
                                    }
                                    t1.m mVar2 = ((t1.m[]) dVar.f34423d)[i15];
                                    if ((mVar2 != null ? mVar2.get() : null) == yVar) {
                                        i12 = i15;
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                t1.m mVar3 = ((t1.m[]) dVar.f34423d)[i17];
                                if ((mVar3 != null ? mVar3.get() : null) == yVar) {
                                    i12 = i17;
                                    break;
                                }
                                i17--;
                            }
                        }
                    }
                }
                if (i12 >= 0) {
                    return;
                }
            }
            int i19 = -(i12 + 1);
            t1.m[] mVarArr = (t1.m[]) dVar.f34423d;
            int length = mVarArr.length;
            if (i11 == length) {
                int i21 = length * 2;
                t1.m[] mVarArr2 = new t1.m[i21];
                int[] iArr = new int[i21];
                int i22 = i19 + 1;
                System.arraycopy(mVarArr, i19, mVarArr2, i22, i11 - i19);
                System.arraycopy((t1.m[]) dVar.f34423d, 0, mVarArr2, 0, i19);
                ry.l.H(i22, i19, (int[]) dVar.f34422c, iArr, i11);
                ry.l.L(0, i19, (int[]) dVar.f34422c, iArr, 6);
                dVar.f34423d = mVarArr2;
                dVar.f34422c = iArr;
            } else {
                int i23 = i19 + 1;
                System.arraycopy(mVarArr, i19, mVarArr, i23, i11 - i19);
                int[] iArr2 = (int[]) dVar.f34422c;
                ry.l.H(i23, i19, iArr2, iArr2, i11);
            }
            ((t1.m[]) dVar.f34423d)[i19] = new t1.m(yVar);
            ((int[]) dVar.f34422c)[i19] = iIdentityHashCode;
            dVar.f34421b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final a0 s(a0 a0Var, long j11, j jVar) {
        a0 a0Var2 = null;
        while (a0Var != null) {
            long j12 = a0Var.f55637a;
            if (j12 != 0 && kotlin.jvm.internal.m.i(j12, j11) <= 0 && !jVar.e(j12) && (a0Var2 == null || kotlin.jvm.internal.m.i(a0Var2.f55637a, a0Var.f55637a) < 0)) {
                a0Var2 = a0Var;
            }
            a0Var = a0Var.f55638b;
        }
        if (a0Var2 != null) {
            return a0Var2;
        }
        return null;
    }

    public static final a0 t(a0 a0Var, y yVar) {
        a0 a0VarS;
        f fVarJ = j();
        fz.c cVarE = fVarJ.e();
        if (cVarE != null) {
            cVarE.invoke(yVar);
        }
        a0 a0VarS2 = s(a0Var, fVarJ.g(), fVarJ.d());
        if (a0VarS2 != null) {
            return a0VarS2;
        }
        synchronized (f55691c) {
            f fVarJ2 = j();
            a0 a0VarB = yVar.b();
            kotlin.jvm.internal.m.d(a0VarB, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            a0VarS = s(a0VarB, fVarJ2.g(), fVarJ2.d());
            if (a0VarS == null) {
                r();
                throw null;
            }
        }
        return a0VarS;
    }

    public static final void u(int i11) {
        j4.i iVar = f55694f;
        int i12 = ((int[]) iVar.f35912e)[i11];
        iVar.d(i12, iVar.f35908a - 1);
        iVar.f35908a--;
        long[] jArr = (long[]) iVar.f35910c;
        long j11 = jArr[i12];
        int i13 = i12;
        while (i13 > 0) {
            int i14 = ((i13 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.m.i(jArr[i14], j11) <= 0) {
                break;
            }
            iVar.d(i14, i13);
            i13 = i14;
        }
        long[] jArr2 = (long[]) iVar.f35910c;
        int i15 = iVar.f35908a >> 1;
        while (i12 < i15) {
            int i16 = (i12 + 1) << 1;
            int i17 = i16 - 1;
            if (i16 < iVar.f35908a && kotlin.jvm.internal.m.i(jArr2[i16], jArr2[i17]) < 0) {
                if (kotlin.jvm.internal.m.i(jArr2[i16], jArr2[i12]) >= 0) {
                    break;
                }
                iVar.d(i16, i12);
                i12 = i16;
            } else {
                if (kotlin.jvm.internal.m.i(jArr2[i17], jArr2[i12]) >= 0) {
                    break;
                }
                iVar.d(i17, i12);
                i12 = i17;
            }
        }
        ((int[]) iVar.f35912e)[i11] = iVar.f35909b;
        iVar.f35909b = i11;
    }

    public static final Object v(a aVar, fz.c cVar) {
        long j11 = aVar.f55670b;
        Object objInvoke = cVar.invoke(f55692d.d(j11));
        long j12 = f55693e;
        f55693e = ((long) 1) + j12;
        j jVarD = f55692d.d(j11);
        f55692d = jVarD;
        aVar.f55670b = j12;
        aVar.f55669a = jVarD;
        aVar.f55642g = 0;
        aVar.f55643h = null;
        aVar.o();
        f55692d = f55692d.g(j12);
        return objInvoke;
    }

    public static final a0 w(a0 a0Var, y yVar, f fVar) {
        a0 a0VarS;
        if (fVar.f()) {
            fVar.n(yVar);
        }
        long jG = fVar.g();
        a0 a0VarS2 = s(a0Var, jG, fVar.d());
        if (a0VarS2 == null) {
            r();
            throw null;
        }
        if (a0VarS2.f55637a == fVar.g()) {
            return a0VarS2;
        }
        synchronized (f55691c) {
            a0VarS = s(yVar.b(), jG, fVar.d());
            if (a0VarS == null) {
                r();
                throw null;
            }
            if (a0VarS.f55637a != jG) {
                a0 a0VarM = m(a0VarS, yVar);
                a0VarM.a(a0VarS);
                a0VarM.f55637a = fVar.g();
                a0VarS = a0VarM;
            }
        }
        if (a0VarS2.f55637a != 1) {
            fVar.n(yVar);
        }
        return a0VarS;
    }
}
