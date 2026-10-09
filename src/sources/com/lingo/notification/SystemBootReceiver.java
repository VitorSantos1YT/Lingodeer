package com.lingo.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetUpdateWorker;
import e6.f1;
import e6.q0;
import fb.n;
import gb.p;
import kotlin.jvm.internal.m;
import rz.e0;
import rz.o0;
import sz.xej.iFLeRCXvYCGdPW;
import wz.d;
import xq.a;
import yz.e;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SystemBootReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f22224b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22225a;

    public SystemBootReceiver() {
        f fVar = o0.f50940a;
        this.f22225a = e0.c(e.f58387a.plus(e0.e()));
    }

    public static final boolean a(SystemBootReceiver systemBootReceiver) {
        try {
            if (!m.a(LingoSkillApplication.L.getValue(), Boolean.TRUE)) {
                return false;
            }
            x.n();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data;
        Uri data2;
        m.f(context, "context");
        String action = intent != null ? intent.getAction() : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f22224b < 30000) {
            return;
        }
        f22224b = jCurrentTimeMillis;
        if (action != null) {
            switch (action.hashCode()) {
                case -1787487905:
                    if (action.equals("android.intent.action.QUICKBOOT_POWERON")) {
                        b(context);
                        return;
                    }
                    return;
                case -810471698:
                    if (!action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        return;
                    }
                    break;
                case 798292259:
                    if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                        b(context);
                        return;
                    }
                    return;
                case 1737074039:
                    if (!action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                        return;
                    }
                    break;
                case 2039811242:
                    if (action.equals("android.intent.action.REBOOT")) {
                        b(context);
                        return;
                    }
                    return;
                default:
                    return;
            }
            if (!m.a(intent != null ? intent.getAction() : null, "android.intent.action.MY_PACKAGE_REPLACED")) {
                if (!m.a((intent == null || (data2 = intent.getData()) == null) ? null : data2.getSchemeSpecificPart(), context.getPackageName())) {
                    if (intent == null || (data = intent.getData()) == null) {
                        return;
                    }
                    data.getSchemeSpecificPart();
                    return;
                }
            }
            Context applicationContext = context.getApplicationContext();
            m.e(applicationContext, "getApplicationContext(...)");
            Context applicationContext2 = applicationContext.getApplicationContext();
            m.c(applicationContext2);
            if (a.d(applicationContext2)) {
                p pVarE = p.E(applicationContext2);
                m.e(pVarE, "getInstance(context)");
                pVarE.m("day_streak_widget_update", n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
            } else {
                a.b(applicationContext2);
            }
            e0.B(this.f22225a, null, null, new f1(context, null, 1), 3);
        }
    }

    public final void b(Context context) {
        Context applicationContext = context.getApplicationContext();
        m.e(applicationContext, iFLeRCXvYCGdPW.gxVOMuTk);
        Context applicationContext2 = applicationContext.getApplicationContext();
        m.c(applicationContext2);
        if (!a.d(applicationContext2)) {
            a.b(applicationContext2);
        } else {
            p pVarE = p.E(applicationContext2);
            m.e(pVarE, "getInstance(context)");
            pVarE.m("day_streak_widget_update", n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
        }
        e0.B(this.f22225a, null, null, new q0(this, context, (vy.d) null, 2), 3);
    }
}
