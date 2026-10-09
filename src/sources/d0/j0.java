package d0;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22736a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f22737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f22738c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f22737b = dLog;
        f22738c = dLog - 1.0d;
    }
}
