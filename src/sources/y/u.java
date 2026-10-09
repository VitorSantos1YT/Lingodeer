package y;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f56768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56769b;

    public u(int i11) {
        this.f56768a = i11 == 0 ? i.f56712a : new float[i11];
    }

    public static String c(u uVar, int i11) {
        int i12 = i11 & 2;
        String str = BuildConfig.VERSION_NAME;
        String str2 = i12 != 0 ? BuildConfig.VERSION_NAME : "[";
        if ((i11 & 4) == 0) {
            str = "]";
        }
        uVar.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        float[] fArr = uVar.f56768a;
        int i13 = uVar.f56769b;
        for (int i14 = 0; i14 < i13; i14++) {
            float f5 = fArr[i14];
            if (i14 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
            }
            if (i14 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(f5);
        }
        sb2.append((CharSequence) str);
        String string2 = sb2.toString();
        kotlin.jvm.internal.m.e(string2, "toString(...)");
        return string2;
    }

    public final void a(float f5) {
        int i11 = this.f56769b + 1;
        float[] fArr = this.f56768a;
        if (fArr.length < i11) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i11, (fArr.length * 3) / 2));
            kotlin.jvm.internal.m.e(fArrCopyOf, "copyOf(...)");
            this.f56768a = fArrCopyOf;
        }
        float[] fArr2 = this.f56768a;
        int i12 = this.f56769b;
        fArr2[i12] = f5;
        this.f56769b = i12 + 1;
    }

    public final float b(int i11) {
        if (i11 >= 0 && i11 < this.f56769b) {
            return this.f56768a[i11];
        }
        z.a.d("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            int i11 = uVar.f56769b;
            int i12 = this.f56769b;
            if (i11 == i12) {
                float[] fArr = this.f56768a;
                float[] fArr2 = uVar.f56768a;
                lz.g gVarU = hz.b.U(0, i12);
                int i13 = gVarU.f40532a;
                int i14 = gVarU.f40533b;
                if (i13 > i14) {
                    return true;
                }
                while (fArr[i13] == fArr2[i13]) {
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

    public final int hashCode() {
        float[] fArr = this.f56768a;
        int i11 = this.f56769b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += Float.hashCode(fArr[i12]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        return c(this, 25);
    }
}
