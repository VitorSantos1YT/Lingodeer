package vz;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends e {
    public f(uz.i iVar, vy.i iVar2, int i11, tz.a aVar, int i12) {
        super((i12 & 4) != 0 ? -3 : i11, (i12 & 8) != 0 ? tz.a.SUSPEND : aVar, iVar, (i12 & 2) != 0 ? vy.j.f54321a : iVar2);
    }

    @Override // vz.d
    public final d g(vy.i iVar, int i11, tz.a aVar) {
        return new f(i11, aVar, this.f54335d, iVar);
    }

    @Override // vz.d
    public final uz.i h() {
        return this.f54335d;
    }

    @Override // vz.e
    public final Object j(uz.j jVar, vy.d dVar) {
        Object objCollect = this.f54335d.collect(jVar, dVar);
        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : b0.f48488a;
    }
}
