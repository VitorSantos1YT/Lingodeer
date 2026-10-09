package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f28486e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00.g f28487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.m0 f28488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f28490d;

    public x(e00.g descriptor, d0.m0 m0Var) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        this.f28487a = descriptor;
        this.f28488b = m0Var;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f28489c = iF != 64 ? (-1) << iF : 0L;
            this.f28490d = f28486e;
            return;
        }
        this.f28489c = 0L;
        int i11 = (iF - 1) >>> 6;
        long[] jArr = new long[i11];
        if ((iF & 63) != 0) {
            jArr[i11 - 1] = (-1) << iF;
        }
        this.f28490d = jArr;
    }
}
