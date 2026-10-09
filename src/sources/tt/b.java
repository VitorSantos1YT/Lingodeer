package tt;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import java.util.UUID;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52535c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f52533a, bVar.f52533a) && m.a(this.f52534b, bVar.f52534b);
    }

    public final int hashCode() {
        Object obj = this.f52533a;
        return this.f52534b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "SingleLiveEvent(content=" + this.f52533a + ", id=" + this.f52534b + ")";
    }

    public b(Object obj) {
        String string = UUID.randomUUID().toString();
        m.e(string, ypOOxsaJG.VmOiGjewpetlSJg);
        this.f52533a = obj;
        this.f52534b = string;
    }
}
