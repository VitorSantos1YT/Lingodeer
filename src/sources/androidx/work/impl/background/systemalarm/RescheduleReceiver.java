package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fb.l;
import gb.p;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        l.c("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l lVarB = l.b();
        Objects.toString(intent);
        lVarB.getClass();
        try {
            p pVarE = p.E(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            pVarE.getClass();
            synchronized (p.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = pVarE.f28961i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    pVarE.f28961i = pendingResultGoAsync;
                    if (pVarE.f28960h) {
                        pendingResultGoAsync.finish();
                        pVarE.f28961i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException unused) {
            l.b().getClass();
        }
    }
}
