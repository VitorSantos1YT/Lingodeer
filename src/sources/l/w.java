package l;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, androidx.appcompat.app.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.android.material.motion.a aVar = new com.google.android.material.motion.a(bVar, 2);
        h2.d.c(obj).registerOnBackInvokedCallback(1000000, aVar);
        return aVar;
    }

    public static void c(Object obj, Object obj2) {
        h2.d.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
