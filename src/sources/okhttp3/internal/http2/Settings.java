package okhttp3.internal.http2;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f45497b = new int[10];

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public final int a() {
        if ((this.f45496a & 16) != 0) {
            return this.f45497b[4];
        }
        return 65535;
    }

    public final void b(Settings other) {
        m.f(other, "other");
        for (int i11 = 0; i11 < 10; i11++) {
            if (((1 << i11) & other.f45496a) != 0) {
                c(i11, other.f45497b[i11]);
            }
        }
    }

    public final void c(int i11, int i12) {
        if (i11 >= 0) {
            int[] iArr = this.f45497b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f45496a = (1 << i11) | this.f45496a;
            iArr[i11] = i12;
        }
    }
}
