package tf;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f52240d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o20.i f52242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52243c;

    public y(Context context, String str) {
        PackageInfo packageInfo;
        this.f52241a = str;
        this.f52242b = new o20.i(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f52243c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            Bundle bundleB = c0.b(BuildConfig.VERSION_NAME);
            bundleB.putString("2_result", u.ERROR.a());
            bundleB.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            bundleB.putString("3_method", str2);
            this.f52242b.c(str, bundleB);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
