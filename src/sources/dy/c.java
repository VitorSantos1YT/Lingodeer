package dy;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f24563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24564c;

    public c(int i11, ThreadFactory threadFactory) {
        this.f24562a = i11;
        this.f24563b = new d[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f24563b[i12] = new d(threadFactory);
        }
    }

    public final d a() {
        int i11 = this.f24562a;
        if (i11 == 0) {
            return e.f24568g;
        }
        long j11 = this.f24564c;
        this.f24564c = 1 + j11;
        return this.f24563b[(int) (j11 % ((long) i11))];
    }
}
