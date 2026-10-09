package m6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.pairip.VMRunner;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f40872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IntentFilter f40873c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.c f40874a;

    static {
        List listL = ns.o.L("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f40872b = listL;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        f40873c = intentFilter;
    }

    public d(d2.c cVar) {
        this.f40874a = cVar;
    }

    public final void a(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        boolean zA = a.f40864a.a(powerManager);
        if (i11 >= 33) {
            zA = zA || b.f40865a.a(powerManager);
        }
        if (zA) {
            this.f40874a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("4p8CKGhNZuwtg4JU", new Object[]{this, context, intent});
    }
}
