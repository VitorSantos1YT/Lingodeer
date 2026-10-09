package zr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59331a;

    public z(List groups) {
        kotlin.jvm.internal.m.f(groups, "groups");
        this.f59331a = groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.m.a(this.f59331a, ((z) obj).f59331a);
    }

    public final int hashCode() {
        return this.f59331a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f59331a, "Success(groups=", ")");
    }
}
