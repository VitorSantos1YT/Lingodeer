package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends x1.a0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f39291h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y.d0 f39294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f39295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39296g;

    public f0(long j11) {
        super(j11);
        y.d0 d0Var = y.n0.f56743a;
        kotlin.jvm.internal.m.d(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f39294e = d0Var;
        this.f39295f = f39291h;
    }

    @Override // x1.a0
    public final void a(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        f0 f0Var = (f0) a0Var;
        this.f39294e = f0Var.f39294e;
        this.f39295f = f0Var.f39295f;
        this.f39296g = f0Var.f39296g;
    }

    @Override // x1.a0
    public final x1.a0 b(long j11) {
        return new f0(j11);
    }

    public final boolean c(g0 g0Var, x1.f fVar) {
        boolean z11;
        boolean z12;
        Object obj = x1.l.f55691c;
        synchronized (obj) {
            z11 = true;
            z12 = (this.f39292c == fVar.g() && this.f39293d == fVar.h()) ? false : true;
        }
        if (this.f39295f == f39291h || (z12 && this.f39296g != d(g0Var, fVar))) {
            z11 = false;
        }
        if (!z11 || !z12) {
            return z11;
        }
        synchronized (obj) {
            this.f39292c = fVar.g();
            this.f39293d = fVar.h();
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[LOOP:4: B:48:0x00d2->B:49:0x00d4, LOOP_END] */
    public final int d(g0 g0Var, x1.f fVar) throws Throwable {
        y.d0 d0Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i11;
        int i12;
        long[] jArr;
        int i13;
        int i14;
        int i15;
        x1.a0 a0VarL;
        synchronized (x1.l.f55691c) {
            d0Var = this.f39294e;
        }
        int i16 = 7;
        if (d0Var.f56681e == 0) {
            return 7;
        }
        n1.e eVarR = t.r();
        Object[] objArr2 = eVarR.f43112a;
        int i17 = eVarR.f43114c;
        for (int i18 = 0; i18 < i17; i18++) {
            ((r) objArr2[i18]).b();
        }
        try {
            Object[] objArr3 = d0Var.f56678b;
            int[] iArr = d0Var.f56679c;
            long[] jArr2 = d0Var.f56677a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i19 = 0;
                while (true) {
                    long j11 = jArr2[i19];
                    if ((((~j11) << i16) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i21 = 8;
                        int i22 = 8 - ((~(i19 - length)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j11 & 255) < 128) {
                                int i24 = (i19 << 3) + i23;
                                Object obj = objArr3[i24];
                                i14 = i16;
                                int i25 = iArr[i24];
                                i15 = i21;
                                x1.y yVar = (x1.y) obj;
                                if (i25 == 1) {
                                    if (yVar instanceof g0) {
                                        try {
                                            g0 g0Var2 = (g0) yVar;
                                            a0VarL = g0Var2.l((f0) x1.l.i(g0Var2.f39307d, fVar), fVar, false, g0Var2.f39305b);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Object[] objArr4 = eVarR.f43112a;
                                            int i26 = eVarR.f43114c;
                                            for (int i27 = 0; i27 < i26; i27++) {
                                                ((r) objArr4[i27]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        a0VarL = x1.l.i(yVar.b(), fVar);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(a0VarL)) * 31) + Long.hashCode(a0VarL.f55637a);
                                }
                            } else {
                                i14 = i16;
                                i15 = i21;
                            }
                            j11 >>= i15;
                            i23++;
                            i16 = i14;
                            jArr2 = jArr2;
                            i21 = i15;
                        }
                        jArr = jArr2;
                        i13 = i16;
                        if (i22 != i21) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        i13 = i16;
                    }
                    if (i19 != length) {
                        i19++;
                        i16 = i13;
                        jArr2 = jArr;
                    } else {
                        i16 = iIdentityHashCode;
                    }
                }
                objArr = eVarR.f43112a;
                i11 = eVarR.f43114c;
                for (i12 = 0; i12 < i11; i12++) {
                    ((r) objArr[i12]).a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i16;
            objArr = eVarR.f43112a;
            i11 = eVarR.f43114c;
            while (i12 < i11) {
                ((r) objArr[i12]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
