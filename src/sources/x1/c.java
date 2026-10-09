package x1;

import java.util.Arrays;
import java.util.HashMap;
import y.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f55652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f55653p;

    public c(long j11, j jVar, fz.c cVar, fz.c cVar2, b bVar) {
        super(j11, jVar, cVar, cVar2);
        this.f55652o = bVar;
        bVar.k();
    }

    @Override // x1.b, x1.f
    public final void c() {
        if (this.f55671c) {
            return;
        }
        super.c();
        if (this.f55653p) {
            return;
        }
        this.f55653p = true;
        this.f55652o.l();
    }

    @Override // x1.b
    public final q w() throws Throwable {
        c cVar;
        b bVar = this.f55652o;
        if (bVar.m || bVar.f55671c) {
            return new g(this);
        }
        j0 j0Var = this.f55643h;
        long j11 = this.f55670b;
        HashMap mapB = j0Var != null ? l.b(bVar.g(), this, this.f55652o.d()) : null;
        Object obj = l.f55691c;
        synchronized (obj) {
            try {
                l.c(this);
                try {
                    if (j0Var == null || j0Var.f56723d == 0) {
                        cVar = this;
                        a();
                    } else {
                        cVar = this;
                        q qVarZ = cVar.z(this.f55652o.g(), j0Var, mapB, this.f55652o.d());
                        if (!qVarZ.equals(h.f55674c)) {
                            return qVarZ;
                        }
                        j0 j0VarX = cVar.f55652o.x();
                        if (j0VarX != null) {
                            j0VarX.k(j0Var);
                        } else {
                            cVar.f55652o.B(j0Var);
                            cVar.f55643h = null;
                        }
                    }
                    if (kotlin.jvm.internal.m.i(cVar.f55652o.g(), j11) < 0) {
                        cVar.f55652o.v();
                    }
                    b bVar2 = cVar.f55652o;
                    bVar2.r(bVar2.d().d(j11).b(cVar.f55645j));
                    cVar.f55652o.A(j11);
                    b bVar3 = cVar.f55652o;
                    int i11 = cVar.f55672d;
                    cVar.f55672d = -1;
                    if (i11 >= 0) {
                        int[] iArr = bVar3.f55646k;
                        kotlin.jvm.internal.m.f(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i11;
                        bVar3.f55646k = iArrCopyOf;
                    } else {
                        bVar3.getClass();
                    }
                    b bVar4 = cVar.f55652o;
                    j jVar = cVar.f55645j;
                    bVar4.getClass();
                    synchronized (obj) {
                        bVar4.f55645j = bVar4.f55645j.f(jVar);
                        b bVar5 = cVar.f55652o;
                        int[] iArr2 = cVar.f55646k;
                        bVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = bVar5.f55646k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                                kotlin.jvm.internal.m.c(iArrCopyOf2);
                                iArr2 = iArrCopyOf2;
                            }
                            bVar5.f55646k = iArr2;
                        }
                    }
                    cVar.m = true;
                    if (!cVar.f55653p) {
                        cVar.f55653p = true;
                        cVar.f55652o.l();
                    }
                    return h.f55674c;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
