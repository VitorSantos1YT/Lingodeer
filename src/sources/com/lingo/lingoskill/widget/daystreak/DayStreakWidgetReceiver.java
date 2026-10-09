package com.lingo.lingoskill.widget.daystreak;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.a;
import bq.r;
import cj.b;
import e6.p0;
import e6.q0;
import fb.n;
import gb.p;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import rz.o0;
import vy.d;
import xq.c;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DayStreakWidgetReceiver extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f22193a = o0.f50940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f22194b = new c(0);

    public static final void a(DayStreakWidgetReceiver dayStreakWidgetReceiver, b0 b0Var, Context context) {
        e0.B(b0Var, null, null, new q0(0, context, dayStreakWidgetReceiver, (d) null), 3);
    }

    public final void b(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        a.y(this, this.f22193a, new b0.f(this, context, iArr, (d) null, 14));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i11, Bundle bundle) {
        a.y(this, this.f22193a, new b(this, context, i11, bundle, (d) null, 1));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        a.y(this, this.f22193a, new p0(this, context, iArr, (d) null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        m.f(context, "context");
        super.onDisabled(context);
        Context applicationContext = context.getApplicationContext();
        m.e(applicationContext, "getApplicationContext(...)");
        Object systemService = applicationContext.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            return;
        }
        Intent intent = new Intent(applicationContext, (Class<?>) DayStreakWidgetRolloverReceiver.class);
        intent.setAction("com.lingo.lingoskill.widget.daystreak.ACTION_DAY_STREAK_WIDGET_ROLLOVER");
        int[] iArr = r.f4959a;
        PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, 10241, intent, r.f4981x);
        m.e(broadcast, "getBroadcast(...)");
        alarmManager.cancel(broadcast);
        broadcast.cancel();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        m.f(context, "context");
        super.onEnabled(context);
        Context applicationContext = context.getApplicationContext();
        m.e(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = applicationContext.getApplicationContext();
        m.c(applicationContext2);
        if (!xq.a.d(applicationContext2)) {
            xq.a.b(applicationContext2);
            return;
        }
        p pVarE = p.E(applicationContext2);
        m.e(pVarE, "getInstance(context)");
        pVarE.m("day_streak_widget_update", n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[Catch: all -> 0x00aa, TryCatch #1 {all -> 0x00aa, blocks: (B:21:0x0041, B:24:0x004a, B:25:0x0052, B:26:0x0053, B:27:0x005b, B:28:0x005c, B:44:0x00a7, B:34:0x0072, B:36:0x0084, B:38:0x008f, B:40:0x009b, B:39:0x0097, B:42:0x009f, B:43:0x00a6, B:31:0x0067), top: B:49:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008f A[Catch: all -> 0x00aa, TryCatch #1 {all -> 0x00aa, blocks: (B:21:0x0041, B:24:0x004a, B:25:0x0052, B:26:0x0053, B:27:0x005b, B:28:0x005c, B:44:0x00a7, B:34:0x0072, B:36:0x0084, B:38:0x008f, B:40:0x009b, B:39:0x0097, B:42:0x009f, B:43:0x00a6, B:31:0x0067), top: B:49:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[Catch: all -> 0x00aa, TryCatch #1 {all -> 0x00aa, blocks: (B:21:0x0041, B:24:0x004a, B:25:0x0052, B:26:0x0053, B:27:0x005b, B:28:0x005c, B:44:0x00a7, B:34:0x0072, B:36:0x0084, B:38:0x008f, B:40:0x009b, B:39:0x0097, B:42:0x009f, B:43:0x00a6, B:31:0x0067), top: B:49:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x00aa, TryCatch #1 {all -> 0x00aa, blocks: (B:21:0x0041, B:24:0x004a, B:25:0x0052, B:26:0x0053, B:27:0x005b, B:28:0x005c, B:44:0x00a7, B:34:0x0072, B:36:0x0084, B:38:0x008f, B:40:0x009b, B:39:0x0097, B:42:0x009f, B:43:0x00a6, B:31:0x0067), top: B:49:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            try {
                if (action == null) {
                    context2 = context;
                } else {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -19011148) {
                        context2 = context;
                        if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            m.c(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 649033583) {
                        context2 = context;
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            m.c(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                        String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        a.y(this, this.f22193a, new b(this, context, intExtra, stringExtra, (d) null, 2));
                        return;
                    }
                    context2 = context;
                }
                super.onReceive(context2, intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        m.f(context, "context");
        m.f(appWidgetManager, "appWidgetManager");
        m.f(appWidgetIds, "appWidgetIds");
        b(context, appWidgetManager, appWidgetIds);
        Context applicationContext = context.getApplicationContext();
        m.e(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = applicationContext.getApplicationContext();
        m.c(applicationContext2);
        if (!xq.a.d(applicationContext2)) {
            xq.a.b(applicationContext2);
            return;
        }
        p pVarE = p.E(applicationContext2);
        m.e(pVarE, "getInstance(context)");
        pVarE.m("day_streak_widget_update", n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
    }
}
