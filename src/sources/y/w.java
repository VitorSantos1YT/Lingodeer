package y;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f56782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56783b;

    public w(int i11) {
        this.f56782a = i11 == 0 ? o.f56744a : new int[i11];
    }

    public final void a(int i11) {
        b(this.f56783b + 1);
        int[] iArr = this.f56782a;
        int i12 = this.f56783b;
        iArr[i12] = i11;
        this.f56783b = i12 + 1;
    }

    public final void b(int i11) {
        int[] iArr = this.f56782a;
        if (iArr.length < i11) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f56782a = iArrCopyOf;
        }
    }

    public final int c(int i11) {
        if (i11 >= 0 && i11 < this.f56783b) {
            return this.f56782a[i11];
        }
        z.a.d("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i11 = this.f56783b;
        if (i11 != 0) {
            return this.f56782a[i11 - 1];
        }
        z.a.e("IntList is empty.");
        throw null;
    }

    public final void e(int i11) {
        int[] iArr = this.f56782a;
        int i12 = this.f56783b;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                i13 = -1;
                break;
            } else if (i11 == iArr[i13]) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            f(i13);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i11 = wVar.f56783b;
            int i12 = this.f56783b;
            if (i11 == i12) {
                int[] iArr = this.f56782a;
                int[] iArr2 = wVar.f56782a;
                lz.g gVarU = hz.b.U(0, i12);
                int i13 = gVarU.f40532a;
                int i14 = gVarU.f40533b;
                if (i13 > i14) {
                    return true;
                }
                while (iArr[i13] == iArr2[i13]) {
                    if (i13 == i14) {
                        return true;
                    }
                    i13++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f56783b)) {
            z.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f56782a;
        int i13 = iArr[i11];
        if (i11 != i12 - 1) {
            ry.l.H(i11, i11 + 1, iArr, iArr, i12);
        }
        this.f56783b--;
    }

    public final void g(int i11, int i12) {
        if (i11 < 0 || i11 >= this.f56783b) {
            z.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f56782a;
        int i13 = iArr[i11];
        iArr[i11] = i12;
    }

    public final int hashCode() {
        int[] iArr = this.f56782a;
        int i11 = this.f56783b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += Integer.hashCode(iArr[i12]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f56782a;
        int i11 = this.f56783b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i13);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.m.e(string2, "toString(...)");
        return string2;
    }

    public /* synthetic */ w() {
        this(16);
    }
}
