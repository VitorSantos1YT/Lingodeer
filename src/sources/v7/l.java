package v7;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f53647e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f53648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f53649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53650c;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z11) {
        super(surfaceTexture);
        this.f53649b = kVar;
        this.f53648a = z11;
    }

    public static int a(Context context) {
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (((i11 >= 26 || !(Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? b7.a.w("EGL_EXT_protected_content") : false) {
                return b7.a.w("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (GlUtil$GlException e8) {
            b7.a.o("Failed to determine secure mode due to GL error: " + e8.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f53647e) {
                f53646d = a(context);
                f53647e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f53646d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f53649b) {
            try {
                if (!this.f53650c) {
                    k kVar = this.f53649b;
                    kVar.f53642b.getClass();
                    kVar.f53642b.sendEmptyMessage(2);
                    this.f53650c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
