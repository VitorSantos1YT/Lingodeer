package xd;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56009e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f56011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tp.e f56012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f56013d;

    static {
        f56009e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public d(Context context) {
        this.f56013d = f56009e;
        this.f56010a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f56011b = activityManager;
        this.f56012c = new tp.e(context.getResources().getDisplayMetrics(), 5);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f56013d = CropImageView.DEFAULT_ASPECT_RATIO;
    }
}
