package com.lingo.notification;

import ad.x;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.m;
import rz.e0;
import rz.o0;
import wz.d;
import yz.e;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnifiedNotificationReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22229a;

    public UnifiedNotificationReceiver() {
        f fVar = o0.f50940a;
        this.f22229a = e0.c(e.f58387a.plus(e0.e()));
    }

    public static final void a(UnifiedNotificationReceiver unifiedNotificationReceiver, Context context, er.e eVar, Intent intent) {
        try {
            Object systemService = context.getSystemService("jobscheduler");
            JobScheduler jobScheduler = systemService instanceof JobScheduler ? (JobScheduler) systemService : null;
            if (jobScheduler == null) {
                return;
            }
            if (jobScheduler.schedule(new JobInfo.Builder(eVar.a(), new ComponentName(context.getPackageName(), UnifiedNotificationJobService.class.getName())).setOverrideDeadline(0L).setRequiredNetworkType(1).setExtras(b(intent)).build()) == 1) {
                eVar.name();
            } else {
                eVar.name();
            }
        } catch (Exception unused) {
        }
    }

    public static PersistableBundle b(Intent intent) {
        Set<String> setKeySet;
        PersistableBundle persistableBundle = new PersistableBundle();
        Bundle extras = intent.getExtras();
        if (extras != null && (setKeySet = extras.keySet()) != null) {
            for (String str : setKeySet) {
                Bundle extras2 = intent.getExtras();
                Object obj = extras2 != null ? extras2.get(str) : null;
                if (obj instanceof String) {
                    persistableBundle.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    persistableBundle.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    persistableBundle.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    persistableBundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else {
                    Objects.toString(obj);
                }
            }
        }
        return persistableBundle;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.f(context, "context");
        if (intent != null) {
            try {
                intent.getAction();
            } catch (IllegalArgumentException | Exception unused) {
                return;
            }
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("notification_type");
            if (stringExtra == null) {
                stringExtra = BuildConfig.VERSION_NAME;
            }
            er.e eVarValueOf = er.e.valueOf(stringExtra);
            eVarValueOf.name();
            e0.B(this.f22229a, null, null, new x(this, context, eVarValueOf, intent, null, 9), 3);
        }
    }
}
