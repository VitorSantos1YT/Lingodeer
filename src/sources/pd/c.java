package pd;

import android.text.TextUtils;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46777b;

    public c(String str, String str2) {
        this.f46776a = str;
        this.f46777b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.f46776a, cVar.f46776a) && TextUtils.equals(this.f46777b, cVar.f46777b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46777b.hashCode() + (this.f46776a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f46776a);
        sb2.append(",value=");
        return ep.a.k(sb2, this.f46777b, aYZzTH.NqrLTYEKzVgxE);
    }
}
