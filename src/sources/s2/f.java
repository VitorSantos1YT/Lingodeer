package s2;

import y2.e2;
import y2.g2;
import y2.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends z1.q implements g2, y1, y2.l {
    public y2.p Q;
    public a R;
    public boolean S;

    public f(a aVar, y2.p pVar) {
        this.Q = pVar;
        this.R = aVar;
    }

    @Override // y2.y1
    public final void G() {
        X0();
    }

    @Override // z1.q
    public final void M0() {
        X0();
    }

    public final void T0() {
        a aVar;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        y2.f.B(this, new e(1));
        f fVar = (f) yVar.f38361a;
        if (fVar == null || (aVar = fVar.R) == null) {
            aVar = this.R;
        }
        U0(aVar);
    }

    public abstract void U0(q qVar);

    public final void V0() {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f38357a = true;
        y2.f.C(this, new c2.f(uVar));
        if (uVar.f38357a) {
            T0();
        }
    }

    public abstract boolean W0(int i11);

    public final void X0() {
        if (this.S) {
            this.S = false;
            if (this.P) {
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                y2.f.B(this, new r2.j(yVar, 1));
                f fVar = (f) yVar.f38361a;
                if (fVar != null) {
                    fVar.T0();
                } else {
                    U0(null);
                }
            }
        }
    }

    @Override // y2.y1
    public final long k() {
        y2.p pVar = this.Q;
        if (pVar == null) {
            return e2.f56851a;
        }
        v3.c cVar = y2.f.x(this).f56881b0;
        int i11 = e2.f56852b;
        return y2.d.d(cVar.n0(pVar.f56985a), cVar.n0(pVar.f56986b), cVar.n0(pVar.f56987c), cVar.n0(pVar.f56988d));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // y2.y1
    public final void q(l lVar, m mVar, long j11) {
        if (mVar == m.Main) {
            ?? r9 = lVar.f51328a;
            int size = r9.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (W0(((t) r9.get(i11)).f51351i)) {
                    int i12 = lVar.f51332e;
                    if (i12 == 4) {
                        this.S = true;
                        V0();
                        return;
                    } else {
                        if (i12 == 5) {
                            X0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
