package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface d0 extends m {
    @Override // b0.m
    default l2 a(j2 j2Var) {
        return new dm.c(this);
    }

    long b(float f5, float f11, float f12);

    float c(float f5, float f11, float f12, long j11);

    default float d(float f5, float f11, float f12) {
        return c(f5, f11, f12, b(f5, f11, f12));
    }

    float e(float f5, float f11, float f12, long j11);
}
