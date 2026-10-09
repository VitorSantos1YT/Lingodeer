package wu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55389a;

    public g(List list) {
        this.f55389a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.m.a(this.f55389a, ((g) obj).f55389a);
    }

    public final int hashCode() {
        return this.f55389a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f55389a, "Success(histories=", ")");
    }
}
