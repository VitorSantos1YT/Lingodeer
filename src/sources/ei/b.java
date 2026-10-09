package ei;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25575a;

    public b(List list) {
        this.f25575a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.m.a(this.f25575a, ((b) obj).f25575a);
    }

    public final int hashCode() {
        return this.f25575a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f25575a, "ARAlphabetFormsTableRow(cells=", ")");
    }
}
