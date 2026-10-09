package t7;

import b7.f0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52063d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f52060a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52061b = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52064e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f52065f = new a[100];

    public final synchronized void a(int i11) {
        boolean z11 = i11 < this.f52062c;
        this.f52062c = i11;
        if (z11) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, f0.e(this.f52062c, this.f52061b) - this.f52063d);
        int i11 = this.f52064e;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.f52065f, iMax, i11, (Object) null);
        this.f52064e = iMax;
    }
}
