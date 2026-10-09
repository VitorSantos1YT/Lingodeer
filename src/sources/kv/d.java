package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f38724c;

    public d(List list, List list2, z0 z0Var) {
        this.f38722a = list;
        this.f38723b = list2;
        this.f38724c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f38722a, dVar.f38722a) && kotlin.jvm.internal.m.a(this.f38723b, dVar.f38723b) && kotlin.jvm.internal.m.a(this.f38724c, dVar.f38724c);
    }

    public final int hashCode() {
        return this.f38724c.hashCode() + hh.p0.b(this.f38722a.hashCode() * 31, 31, this.f38723b);
    }

    public final String toString() {
        return "GojūonChartData(columnHeaders=" + this.f38722a + ", rows=" + this.f38723b + ", nCell=" + this.f38724c + ")";
    }
}
