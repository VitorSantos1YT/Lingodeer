package uv;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Handler.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static File f53233d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f53234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f53235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zv.e f53236c;

    public u(zv.d dVar) {
        this.f53236c = dVar;
    }

    public static void a() {
        File fileB = b();
        if (fileB.exists()) {
            o00.a.p(u.class, "delete marker file " + fileB.delete(), new Object[0]);
        }
    }

    public static File b() {
        if (f53233d == null) {
            Context context = ns.o.f44007a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getCacheDir());
            f53233d = new File(ep.a.k(sb2, File.separator, ".filedownloader_pause_all_marker.b"));
        }
        return f53233d;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            if (b().exists()) {
                try {
                    this.f53236c.l();
                } catch (RemoteException e8) {
                    o00.a.B(6, this, e8, "pause all failed", new Object[0]);
                }
                a();
            }
            this.f53235b.sendEmptyMessageDelayed(0, 1000L);
            return true;
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
