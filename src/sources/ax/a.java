package ax;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kx.o;
import v4.g;
import v5.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3256a;

    public /* synthetic */ a(int i11) {
        this.f3256a = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3256a) {
            case 0:
                return;
            case 1:
                ArrayList arrayList = new ArrayList(o.f38924d.keySet());
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        o.f38924d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 2:
                try {
                    int i12 = g.f53514a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.d()) {
                        j.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i13 = g.f53514a;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f3256a) {
            case 0:
                return "EmptyRunnable";
            case 3:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
