package db;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.m;
import vf.eq.EHjhWcesDUIsIw;
import za.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f23351b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f23352c = new e();

    @Override // db.f
    public k c(Activity activity, d densityCompatHelper) {
        m.f(densityCompatHelper, "densityCompatHelper");
        b.f23348a.getClass();
        return new k(new ya.b(a.e().b(activity)), densityCompatHelper.d(activity));
    }

    @Override // db.d
    public float d(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // db.f
    public k a(Context context, d densityCompatHelper) {
        m.f(densityCompatHelper, "densityCompatHelper");
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        m.e(bounds, EHjhWcesDUIsIw.WTVKSgIqrCJ);
        return new k(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
