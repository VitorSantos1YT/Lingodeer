package q7;

import b7.w;
import p7.y0;
import x7.e0;
import y6.d0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {
    public final int Q;
    public final long R;
    public final c S;
    public long T;
    public volatile boolean U;
    public boolean V;

    public h(d7.f fVar, d7.h hVar, p pVar, int i11, Object obj, long j11, long j12, long j13, long j14, long j15, int i12, long j16, c cVar) {
        super(fVar, hVar, pVar, i11, obj, j11, j12, j13, j14, j15);
        this.Q = i12;
        this.R = j16;
        this.S = cVar;
    }

    @Override // q7.a
    public final long b() {
        return this.L + ((long) this.Q);
    }

    @Override // q7.a
    public final boolean c() {
        return this.V;
    }

    @Override // t7.l
    public final void e() {
        ob.c cVar = this.O;
        b7.a.k(cVar);
        if (this.T == 0) {
            long j11 = this.R;
            for (y0 y0Var : (y0[]) cVar.f44800c) {
                if (y0Var.E != j11) {
                    y0Var.E = j11;
                    y0Var.f46562z = true;
                }
            }
            c cVar2 = this.S;
            long j12 = this.M;
            long j13 = j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.R;
            long j14 = this.N;
            cVar2.a(cVar, j13, j14 != -9223372036854775807L ? j14 - this.R : -9223372036854775807L);
        }
        try {
            d7.h hVarA = this.f47525b.a(this.T);
            d7.p pVar = this.K;
            x7.j jVar = new x7.j(pVar, hVarA.f23228e, pVar.u(hVarA));
            while (!this.U) {
                try {
                    int iG = this.S.f47517a.g(jVar, c.L);
                    b7.a.j(iG != 1);
                    if (!(iG == 0)) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.T = jVar.f55901d - this.f47525b.f23228e;
                    throw th2;
                }
            }
            p pVar2 = this.f47527d;
            String str = pVar2.m;
            int i11 = pVar2.M;
            int i12 = pVar2.N;
            if (d0.l(str) && ((i11 > 1 || i12 > 1) && i11 != -1 && i12 != -1)) {
                e0 e0VarU = cVar.u(4);
                int i13 = i11 * i12;
                long j15 = (this.H - this.f47530t) / ((long) i13);
                for (int i14 = 1; i14 < i13; i14++) {
                    e0VarU.a(new w(), 0, 0);
                    e0VarU.d(((long) i14) * j15, 0, 0, 0, null);
                }
            }
            this.T = jVar.f55901d - this.f47525b.f23228e;
            com.bumptech.glide.e.j(this.K);
            this.V = !this.U;
        } catch (Throwable th3) {
            com.bumptech.glide.e.j(this.K);
            throw th3;
        }
    }

    @Override // t7.l
    public final void k() {
        this.U = true;
    }
}
