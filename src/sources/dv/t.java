package dv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class t {
    public static final s Companion = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qy.h[] f24512b = {com.bumptech.glide.d.u(qy.j.PUBLICATION, new cr.m(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24513a;

    public /* synthetic */ t(int i11, List list) {
        if ((i11 & 1) == 0) {
            this.f24513a = ry.r.f50854a;
        } else {
            this.f24513a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.m.a(this.f24513a, ((t) obj).f24513a);
    }

    public final int hashCode() {
        return this.f24513a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f24513a, "GeminiCompletion(candidates=", ")");
    }
}
