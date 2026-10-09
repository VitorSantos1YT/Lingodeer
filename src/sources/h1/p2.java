package h1;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f30831a = new LinkedHashMap();

    public final String a(Long l9, Locale locale, boolean z11) {
        if (l9 == null) {
            return null;
        }
        return i1.p.h(l9.longValue(), z11 ? "yMMMMEEEEd" : "yMMMd", locale, this.f30831a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof p2;
    }

    public final int hashCode() {
        return 436998964;
    }
}
