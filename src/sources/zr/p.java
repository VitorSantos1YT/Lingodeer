package zr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59318a;

    public p(List list) {
        this.f59318a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.m.a(this.f59318a, ((p) obj).f59318a);
    }

    public final int hashCode() {
        return this.f59318a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f59318a, "Success(levels=", ")");
    }
}
