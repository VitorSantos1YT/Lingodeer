package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements g2.w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f35753a = new p();

    @Override // g2.w0
    public final g2.f0 a(long j11, v3.m mVar, v3.c cVar) {
        float fC = f2.e.c(j11) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
        return new g2.n0(com.bumptech.glide.f.b(com.bumptech.glide.e.e(0L, j11), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
    }
}
