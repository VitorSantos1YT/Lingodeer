package o4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i11) {
        return (i11 & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, c.c(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i11) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i11);
    }

    public static void c(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
