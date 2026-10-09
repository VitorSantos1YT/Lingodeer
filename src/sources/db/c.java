package db;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;
import za.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f23349b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f23350c = new c();

    @Override // db.f
    public k a(Context context, d densityCompatHelper) {
        m.f(densityCompatHelper, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f5 = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        m.e(bounds, "getBounds(...)");
        return new k(bounds, f5);
    }

    @Override // db.f
    public k c(Activity activity, d densityCompatHelper) {
        m.f(densityCompatHelper, "densityCompatHelper");
        b.f23348a.getClass();
        return new k(new ya.b(a.e().b(activity)), densityCompatHelper.d(activity));
    }

    @Override // db.b
    public Rect b(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        m.e(bounds, txBUGYhC.LQFOVuHLSw);
        return bounds;
    }
}
