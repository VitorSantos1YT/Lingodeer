package q6;

import b1.p;
import gb.r;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f47478a;

    public c(float[] fArr) {
        this.f47478a = fArr;
        if (fArr.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public final float a() {
        return this.f47478a[6];
    }

    public final float b() {
        return this.f47478a[7];
    }

    public final long c(float f5) {
        float f11 = 1 - f5;
        float[] fArr = this.f47478a;
        float f12 = f11 * f11 * f11;
        float f13 = 3 * f5;
        float f14 = f13 * f11 * f11;
        float f15 = f13 * f5 * f11;
        float f16 = f5 * f5 * f5;
        return y.h.a((a() * f16) + (fArr[4] * f15) + (fArr[2] * f14) + (fArr[0] * f12), (b() * f16) + (fArr[5] * f15) + (fArr[3] * f14) + (fArr[1] * f12));
    }

    public final qy.l d(float f5) {
        float f11 = 1 - f5;
        long jC = c(f5);
        float[] fArr = this.f47478a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[2];
        float f15 = fArr[3];
        float f16 = f11 * f11;
        float f17 = 2 * f11 * f5;
        float f18 = f5 * f5;
        return new qy.l(ew.a.b(f12, f13, (f14 * f5) + (f12 * f11), (f15 * f5) + (f13 * f11), (fArr[4] * f18) + (f14 * f17) + (f12 * f16), (fArr[5] * f18) + (f15 * f17) + (f13 * f16), r.y(jC), r.z(jC)), ew.a.b(r.y(jC), r.z(jC), (a() * f18) + (fArr[4] * f17) + (fArr[2] * f16), (b() * f18) + (fArr[5] * f17) + (fArr[3] * f16), (a() * f5) + (fArr[4] * f11), (b() * f5) + (fArr[5] * f11), a(), b()));
    }

    public final j e(p pVar) {
        float[] fArr = new float[8];
        j jVar = new j(fArr);
        float[] fArr2 = this.f47478a;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        jVar.f(pVar, 0);
        jVar.f(pVar, 2);
        jVar.f(pVar, 4);
        jVar.f(pVar, 6);
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return Arrays.equals(this.f47478a, ((c) obj).f47478a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f47478a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("anchor0: (");
        float[] fArr = this.f47478a;
        sb2.append(fArr[0]);
        sb2.append(", ");
        sb2.append(fArr[1]);
        sb2.append(") control0: (");
        sb2.append(fArr[2]);
        sb2.append(", ");
        sb2.append(fArr[3]);
        sb2.append("), control1: (");
        sb2.append(fArr[4]);
        sb2.append(", ");
        sb2.append(fArr[5]);
        sb2.append("), anchor1: (");
        sb2.append(a());
        sb2.append(", ");
        sb2.append(b());
        sb2.append(')');
        return sb2.toString();
    }
}
