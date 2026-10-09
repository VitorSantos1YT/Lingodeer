package c6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    Object a(Object obj, fz.e eVar);

    boolean b(fz.c cVar);

    boolean c();

    default l d(l lVar) {
        return lVar == j.f6631a ? this : new d(this, lVar);
    }
}
