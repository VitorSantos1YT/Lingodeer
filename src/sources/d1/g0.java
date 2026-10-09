package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f22912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g3.a0 f22913c = new g3.a0("SelectionHandleInfo");

    static {
        float f5 = 25;
        f22911a = f5;
        f22912b = f5;
    }

    public static final long a(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
