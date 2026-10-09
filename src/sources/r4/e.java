package r4;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import gd.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f48797a = 0;

    static {
        new ThreadLocal();
    }

    public static void a(m mVar, a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            c3.c.j(mVar, aVar != null ? c3.c.g(aVar) : null);
        } else if (aVar == null) {
            mVar.setXfermode(null);
        } else {
            PorterDuff.Mode modeF = ff.h.F(aVar);
            mVar.setXfermode(modeF != null ? new PorterDuffXfermode(modeF) : null);
        }
    }
}
