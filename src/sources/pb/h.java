package pb;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    static {
        fb.l.c("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z11) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z12 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z12 = true;
            }
            if (z11 == z12) {
                fb.l.b().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
                fb.l.b().getClass();
            }
        } catch (Exception unused) {
            fb.l.b().getClass();
        }
    }
}
