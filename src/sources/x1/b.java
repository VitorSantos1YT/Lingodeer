package x1;

import java.util.ArrayList;
import java.util.HashMap;
import l1.r1;
import y.j0;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f55639n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.c f55640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fz.c f55641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f55643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f55644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f55645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f55646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f55647l;
    public boolean m;

    public b(long j11, j jVar, fz.c cVar, fz.c cVar2) {
        super(j11, jVar);
        this.f55640e = cVar;
        this.f55641f = cVar2;
        this.f55645j = j.f55681e;
        this.f55646k = f55639n;
        this.f55647l = 1;
    }

    public final void A(long j11) {
        synchronized (l.f55691c) {
            this.f55645j = this.f55645j.g(j11);
        }
    }

    public void B(j0 j0Var) {
        this.f55643h = j0Var;
    }

    public b C(fz.c cVar, fz.c cVar2) {
        if (this.f55671c) {
            r1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.f55672d < 0) {
            r1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f55691c;
        synchronized (obj) {
            try {
                long j11 = l.f55693e;
                long j12 = 1;
                l.f55693e = j11 + j12;
                l.f55692d = l.f55692d.g(j11);
                j jVarD = d();
                r(jVarD.g(j11));
                try {
                    c cVar3 = new c(j11, l.d(jVarD, g() + j12, j11), l.k(cVar, e(), true), l.l(cVar2, i()), this);
                    if (this.m || this.f55671c) {
                        return cVar3;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j13 = l.f55693e;
                        l.f55693e = j13 + j12;
                        s(j13);
                        l.f55692d = l.f55692d.g(g());
                    }
                    r(l.d(d(), jG + j12, g()));
                    return cVar3;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // x1.f
    public final void b() {
        l.f55692d = l.f55692d.d(g()).b(this.f55645j);
    }

    @Override // x1.f
    public void c() {
        if (this.f55671c) {
            return;
        }
        this.f55671c = true;
        synchronized (l.f55691c) {
            o();
        }
        l();
    }

    @Override // x1.f
    public boolean f() {
        return false;
    }

    @Override // x1.f
    public int h() {
        return this.f55642g;
    }

    @Override // x1.f
    public fz.c i() {
        return this.f55641f;
    }

    @Override // x1.f
    public void k() {
        this.f55647l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // x1.f
    public void l() {
        if (this.f55647l <= 0) {
            r1.a("no pending nested snapshots");
        }
        int i11 = this.f55647l - 1;
        this.f55647l = i11;
        if (i11 != 0 || this.m) {
            return;
        }
        j0 j0VarX = x();
        if (j0VarX != null) {
            if (this.m) {
                r1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = j0VarX.f56721b;
            long[] jArr = j0VarX.f56720a;
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
                                for (a0 a0VarB = ((y) objArr[(i12 << 3) + i14]).b(); a0VarB != null; a0VarB = a0VarB.f55638b) {
                                    long j12 = a0VarB.f55637a;
                                    if (j12 == jG || ry.m.i0(this.f55645j, Long.valueOf(j12))) {
                                        vr.a aVar = l.f55689a;
                                        a0VarB.f55637a = 0L;
                                    }
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // x1.f
    public void m() {
        if (this.m || this.f55671c) {
            return;
        }
        v();
    }

    @Override // x1.f
    public void n(y yVar) {
        j0 j0VarX = x();
        if (j0VarX == null) {
            j0 j0Var = s0.f56760a;
            j0VarX = new j0();
            B(j0VarX);
        }
        j0VarX.a(yVar);
    }

    @Override // x1.f
    public final void p() {
        int length = this.f55646k.length;
        for (int i11 = 0; i11 < length; i11++) {
            l.u(this.f55646k[i11]);
        }
        o();
    }

    @Override // x1.f
    public void t(int i11) {
        this.f55642g = i11;
    }

    @Override // x1.f
    public f u(fz.c cVar) throws Throwable {
        if (this.f55671c) {
            r1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.f55672d < 0) {
            r1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = l.f55691c;
        synchronized (obj) {
            try {
                long j11 = l.f55693e;
                long j12 = 1;
                l.f55693e = j11 + j12;
                l.f55692d = l.f55692d.g(j11);
                try {
                    d dVar = new d(j11, l.d(d(), jG + j12, j11), l.k(cVar, e(), true), this);
                    if (this.m || this.f55671c) {
                        return dVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j13 = l.f55693e;
                        l.f55693e = j13 + j12;
                        s(j13);
                        l.f55692d = l.f55692d.g(g());
                    }
                    r(l.d(d(), jG2 + j12, g()));
                    return dVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v() {
        long j11;
        A(g());
        if (this.m || this.f55671c) {
            return;
        }
        long jG = g();
        synchronized (l.f55691c) {
            long j12 = l.f55693e;
            j11 = 1;
            l.f55693e = j12 + j11;
            s(j12);
            l.f55692d = l.f55692d.g(g());
        }
        r(l.d(d(), jG + j11, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    public q w() {
        HashMap mapB;
        ?? r9;
        j0 j0Var;
        long j11;
        long j12;
        j0 j0VarX = x();
        if (j0VarX != null) {
            long j13 = l.f55698j.f55670b;
            mapB = l.b(j13, this, l.f55692d.d(j13));
        } else {
            mapB = null;
        }
        ry.r rVar = ry.r.f50854a;
        synchronized (l.f55691c) {
            try {
                l.c(this);
                if (j0VarX == null || j0VarX.f56723d == 0) {
                    b();
                    a aVar = l.f55698j;
                    j0 j0Var2 = aVar.f55643h;
                    l.v(aVar, l.f55689a);
                    if (j0Var2 == null || !j0Var2.h()) {
                        r9 = rVar;
                        j0Var = null;
                    } else {
                        r9 = l.f55696h;
                        j0Var = j0Var2;
                    }
                } else {
                    a aVar2 = l.f55698j;
                    q qVarZ = z(l.f55693e, j0VarX, mapB, l.f55692d.d(aVar2.f55670b));
                    if (!qVarZ.equals(h.f55674c)) {
                        return qVarZ;
                    }
                    b();
                    j0Var = aVar2.f55643h;
                    l.v(aVar2, l.f55689a);
                    B(null);
                    aVar2.f55643h = null;
                    r9 = l.f55696h;
                }
                this.m = true;
                if (j0Var != null) {
                    n1.h hVar = new n1.h(j0Var);
                    if (!j0Var.g()) {
                        int size = r9.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((fz.e) r9.get(i11)).invoke(hVar, this);
                        }
                    }
                }
                if (j0VarX != null && j0VarX.h()) {
                    n1.h hVar2 = new n1.h(j0VarX);
                    int size2 = r9.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((fz.e) r9.get(i12)).invoke(hVar2, this);
                    }
                }
                synchronized (l.f55691c) {
                    try {
                        p();
                        l.f();
                        if (j0Var != null) {
                            Object[] objArr = j0Var.f56721b;
                            long[] jArr = j0Var.f56720a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i13 = 0;
                                j11 = 128;
                                while (true) {
                                    long j14 = jArr[i13];
                                    j12 = 255;
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i13 != length) {
                                            break;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j14 & 255) < 128) {
                                                l.q((y) objArr[(i13 << 3) + i15]);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length) {
                                            break;
                                        }
                                        i13++;
                                    }
                                }
                            } else {
                                j11 = 128;
                                j12 = 255;
                            }
                        } else {
                            j11 = 128;
                            j12 = 255;
                        }
                        if (j0VarX != null) {
                            Object[] objArr2 = j0VarX.f56721b;
                            long[] jArr2 = j0VarX.f56720a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j15 = jArr2[i16];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length2) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j15 & j12) < j11) {
                                                l.q((y) objArr2[(i16 << 3) + i18]);
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        }
                                        if (i16 != length2) {
                                            break;
                                        }
                                        i16++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f55644i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i19 = 0; i19 < size3; i19++) {
                                l.q((y) arrayList.get(i19));
                            }
                        }
                        this.f55644i = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return h.f55674c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public j0 x() {
        return this.f55643h;
    }

    @Override // x1.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public fz.c e() {
        return this.f55640e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final q z(long j11, j0 j0Var, HashMap map, j jVar) {
        ArrayList arrayList;
        ArrayList arrayListH0;
        ArrayList arrayList2;
        int size;
        int i11;
        ArrayList arrayList3;
        int size2;
        int i12;
        y yVar;
        a0 a0Var;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        long j12;
        ArrayList arrayList4;
        a0 a0VarD;
        j jVarF = d().g(g()).f(this.f55645j);
        Object[] objArr3 = j0Var.f56721b;
        long[] jArr3 = j0Var.f56720a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i14 = 0;
            arrayList2 = null;
            arrayListH0 = null;
            while (true) {
                long j13 = jArr3[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j13 & 255) < 128) {
                            objArr2 = objArr3;
                            y yVar2 = (y) objArr3[(i14 << 3) + i16];
                            jArr2 = jArr3;
                            a0 a0VarB = yVar2.b();
                            i13 = i16;
                            ArrayList arrayList5 = arrayList2;
                            a0 a0VarS = l.s(a0VarB, j11, jVar);
                            if (a0VarS == null) {
                                jVar3 = jVarF;
                                arrayList4 = arrayListH0;
                                j12 = j13;
                            } else {
                                arrayList4 = arrayListH0;
                                j12 = j13;
                                a0 a0VarS2 = l.s(a0VarB, g(), jVarF);
                                if (a0VarS2 == null) {
                                    jVar3 = jVarF;
                                } else {
                                    jVar3 = jVarF;
                                    if (a0VarS2.f55637a != 1 && !a0VarS.equals(a0VarS2)) {
                                        a0 a0VarS3 = l.s(a0VarB, g(), d());
                                        if (a0VarS3 == null) {
                                            l.r();
                                            throw null;
                                        }
                                        if (map == null || (a0VarD = (a0) map.get(a0VarS)) == null) {
                                            a0VarD = yVar2.d(a0VarS2, a0VarS, a0VarS3);
                                        }
                                        if (a0VarD == null) {
                                            return new g(this);
                                        }
                                        if (!a0VarD.equals(a0VarS3)) {
                                            if (a0VarD.equals(a0VarS)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new qy.l(yVar2, a0VarS.b(g())));
                                                arrayListH0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListH0.add(yVar2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!a0VarD.equals(a0VarS2) ? new qy.l(yVar2, a0VarD) : new qy.l(yVar2, a0VarS2.b(g())));
                                            }
                                        }
                                        arrayListH0 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListH0 = arrayList4;
                        } else {
                            jVar3 = jVarF;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i13 = i16;
                            j12 = j13;
                        }
                        j13 = j12 >> 8;
                        i16 = i13 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarF = jVar3;
                    }
                    jVar2 = jVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i14 != length) {
                    i14++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    jVarF = jVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i12 = 0; i12 < size2; i12++) {
                    qy.l lVar = (qy.l) arrayList2.get(i12);
                    yVar = (y) lVar.f48495a;
                    a0Var = (a0) lVar.f48496b;
                    a0Var.f55637a = j11;
                    synchronized (l.f55691c) {
                        a0Var.f55638b = yVar.b();
                        yVar.g(a0Var);
                    }
                }
            }
            if (arrayListH0 != null) {
                size = arrayListH0.size();
                for (i11 = 0; i11 < size; i11++) {
                    j0Var.l((y) arrayListH0.get(i11));
                }
                arrayList3 = this.f55644i;
                if (arrayList3 != null) {
                    arrayListH0 = ry.m.H0(arrayList3, arrayListH0);
                }
                this.f55644i = arrayListH0;
            }
            return h.f55674c;
        }
        arrayList = null;
        arrayListH0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i12 < size2) {
                qy.l lVar2 = (qy.l) arrayList2.get(i12);
                yVar = (y) lVar2.f48495a;
                a0Var = (a0) lVar2.f48496b;
                a0Var.f55637a = j11;
                synchronized (l.f55691c) {
                    a0Var.f55638b = yVar.b();
                    yVar.g(a0Var);
                }
            }
        }
        if (arrayListH0 != null) {
            size = arrayListH0.size();
            while (i11 < size) {
                j0Var.l((y) arrayListH0.get(i11));
            }
            arrayList3 = this.f55644i;
            if (arrayList3 != null) {
                arrayListH0 = ry.m.H0(arrayList3, arrayListH0);
            }
            this.f55644i = arrayListH0;
        }
        return h.f55674c;
    }
}
