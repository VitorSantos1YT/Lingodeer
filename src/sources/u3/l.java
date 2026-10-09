package u3;

import hh.p0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f52751b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f52752c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f52753d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52754a;

    public l(int i11) {
        this.f52754a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f52754a == ((l) obj).f52754a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52754a;
    }

    public final String toString() {
        int i11 = this.f52754a;
        if (i11 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return p0.o(new StringBuilder("TextDecoration["), x3.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
