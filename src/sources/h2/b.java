package h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f31451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f31452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f31453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f31454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31455e = 0;

    static {
        long j11 = 3;
        long j12 = j11 << 32;
        f31451a = (((long) 0) & 4294967295L) | j12;
        f31452b = (((long) 1) & 4294967295L) | j12;
        f31453c = j12 | (((long) 2) & 4294967295L);
        f31454d = (j11 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j11, long j12) {
        return j11 == j12;
    }

    public static String b(long j11) {
        if (a(j11, f31451a)) {
            return "Rgb";
        }
        if (a(j11, f31452b)) {
            return "Xyz";
        }
        if (a(j11, f31453c)) {
            return "Lab";
        }
        return a(j11, f31454d) ? "Cmyk" : "Unknown";
    }
}
