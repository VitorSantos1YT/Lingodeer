package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends f.x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f1613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1 k1Var) {
        super(false);
        this.f1613d = k1Var;
    }

    @Override // f.x
    public final void a() {
        boolean zL = k1.L(3);
        k1 k1Var = this.f1613d;
        if (zL) {
            Objects.toString(k1Var);
        }
        if (k1.L(3)) {
            Objects.toString(k1Var.f1716h);
        }
        a aVar = k1Var.f1716h;
        if (aVar != null) {
            aVar.f1610s = false;
            aVar.g();
            a aVar2 = k1Var.f1716h;
            z zVar = new z(k1Var, 4);
            if (aVar2.f1906q == null) {
                aVar2.f1906q = new ArrayList();
            }
            aVar2.f1906q.add(zVar);
            k1Var.f1716h.h();
            k1Var.f1717i = true;
            k1Var.z(true);
            k1Var.F();
            k1Var.f1717i = false;
            k1Var.f1716h = null;
        }
    }

    @Override // f.x
    public final void b() {
        boolean zL = k1.L(3);
        k1 k1Var = this.f1613d;
        if (zL) {
            Objects.toString(k1Var);
        }
        a1 a1Var = k1Var.f1718j;
        ArrayList arrayList = k1Var.f1722o;
        k1Var.f1717i = true;
        k1Var.z(true);
        int i11 = 0;
        k1Var.f1717i = false;
        if (k1Var.f1716h == null) {
            if (a1Var.f26172a) {
                k1Var.T();
                return;
            } else {
                k1Var.f1715g.c();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(k1.G(k1Var.f1716h));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = k1Var.f1716h.f1891a;
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            k0 k0Var = ((y1) obj2).f1879b;
            if (k0Var != null) {
                k0Var.mTransitioning = false;
            }
        }
        for (s sVar : k1Var.f(new ArrayList(Collections.singletonList(k1Var.f1716h)), 0, 1)) {
            ArrayList arrayList3 = sVar.f1828c;
            sVar.m(arrayList3);
            sVar.c(arrayList3);
        }
        ArrayList arrayList4 = k1Var.f1716h.f1891a;
        int size3 = arrayList4.size();
        while (i11 < size3) {
            Object obj3 = arrayList4.get(i11);
            i11++;
            k0 k0Var2 = ((y1) obj3).f1879b;
            if (k0Var2 != null && k0Var2.mContainer == null) {
                k1Var.g(k0Var2).i();
            }
        }
        k1Var.f1716h = null;
        k1Var.i0();
        if (k1.L(3)) {
            boolean z11 = a1Var.f26172a;
            k1Var.toString();
        }
    }

    @Override // f.x
    public final void c(f.a backEvent) {
        boolean zL = k1.L(2);
        k1 k1Var = this.f1613d;
        if (zL) {
            Objects.toString(k1Var);
        }
        if (k1Var.f1716h != null) {
            for (s sVar : k1Var.f(new ArrayList(Collections.singletonList(k1Var.f1716h)), 0, 1)) {
                sVar.getClass();
                kotlin.jvm.internal.m.f(backEvent, "backEvent");
                ArrayList arrayList = sVar.f1828c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ry.m.d0(arrayList2, ((m2) obj).f1764k);
                }
                List listA1 = ry.m.a1(ry.m.f1(arrayList2));
                int size2 = listA1.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((l2) listA1.get(i12)).d(backEvent, sVar.f1826a);
                }
            }
            Iterator it = k1Var.f1722o.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // f.x
    public final void d(f.a aVar) {
        boolean zL = k1.L(3);
        k1 k1Var = this.f1613d;
        if (zL) {
            Objects.toString(k1Var);
        }
        k1Var.w();
        k1Var.x(new j1(k1Var), false);
    }
}
