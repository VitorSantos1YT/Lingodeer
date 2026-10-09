package km;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38228c;

    public k2(ArrayList arrayList, List list, List resultCells) {
        kotlin.jvm.internal.m.f(resultCells, "resultCells");
        this.f38226a = arrayList;
        this.f38227b = list;
        this.f38228c = resultCells;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f38226a.equals(k2Var.f38226a) && this.f38227b.equals(k2Var.f38227b) && kotlin.jvm.internal.m.a(this.f38228c, k2Var.f38228c);
    }

    public final int hashCode() {
        return this.f38228c.hashCode() + hh.p0.b(this.f38226a.hashCode() * 31, 31, this.f38227b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("YoonTableData(baseCells=");
        sb2.append(this.f38226a);
        sb2.append(", middleCells=");
        sb2.append(this.f38227b);
        sb2.append(", resultCells=");
        return b7.e0.n(sb2, this.f38228c, ")");
    }
}
