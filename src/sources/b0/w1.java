package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface w1 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        return kotlin.jvm.internal.m.a(obj, a()) && kotlin.jvm.internal.m.a(obj2, c());
    }

    Object c();
}
