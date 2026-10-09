package uz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class w0 extends vz.a implements o0, i, vz.l {
    public Object[] H;
    public long K;
    public long L;
    public int M;
    public int N;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53427f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tz.a f53428t;

    public w0(int i11, int i12, tz.a aVar) {
        this.f53426e = i11;
        this.f53427f = i12;
        this.f53428t = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (((uz.l1) r9).a(r0) == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wy.a l(uz.w0 r8, uz.j r9, vy.d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz.w0.l(uz.w0, uz.j, vy.d):wy.a");
    }

    @Override // uz.s0
    public final List a() {
        synchronized (this) {
            int iP = (int) ((p() + ((long) this.M)) - this.K);
            if (iP == 0) {
                return ry.r.f50854a;
            }
            ArrayList arrayList = new ArrayList(iP);
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.c(objArr);
            for (int i11 = 0; i11 < iP; i11++) {
                arrayList.add(objArr[((int) (this.K + ((long) i11))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // vz.l
    public final i b(vy.i iVar, int i11, tz.a aVar) {
        return x0.x(this, iVar, i11, aVar);
    }

    @Override // uz.o0
    public final void c() throws Throwable {
        synchronized (this) {
            try {
                try {
                    u(p() + ((long) this.M), this.L, p() + ((long) this.M), p() + ((long) this.M) + ((long) this.N));
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) {
        return l(this, jVar, dVar);
    }

    @Override // uz.o0
    public final boolean d(Object obj) {
        int i11;
        boolean z11;
        vy.d[] dVarArrO = vz.b.f54328a;
        synchronized (this) {
            if (r(obj)) {
                dVarArrO = o(dVarArrO);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        for (vy.d dVar : dVarArrO) {
            if (dVar != null) {
                dVar.resumeWith(qy.b0.f48488a);
            }
        }
        return z11;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) throws Throwable {
        Throwable th2;
        vy.d[] dVarArrO;
        t0 t0Var;
        if (d(obj)) {
            return qy.b0.f48488a;
        }
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        vy.d[] dVarArrO2 = vz.b.f54328a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        mVar.resumeWith(qy.b0.f48488a);
                        dVarArrO = o(dVarArrO2);
                        t0Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        t0 t0Var2 = new t0(this, p() + ((long) (this.M + this.N)), obj, mVar);
                        n(t0Var2);
                        this.N++;
                        if (this.f53427f == 0) {
                            dVarArrO2 = o(dVarArrO2);
                        }
                        dVarArrO = dVarArrO2;
                        t0Var = t0Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (t0Var != null) {
                    mVar.v(new rz.j(t0Var, 2));
                }
                for (vy.d dVar2 : dVarArrO) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(qy.b0.f48488a);
                    }
                }
                Object objR = mVar.r();
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                if (objR != aVar) {
                    objR = qy.b0.f48488a;
                }
                return objR == aVar ? objR : qy.b0.f48488a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // vz.a
    public final vz.c f() {
        y0 y0Var = new y0();
        y0Var.f53441a = -1L;
        return y0Var;
    }

    @Override // vz.a
    public final vz.c[] g() {
        return new y0[2];
    }

    public final Object j(y0 y0Var, v0 v0Var) {
        rz.m mVar = new rz.m(1, ue.f.x(v0Var));
        mVar.s();
        synchronized (this) {
            try {
                if (s(y0Var) < 0) {
                    y0Var.f53442b = mVar;
                } else {
                    mVar.resumeWith(qy.b0.f48488a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objR = mVar.r();
        return objR == wy.a.COROUTINE_SUSPENDED ? objR : qy.b0.f48488a;
    }

    public final void k() {
        if (this.f53427f != 0 || this.N > 1) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.c(objArr);
            while (this.N > 0) {
                long jP = p();
                int i11 = this.M;
                int i12 = this.N;
                if (objArr[((int) ((jP + ((long) (i11 + i12))) - 1)) & (objArr.length - 1)] != x0.f53434a) {
                    return;
                }
                this.N = i12 - 1;
                x0.e(objArr, p() + ((long) (this.M + this.N)), null);
            }
        }
    }

    public final void m() {
        vz.c[] cVarArr;
        Object[] objArr = this.H;
        kotlin.jvm.internal.m.c(objArr);
        x0.e(objArr, p(), null);
        this.M--;
        long jP = p() + 1;
        if (this.K < jP) {
            this.K = jP;
        }
        if (this.L < jP) {
            if (this.f54325b != 0 && (cVarArr = this.f54324a) != null) {
                for (vz.c cVar : cVarArr) {
                    if (cVar != null) {
                        y0 y0Var = (y0) cVar;
                        long j11 = y0Var.f53441a;
                        if (j11 >= 0 && j11 < jP) {
                            y0Var.f53441a = jP;
                        }
                    }
                }
            }
            this.L = jP;
        }
    }

    public final void n(Object obj) {
        int i11 = this.M + this.N;
        Object[] objArrQ = this.H;
        if (objArrQ == null) {
            objArrQ = q(0, 2, null);
        } else if (i11 >= objArrQ.length) {
            objArrQ = q(i11, objArrQ.length * 2, objArrQ);
        }
        x0.e(objArrQ, p() + ((long) i11), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [vy.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final vy.d[] o(vy.d[] dVarArr) {
        vz.c[] cVarArr;
        y0 y0Var;
        rz.m mVar;
        int length = dVarArr.length;
        if (this.f54325b != 0 && (cVarArr = this.f54324a) != null) {
            int length2 = cVarArr.length;
            int i11 = 0;
            while (i11 < length2) {
                vz.c cVar = cVarArr[i11];
                if (cVar == null || (mVar = (y0Var = (y0) cVar).f53442b) == null || s(y0Var) < 0) {
                    dVarArr = dVarArr;
                } else {
                    if (length >= dVarArr.length) {
                        dVarArr = dVarArr;
                        dVarArr = dVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
                        dVarArr = objArrCopyOf;
                    }
                    dVarArr = dVarArr;
                    dVarArr = dVarArr;
                    ((vy.d[]) dVarArr)[length] = mVar;
                    y0Var.f53442b = null;
                    length++;
                }
                i11++;
                dVarArr = dVarArr;
            }
            dVarArr = dVarArr;
        }
        return (vy.d[]) dVarArr;
    }

    public final long p() {
        return Math.min(this.L, this.K);
    }

    public final Object[] q(int i11, int i12, Object[] objArr) {
        if (i12 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i12];
        this.H = objArr2;
        if (objArr != null) {
            long jP = p();
            for (int i13 = 0; i13 < i11; i13++) {
                long j11 = ((long) i13) + jP;
                x0.e(objArr2, j11, objArr[((int) j11) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    public final boolean r(Object obj) {
        int i11;
        long jP;
        long j11;
        int i12 = this.f54325b;
        int i13 = this.f53426e;
        if (i12 != 0) {
            int i14 = this.M;
            int i15 = this.f53427f;
            if (i14 < i15 || this.L > this.K) {
                n(obj);
                i11 = this.M + 1;
                this.M = i11;
                if (i11 > i15) {
                    m();
                }
                jP = p() + ((long) this.M);
                j11 = this.K;
                if (((int) (jP - j11)) > i13) {
                    u(1 + j11, this.L, p() + ((long) this.M), p() + ((long) this.M) + ((long) this.N));
                }
            } else {
                int i16 = u0.f53408a[this.f53428t.ordinal()];
                if (i16 == 1) {
                    return false;
                }
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n(obj);
                    i11 = this.M + 1;
                    this.M = i11;
                    if (i11 > i15) {
                        m();
                    }
                    jP = p() + ((long) this.M);
                    j11 = this.K;
                    if (((int) (jP - j11)) > i13) {
                        u(1 + j11, this.L, p() + ((long) this.M), p() + ((long) this.M) + ((long) this.N));
                    }
                }
            }
        } else if (i13 != 0) {
            n(obj);
            int i17 = this.M + 1;
            this.M = i17;
            if (i17 > i13) {
                m();
            }
            this.L = p() + ((long) this.M);
            return true;
        }
        return true;
    }

    public final long s(y0 y0Var) {
        long j11 = y0Var.f53441a;
        if (j11 < p() + ((long) this.M)) {
            return j11;
        }
        if (this.f53427f <= 0 && j11 <= p() && this.N != 0) {
            return j11;
        }
        return -1L;
    }

    public final Object t(y0 y0Var) {
        Object obj;
        vy.d[] dVarArrV = vz.b.f54328a;
        synchronized (this) {
            try {
                long jS = s(y0Var);
                if (jS < 0) {
                    obj = x0.f53434a;
                } else {
                    long j11 = y0Var.f53441a;
                    Object[] objArr = this.H;
                    kotlin.jvm.internal.m.c(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof t0) {
                        obj2 = ((t0) obj2).f53402c;
                    }
                    y0Var.f53441a = jS + 1;
                    Object obj3 = obj2;
                    dVarArrV = v(j11);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (vy.d dVar : dVarArrV) {
            if (dVar != null) {
                dVar.resumeWith(qy.b0.f48488a);
            }
        }
        return obj;
    }

    public final void u(long j11, long j12, long j13, long j14) {
        long jMin = Math.min(j12, j11);
        for (long jP = p(); jP < jMin; jP++) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.c(objArr);
            x0.e(objArr, jP, null);
        }
        this.K = j11;
        this.L = j12;
        this.M = (int) (j13 - jMin);
        this.N = (int) (j14 - j13);
    }

    public final vy.d[] v(long j11) {
        long j12;
        long j13;
        vy.d[] dVarArr;
        vy.d[] dVarArr2;
        vz.c[] cVarArr;
        com.android.billingclient.api.a aVar = x0.f53434a;
        vy.d[] dVarArr3 = vz.b.f54328a;
        if (j11 <= this.L) {
            long jP = p();
            long j14 = ((long) this.M) + jP;
            int i11 = this.f53427f;
            if (i11 == 0 && this.N > 0) {
                j14++;
            }
            int i12 = 0;
            if (this.f54325b != 0 && (cVarArr = this.f54324a) != null) {
                for (vz.c cVar : cVarArr) {
                    if (cVar != null) {
                        long j15 = ((y0) cVar).f53441a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.L) {
                long jP2 = p() + ((long) this.M);
                int iMin = this.f54325b > 0 ? Math.min(this.N, i11 - ((int) (jP2 - j14))) : this.N;
                long j16 = ((long) this.N) + jP2;
                if (iMin > 0) {
                    j13 = 1;
                    Object[] objArr = this.H;
                    kotlin.jvm.internal.m.c(objArr);
                    vy.d[] dVarArr4 = new vy.d[iMin];
                    long j17 = jP2;
                    while (true) {
                        if (jP2 >= j16) {
                            dVarArr2 = dVarArr4;
                            j12 = j14;
                            break;
                        }
                        dVarArr2 = dVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jP2)];
                        if (obj != aVar) {
                            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            t0 t0Var = (t0) obj;
                            int i13 = i12 + 1;
                            j12 = j14;
                            dVarArr2[i12] = t0Var.f53403d;
                            x0.e(objArr, jP2, aVar);
                            x0.e(objArr, j17, t0Var.f53402c);
                            j17++;
                            if (i13 >= iMin) {
                                break;
                            }
                            i12 = i13;
                        } else {
                            j12 = j14;
                        }
                        jP2++;
                        dVarArr4 = dVarArr2;
                        j14 = j12;
                    }
                    jP2 = j17;
                    dVarArr = dVarArr2;
                } else {
                    j12 = j14;
                    j13 = 1;
                    dVarArr = dVarArr3;
                }
                int i14 = (int) (jP2 - jP);
                long j18 = this.f54325b == 0 ? jP2 : j12;
                long jMax = Math.max(this.K, jP2 - ((long) Math.min(this.f53426e, i14)));
                if (i11 == 0 && jMax < j16) {
                    Object[] objArr2 = this.H;
                    kotlin.jvm.internal.m.c(objArr2);
                    if (kotlin.jvm.internal.m.a(objArr2[((int) jMax) & (objArr2.length - 1)], aVar)) {
                        jP2 += j13;
                        jMax += j13;
                    }
                }
                u(jMax, j18, jP2, j16);
                k();
                return dVarArr.length == 0 ? dVarArr : o(dVarArr);
            }
        }
        return dVarArr3;
    }
}
