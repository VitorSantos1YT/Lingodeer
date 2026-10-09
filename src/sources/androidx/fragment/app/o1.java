package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends ViewModel {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n1 f1775t = new n1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1779d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1776a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1777b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1778c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1780e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1781f = false;

    public o1(boolean z11) {
        this.f1779d = z11;
    }

    public final void a(k0 k0Var) {
        if (this.f1781f) {
            return;
        }
        String str = k0Var.mWho;
        HashMap map = this.f1776a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(k0Var.mWho, k0Var);
        if (k1.L(2)) {
            k0Var.toString();
        }
    }

    public final void b(String str, boolean z11) {
        HashMap map = this.f1777b;
        o1 o1Var = (o1) map.get(str);
        if (o1Var != null) {
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(o1Var.f1777b.keySet());
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    o1Var.b((String) obj, true);
                }
            }
            o1Var.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f1778c;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            map2.remove(str);
        }
    }

    public final void c(k0 k0Var) {
        if (this.f1781f || this.f1776a.remove(k0Var.mWho) == null || !k1.L(2)) {
            return;
        }
        k0Var.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f1776a.equals(o1Var.f1776a) && this.f1777b.equals(o1Var.f1777b) && this.f1778c.equals(o1Var.f1778c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1778c.hashCode() + ((this.f1777b.hashCode() + (this.f1776a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (k1.L(3)) {
            toString();
        }
        this.f1780e = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f1776a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f1777b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f1778c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
