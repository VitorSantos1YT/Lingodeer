package q7;

import x7.y;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d {
    public final c L;
    public ob.c M;
    public long N;
    public volatile boolean O;

    public i(d7.f fVar, d7.h hVar, p pVar, int i11, Object obj, c cVar) {
        super(fVar, hVar, 2, pVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.L = cVar;
    }

    @Override // t7.l
    public final void e() {
        if (this.N == 0) {
            this.L.a(this.M, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            d7.h hVarA = this.f47525b.a(this.N);
            d7.p pVar = this.K;
            x7.j jVar = new x7.j(pVar, hVarA.f23228e, pVar.u(hVarA));
            while (!this.O) {
                try {
                    int iG = this.L.f47517a.g(jVar, c.L);
                    boolean z11 = false;
                    b7.a.j(iG != 1);
                    if (iG == 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.N = jVar.f55901d - this.f47525b.f23228e;
                    y yVar = this.L.H;
                    throw th2;
                }
            }
            this.N = jVar.f55901d - this.f47525b.f23228e;
            y yVar2 = this.L.H;
            com.bumptech.glide.e.j(this.K);
        } catch (Throwable th3) {
            com.bumptech.glide.e.j(this.K);
            throw th3;
        }
    }

    @Override // t7.l
    public final void k() {
        this.O = true;
    }
}
