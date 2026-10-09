package zu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59489a;

    public l1(List users) {
        kotlin.jvm.internal.m.f(users, "users");
        this.f59489a = users;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && kotlin.jvm.internal.m.a(this.f59489a, ((l1) obj).f59489a);
    }

    public final int hashCode() {
        return this.f59489a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f59489a, "Success(users=", ")");
    }
}
