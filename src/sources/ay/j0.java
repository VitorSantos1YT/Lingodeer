package ay;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends qx.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx.d f3332b;

    public j0(Object obj, tx.d dVar) {
        this.f3331a = obj;
        this.f3332b = dVar;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        try {
            Object objApply = this.f3332b.apply(this.f3331a);
            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
            qx.i iVar = (qx.i) objApply;
            if (!(iVar instanceof tx.f)) {
                ((qx.h) iVar).i(kVar);
                return;
            }
            try {
                Object obj = ((tx.f) iVar).get();
                if (obj == null) {
                    ux.c.c(kVar);
                    return;
                }
                i0 i0Var = new i0(kVar, obj);
                kVar.c(i0Var);
                i0Var.run();
            } catch (Throwable th2) {
                ef.e.E(th2);
                ux.c.e(th2, kVar);
            }
        } catch (Throwable th3) {
            ef.e.E(th3);
            ux.c.e(th3, kVar);
        }
    }
}
