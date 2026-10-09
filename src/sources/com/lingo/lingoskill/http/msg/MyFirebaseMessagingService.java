package com.lingo.lingoskill.http.msg;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import bq.r;
import com.adjust.sdk.Constants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import jh.h;
import kotlin.jvm.internal.m;
import n4.p;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(RemoteMessage remoteMessage) {
        String shortClassName;
        remoteMessage.f20504a.getString("from");
        try {
            if (!Env.getSimpleEnv().learningRemind) {
                return;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!remoteMessage.D1().isEmpty()) {
            remoteMessage.D1().toString();
        }
        if (remoteMessage.E1() != null) {
            RemoteMessage.Notification notificationE1 = remoteMessage.E1();
            m.c(notificationE1);
            m.c(notificationE1.f20508b);
        }
        Object systemService = getSystemService("activity");
        m.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        if (x.l0(((ActivityManager) systemService).getRunningAppProcesses().get(0).processName, getPackageName(), true)) {
            Bundle bundle = new Bundle();
            if (remoteMessage.D1().containsKey("type")) {
                bundle.putString("type", (String) remoteMessage.D1().get("type"));
            }
            if (remoteMessage.D1().containsKey("url") && remoteMessage.D1().containsKey("title")) {
                bundle.putString("url", (String) remoteMessage.D1().get("url"));
                bundle.putString("title", (String) remoteMessage.D1().get("title"));
            }
            if (remoteMessage.D1().containsKey("target")) {
                bundle.putString("target", (String) remoteMessage.D1().get("target"));
            }
            if (remoteMessage.D1().containsKey("oib")) {
                bundle.putString("oib", (String) remoteMessage.D1().get("oib"));
            }
            if (remoteMessage.D1().containsKey(Constants.DEEPLINK)) {
                bundle.putString(Constants.DEEPLINK, (String) remoteMessage.D1().get(Constants.DEEPLINK));
            }
            Intent intentG = h.g(this, bundle);
            try {
                Object systemService2 = getSystemService("activity");
                m.d(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
                ActivityManager.RunningTaskInfo runningTaskInfo = ((ActivityManager) systemService2).getRunningTasks(1).get(0);
                if (Build.VERSION.SDK_INT >= 29) {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    m.c(componentName);
                    shortClassName = componentName.getShortClassName();
                } else {
                    shortClassName = null;
                }
                m.c(shortClassName);
                shortClassName.concat(" 前台Activity");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            PendingIntent activity = PendingIntent.getActivity(this, 0, intentG, r.f4981x);
            String string = getString(R.string.default_notification_channel_id);
            m.e(string, "getString(...)");
            p pVar = new p(this, string);
            pVar.f43228s.icon = R.drawable.ic_notification_white;
            RemoteMessage.Notification notificationE2 = remoteMessage.E1();
            m.c(notificationE2);
            pVar.f43215e = p.b(notificationE2.f20507a);
            RemoteMessage.Notification notificationE3 = remoteMessage.E1();
            m.c(notificationE3);
            pVar.f43216f = p.b(notificationE3.f20508b);
            pVar.c(true);
            pVar.f43217g = activity;
            if (remoteMessage.D1().containsKey("target") && m.a(remoteMessage.D1().get("target"), "feedback")) {
                Notification notification = pVar.f43228s;
                notification.defaults = -1;
                notification.flags |= 1;
                pVar.f43220j = 1;
            }
            Object systemService3 = getSystemService("notification");
            m.d(systemService3, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService3;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(string, "LingoDeer Notification Channel", 3);
                notificationChannel.setShowBadge(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationManager.notify(0, pVar.a());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String p4) {
        m.f(p4, "p0");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        cf.x.n().GCMPushToken = p4;
        cf.x.n().updateEntry("GCMPushToken");
        cf.x.n();
    }
}
