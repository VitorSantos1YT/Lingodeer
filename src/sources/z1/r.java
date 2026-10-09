package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface r {
    Object a(Object obj, fz.e eVar);

    boolean c(fz.c cVar);

    default r i(r rVar) {
        return rVar == o.f58481a ? this : new l(this, rVar);
    }
}
