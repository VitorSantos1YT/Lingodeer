package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f56712a;

    static {
        long[] jArr = r0.f56756a;
        int iD = r0.d(0);
        int iMax = iD > 0 ? Math.max(7, r0.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ry.l.R(jArr, -9187201950435737472L);
        }
        int i11 = iMax >> 3;
        long j11 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j11)) | j11;
        float[] fArr = new float[iMax];
        f56712a = new float[0];
    }
}
