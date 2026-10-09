package com.lingo.lingoskill.widget.daystreak;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fb.n;
import gb.p;
import kotlin.jvm.internal.m;
import xq.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DayStreakWidgetRolloverReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        if (m.a(intent != null ? intent.getAction() : null, "com.lingo.lingoskill.widget.daystreak.ACTION_DAY_STREAK_WIDGET_ROLLOVER")) {
            Context applicationContext = context.getApplicationContext();
            m.e(applicationContext, "getApplicationContext(...)");
            Context applicationContext2 = applicationContext.getApplicationContext();
            m.c(applicationContext2);
            if (!a.d(applicationContext2)) {
                a.b(applicationContext2);
                return;
            }
            p pVarE = p.E(applicationContext2);
            m.e(pVarE, "getInstance(context)");
            pVarE.m("day_streak_widget_update", n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
        }
    }
}
