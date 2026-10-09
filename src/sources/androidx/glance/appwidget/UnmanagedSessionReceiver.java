package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import e6.x;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class UnmanagedSessionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f1908a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f1909b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (m.a(intent.getAction(), gkbGsXmgaxRjJ.KVIgUqkUezvIaf)) {
            if (intent.getStringExtra("EXTRA_ACTION_KEY") != null) {
                int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                if (intExtra != -1) {
                    x.a(intExtra);
                    return;
                }
                throw new IllegalStateException("Intent is missing AppWidgetId extra");
            }
            throw new IllegalStateException("Intent is missing ActionKey extra");
        }
    }
}
