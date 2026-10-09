package w2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements s0, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f54595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.m f54596b;

    public w(s sVar, v3.m mVar) {
        this.f54595a = sVar;
        this.f54596b = mVar;
    }

    @Override // v3.c
    public final long I(int i11) {
        return this.f54595a.I(i11);
    }

    @Override // v3.c
    public final long K(float f5) {
        return this.f54595a.K(f5);
    }

    @Override // w2.s0
    public final r0 O(int i11, int i12, Map map, fz.c cVar, fz.c cVar2) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if ((i11 & (-16777216)) != 0 || ((-16777216) & i12) != 0) {
            v2.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new v(i11, i12, map, cVar);
    }

    @Override // v3.c
    public final float Q(int i11) {
        return this.f54595a.Q(i11);
    }

    @Override // v3.c
    public final float T(float f5) {
        return this.f54595a.T(f5);
    }

    @Override // v3.c
    public final float Z() {
        return this.f54595a.Z();
    }

    @Override // w2.s
    public final boolean c0() {
        return this.f54595a.c0();
    }

    @Override // v3.c
    public final float e0(float f5) {
        return this.f54595a.e0(f5);
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f54595a.getDensity();
    }

    @Override // w2.s
    public final v3.m getLayoutDirection() {
        return this.f54596b;
    }

    @Override // v3.c
    public final int k0(long j11) {
        return this.f54595a.k0(j11);
    }

    @Override // v3.c
    public final long n(float f5) {
        return this.f54595a.n(f5);
    }

    @Override // v3.c
    public final int n0(float f5) {
        return this.f54595a.n0(f5);
    }

    @Override // v3.c
    public final long o(long j11) {
        return this.f54595a.o(j11);
    }

    @Override // v3.c
    public final long v0(long j11) {
        return this.f54595a.v0(j11);
    }

    @Override // v3.c
    public final float w(long j11) {
        return this.f54595a.w(j11);
    }

    @Override // v3.c
    public final float y0(long j11) {
        return this.f54595a.y0(j11);
    }
}
