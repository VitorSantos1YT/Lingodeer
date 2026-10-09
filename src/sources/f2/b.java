package f2;

import cf.x;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26570a;

    public static long a(float f5, int i11, long j11) {
        float fIntBitsToFloat = (i11 & 1) != 0 ? Float.intBitsToFloat((int) (j11 >> 32)) : CropImageView.DEFAULT_ASPECT_RATIO;
        if ((i11 & 2) != 0) {
            f5 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    public static final long b(long j11, float f5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f5;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f5;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static final float d(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float e(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float f(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final long g(long j11, long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long h(long j11, long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long i(long j11, float f5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f5;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f5;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static String j(long j11) {
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + x.P(Float.intBitsToFloat((int) (j11 >> 32))) + ", " + x.P(Float.intBitsToFloat((int) (j11 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f26570a == ((b) obj).f26570a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26570a);
    }

    public final String toString() {
        return j(this.f26570a);
    }
}
