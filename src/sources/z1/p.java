package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface p extends r {
    @Override // z1.r
    default Object a(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // z1.r
    default boolean c(fz.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }
}
