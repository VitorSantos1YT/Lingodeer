package j9;

import java.util.List;
import java.util.ListIterator;
import mt.b6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f36183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36184b;

    public abstract q a();

    public final i b() {
        i iVar = this.f36183a;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, y yVar) {
        nz.g gVar = new nz.g(new nz.i(nz.n.W(ry.m.g0(list), new gr.s(this, yVar)), false, new b6(20)));
        while (gVar.hasNext()) {
            b().f((e) gVar.next());
        }
    }

    public void e(e eVar, boolean z11) {
        List list = (List) b().f36206e.f53391a.getValue();
        if (!list.contains(eVar)) {
            throw new IllegalStateException(("popBackStack was called with " + eVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        e eVar2 = null;
        while (f()) {
            eVar2 = (e) listIterator.previous();
            if (kotlin.jvm.internal.m.a(eVar2, eVar)) {
                break;
            }
        }
        if (eVar2 != null) {
            b().d(eVar2, z11);
        }
    }

    public boolean f() {
        return true;
    }

    public q c(q qVar) {
        return qVar;
    }
}
