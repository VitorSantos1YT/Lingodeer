package pd;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f46805c = p.f46808a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46806a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46807b = false;

    public final synchronized void a(long j11, String str) {
        if (this.f46807b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f46806a.add(new n(str, j11, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j11;
        this.f46807b = true;
        ArrayList arrayList = this.f46806a;
        int i11 = 0;
        if (arrayList.size() == 0) {
            j11 = 0;
        } else {
            j11 = ((n) arrayList.get(arrayList.size() - 1)).f46804c - ((n) arrayList.get(0)).f46804c;
        }
        if (j11 <= 0) {
            return;
        }
        long j12 = ((n) this.f46806a.get(0)).f46804c;
        p.a("(%-4d ms) %s", Long.valueOf(j11), str);
        ArrayList arrayList2 = this.f46806a;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            n nVar = (n) obj;
            long j13 = nVar.f46804c;
            p.a("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(nVar.f46803b), nVar.f46802a);
            j12 = j13;
        }
    }

    public final void finalize() {
        if (this.f46807b) {
            return;
        }
        b("Request on the loose");
        p.a("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
