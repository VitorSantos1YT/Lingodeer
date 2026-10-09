package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements vy.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f39316a = new g(6);

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final /* bridge */ vy.g get(vy.h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // vy.g
    public final vy.h getKey() {
        return f39316a;
    }

    @Override // vy.i
    public final /* bridge */ vy.i minusKey(vy.h hVar) {
        return ew.a.s(this, hVar);
    }

    @Override // vy.i
    public final /* bridge */ vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }
}
