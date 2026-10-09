package xv;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f56593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f56594f;

    public b() {
        this.f56589a = 0L;
        this.f56590b = 0L;
        this.f56591c = 0L;
        this.f56592d = 0L;
        this.f56593e = false;
        this.f56594f = true;
    }

    public final String toString() {
        int i11 = ew.f.f25949a;
        Locale locale = Locale.ENGLISH;
        StringBuilder sbJ = w4.c.j(this.f56589a, "range[", ", ");
        sbJ.append(this.f56591c);
        sbJ.append(") current offset[");
        sbJ.append(this.f56590b);
        sbJ.append("]");
        return sbJ.toString();
    }

    public b(long j11, long j12, long j13, long j14, boolean z11) {
        if ((j11 == 0 && j13 == 0) || !z11) {
            this.f56589a = j11;
            this.f56590b = j12;
            this.f56591c = j13;
            this.f56592d = j14;
            this.f56593e = z11;
            this.f56594f = false;
            return;
        }
        throw new IllegalArgumentException();
    }
}
