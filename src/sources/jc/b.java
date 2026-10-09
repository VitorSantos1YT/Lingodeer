package jc;

import gc.o;
import kotlin.NoWhenBranchMatchedException;
import wb.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f36296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.j f36297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36298c;

    public b(j jVar, gc.j jVar2, int i11) {
        this.f36296a = jVar;
        this.f36297b = jVar2;
        this.f36298c = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // jc.f
    public final void a() {
        this.f36296a.getClass();
        gc.j jVar = this.f36297b;
        boolean z11 = jVar instanceof o;
        new zb.a(jVar.a(), jVar.b().f29039w, this.f36298c, (z11 && ((o) jVar).f29067g) ? false : true);
        if (!z11 && !(jVar instanceof gc.e)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
