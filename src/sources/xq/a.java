package xq;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import cf.x;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetClickActivity;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetRolloverReceiver;
import com.lingodeer.R;
import e6.y;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import l1.s;
import l1.x1;
import mt.r;
import qy.b0;
import se.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f56169a = new t1.d(new wr.a(9), false, -858963250);

    public static final void a(final k kVar, l1.n nVar, int i11) {
        final o oVar;
        s sVar = (s) nVar;
        sVar.f0(445492870);
        int i12 = (sVar.f(kVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Context context = (Context) sVar.j(c6.f.f6623b);
            long j11 = ((v3.h) sVar.j(c6.f.f6622a)).f53491a;
            final float fB = v3.f.a(v3.h.b(j11), v3.h.a(j11)) < 0 ? v3.h.b(j11) : v3.h.a(j11);
            final float f5 = 15;
            Intent intent = new Intent(context, (Class<?>) DayStreakWidgetClickActivity.class);
            intent.addFlags(270532608);
            int i13 = g.f56184a[kVar.f56191b.ordinal()];
            if (i13 == 1) {
                oVar = new o(R.string.widget_msg_streaked, R.drawable.widget_status_streaked, R.drawable.widget_status_icon_streaked);
            } else if (i13 == 2) {
                oVar = new o(R.string.widget_msg_streak_learn, R.drawable.widget_status_streak_learn, R.drawable.widget_status_icon_streak_learn);
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                oVar = new o(R.string.widget_msg_streak_shield, R.drawable.widget_status_streak_shield, R.drawable.widget_status_icon_streak_shield);
            }
            p.F(vc.a.i(c6.j.f6631a).d(new d6.b(new f6.f(intent, x.y((d6.d[]) Arrays.copyOf(new d6.d[0], 0))))), k6.c.f37914d, t1.e.d(706387304, new fz.e() { // from class: xq.e
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar2 = (s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        c6.l lVarA = vc.a.A(fB);
                        float f11 = f5;
                        p.F(lVarA.d(new y(new p6.c(f11))), k6.c.f37914d, t1.e.d(-627526714, new dt.s(oVar, f11, kVar), sVar2), sVar2, 384);
                    } else {
                        sVar2.W();
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new r(kVar, i11, 22);
        }
    }

    public static void b(Context context) {
        Object systemService = context.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            return;
        }
        PendingIntent pendingIntentC = c(context);
        alarmManager.cancel(pendingIntentC);
        pendingIntentC.cancel();
    }

    public static PendingIntent c(Context context) {
        Intent intent = new Intent(context, (Class<?>) DayStreakWidgetRolloverReceiver.class);
        intent.setAction("com.lingo.lingoskill.widget.daystreak.ACTION_DAY_STREAK_WIDGET_ROLLOVER");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 10241, intent, bq.r.f4981x);
        kotlin.jvm.internal.m.e(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public static boolean d(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) DayStreakWidgetReceiver.class));
        kotlin.jvm.internal.m.c(appWidgetIds);
        return !(appWidgetIds.length == 0);
    }

    public static void e(Context context) {
        if (!d(context)) {
            b(context);
            return;
        }
        Object systemService = context.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        kotlin.jvm.internal.m.e(timeZone, "getDefault(...)");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 5);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.getTimeInMillis() <= jCurrentTimeMillis) {
            calendar.add(6, 1);
        }
        long timeInMillis = calendar.getTimeInMillis();
        alarmManager.cancel(c(context));
        alarmManager.setAndAllowWhileIdle(0, timeInMillis, c(context));
    }
}
