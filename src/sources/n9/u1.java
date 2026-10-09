package n9;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends v1 implements Iterable, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43709e;

    static {
        new u1(ry.r.f50854a, null, null, 0, 0);
    }

    public u1(List list, Object obj, Object obj2, int i11, int i12) {
        this.f43705a = list;
        this.f43706b = obj;
        this.f43707c = obj2;
        this.f43708d = i11;
        this.f43709e = i12;
        if (i11 != Integer.MIN_VALUE && i11 < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i12 != Integer.MIN_VALUE && i12 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.m.a(this.f43705a, u1Var.f43705a) && kotlin.jvm.internal.m.a(this.f43706b, u1Var.f43706b) && kotlin.jvm.internal.m.a(this.f43707c, u1Var.f43707c) && this.f43708d == u1Var.f43708d && this.f43709e == u1Var.f43709e;
    }

    public final int hashCode() {
        int iHashCode = this.f43705a.hashCode() * 31;
        Object obj = this.f43706b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f43707c;
        return Integer.hashCode(this.f43709e) + defpackage.e.b(this.f43708d, (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f43705a.listIterator();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.f43705a;
        sb2.append(list.size());
        sb2.append("\n                    |   first Item: ");
        sb2.append(ry.m.s0(list));
        sb2.append("\n                    |   last Item: ");
        sb2.append(ry.m.A0(list));
        sb2.append("\n                    |   nextKey: ");
        sb2.append(this.f43707c);
        sb2.append("\n                    |   prevKey: ");
        sb2.append(this.f43706b);
        sb2.append("\n                    |   itemsBefore: ");
        sb2.append(this.f43708d);
        sb2.append("\n                    |   itemsAfter: ");
        sb2.append(this.f43709e);
        sb2.append("\n                    |) ");
        return oz.r.h0(sb2.toString());
    }
}
