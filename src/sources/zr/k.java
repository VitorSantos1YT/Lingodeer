package zr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59308a;

    public k(List charGroups) {
        kotlin.jvm.internal.m.f(charGroups, "charGroups");
        this.f59308a = charGroups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.f59308a, ((k) obj).f59308a);
    }

    public final int hashCode() {
        return this.f59308a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f59308a, "Success(charGroups=", ")");
    }
}
