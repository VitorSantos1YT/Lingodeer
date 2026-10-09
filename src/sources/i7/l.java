package i7;

import b7.f0;
import ob.u;
import p7.z0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f34237a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f34239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j7.g f34241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34242f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34243t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f34238b = new u(13);
    public long H = -9223372036854775807L;

    public l(j7.g gVar, p pVar, boolean z11) {
        this.f34237a = pVar;
        this.f34241e = gVar;
        this.f34239c = gVar.f36128b;
        a(gVar, z11);
    }

    public final void a(j7.g gVar, boolean z11) {
        int i11 = this.f34243t;
        long j11 = -9223372036854775807L;
        long j12 = i11 == 0 ? -9223372036854775807L : this.f34239c[i11 - 1];
        this.f34240d = z11;
        this.f34241e = gVar;
        long[] jArr = gVar.f36128b;
        this.f34239c = jArr;
        long j13 = this.H;
        if (j13 == -9223372036854775807L) {
            if (j12 != -9223372036854775807L) {
                this.f34243t = f0.a(jArr, j12, false);
            }
        } else {
            int iA = f0.a(jArr, j13, true);
            this.f34243t = iA;
            if (this.f34240d && iA == this.f34239c.length) {
                j11 = j13;
            }
            this.H = j11;
        }
    }

    @Override // p7.z0
    public final boolean f() {
        return true;
    }

    @Override // p7.z0
    public final int m(long j11) {
        int iMax = Math.max(this.f34243t, f0.a(this.f34239c, j11, true));
        int i11 = iMax - this.f34243t;
        this.f34243t = iMax;
        return i11;
    }

    @Override // p7.z0
    public final int o(ob.e eVar, e7.d dVar, int i11) {
        int i12 = this.f34243t;
        boolean z11 = i12 == this.f34239c.length;
        if (z11 && !this.f34240d) {
            dVar.f6652b = 4;
            return -4;
        }
        if ((i11 & 2) != 0 || !this.f34242f) {
            eVar.f44805c = this.f34237a;
            this.f34242f = true;
            return -5;
        }
        if (z11) {
            return -3;
        }
        if ((i11 & 1) == 0) {
            this.f34243t = i12 + 1;
        }
        if ((i11 & 4) == 0) {
            byte[] bArrO = this.f34238b.o(this.f34241e.f36127a[i12]);
            dVar.q(bArrO.length);
            dVar.f25115e.put(bArrO);
        }
        dVar.f25117t = this.f34239c[i12];
        dVar.f6652b = 1;
        return -4;
    }

    @Override // p7.z0
    public final void b() {
    }
}
