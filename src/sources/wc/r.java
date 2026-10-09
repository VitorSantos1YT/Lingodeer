package wc;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f55004b;

    public /* synthetic */ r(v vVar, int i11) {
        this.f55003a = i11;
        this.f55004b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55003a) {
            case 0:
                Drawable drawable = this.f55004b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                v vVar = this.f55004b;
                Semaphore semaphore = vVar.f55031p0;
                gd.e eVar = vVar.R;
                if (eVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    eVar.r(vVar.f55012b.f());
                    if (v.f55007u0 && vVar.f55029n0) {
                        if (vVar.f55032q0 == null) {
                            vVar.f55032q0 = new Handler(Looper.getMainLooper());
                            vVar.f55033r0 = new r(vVar, 0);
                        }
                        vVar.f55032q0.post(vVar.f55033r0);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
        }
    }
}
