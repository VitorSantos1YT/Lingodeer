package er;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import bq.r;
import com.lingodeer.R;
import fr.p3;
import java.util.Map;
import n4.n;
import n4.p;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p3 f25773d = new p3(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile m f25774e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f25776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f25777c;

    public m(Context context) {
        this.f25775a = context;
        final int i11 = 0;
        q qVarV = com.bumptech.glide.d.v(new fz.a(this) { // from class: er.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f25772b;

            {
                this.f25772b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        Object systemService = this.f25772b.f25775a.getSystemService("notification");
                        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        return (NotificationManager) systemService;
                    default:
                        return ff.h.y(this.f25772b.f25775a, R.string.default_notification_channel_id);
                }
            }
        });
        this.f25776b = qVarV;
        final int i12 = 1;
        q qVarV2 = com.bumptech.glide.d.v(new fz.a(this) { // from class: er.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f25772b;

            {
                this.f25772b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        Object systemService = this.f25772b.f25775a.getSystemService("notification");
                        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        return (NotificationManager) systemService;
                    default:
                        return ff.h.y(this.f25772b.f25775a, R.string.default_notification_channel_id);
                }
            }
        });
        this.f25777c = qVarV2;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel((String) qVarV2.getValue(), "Lingodeer", 4);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16711936);
            notificationChannel.setShowBadge(true);
            notificationChannel.setDescription("LingoDeer学习提醒和通知");
            ((NotificationManager) qVarV.getValue()).createNotificationChannel(notificationChannel);
        }
    }

    public final Notification a(e eVar, a aVar) {
        Bundle bundle = new Bundle();
        String str = aVar.f25742c;
        String str2 = aVar.f25741b;
        String str3 = aVar.f25740a;
        bundle.putString("source", str);
        bundle.putString("default", str3 + "!@@@!" + str2);
        for (Map.Entry entry : aVar.f25743d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        Context context = this.f25775a;
        PendingIntent activity = PendingIntent.getActivity(context, eVar.b(), jh.h.g(context, bundle), r.f4981x);
        kotlin.jvm.internal.m.e(activity, "getActivity(...)");
        p pVar = new p(context, (String) this.f25777c.getValue());
        pVar.f43228s.icon = R.drawable.ic_notification_white;
        pVar.d(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher));
        pVar.f43215e = p.b(str3);
        pVar.f43216f = p.b(str2);
        pVar.c(true);
        pVar.f43217g = activity;
        n nVar = new n();
        nVar.f43210c = p.b(str2);
        nVar.f670b = p.b(str3);
        pVar.e(nVar);
        if (eVar == e.SRS_REVIEW) {
            n nVar2 = new n();
            nVar2.f43210c = p.b(str2);
            nVar2.f670b = p.b(str3);
            pVar.e(nVar2);
        }
        Notification notificationA = pVar.a();
        kotlin.jvm.internal.m.e(notificationA, "build(...)");
        return notificationA;
    }
}
