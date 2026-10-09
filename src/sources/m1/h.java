package m1;

import kotlin.KotlinNothingValueException;
import l1.p2;
import l1.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f40788c = new h(0, 4, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        z0 z0Var = (z0) tVar.f(2);
        l1.w wVar = (l1.w) tVar.f(1);
        wVar.m(z0Var);
        l1.u.b("Could not resolve state for movable content");
        throw new KotlinNothingValueException();
    }
}
