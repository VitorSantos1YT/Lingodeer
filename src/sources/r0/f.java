package r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f48733a = a();

    public static final e a() {
        c cVar = new c(50);
        return new e(cVar, cVar, cVar, cVar);
    }

    public static final e b(int i11, int i12, int i13, int i14) {
        return new e(new c(i11), new c(i12), new c(i13), new c(i14));
    }

    public static /* synthetic */ e c(int i11, int i12) {
        int i13 = (i12 & 1) != 0 ? 0 : 50;
        int i14 = (i12 & 2) != 0 ? 0 : 50;
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return b(i13, i14, i11, (i12 & 8) != 0 ? 0 : 50);
    }

    public static final e d(float f5) {
        b bVar = new b(f5);
        return new e(bVar, bVar, bVar, bVar);
    }

    public static final e e(float f5, float f11, float f12, float f13) {
        return new e(new b(f5), new b(f11), new b(f12), new b(f13));
    }

    public static e f(float f5, float f11, float f12, float f13, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        if ((i11 & 4) != 0) {
            f12 = 0;
        }
        if ((i11 & 8) != 0) {
            f13 = 0;
        }
        return e(f5, f11, f12, f13);
    }
}
