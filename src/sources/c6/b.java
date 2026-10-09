package c6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l1.a {
    @Override // l1.d
    public final /* bridge */ /* synthetic */ void b(int i11, Object obj) {
    }

    @Override // l1.a
    public final void g() {
        Object obj = this.f39227a;
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((i) obj).f6630b.clear();
    }

    public final ArrayList j() {
        g gVar = (g) this.f39228b;
        if (gVar instanceof i) {
            return ((i) gVar).f6630b;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }

    @Override // l1.d
    public final void k(int i11, int i12, int i13) {
        ArrayList arrayListJ = j();
        int i14 = i11 > i12 ? i12 : i12 - i13;
        if (i13 != 1) {
            List listSubList = arrayListJ.subList(i11, i13 + i11);
            ArrayList arrayListC1 = ry.m.c1(listSubList);
            listSubList.clear();
            arrayListJ.addAll(i14, arrayListC1);
            return;
        }
        if (i11 == i12 + 1 || i11 == i12 - 1) {
            arrayListJ.set(i11, arrayListJ.set(i12, arrayListJ.get(i11)));
        } else {
            arrayListJ.add(i14, arrayListJ.remove(i11));
        }
    }

    @Override // l1.d
    public final void l(int i11, int i12) {
        ArrayList arrayListJ = j();
        if (i12 == 1) {
            arrayListJ.remove(i11);
        } else {
            arrayListJ.subList(i11, i12 + i11).clear();
        }
    }

    @Override // l1.d
    public final void v(int i11, Object obj) {
        g gVar = (g) obj;
        Object obj2 = this.f39228b;
        kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        int i12 = ((i) obj2).f6629a;
        if (i12 > 0) {
            if (gVar instanceof i) {
                ((i) gVar).f6629a = i12 - 1;
            }
            j().add(i11, gVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        Object obj3 = this.f39227a;
        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        sb2.append(((i) obj3).f6629a);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
}
