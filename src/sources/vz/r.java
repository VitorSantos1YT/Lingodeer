package vz;

import qy.b0;
import tz.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f54361a;

    public r(tz.t tVar) {
        this.f54361a = tVar;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        Object objF = this.f54361a.f(obj, dVar);
        return objF == wy.a.COROUTINE_SUSPENDED ? objF : b0.f48488a;
    }
}
