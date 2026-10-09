package d2;

import a0.e1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f23069a = l.f23074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a5.f f23070b;

    @Override // v3.c
    public final float Z() {
        return this.f23069a.getDensity().Z();
    }

    public final a5.f a(fz.c cVar) {
        return b(new e1(cVar, 4));
    }

    public final a5.f b(fz.c cVar) {
        a5.f fVar = new a5.f(7, false);
        fVar.f378b = cVar;
        this.f23070b = fVar;
        return fVar;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f23069a.getDensity().getDensity();
    }
}
