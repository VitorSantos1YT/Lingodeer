package g2;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f28593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28595e;

    public q0(List list, long j11, float f5) {
        this.f28593c = list;
        this.f28594d = j11;
        this.f28595e = f5;
    }

    @Override // g2.u0
    public final Shader b(long j11) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j12 = this.f28594d;
        if ((9223372034707292159L & j12) == 9205357640488583168L) {
            long jL = com.bumptech.glide.g.l(j11);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        } else {
            int i11 = (int) (j12 >> 32);
            if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
                i11 = (int) (j11 >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i11);
            int i12 = (int) (j12 & 4294967295L);
            if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
                i12 = (int) (j11 & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i12);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = this.f28595e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = f2.e.c(j11) / 2;
        }
        float f5 = fC;
        List list = this.f28593c;
        f0.J(list);
        int iM = f0.m(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f5, f0.w(iM, list), f0.x(iM, list), f0.D(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f28593c.equals(q0Var.f28593c) && f2.b.c(this.f28594d, q0Var.f28594d) && this.f28595e == q0Var.f28595e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + defpackage.e.a(defpackage.e.f(this.f28594d, this.f28593c.hashCode() * 961, 31), this.f28595e, 31);
    }

    public final String toString() {
        String str;
        long j11 = this.f28594d;
        long j12 = 9223372034707292159L & j11;
        String str2 = BuildConfig.VERSION_NAME;
        if (j12 != 9205357640488583168L) {
            str = "center=" + ((Object) f2.b.j(j11)) + ", ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        float f5 = this.f28595e;
        if ((Float.floatToRawIntBits(f5) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f5 + ", ";
        }
        return "RadialGradient(colors=" + this.f28593c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) f0.I(0)) + ')';
    }
}
