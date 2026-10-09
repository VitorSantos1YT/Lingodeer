package n8;

import b7.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43467c;

    public a(long j11, int i11, long j12) {
        this.f43465a = i11;
        switch (i11) {
            case 1:
                this.f43466b = j11;
                this.f43467c = j12;
                break;
            default:
                this.f43466b = j12;
                this.f43467c = j11;
                break;
        }
    }

    public static long d(long j11, w wVar) {
        long jW = wVar.w();
        if ((128 & jW) != 0) {
            return 8589934591L & ((((jW & 1) << 32) | wVar.y()) + j11);
        }
        return -9223372036854775807L;
    }

    @Override // n8.b
    public final String toString() {
        switch (this.f43465a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f43466b);
                sb2.append(", identifier= ");
                return defpackage.e.i(this.f43467c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f43466b);
                sb3.append(", playbackPositionUs= ");
                return defpackage.e.i(this.f43467c, " }", sb3);
        }
    }
}
