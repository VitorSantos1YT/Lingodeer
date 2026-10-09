package uz;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements g1, i, vz.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f53391a;

    public r0(p0 p0Var) {
        this.f53391a = p0Var;
    }

    @Override // uz.s0
    public final List a() {
        return this.f53391a.a();
    }

    @Override // vz.l
    public final i b(vy.i iVar, int i11, tz.a aVar) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || aVar != tz.a.DROP_OLDEST) ? x0.x(this, iVar, i11, aVar) : this;
    }

    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) {
        return this.f53391a.collect(jVar, dVar);
    }

    @Override // uz.g1
    public final Object getValue() {
        return this.f53391a.getValue();
    }
}
