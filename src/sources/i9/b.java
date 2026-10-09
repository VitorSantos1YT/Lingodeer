package i9;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.pairip.StartupLauncher;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Application {
    static {
        StartupLauncher.launch();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (a.f34267b) {
            return;
        }
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (Exception e8) {
                throw new RuntimeException("MultiDex installation failed (" + e8.getMessage() + ").");
            }
        } catch (RuntimeException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return;
        }
        a.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
    }
}
