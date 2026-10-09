package l1;

import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends x1.z implements b3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f39305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f39306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0 f39307d = new f0(x1.l.j().g());

    public g0(fz.a aVar, v2 v2Var) {
        this.f39305b = aVar;
        this.f39306c = v2Var;
    }

    @Override // x1.y
    public final x1.a0 b() {
        return this.f39307d;
    }

    @Override // x1.y
    public final void g(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f39307d = (f0) a0Var;
    }

    @Override // l1.b3
    public final Object getValue() {
        fz.c cVarE = x1.l.j().e();
        if (cVarE != null) {
            cVarE.invoke(this);
        }
        x1.f fVarJ = x1.l.j();
        return l((f0) x1.l.i(this.f39307d, fVarJ), fVarJ, true, this.f39305b).f39295f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a3 A[EDGE_INSN: B:101:0x00a3->B:31:0x00a3 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009e, LOOP_END, TryCatch #1 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a3), top: B:93:0x0023 }] */
    public final f0 l(f0 f0Var, x1.f fVar, boolean z11, fz.a aVar) {
        f0 f0Var2;
        v2 v2Var;
        int i11;
        if (f0Var.c(this, fVar)) {
            if (z11) {
                n1.e eVarR = t.r();
                Object[] objArr = eVarR.f43112a;
                int i12 = eVarR.f43114c;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((r) objArr[i13]).b();
                }
                try {
                    y.d0 d0Var = f0Var.f39294e;
                    m4 m4Var = w2.f39494a;
                    t1.f fVar2 = (t1.f) m4Var.e();
                    if (fVar2 == null) {
                        fVar2 = new t1.f();
                        m4Var.m(fVar2);
                    }
                    int i14 = fVar2.f51988a;
                    Object[] objArr2 = d0Var.f56678b;
                    int[] iArr = d0Var.f56679c;
                    long[] jArr = d0Var.f56677a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr[i15];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i15 != length) {
                                    break;
                                    break;
                                }
                                i15++;
                            } else {
                                int i16 = 8;
                                int i17 = 8 - ((~(i15 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j11 & 255) < 128) {
                                        int i19 = (i15 << 3) + i18;
                                        i11 = i16;
                                        x1.y yVar = (x1.y) objArr2[i19];
                                        fVar2.f51988a = i14 + iArr[i19];
                                        fz.c cVarE = fVar.e();
                                        if (cVarE != null) {
                                            cVarE.invoke(yVar);
                                        }
                                    } else {
                                        i11 = i16;
                                    }
                                    j11 >>= i11;
                                    i18++;
                                    i16 = i11;
                                }
                                if (i17 != i16) {
                                    break;
                                }
                                if (i15 != length) {
                                    break;
                                }
                                i15++;
                            }
                        }
                    }
                    fVar2.f51988a = i14;
                } finally {
                    Object[] objArr3 = eVarR.f43112a;
                    int i21 = eVarR.f43114c;
                    for (int i22 = 0; i22 < i21; i22++) {
                        ((r) objArr3[i22]).a();
                    }
                }
            }
            return f0Var;
        }
        y.d0 d0Var2 = new y.d0();
        m4 m4Var2 = w2.f39494a;
        t1.f fVar3 = (t1.f) m4Var2.e();
        if (fVar3 == null) {
            fVar3 = new t1.f();
            m4Var2.m(fVar3);
        }
        int i23 = fVar3.f51988a;
        n1.e eVarR2 = t.r();
        Object[] objArr4 = eVarR2.f43112a;
        int i24 = eVarR2.f43114c;
        for (int i25 = 0; i25 < i24; i25++) {
            ((r) objArr4[i25]).b();
        }
        try {
            fVar3.f51988a = i23 + 1;
            Object objS = re.q.s(new au.a1(this, fVar3, d0Var2, i23, 2), aVar);
            fVar3.f51988a = i23;
            Object[] objArr5 = eVarR2.f43112a;
            int i26 = eVarR2.f43114c;
            for (int i27 = 0; i27 < i26; i27++) {
                ((r) objArr5[i27]).a();
            }
            Object obj = x1.l.f55691c;
            synchronized (obj) {
                try {
                    x1.f fVarJ = x1.l.j();
                    Object obj2 = f0Var.f39295f;
                    if (obj2 == f0.f39291h || (v2Var = this.f39306c) == null || !v2Var.a(objS, obj2)) {
                        f0 f0Var3 = this.f39307d;
                        synchronized (obj) {
                            x1.a0 a0VarM = x1.l.m(f0Var3, this);
                            a0VarM.a(f0Var3);
                            a0VarM.f55637a = fVarJ.g();
                            f0Var2 = (f0) a0VarM;
                            f0Var2.f39294e = d0Var2;
                            f0Var2.f39296g = f0Var2.d(this, fVarJ);
                            f0Var2.f39295f = objS;
                        }
                        return f0Var2;
                    }
                    f0Var.f39294e = d0Var2;
                    f0Var.f39296g = f0Var.d(this, fVarJ);
                    f0Var2 = f0Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            t1.f fVar4 = (t1.f) w2.f39494a.e();
            if (fVar4 == null || fVar4.f51988a != 0) {
                return f0Var2;
            }
            x1.l.j().m();
            synchronized (obj) {
                x1.f fVarJ2 = x1.l.j();
                f0Var2.f39292c = fVarJ2.g();
                f0Var2.f39293d = fVarJ2.h();
                return f0Var2;
            }
        } catch (Throwable th3) {
            Object[] objArr6 = eVarR2.f43112a;
            int i28 = eVarR2.f43114c;
            for (int i29 = 0; i29 < i28; i29++) {
                ((r) objArr6[i29]).a();
            }
            throw th3;
        }
    }

    public final f0 m() {
        x1.f fVarJ = x1.l.j();
        return l((f0) x1.l.i(this.f39307d, fVarJ), fVarJ, false, this.f39305b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        f0 f0Var = (f0) x1.l.h(this.f39307d);
        sb2.append(f0Var.c(this, x1.l.j()) ? String.valueOf(f0Var.f39295f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
