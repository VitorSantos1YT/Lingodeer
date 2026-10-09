package d0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.v1 f22782b;

    public q1() {
        long jE = g2.f0.e(4284900966L);
        j0.v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3);
        this.f22781a = jE;
        this.f22782b = v1VarD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        q1 q1Var = (q1) obj;
        return g2.x.d(this.f22781a, q1Var.f22781a) && kotlin.jvm.internal.m.a(this.f22782b, q1Var.f22782b);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return this.f22782b.hashCode() + (Long.hashCode(this.f22781a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        com.google.android.material.datepicker.d.t(this.f22781a, ", drawPadding=", sb2);
        sb2.append(this.f22782b);
        sb2.append(')');
        return sb2.toString();
    }
}
