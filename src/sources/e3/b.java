package e3;

import android.content.res.Resources;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f24774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24775b;

    public b(Resources.Theme theme, int i11) {
        this.f24774a = theme;
        this.f24775b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f24774a, bVar.f24774a) && this.f24775b == bVar.f24775b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24775b) + (this.f24774a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f24774a);
        sb2.append(", id=");
        return ep.a.j(sb2, this.f24775b, ')');
    }
}
