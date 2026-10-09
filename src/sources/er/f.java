package er;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ay.k0;
import bq.r;
import com.lingo.notification.UnifiedNotificationReceiver;
import cr.n;
import java.util.Map;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f25749c = new k0(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile f f25750d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f25752b = com.bumptech.glide.d.v(new n(this, 14));

    public f(Context context) {
        this.f25751a = context;
    }

    public final boolean a(e notificationType) {
        kotlin.jvm.internal.m.f(notificationType, "notificationType");
        AlarmManager alarmManager = (AlarmManager) this.f25752b.getValue();
        if (alarmManager == null) {
            return false;
        }
        try {
            PendingIntent pendingIntentB = b(notificationType, null);
            alarmManager.cancel(pendingIntentB);
            pendingIntentB.cancel();
            notificationType.name();
            return true;
        } catch (Exception unused) {
            notificationType.name();
            return false;
        }
    }

    public final PendingIntent b(e eVar, a aVar) {
        Intent intent = new Intent("com.lingo.notification.UNIFIED_ALARM");
        Context context = this.f25751a;
        intent.setClass(context, UnifiedNotificationReceiver.class);
        intent.putExtra("notification_type", eVar.name());
        if (aVar != null) {
            intent.putExtra("source", aVar.f25742c);
            intent.putExtra("default", aVar.f25740a + "!@@@!" + aVar.f25741b);
            for (Map.Entry entry : aVar.f25743d.entrySet()) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, eVar.b(), intent, r.f4981x);
        kotlin.jvm.internal.m.e(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
