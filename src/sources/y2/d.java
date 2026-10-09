package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56843a;

    public static final int b(int i11, long j11) {
        int i12 = e2.f56852b;
        return ((int) (j11 >> (i11 * 15))) & 32767;
    }

    public static long d(int i11, int i12, int i13, int i14) {
        return (((long) (i12 & 32767)) << 15) | ((long) (i11 & 32767)) | (((long) (i13 & 32767)) << 30) | (((long) (i14 & 32767)) << 45) | Long.MIN_VALUE;
    }

    @Override // x2.g
    public Object a(x2.h hVar) {
        return hVar.f55760a.invoke();
    }

    public int c() {
        switch (this.f56843a) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }
}
