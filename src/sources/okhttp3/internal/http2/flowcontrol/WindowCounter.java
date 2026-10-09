package okhttp3.internal.http2.flowcontrol;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class WindowCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45511c;

    public WindowCounter(int i11) {
        this.f45509a = i11;
    }

    public static void b(WindowCounter windowCounter, long j11, long j12, int i11) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        if ((i11 & 2) != 0) {
            j12 = 0;
        }
        synchronized (windowCounter) {
            try {
                if (j11 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j12 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j13 = windowCounter.f45510b + j11;
                windowCounter.f45510b = j13;
                long j14 = windowCounter.f45511c + j12;
                windowCounter.f45511c = j14;
                if (j14 > j13) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized long a() {
        return this.f45510b - this.f45511c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f45509a + ", total=" + this.f45510b + ", acknowledged=" + this.f45511c + ", unacknowledged=" + a() + ')';
    }
}
