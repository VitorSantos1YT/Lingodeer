package tt;

import java.util.UUID;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52532b;

    public a(Object obj) {
        String string = UUID.randomUUID().toString();
        m.e(string, "toString(...)");
        this.f52531a = obj;
        this.f52532b = string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f52531a, aVar.f52531a) && m.a(this.f52532b, aVar.f52532b);
    }

    public final int hashCode() {
        Object obj = this.f52531a;
        return this.f52532b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "RefreshEvent(content=" + this.f52531a + ", id=" + this.f52532b + ")";
    }
}
