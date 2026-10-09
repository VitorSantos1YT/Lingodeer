package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import n4.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CommonNotificationBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f20451a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DisplayNotificationInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f20452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20453b;

        public DisplayNotificationInfo(p pVar, String str) {
            this.f20452a = pVar;
            this.f20453b = str;
        }
    }

    private CommonNotificationBuilder() {
    }

    /* JADX WARN: Code duplicated, block: B:123:0x029e  */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0295 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70, types: [int] */
    public static DisplayNotificationInfo a(FirebaseMessagingService firebaseMessagingService, NotificationParams notificationParams) {
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        int i11;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            e8.toString();
        }
        Bundle bundle2 = bundle;
        String strH = notificationParams.h("gcm.n.android_channel_id");
        int i12 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strH = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strH = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strH) || notificationManager.getNotificationChannel(strH) == null) {
                        strH = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (TextUtils.isEmpty(strH) || notificationManager.getNotificationChannel(strH) == null) {
                            strH = "fcm_fallback_notification_channel";
                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                int identifier2 = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier2 == 0 ? "Misc" : firebaseMessagingService.getString(identifier2), 3));
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        p pVar = new p(firebaseMessagingService, strH);
        String strG = notificationParams.g(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strG)) {
            pVar.f43215e = p.b(strG);
        }
        String strG2 = notificationParams.g(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strG2)) {
            pVar.f43216f = p.b(strG2);
            n4.n nVar = new n4.n();
            nVar.f43210c = p.b(strG2);
            pVar.e(nVar);
        }
        String strH2 = notificationParams.h("gcm.n.icon");
        if (TextUtils.isEmpty(strH2) || (((identifier = resources.getIdentifier(strH2, "drawable", packageName)) == 0 || !b(resources, identifier)) && ((identifier = resources.getIdentifier(strH2, "mipmap", packageName)) == 0 || !b(resources, identifier)))) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier == 0 || !b(resources, identifier)) {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.toString();
                }
            }
            if (identifier == 0 || !b(resources, identifier)) {
                identifier = 17301651;
            }
        }
        pVar.f43228s.icon = identifier;
        String strH3 = notificationParams.h("gcm.n.sound2");
        if (TextUtils.isEmpty(strH3)) {
            strH3 = notificationParams.h("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strH3)) {
            defaultUri = null;
        } else if ("default".equals(strH3) || resources.getIdentifier(strH3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strH3);
        }
        if (defaultUri != null) {
            Notification notification = pVar.f43228s;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = n4.o.a(n4.o.d(n4.o.c(n4.o.b(), 4), 5));
        }
        String strH4 = notificationParams.h("gcm.n.click_action");
        if (TextUtils.isEmpty(strH4)) {
            String strH5 = notificationParams.h("gcm.n.link_android");
            if (TextUtils.isEmpty(strH5)) {
                strH5 = notificationParams.h("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strH5) ? Uri.parse(strH5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            }
        } else {
            launchIntentForPackage = new Intent(strH4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = f20451a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = notificationParams.f20502a;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (notificationParams.a("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", notificationParams.k());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        pVar.f43217g = activity;
        PendingIntent broadcast = !notificationParams.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(notificationParams.k())), 1140850688);
        if (broadcast != null) {
            pVar.f43228s.deleteIntent = broadcast;
        }
        String strH6 = notificationParams.h("gcm.n.color");
        if (TextUtils.isEmpty(strH6)) {
            i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i11 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i11));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strH6));
            } catch (IllegalArgumentException unused2) {
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i11));
                    } catch (Resources.NotFoundException unused3) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            pVar.f43224o = numValueOf.intValue();
        }
        pVar.c(!notificationParams.a("gcm.n.sticky"));
        pVar.m = notificationParams.a("gcm.n.local_only");
        String strH7 = notificationParams.h("gcm.n.ticker");
        if (strH7 != null) {
            pVar.f43228s.tickerText = p.b(strH7);
        }
        Integer numB = notificationParams.b("gcm.n.notification_priority");
        if (numB == null || numB.intValue() < -2 || numB.intValue() > 2) {
            numB = null;
        }
        if (numB != null) {
            pVar.f43220j = numB.intValue();
        }
        Integer numB2 = notificationParams.b("gcm.n.visibility");
        if (numB2 == null || numB2.intValue() < -1 || numB2.intValue() > 1) {
            numB2 = null;
        }
        if (numB2 != null) {
            pVar.f43225p = numB2.intValue();
        }
        Integer numB3 = notificationParams.b("gcm.n.notification_count");
        if (numB3 == null || numB3.intValue() < 0) {
            numB3 = null;
        }
        if (numB3 != null) {
            pVar.f43219i = numB3.intValue();
        }
        String strH8 = notificationParams.h("gcm.n.event_time");
        if (TextUtils.isEmpty(strH8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strH8));
            } catch (NumberFormatException unused4) {
                NotificationParams.l("gcm.n.event_time");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            pVar.f43221k = true;
            pVar.f43228s.when = lValueOf.longValue();
        }
        long[] jArrI = notificationParams.i();
        if (jArrI != null) {
            pVar.f43228s.vibrate = jArrI;
        }
        int[] iArrD = notificationParams.d();
        if (iArrD != null) {
            int i13 = iArrD[0];
            int i14 = iArrD[1];
            int i15 = iArrD[2];
            Notification notification2 = pVar.f43228s;
            notification2.ledARGB = i13;
            notification2.ledOnMS = i14;
            notification2.ledOffMS = i15;
            if (i14 != 0 && i15 != 0) {
                i12 = 1;
            }
            notification2.flags = (notification2.flags & (-2)) | i12;
        }
        boolean zA = notificationParams.a("gcm.n.default_sound");
        ?? r9 = zA;
        if (notificationParams.a("gcm.n.default_vibrate_timings")) {
            r9 = (zA ? 1 : 0) | 2;
        }
        ?? r11 = r9;
        if (notificationParams.a("gcm.n.default_light_settings")) {
            r11 = (r9 == true ? 1 : 0) | 4;
        }
        Notification notification3 = pVar.f43228s;
        notification3.defaults = r11;
        if ((r11 & 4) != 0) {
            notification3.flags |= 1;
        }
        String strH9 = notificationParams.h("gcm.n.tag");
        if (TextUtils.isEmpty(strH9)) {
            strH9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new DisplayNotificationInfo(pVar, strH9);
    }

    public static boolean b(Resources resources, int i11) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i11, null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
