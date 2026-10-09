package g00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements c00.a {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // c00.a
    public Object deserialize(f00.c cVar) {
        return e(cVar);
    }

    public final Object e(f00.c cVar) {
        Object objA = a();
        int iB = b(objA);
        f00.a aVarD = cVar.d(getDescriptor());
        while (true) {
            int iN = aVarD.n(getDescriptor());
            if (iN == -1) {
                aVarD.c(getDescriptor());
                return h(objA);
            }
            f(aVarD, iN + iB, objA);
        }
    }

    public abstract void f(f00.a aVar, int i11, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
