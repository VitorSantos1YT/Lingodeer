package px;

import android.os.Handler;
import android.os.Looper;
import qx.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f47198a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        o oVar = b.f47199a;
        f47198a = new e(new Handler(mainLooper));
    }
}
