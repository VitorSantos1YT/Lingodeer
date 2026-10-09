package g2;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f28572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28574e;

    public j0(long j11, long j12, List list) {
        this.f28572c = list;
        this.f28573d = j11;
        this.f28574e = j12;
    }

    @Override // g2.u0
    public final Shader b(long j11) {
        long j12 = this.f28573d;
        int i11 = (int) (j12 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j11 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j11 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12);
        long j13 = this.f28574e;
        int i13 = (int) (j13 >> 32);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j11 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
        int i14 = (int) (j13 & 4294967295L);
        if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
            i14 = (int) (j11 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i14);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f28572c;
        f0.J(list);
        int iM = f0.m(list);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), f0.w(iM, list), f0.x(iM, list), f0.D(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.m.a(this.f28572c, j0Var.f28572c) && f2.b.c(this.f28573d, j0Var.f28573d) && f2.b.c(this.f28574e, j0Var.f28574e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + defpackage.e.f(this.f28574e, defpackage.e.f(this.f28573d, this.f28572c.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        String str;
        long j11 = this.f28573d;
        long j12 = (((j11 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String str2 = BuildConfig.VERSION_NAME;
        if (j12 == 0) {
            str = "start=" + ((Object) f2.b.j(j11)) + ", ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        long j13 = this.f28574e;
        if (((((j13 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) f2.b.j(j13)) + ", ";
        }
        return "LinearGradient(colors=" + this.f28572c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) f0.I(0)) + ')';
    }
}
