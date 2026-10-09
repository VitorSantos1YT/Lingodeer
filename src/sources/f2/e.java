package f2;

import cf.x;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26584a;

    public /* synthetic */ e(long j11) {
        this.f26584a = j11;
    }

    public static final boolean a(long j11, long j12) {
        return j11 == j12;
    }

    public static final float b(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final float c(long j11) {
        return Math.min(Float.intBitsToFloat((int) ((j11 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j11 & 2147483647L)));
    }

    public static final float d(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final boolean e(long j11) {
        return (j11 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j11 >> 32)) <= CropImageView.DEFAULT_ASPECT_RATIO) | (Float.intBitsToFloat((int) (j11 & 4294967295L)) <= CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public static String f(long j11) {
        if (j11 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + x.P(Float.intBitsToFloat((int) (j11 >> 32))) + ", " + x.P(Float.intBitsToFloat((int) (j11 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f26584a == ((e) obj).f26584a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26584a);
    }

    public final String toString() {
        return f(this.f26584a);
    }
}
