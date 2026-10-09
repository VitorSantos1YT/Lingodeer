package c1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6411a = a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6412b = 0;

    public static long a(float f5, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static String b(long j11) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j11 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j11 & 4294967295L)) + ')';
    }
}
