package m8;

import java.util.ArrayList;
import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41046a;

    public c(ArrayList arrayList) {
        this.f41046a = arrayList;
        boolean z11 = false;
        if (!arrayList.isEmpty()) {
            long j11 = ((b) arrayList.get(0)).f41044b;
            for (int i11 = 1; i11 < arrayList.size(); i11++) {
                if (((b) arrayList.get(i11)).f41043a < j11) {
                    z11 = true;
                    break;
                }
                j11 = ((b) arrayList.get(i11)).f41044b;
            }
        }
        b7.a.d(!z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f41046a.equals(((c) obj).f41046a);
    }

    public final int hashCode() {
        return this.f41046a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f41046a;
    }
}
