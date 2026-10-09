package h0;

import qy.b0;
import uz.w0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f29906a = x0.b(16, 1, tz.a.DROP_OLDEST);

    public final Object a(h hVar, vy.d dVar) throws Throwable {
        Object objEmit = this.f29906a.emit(hVar, dVar);
        return objEmit == wy.a.COROUTINE_SUSPENDED ? objEmit : b0.f48488a;
    }

    public final void b(h hVar) {
        this.f29906a.d(hVar);
    }
}
