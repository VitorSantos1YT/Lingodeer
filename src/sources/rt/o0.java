package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50162a;

    public o0(List types) {
        kotlin.jvm.internal.m.f(types, "types");
        this.f50162a = types;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && kotlin.jvm.internal.m.a(this.f50162a, ((o0) obj).f50162a);
    }

    public final int hashCode() {
        return this.f50162a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f50162a, "UpdateFocTypes(types=", ")");
    }
}
