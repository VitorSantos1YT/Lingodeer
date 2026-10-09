package x0;

import z3.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd.b f55609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v3.l f55610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v3.m f55611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v3.l f55612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v3.j f55613e;

    public n(hd.b bVar) {
        this.f55609a = bVar;
    }

    @Override // z3.y
    public final long b(v3.k kVar, long j11, v3.m mVar, long j12) {
        v3.j jVar = this.f55613e;
        if (jVar != null) {
            v3.l lVar = this.f55610b;
            if ((lVar == null ? false : v3.l.a(lVar.f53498a, j11)) && this.f55611c == mVar) {
                v3.l lVar2 = this.f55612d;
                if (lVar2 != null ? v3.l.a(lVar2.f53498a, j12) : false) {
                    return jVar.f53492a;
                }
            }
        }
        long jB = this.f55609a.b(kVar, j11, mVar, j12);
        this.f55610b = new v3.l(j11);
        this.f55611c = mVar;
        this.f55612d = new v3.l(j12);
        this.f55613e = new v3.j(jB);
        return jB;
    }
}
