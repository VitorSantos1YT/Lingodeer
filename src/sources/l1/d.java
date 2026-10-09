package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    default void A(Object obj, fz.e eVar) {
        eVar.invoke(x(), obj);
    }

    void b(int i11, Object obj);

    void d(Object obj);

    default void h() {
        Object objX = x();
        j jVar = objX instanceof j ? (j) objX : null;
        if (jVar != null) {
            jVar.j();
        }
    }

    void k(int i11, int i12, int i13);

    void l(int i11, int i12);

    void q();

    void v(int i11, Object obj);

    Object x();

    default void w() {
    }
}
