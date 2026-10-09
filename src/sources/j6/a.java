package j6;

import com.google.android.material.datepicker.d;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36062b;

    public a(long j11, long j12) {
        this.f36061a = j11;
        this.f36062b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.d(this.f36061a, aVar.f36061a) && x.d(this.f36062b, aVar.f36062b);
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Long.hashCode(this.f36062b) + (Long.hashCode(this.f36061a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DayNightColorProvider(day=");
        d.t(this.f36061a, ", night=", sb2);
        sb2.append((Object) x.j(this.f36062b));
        sb2.append(')');
        return sb2.toString();
    }
}
