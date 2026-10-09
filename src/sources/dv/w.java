package dv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class w {
    public static final v Companion = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qy.h[] f24528b = {com.bumptech.glide.d.u(qy.j.PUBLICATION, new cr.m(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24529a;

    public /* synthetic */ w(int i11, List list) {
        if ((i11 & 1) == 0) {
            this.f24529a = ry.r.f50854a;
        } else {
            this.f24529a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && kotlin.jvm.internal.m.a(this.f24529a, ((w) obj).f24529a);
    }

    public final int hashCode() {
        return this.f24529a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f24529a, "GeminiContent(parts=", ")");
    }

    public w() {
        this.f24529a = ry.r.f50854a;
    }
}
