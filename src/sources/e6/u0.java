package e6;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f25054c;

    public u0(int i11, int i12, Map map) {
        this.f25052a = i11;
        this.f25053b = i12;
        this.f25054c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f25052a == u0Var.f25052a && this.f25053b == u0Var.f25053b && kotlin.jvm.internal.m.a(this.f25054c, u0Var.f25054c);
    }

    public final int hashCode() {
        return this.f25054c.hashCode() + defpackage.e.b(this.f25053b, Integer.hashCode(this.f25052a) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.f25052a + ", complexViewId=" + this.f25053b + ", children=" + this.f25054c + ')';
    }

    public /* synthetic */ u0(int i11, int i12, Map map, int i13) {
        this((i13 & 1) != 0 ? -1 : i11, (i13 & 2) != 0 ? -1 : i12, (i13 & 4) != 0 ? ry.s.f50855a : map);
    }
}
