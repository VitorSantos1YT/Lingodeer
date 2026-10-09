package se;

import java.io.Serializable;
import lf.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51581b;

    public b(String str, String str2) {
        this.f51580a = str2;
        this.f51581b = j1.y(str) ? null : str;
    }

    private final Object writeReplace() {
        return new a(this.f51581b, this.f51580a);
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = bVar.f51581b;
            String str2 = this.f51581b;
            if (str == null) {
                zEquals = str2 == null;
            } else {
                zEquals = str.equals(str2);
            }
            if (zEquals && bVar.f51580a.equals(this.f51580a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f51581b;
        return (str != null ? str.hashCode() : 0) ^ this.f51580a.hashCode();
    }
}
