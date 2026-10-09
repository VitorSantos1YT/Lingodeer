package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends v1 {
    @Override // d0.v1, d0.t1
    public final void a(long j11, long j12) {
        if (!Float.isNaN(Float.NaN)) {
            this.f22816a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j12) != 9205357640488583168L) {
            this.f22816a.show(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
        } else {
            this.f22816a.show(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
    }
}
