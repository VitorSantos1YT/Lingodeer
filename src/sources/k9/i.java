package k9;

import androidx.lifecycle.Lifecycle;
import j9.b0;
import j9.c0;
import j9.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l1.k1;
import uz.i1;
import uz.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@b0("composable")
public final class i extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f37982c = l1.t.B(Boolean.FALSE);

    @Override // j9.c0
    public final j9.q a() {
        return new h(this, c.f37977a);
    }

    @Override // j9.c0
    public final void d(List list, y yVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j9.e backStackEntry = (j9.e) it.next();
            j9.i iVarB = b();
            r0 r0Var = iVarB.f36206e;
            kotlin.jvm.internal.m.f(backStackEntry, "backStackEntry");
            i1 i1Var = iVarB.f36204c;
            Iterable iterable = (Iterable) i1Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((j9.e) it2.next()) == backStackEntry) {
                            Iterable iterable2 = (Iterable) r0Var.f53391a.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((j9.e) it3.next()) == backStackEntry) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j9.e eVar = (j9.e) ry.m.A0((List) r0Var.f53391a.getValue());
            if (eVar != null) {
                i1Var.l(null, qx.b.E((Set) i1Var.getValue(), eVar));
            }
            i1Var.l(null, qx.b.E((Set) i1Var.getValue(), backStackEntry));
            iVarB.f(backStackEntry);
        }
        this.f37982c.setValue(Boolean.FALSE);
    }

    @Override // j9.c0
    public final void e(j9.e eVar, boolean z11) {
        b().e(eVar, z11);
        this.f37982c.setValue(Boolean.TRUE);
    }

    public final void g(j9.e entry) {
        j9.i iVarB = b();
        kotlin.jvm.internal.m.f(entry, "entry");
        i1 i1Var = iVarB.f36204c;
        i1Var.l(null, qx.b.E((Set) i1Var.getValue(), entry));
        m9.g gVar = iVarB.f36209h.f36257b;
        gVar.getClass();
        if (!gVar.f41075f.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.a(Lifecycle.State.STARTED);
    }
}
