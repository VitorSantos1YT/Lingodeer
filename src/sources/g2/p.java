package g2;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import d0.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorFilter f28589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28591c;

    public p(long j11, int i11) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            h2.e();
            porterDuffColorFilter = h2.a(f0.E(j11), b.d(i11));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(f0.E(j11), b.e(i11));
        }
        this.f28589a = porterDuffColorFilter;
        this.f28590b = j11;
        this.f28591c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return x.d(this.f28590b, pVar.f28590b) && this.f28591c == pVar.f28591c;
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Integer.hashCode(this.f28591c) + (Long.hashCode(this.f28590b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        com.google.android.material.datepicker.d.t(this.f28590b, ", blendMode=", sb2);
        sb2.append((Object) f0.H(this.f28591c));
        sb2.append(')');
        return sb2.toString();
    }
}
