package c8;

import x7.d;
import x7.e;
import x7.f;
import x7.g;
import x7.h;
import x7.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f6722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6723d;

    public b(f fVar, h hVar, long j11, long j12, long j13, long j14, long j15, int i11) {
        this.f6721b = hVar;
        this.f6723d = i11;
        this.f6720a = new d(fVar, j11, j12, j13, j14, j15);
    }

    public static int a(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    public static int c(n nVar, long j11, kw.b bVar) {
        if (j11 == nVar.getPosition()) {
            return 0;
        }
        bVar.f38845a = j11;
        return 1;
    }

    public final int b(n nVar, kw.b bVar) {
        while (true) {
            e eVar = this.f6722c;
            b7.a.k(eVar);
            long j11 = eVar.f55878f;
            long j12 = eVar.f55879g;
            long j13 = eVar.f55880h;
            long j14 = j12 - j11;
            long j15 = this.f6723d;
            h hVar = this.f6721b;
            if (j14 <= j15) {
                this.f6722c = null;
                hVar.o();
                return c(nVar, j11, bVar);
            }
            long position = j13 - nVar.getPosition();
            if (position < 0 || position > 262144) {
                return c(nVar, j13, bVar);
            }
            nVar.s((int) position);
            nVar.r();
            g gVarK = hVar.k(nVar, eVar.f55874b);
            int i11 = gVarK.f55889a;
            long j16 = gVarK.f55890b;
            long j17 = gVarK.f55891c;
            if (i11 == -3) {
                this.f6722c = null;
                hVar.o();
                return c(nVar, j13, bVar);
            }
            if (i11 == -2) {
                eVar.f55876d = j16;
                eVar.f55878f = j17;
                eVar.f55880h = e.a(eVar.f55874b, j16, eVar.f55877e, j17, eVar.f55879g, eVar.f55875c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j17 - nVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        nVar.s((int) position2);
                    }
                    this.f6722c = null;
                    hVar.o();
                    return c(nVar, j17, bVar);
                }
                eVar.f55877e = j16;
                eVar.f55879g = j17;
                eVar.f55880h = e.a(eVar.f55874b, eVar.f55876d, j16, eVar.f55878f, j17, eVar.f55875c);
            }
        }
    }

    public final void d(long j11) {
        e eVar = this.f6722c;
        if (eVar == null || eVar.f55873a != j11) {
            d dVar = this.f6720a;
            this.f6722c = new e(j11, dVar.f55863a.a(j11), dVar.f55865c, dVar.f55866d, dVar.f55867e, dVar.f55868f);
        }
    }
}
