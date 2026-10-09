package n4;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f43230a;

    static {
        new HashSet();
    }

    public t(Context context) {
        this.f43230a = (NotificationManager) context.getSystemService("notification");
    }
}
