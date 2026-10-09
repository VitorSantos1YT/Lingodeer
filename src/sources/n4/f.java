package n4;

import android.app.Notification;
import android.app.Service;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z11) {
        builder.setAllowSystemGeneratedContextualActions(z11);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void e(Service service, int i11, Notification notification) {
        service.startForeground(i11, notification, 0);
    }

    public static void f(Service service, int i11, Notification notification) {
        service.startForeground(i11, notification, 2048);
    }
}
