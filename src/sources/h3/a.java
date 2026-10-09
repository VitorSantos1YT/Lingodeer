package h3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f31533a = (((long) 1023) << 50) ^ (-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f31534b = (-1) ^ (((long) 33554431) << 25);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f31535c;

    static {
        long j11 = 33554431;
        f31535c = j11 | (((long) Math.min(0, 1023)) << 50) | (j11 << 25);
    }
}
