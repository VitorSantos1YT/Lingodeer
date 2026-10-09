package gp;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29393a;

    public i(List histories) {
        kotlin.jvm.internal.m.f(histories, "histories");
        this.f29393a = histories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.m.a(this.f29393a, ((i) obj).f29393a);
    }

    public final int hashCode() {
        return this.f29393a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f29393a, "Success(histories=", ")");
    }
}
