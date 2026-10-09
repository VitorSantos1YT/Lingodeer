package j1;

import qp.o2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o2 f35512b = new o2(6, r.f35511a, g.f35477c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.d f35513a;

    public s(b0.d dVar) {
        this.f35513a = dVar;
    }

    public final Object a(float f5, xy.i iVar) {
        Object objE = this.f35513a.e(new Float(f5), iVar);
        return objE == wy.a.COROUTINE_SUSPENDED ? objE : b0.f48488a;
    }
}
