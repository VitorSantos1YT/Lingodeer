package q7;

import p7.y0;
import x7.e0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a {
    public final int Q;
    public final p R;
    public long S;
    public boolean T;

    public k(d7.f fVar, d7.h hVar, p pVar, int i11, Object obj, long j11, long j12, long j13, int i12, p pVar2) {
        super(fVar, hVar, pVar, i11, obj, j11, j12, -9223372036854775807L, -9223372036854775807L, j13);
        this.Q = i12;
        this.R = pVar2;
    }

    @Override // q7.a
    public final boolean c() {
        return this.T;
    }

    @Override // t7.l
    public final void e() {
        d7.p pVar = this.K;
        ob.c cVar = this.O;
        b7.a.k(cVar);
        for (y0 y0Var : (y0[]) cVar.f44800c) {
            if (y0Var.E != 0) {
                y0Var.E = 0L;
                y0Var.f46562z = true;
            }
        }
        e0 e0VarU = cVar.u(this.Q);
        e0VarU.b(this.R);
        try {
            long jU = pVar.u(this.f47525b.a(this.S));
            if (jU != -1) {
                jU += this.S;
            }
            x7.j jVar = new x7.j(this.K, this.S, jU);
            for (int iC = 0; iC != -1; iC = e0VarU.c(jVar, Integer.MAX_VALUE, true)) {
                this.S += (long) iC;
            }
            e0VarU.d(this.f47530t, 1, (int) this.S, 0, null);
            com.bumptech.glide.e.j(pVar);
            this.T = true;
        } catch (Throwable th2) {
            com.bumptech.glide.e.j(pVar);
            throw th2;
        }
    }

    @Override // t7.l
    public final void k() {
    }
}
