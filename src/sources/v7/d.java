package v7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f53596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f53597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f53598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f53599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f53600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f53601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f53602g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53603h;

    public final boolean a() {
        return this.f53599d > 15 && this.f53603h == 0;
    }

    public final void b(long j11) {
        long j12 = this.f53599d;
        if (j12 == 0) {
            this.f53596a = j11;
        } else if (j12 == 1) {
            long j13 = j11 - this.f53596a;
            this.f53597b = j13;
            this.f53601f = j13;
            this.f53600e = 1L;
        } else {
            long j14 = j11 - this.f53598c;
            int i11 = (int) (j12 % 15);
            long jAbs = Math.abs(j14 - this.f53597b);
            boolean[] zArr = this.f53602g;
            if (jAbs <= 1000000) {
                this.f53600e++;
                this.f53601f += j14;
                if (zArr[i11]) {
                    zArr[i11] = false;
                    this.f53603h--;
                }
            } else if (!zArr[i11]) {
                zArr[i11] = true;
                this.f53603h++;
            }
        }
        this.f53599d++;
        this.f53598c = j11;
    }

    public final void c() {
        this.f53599d = 0L;
        this.f53600e = 0L;
        this.f53601f = 0L;
        this.f53603h = 0;
        Arrays.fill(this.f53602g, false);
    }
}
