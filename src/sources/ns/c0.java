package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class c0 {
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qy.h[] f43962c = {null, com.bumptech.glide.d.u(qy.j.PUBLICATION, new d(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43964b;

    public /* synthetic */ c0(int i11, String str, List list) {
        this.f43963a = (i11 & 1) == 0 ? BuildConfig.VERSION_NAME : str;
        if ((i11 & 2) == 0) {
            this.f43964b = ry.r.f50854a;
        } else {
            this.f43964b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f43963a, c0Var.f43963a) && kotlin.jvm.internal.m.a(this.f43964b, c0Var.f43964b);
    }

    public final int hashCode() {
        return this.f43964b.hashCode() + (this.f43963a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseMistakeExplainExample(fullTranslation=" + this.f43963a + ", tokens=" + this.f43964b + ")";
    }
}
