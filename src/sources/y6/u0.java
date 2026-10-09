package y6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f57364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f57366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f57367e;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(3);
        b7.f0.G(4);
    }

    public u0(p0 p0Var, boolean z11, int[] iArr, boolean[] zArr) {
        int i11 = p0Var.f57304a;
        this.f57363a = i11;
        boolean z12 = false;
        b7.a.d(i11 == iArr.length && i11 == zArr.length);
        this.f57364b = p0Var;
        if (z11 && i11 > 1) {
            z12 = true;
        }
        this.f57365c = z12;
        this.f57366d = (int[]) iArr.clone();
        this.f57367e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i11) {
        return this.f57366d[i11] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f57365c == u0Var.f57365c && this.f57364b.equals(u0Var.f57364b) && Arrays.equals(this.f57366d, u0Var.f57366d) && Arrays.equals(this.f57367e, u0Var.f57367e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57367e) + ((Arrays.hashCode(this.f57366d) + (((this.f57364b.hashCode() * 31) + (this.f57365c ? 1 : 0)) * 31)) * 31);
    }
}
