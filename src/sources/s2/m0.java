package s2;

import a0.o0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import rz.z1;
import y2.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends z1.q implements w, v3.c, y1 {
    public Object Q;
    public Object R;
    public Object[] S;
    public xy.i T;
    public PointerInputEventHandler U;
    public z1 V;
    public l W = g0.f51302a;
    public final n1.e X;
    public final n1.e Y;
    public final n1.e Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public l f51334a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f51335b0;

    public m0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.Q = obj;
        this.R = obj2;
        this.S = objArr;
        this.U = pointerInputEventHandler;
        n1.e eVar = new n1.e(new k0[16]);
        this.X = eVar;
        this.Y = eVar;
        this.Z = new n1.e(new k0[16]);
        this.f51335b0 = 0L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // y2.y1
    public final void G() {
        l lVar = this.f51334a0;
        if (lVar == null) {
            return;
        }
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((t) r9.get(i11)).f51346d) {
                ArrayList arrayList = new ArrayList(r9.size());
                int size2 = r9.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    t tVar = (t) r9.get(i12);
                    long j11 = tVar.f51343a;
                    long j12 = tVar.f51345c;
                    long j13 = tVar.f51344b;
                    float f5 = tVar.f51347e;
                    boolean z11 = tVar.f51346d;
                    arrayList.add(new t(j11, j13, j12, false, f5, j13, j12, z11, z11, tVar.f51351i, 0L));
                }
                l lVar2 = new l(arrayList, null);
                this.W = lVar2;
                U0(lVar2, m.Initial);
                U0(lVar2, m.Main);
                U0(lVar2, m.Final);
                this.f51334a0 = null;
                return;
            }
        }
    }

    @Override // z1.q
    public final void M0() {
        V0();
    }

    public final Object T0(fz.e eVar, vy.d dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        k0 k0Var = new k0(this, mVar);
        synchronized (this.Y) {
            this.X.c(k0Var);
            new vy.k(ue.f.x(ue.f.o(eVar, k0Var, k0Var)), wy.a.COROUTINE_SUSPENDED).resumeWith(qy.b0.f48488a);
        }
        mVar.u(new o0(k0Var, 27));
        return mVar.r();
    }

    public final void U0(l lVar, m mVar) {
        rz.m mVar2;
        rz.m mVar3;
        synchronized (this.Y) {
            n1.e eVar = this.Z;
            eVar.e(eVar.f43114c, this.X);
        }
        try {
            int i11 = l0.f51333a[mVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                n1.e eVar2 = this.Z;
                Object[] objArr = eVar2.f43112a;
                int i12 = eVar2.f43114c;
                for (int i13 = 0; i13 < i12; i13++) {
                    k0 k0Var = (k0) objArr[i13];
                    if (mVar == k0Var.f51325d && (mVar2 = k0Var.f51324c) != null) {
                        k0Var.f51324c = null;
                        mVar2.resumeWith(lVar);
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                n1.e eVar3 = this.Z;
                int i14 = eVar3.f43114c - 1;
                Object[] objArr2 = eVar3.f43112a;
                if (i14 < objArr2.length) {
                    while (i14 >= 0) {
                        k0 k0Var2 = (k0) objArr2[i14];
                        if (mVar == k0Var2.f51325d && (mVar3 = k0Var2.f51324c) != null) {
                            k0Var2.f51324c = null;
                            mVar3.resumeWith(lVar);
                        }
                        i14--;
                    }
                }
            }
            this.Z.h();
        } catch (Throwable th2) {
            this.Z.h();
            throw th2;
        }
    }

    public final void V0() {
        z1 z1Var = this.V;
        if (z1Var != null) {
            z1Var.r(new PointerInputResetException());
            this.V = null;
        }
    }

    @Override // v3.c
    public final float Z() {
        return y2.f.x(this).f56881b0.Z();
    }

    @Override // y2.m
    public final void c() {
        V0();
    }

    @Override // v3.c
    public final float getDensity() {
        return y2.f.x(this).f56881b0.getDensity();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // y2.y1
    public final void q(l lVar, m mVar, long j11) {
        this.f51335b0 = j11;
        if (mVar == m.Initial) {
            this.W = lVar;
        }
        vy.d dVar = null;
        if (this.V == null) {
            this.V = rz.e0.B(H0(), null, rz.d0.UNDISPATCHED, new mv.f0(this, dVar, 24), 1);
        }
        U0(lVar, mVar);
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!s.c((t) r9.get(i11))) {
                this.f51334a0 = lVar;
            }
        }
        lVar = null;
        this.f51334a0 = lVar;
    }

    @Override // y2.y1
    public final void x0() {
        V0();
    }
}
