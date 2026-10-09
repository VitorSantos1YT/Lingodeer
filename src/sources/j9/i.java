package j9;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import bt.o1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import uz.g1;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw.c f36202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f36203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f36204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f36206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f36207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f36208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f36209h;

    public i(v vVar, c0 navigator) {
        kotlin.jvm.internal.m.f(navigator, "navigator");
        this.f36209h = vVar;
        this.f36202a = new tw.c(21);
        i1 i1VarC = x0.c(ry.r.f50854a);
        this.f36203b = i1VarC;
        i1 i1VarC2 = x0.c(ry.t.f50856a);
        this.f36204c = i1VarC2;
        this.f36206e = new r0(i1VarC);
        this.f36207f = new r0(i1VarC2);
        this.f36208g = navigator;
    }

    public final void a(e backStackEntry) {
        kotlin.jvm.internal.m.f(backStackEntry, "backStackEntry");
        synchronized (this.f36202a) {
            i1 i1Var = this.f36203b;
            ArrayList arrayListG0 = ry.m.G0(backStackEntry, (Collection) i1Var.getValue());
            i1Var.getClass();
            i1Var.l(null, arrayListG0);
        }
    }

    public final e b(q qVar, Bundle bundle) {
        m9.g gVar = this.f36209h.f36257b;
        gVar.getClass();
        return d.a(gVar.f41070a.f36258c, qVar, bundle, gVar.i(), gVar.f41083o);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    public final void c(e entry) {
        j jVar;
        ViewModelStore viewModelStore;
        kotlin.jvm.internal.m.f(entry, "entry");
        m9.g gVar = this.f36209h.f36257b;
        i1 i1Var = gVar.f41077h;
        String backStackEntryId = entry.f36192f;
        LinkedHashMap linkedHashMap = gVar.f41091w;
        boolean zA = kotlin.jvm.internal.m.a(linkedHashMap.get(entry), Boolean.TRUE);
        i1 i1Var2 = this.f36204c;
        i1Var2.l(null, qx.b.y((Set) i1Var2.getValue(), entry));
        linkedHashMap.remove(entry);
        ry.k kVar = gVar.f41075f;
        if (kVar.contains(entry)) {
            if (this.f36205d) {
                return;
            }
            gVar.t();
            i1 i1Var3 = gVar.f41076g;
            ArrayList arrayListC1 = ry.m.c1(kVar);
            i1Var3.getClass();
            i1Var3.l(null, arrayListC1);
            ArrayList arrayListQ = gVar.q();
            i1Var.getClass();
            i1Var.l(null, arrayListQ);
            return;
        }
        gVar.s(entry);
        if (entry.H.f41060j.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            entry.a(Lifecycle.State.DESTROYED);
        }
        if (!kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.m.a(((e) it.next()).f36192f, backStackEntryId)) {
                }
            }
            if (!zA) {
                kotlin.jvm.internal.m.f(backStackEntryId, "backStackEntryId");
                viewModelStore = (ViewModelStore) jVar.f36210a.remove(backStackEntryId);
                if (viewModelStore != null) {
                    viewModelStore.clear();
                }
            }
        } else if (!zA && (jVar = gVar.f41083o) != null) {
            kotlin.jvm.internal.m.f(backStackEntryId, "backStackEntryId");
            viewModelStore = (ViewModelStore) jVar.f36210a.remove(backStackEntryId);
            if (viewModelStore != null) {
                viewModelStore.clear();
            }
        }
        gVar.t();
        ArrayList arrayListQ2 = gVar.q();
        i1Var.getClass();
        i1Var.l(null, arrayListQ2);
    }

    public final void d(e eVar, boolean z11) {
        m9.g gVar = this.f36209h.f36257b;
        fp.f fVar = new fp.f(this, eVar, z11);
        gVar.getClass();
        c0 c0VarB = gVar.f41087s.b(eVar.f36188b.f36241a);
        gVar.f41091w.put(eVar, Boolean.valueOf(z11));
        if (!c0VarB.equals(this.f36208g)) {
            Object obj = gVar.f41088t.get(c0VarB);
            kotlin.jvm.internal.m.c(obj);
            ((i) obj).d(eVar, z11);
            return;
        }
        o1 o1Var = gVar.f41090v;
        if (o1Var != null) {
            o1Var.invoke(eVar);
            fVar.invoke();
            return;
        }
        ry.k kVar = gVar.f41075f;
        int iIndexOf = kVar.indexOf(eVar);
        if (iIndexOf < 0) {
            String message = "Ignoring pop of " + eVar + " as it was not found on the current back stack";
            kotlin.jvm.internal.m.f(message, "message");
            return;
        }
        int i11 = iIndexOf + 1;
        if (i11 != kVar.f50852c) {
            gVar.n(((e) kVar.get(i11)).f36188b.f36242b.f3958a, true, false);
        }
        m9.g.p(gVar, eVar);
        fVar.invoke();
        gVar.f41071b.invoke();
        gVar.b();
    }

    public final void e(e eVar, boolean z11) {
        Object objPrevious;
        i1 i1Var = this.f36204c;
        Iterable iterable = (Iterable) i1Var.getValue();
        boolean z12 = iterable instanceof Collection;
        r0 r0Var = this.f36206e;
        if (!z12 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((e) it.next()) == eVar) {
                    Iterable iterable2 = (Iterable) r0Var.f53391a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((e) it2.next()) == eVar) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        i1Var.l(null, qx.b.E((Set) i1Var.getValue(), eVar));
        g1 g1Var = r0Var.f53391a;
        g1 g1Var2 = r0Var.f53391a;
        List list = (List) g1Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            e eVar2 = (e) objPrevious;
            if (!kotlin.jvm.internal.m.a(eVar2, eVar) && ((List) g1Var2.getValue()).lastIndexOf(eVar2) < ((List) g1Var2.getValue()).lastIndexOf(eVar)) {
                break;
            }
        }
        e eVar3 = (e) objPrevious;
        if (eVar3 != null) {
            i1Var.l(null, qx.b.E((Set) i1Var.getValue(), eVar3));
        }
        d(eVar, z11);
    }

    public final void f(e backStackEntry) {
        kotlin.jvm.internal.m.f(backStackEntry, "backStackEntry");
        m9.g gVar = this.f36209h.f36257b;
        gVar.getClass();
        c0 c0VarB = gVar.f41087s.b(backStackEntry.f36188b.f36241a);
        if (!c0VarB.equals(this.f36208g)) {
            Object obj = gVar.f41088t.get(c0VarB);
            if (obj == null) {
                throw new IllegalStateException(ep.a.k(new StringBuilder("NavigatorBackStack for "), backStackEntry.f36188b.f36241a, " should already be created").toString());
            }
            ((i) obj).f(backStackEntry);
            return;
        }
        fz.c cVar = gVar.f41089u;
        if (cVar != null) {
            cVar.invoke(backStackEntry);
            a(backStackEntry);
            return;
        }
        String message = "Ignoring add of destination " + backStackEntry.f36188b + " outside of the call to navigate(). ";
        kotlin.jvm.internal.m.f(message, "message");
    }
}
