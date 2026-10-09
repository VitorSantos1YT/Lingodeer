package y6;

import am.rVFB.LwKl;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f57194h = new g(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f57198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f57200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57201g;

    static {
        w4.c.s(0, 1, 2, 3, 4);
        b7.f0.G(5);
    }

    public g(int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f57195a = i11;
        this.f57196b = i12;
        this.f57197c = i13;
        this.f57198d = bArr;
        this.f57199e = i14;
        this.f57200f = i15;
    }

    public static String a(int i11) {
        if (i11 == -1) {
            return "Unset color range";
        }
        if (i11 != 1) {
            return i11 != 2 ? nv.p.j(i11, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i11) {
        if (i11 == -1) {
            return "Unset color space";
        }
        if (i11 == 6) {
            return "BT2020";
        }
        if (i11 != 1) {
            return i11 != 2 ? nv.p.j(i11, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i11) {
        if (i11 == -1) {
            return "Unset color transfer";
        }
        if (i11 == 10) {
            return "Gamma 2.2";
        }
        if (i11 == 1) {
            return "Linear";
        }
        if (i11 == 2) {
            return "sRGB";
        }
        if (i11 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i11 != 6) {
            return i11 != 7 ? nv.p.j(i11, "Undefined color transfer ") : LwKl.aYmE;
        }
        return "ST2084 PQ";
    }

    public static boolean e(g gVar) {
        if (gVar == null) {
            return true;
        }
        int i11 = gVar.f57195a;
        if (i11 != -1 && i11 != 1 && i11 != 2) {
            return false;
        }
        int i12 = gVar.f57196b;
        if (i12 != -1 && i12 != 2) {
            return false;
        }
        int i13 = gVar.f57197c;
        if ((i13 != -1 && i13 != 3) || gVar.f57198d != null) {
            return false;
        }
        int i14 = gVar.f57200f;
        if (i14 != -1 && i14 != 8) {
            return false;
        }
        int i15 = gVar.f57199e;
        return i15 == -1 || i15 == 8;
    }

    public static int f(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i11) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 4) {
            return 10;
        }
        if (i11 == 13) {
            return 2;
        }
        if (i11 == 16) {
            return 6;
        }
        if (i11 != 18) {
            return (i11 == 6 || i11 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f57195a == -1 || this.f57196b == -1 || this.f57197c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f57195a == gVar.f57195a && this.f57196b == gVar.f57196b && this.f57197c == gVar.f57197c && Arrays.equals(this.f57198d, gVar.f57198d) && this.f57199e == gVar.f57199e && this.f57200f == gVar.f57200f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f57201g == 0) {
            this.f57201g = ((((Arrays.hashCode(this.f57198d) + ((((((527 + this.f57195a) * 31) + this.f57196b) * 31) + this.f57197c) * 31)) * 31) + this.f57199e) * 31) + this.f57200f;
        }
        return this.f57201g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f57195a));
        sb2.append(", ");
        sb2.append(a(this.f57196b));
        sb2.append(", ");
        sb2.append(c(this.f57197c));
        sb2.append(", ");
        sb2.append(this.f57198d != null);
        sb2.append(", ");
        int i11 = this.f57199e;
        sb2.append(i11 != -1 ? w4.c.f(i11, "bit Luma") : "NA");
        sb2.append(", ");
        int i12 = this.f57200f;
        return ep.a.k(sb2, i12 != -1 ? w4.c.f(i12, "bit Chroma") : "NA", ")");
    }
}
