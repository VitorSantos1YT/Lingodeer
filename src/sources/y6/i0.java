package y6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f57206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f57208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f57209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f57211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f57212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f57213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f57214i;

    static {
        w4.c.s(0, 1, 2, 3, 4);
        b7.f0.G(5);
        b7.f0.G(6);
    }

    public i0(Object obj, int i11, x xVar, Object obj2, int i12, long j11, long j12, int i13, int i14) {
        this.f57206a = obj;
        this.f57207b = i11;
        this.f57208c = xVar;
        this.f57209d = obj2;
        this.f57210e = i12;
        this.f57211f = j11;
        this.f57212g = j12;
        this.f57213h = i13;
        this.f57214i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f57207b == i0Var.f57207b && this.f57210e == i0Var.f57210e && this.f57211f == i0Var.f57211f && this.f57212g == i0Var.f57212g && this.f57213h == i0Var.f57213h && this.f57214i == i0Var.f57214i && Objects.equals(this.f57208c, i0Var.f57208c) && Objects.equals(this.f57206a, i0Var.f57206a) && Objects.equals(this.f57209d, i0Var.f57209d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f57206a, Integer.valueOf(this.f57207b), this.f57208c, this.f57209d, Integer.valueOf(this.f57210e), Long.valueOf(this.f57211f), Long.valueOf(this.f57212g), Integer.valueOf(this.f57213h), Integer.valueOf(this.f57214i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f57207b + ", period=" + this.f57210e + ", pos=" + this.f57211f;
        int i11 = this.f57213h;
        if (i11 == -1) {
            return str;
        }
        StringBuilder sbR = defpackage.e.r(str, ", contentPos=");
        sbR.append(this.f57212g);
        sbR.append(", adGroup=");
        sbR.append(i11);
        sbR.append(", ad=");
        sbR.append(this.f57214i);
        return sbR.toString();
    }
}
