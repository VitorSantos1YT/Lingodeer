package ib;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import bp.g4;
import fb.l;
import kotlin.jvm.internal.m;
import o20.w;
import ob.j;
import s0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34294a = 0;

    static {
        l.c("Alarms");
    }

    public static void a(Context context, j jVar, int i11) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i12 = b.f34295f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i11, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        l lVarB = l.b();
        jVar.toString();
        lVarB.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j jVar, long j11) {
        ob.i iVarB = workDatabase.B();
        ob.g gVarL = iVarB.l(jVar);
        if (gVarL != null) {
            int i11 = gVarL.f44810c;
            a(context, jVar, i11);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i12 = b.f34295f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.c(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i11, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j11, service);
                return;
            }
            return;
        }
        Object objW = workDatabase.w(new u(new g4(new w(workDatabase), 10), 22));
        m.e(objW, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int iIntValue = ((Number) objW).intValue();
        iVarB.p(new ob.g(jVar.f44817a, jVar.f44818b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i13 = b.f34295f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.c(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j11, service2);
        }
    }
}
