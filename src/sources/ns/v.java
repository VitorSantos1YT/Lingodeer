package ns;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class v {
    public static final u Companion = new u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qy.h[] f44026c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f44028b;

    static {
        qy.j jVar = qy.j.PUBLICATION;
        f44026c = new qy.h[]{com.bumptech.glide.d.u(jVar, new d(4)), com.bumptech.glide.d.u(jVar, new d(5))};
    }

    public /* synthetic */ v(int i11, List list, List list2) {
        int i12 = i11 & 1;
        ry.r rVar = ry.r.f50854a;
        if (i12 == 0) {
            this.f44027a = rVar;
        } else {
            this.f44027a = list;
        }
        if ((i11 & 2) == 0) {
            this.f44028b = rVar;
        } else {
            this.f44028b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.m.a(this.f44027a, vVar.f44027a) && kotlin.jvm.internal.m.a(this.f44028b, vVar.f44028b);
    }

    public final int hashCode() {
        return this.f44028b.hashCode() + (this.f44027a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseMistakeExplainComparisonTable(columns=" + this.f44027a + ", data=" + this.f44028b + ")";
    }
}
