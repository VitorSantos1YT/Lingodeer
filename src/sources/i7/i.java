package i7;

import androidx.media3.exoplayer.source.BehindLiveWindowException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7.c f34214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j7.m f34215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j7.b f34216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f34217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f34218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34219f;

    public i(long j11, j7.m mVar, j7.b bVar, q7.c cVar, long j12, h hVar) {
        this.f34218e = j11;
        this.f34215b = mVar;
        this.f34216c = bVar;
        this.f34219f = j12;
        this.f34214a = cVar;
        this.f34217d = hVar;
    }

    public final i a(long j11, j7.m mVar) throws BehindLiveWindowException {
        long jL;
        long jL2;
        h hVarC = this.f34215b.c();
        h hVarC2 = mVar.c();
        if (hVarC == null) {
            return new i(j11, mVar, this.f34216c, this.f34214a, this.f34219f, hVarC);
        }
        if (!hVarC.t()) {
            return new i(j11, mVar, this.f34216c, this.f34214a, this.f34219f, hVarC2);
        }
        long jY = hVarC.y(j11);
        if (jY == 0) {
            return new i(j11, mVar, this.f34216c, this.f34214a, this.f34219f, hVarC2);
        }
        b7.a.k(hVarC2);
        long jW = hVarC.w();
        long jB = hVarC.b(jW);
        long j12 = jY + jW;
        long j13 = j12 - 1;
        long jE = hVarC.e(j13, j11) + hVarC.b(j13);
        long jW2 = hVarC2.w();
        long jB2 = hVarC2.b(jW2);
        long j14 = this.f34219f;
        if (jE != jB2) {
            if (jE < jB2) {
                throw new BehindLiveWindowException();
            }
            if (jB2 < jB) {
                jL2 = j14 - (hVarC2.l(jB, j11) - jW);
            } else {
                jL = hVarC.l(jB2, j11) - jW2;
            }
            return new i(j11, mVar, this.f34216c, this.f34214a, jL2, hVarC2);
        }
        jL = j12 - jW2;
        jL2 = jL + j14;
        return new i(j11, mVar, this.f34216c, this.f34214a, jL2, hVarC2);
    }

    public final long b(long j11) {
        h hVar = this.f34217d;
        b7.a.k(hVar);
        return hVar.g(this.f34218e, j11) + this.f34219f;
    }

    public final long c(long j11) {
        long jB = b(j11);
        h hVar = this.f34217d;
        b7.a.k(hVar);
        return (hVar.z(this.f34218e, j11) + jB) - 1;
    }

    public final long d() {
        h hVar = this.f34217d;
        b7.a.k(hVar);
        return hVar.y(this.f34218e);
    }

    public final long e(long j11) {
        long jF = f(j11);
        h hVar = this.f34217d;
        b7.a.k(hVar);
        return hVar.e(j11 - this.f34219f, this.f34218e) + jF;
    }

    public final long f(long j11) {
        h hVar = this.f34217d;
        b7.a.k(hVar);
        return hVar.b(j11 - this.f34219f);
    }

    public final boolean g(long j11, long j12) {
        h hVar = this.f34217d;
        b7.a.k(hVar);
        return hVar.t() || j12 == -9223372036854775807L || e(j11) <= j12;
    }
}
