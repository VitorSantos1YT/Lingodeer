package c7;

import com.google.common.primitives.Longs;
import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6657c;

    public h(long j11, long j12, long j13) {
        this.f6655a = j11;
        this.f6656b = j12;
        this.f6657c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6655a == hVar.f6655a && this.f6656b == hVar.f6656b && this.f6657c == hVar.f6657c;
    }

    public final int hashCode() {
        return Longs.c(this.f6657c) + ((Longs.c(this.f6656b) + ((Longs.c(this.f6655a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f6655a + ", modification time=" + this.f6656b + ", timescale=" + this.f6657c;
    }
}
