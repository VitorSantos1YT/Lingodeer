package th;

import java.util.Comparator;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j11;
        long j12 = 0;
        try {
            j11 = Long.parseLong((String) q.W0((String) obj2, new String[]{":"}, 0, 6).get(0));
        } catch (Exception unused) {
            j11 = 0;
        }
        Long lValueOf = Long.valueOf(j11);
        try {
            j12 = Long.parseLong((String) q.W0((String) obj, new String[]{":"}, 0, 6).get(0));
        } catch (Exception unused2) {
        }
        return qx.b.i(lValueOf, Long.valueOf(j12));
    }
}
