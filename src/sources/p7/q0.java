package p7;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f46452b;

    public q0(s0 s0Var, int i11) {
        this.f46452b = s0Var;
        this.f46451a = i11;
    }

    @Override // p7.z0
    public final void b() throws IOException {
        int i11 = this.f46451a;
        s0 s0Var = this.f46452b;
        y0 y0Var = s0Var.V[i11];
        hd.b bVar = y0Var.f46545h;
        if (bVar != null && bVar.r() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionO = y0Var.f46545h.o();
            drmSession$DrmSessionExceptionO.getClass();
            throw drmSession$DrmSessionExceptionO;
        }
        t7.n nVar = s0Var.N;
        int iW = s0Var.f46470d.w(s0Var.f46475f0);
        IOException iOException = nVar.f52099c;
        if (iOException != null) {
            throw iOException;
        }
        t7.k kVar = nVar.f52098b;
        if (kVar != null) {
            if (iW == Integer.MIN_VALUE) {
                iW = kVar.f52088a;
            }
            IOException iOException2 = kVar.f52092e;
            if (iOException2 != null && kVar.f52093f > iW) {
                throw iOException2;
            }
        }
    }

    @Override // p7.z0
    public final boolean f() {
        s0 s0Var = this.f46452b;
        return !s0Var.F() && s0Var.V[this.f46451a].p(s0Var.f46485p0);
    }

    @Override // p7.z0
    public final int m(long j11) {
        s0 s0Var = this.f46452b;
        if (s0Var.F()) {
            return 0;
        }
        int i11 = this.f46451a;
        s0Var.A(i11);
        y0 y0Var = s0Var.V[i11];
        int iO = y0Var.o(j11, s0Var.f46485p0);
        y0Var.w(iO);
        if (iO == 0) {
            s0Var.B(i11);
        }
        return iO;
    }

    @Override // p7.z0
    public final int o(ob.e eVar, e7.d dVar, int i11) {
        s0 s0Var = this.f46452b;
        if (s0Var.F()) {
            return -3;
        }
        int i12 = this.f46451a;
        s0Var.A(i12);
        int iS = s0Var.V[i12].s(eVar, dVar, i11, s0Var.f46485p0);
        if (iS == -3) {
            s0Var.B(i12);
        }
        return iS;
    }
}
