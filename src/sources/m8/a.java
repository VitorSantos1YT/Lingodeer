package m8;

import com.google.common.primitives.Longs;
import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41042e;

    public a(long j11, long j12, long j13, long j14, long j15) {
        this.f41038a = j11;
        this.f41039b = j12;
        this.f41040c = j13;
        this.f41041d = j14;
        this.f41042e = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f41038a == aVar.f41038a && this.f41039b == aVar.f41039b && this.f41040c == aVar.f41040c && this.f41041d == aVar.f41041d && this.f41042e == aVar.f41042e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.c(this.f41042e) + ((Longs.c(this.f41041d) + ((Longs.c(this.f41040c) + ((Longs.c(this.f41039b) + ((Longs.c(this.f41038a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f41038a + ", photoSize=" + this.f41039b + ", photoPresentationTimestampUs=" + this.f41040c + ", videoStartPosition=" + this.f41041d + ", videoSize=" + this.f41042e;
    }
}
