package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49955a;

    public k1(List items) {
        kotlin.jvm.internal.m.f(items, "items");
        this.f49955a = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && kotlin.jvm.internal.m.a(this.f49955a, ((k1) obj).f49955a);
    }

    public final int hashCode() {
        return this.f49955a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f49955a, "Success(items=", ")");
    }
}
