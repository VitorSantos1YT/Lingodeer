package m8;

import b7.f0;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41045c;

    public b(long j11, int i11, long j12) {
        b7.a.d(j11 < j12);
        this.f41043a = j11;
        this.f41044b = j12;
        this.f41045c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41043a == bVar.f41043a && this.f41044b == bVar.f41044b && this.f41045c == bVar.f41045c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f41043a), Long.valueOf(this.f41044b), Integer.valueOf(this.f41045c));
    }

    public final String toString() {
        String str = f0.f3975a;
        Locale locale = Locale.US;
        StringBuilder sbJ = w4.c.j(this.f41043a, "Segment: startTimeMs=", ", endTimeMs=");
        sbJ.append(this.f41044b);
        sbJ.append(", speedDivisor=");
        sbJ.append(this.f41045c);
        return sbJ.toString();
    }
}
