package hh;

import androidx.fragment.app.v1;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends v1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f32270i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.fragment.app.k1 k1Var, List list) {
        super(k1Var);
        kotlin.jvm.internal.m.f(list, "list");
        this.f32270i = list;
    }

    @Override // ua.a
    public final void a(ViewPager viewPager, int i11, Object object) {
        ArrayList arrayList;
        kotlin.jvm.internal.m.f(object, "object");
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) object;
        androidx.fragment.app.a aVar = this.f1854d;
        androidx.fragment.app.k1 k1Var = this.f1852b;
        if (aVar == null) {
            k1Var.getClass();
            this.f1854d = new androidx.fragment.app.a(k1Var);
        }
        while (true) {
            arrayList = this.f1855e;
            if (arrayList.size() > i11) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i11, k0Var.isAdded() ? k1Var.b0(k0Var) : null);
        this.f1856f.set(i11, null);
        this.f1854d.l(k0Var);
        if (k0Var.equals(this.f1857g)) {
            this.f1857g = null;
        }
    }

    @Override // ua.a
    public final int c() {
        return this.f32270i.size();
    }
}
