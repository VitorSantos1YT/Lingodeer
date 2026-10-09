package g4;

import h4.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.n f28739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c4.k f28740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c4.m f28741c;

    public b() {
        c4.n nVar = new c4.n();
        nVar.f6591k = false;
        this.f28739a = nVar;
        this.f28741c = nVar;
    }

    @Override // h4.r
    public final float a() {
        return this.f28741c.b();
    }

    public final void b(float f5, float f11, float f12, float f13, float f14, float f15) {
        c4.n nVar = this.f28739a;
        this.f28741c = nVar;
        nVar.f6592l = f5;
        boolean z11 = f5 > f11;
        nVar.f6591k = z11;
        if (z11) {
            nVar.d(-f12, f5 - f11, f14, f15, f13);
        } else {
            nVar.d(f12, f11 - f5, f14, f15, f13);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        return this.f28741c.getInterpolation(f5);
    }
}
