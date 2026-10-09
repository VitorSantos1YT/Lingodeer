package g2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v0 f28610d = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28613c;

    public v0(long j11, long j12, float f5) {
        this.f28611a = j11;
        this.f28612b = j12;
        this.f28613c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return x.d(this.f28611a, v0Var.f28611a) && f2.b.c(this.f28612b, v0Var.f28612b) && this.f28613c == v0Var.f28613c;
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Float.hashCode(this.f28613c) + defpackage.e.f(this.f28612b, Long.hashCode(this.f28611a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        com.google.android.material.datepicker.d.t(this.f28611a, ", offset=", sb2);
        sb2.append((Object) f2.b.j(this.f28612b));
        sb2.append(", blurRadius=");
        return defpackage.e.o(sb2, this.f28613c, ')');
    }

    public /* synthetic */ v0() {
        this(f0.e(4278190080L), 0L, CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
