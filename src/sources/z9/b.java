package z9;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements y9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w00.d f59034a;

    public b(w00.d dVar) {
        this.f59034a = dVar;
    }

    @Override // y9.b
    public final Object K(boolean z11, fz.e eVar, xy.c cVar) {
        ka.d dVar = (ka.d) this.f59034a.f54378a;
        dVar.getDatabaseName();
        return eVar.invoke(new e(new a(dVar.n0())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((ka.d) this.f59034a.f54378a).close();
    }
}
