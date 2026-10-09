package yr;

import g00.d1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c00.e
public final class h {
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qy.h[] f57873b = {com.bumptech.glide.d.u(qy.j.PUBLICATION, new uu.f(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f57874a;

    public /* synthetic */ h(int i11, List list) {
        if (1 == (i11 & 1)) {
            this.f57874a = list;
        } else {
            d1.k(i11, 1, f.f57872a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.m.a(this.f57874a, ((h) obj).f57874a);
    }

    public final int hashCode() {
        List list = this.f57874a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f57874a, "TopicsRoot(categories=", ")");
    }
}
