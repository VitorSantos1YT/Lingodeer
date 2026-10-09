package f9;

import b7.w;
import pz.h;
import x7.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27021b;

    public /* synthetic */ e(int i11, long j11, boolean z11) {
        this.f27021b = i11;
        this.f27020a = j11;
    }

    public static e a(n nVar, w wVar) {
        nVar.A(wVar.f4039a, 0, 8);
        wVar.I(0);
        return new e(wVar.j(), wVar.n(), false);
    }

    @Override // pz.h
    public pz.d toInstant() {
        long j11 = pz.d.f47223c.f47225a;
        long j12 = this.f27020a;
        if (j12 >= j11 && j12 <= pz.d.f47224d.f47225a) {
            return pz.f.i(this.f27021b, j12);
        }
        throw new j00.d("The parsed date is outside the range representable by Instant (Unix epoch second " + j12 + ')', 1);
    }

    public e(int i11, long j11) {
        b7.a.d(j11 >= 0);
        this.f27021b = i11;
        this.f27020a = j11;
    }

    public e(long j11, int i11) {
        this.f27020a = j11;
        this.f27021b = i11;
    }
}
