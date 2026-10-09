package vz;

import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xy.i f54346e;

    /* JADX WARN: Multi-variable type inference failed */
    public i(fz.f fVar, uz.i iVar, vy.i iVar2, int i11, tz.a aVar) {
        super(i11, aVar, iVar, iVar2);
        this.f54346e = (xy.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.f, xy.i] */
    @Override // vz.d
    public final d g(vy.i iVar, int i11, tz.a aVar) {
        return new i(this.f54346e, this.f54335d, iVar, i11, aVar);
    }

    @Override // vz.e
    public final Object j(uz.j jVar, vy.d dVar) {
        Object objL = e0.l(new g(this, jVar, null), dVar);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : b0.f48488a;
    }
}
