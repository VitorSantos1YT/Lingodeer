package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f1706a;

    public j1(k1 k1Var) {
        this.f1706a = k1Var;
    }

    @Override // androidx.fragment.app.h1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zV;
        k1 k1Var = this.f1706a;
        ArrayList arrayList3 = k1Var.f1722o;
        if (k1.L(2)) {
            Objects.toString(k1Var.f1709a);
        }
        int i11 = 0;
        if (k1Var.f1712d.isEmpty()) {
            zV = false;
        } else {
            a aVar = (a) nv.p.f(1, k1Var.f1712d);
            k1Var.f1716h = aVar;
            ArrayList arrayList4 = aVar.f1891a;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                k0 k0Var = ((y1) obj).f1879b;
                if (k0Var != null) {
                    k0Var.mTransitioning = true;
                }
            }
            zV = k1Var.V(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList.get(i13);
                i13++;
                linkedHashSet.addAll(k1.G((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zV;
    }
}
