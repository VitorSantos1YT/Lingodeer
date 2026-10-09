package i6;

import android.os.Build;
import android.widget.RemoteViews;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f34162a = new b();

    public final void a(RemoteViews remoteViews, int i11, int i12) {
        m.f(remoteViews, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setInt(i11, "setGravity", i12);
            return;
        }
        throw new IllegalArgumentException(("setGravity is only available on SDK 31 and higher").toString());
    }
}
