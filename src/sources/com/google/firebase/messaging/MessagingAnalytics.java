package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.ProductData;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MessagingAnalytics {
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.e();
            FirebaseApp firebaseAppE = FirebaseApp.e();
            firebaseAppE.b();
            Context context = firebaseAppE.f17714a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0159  */
    /* JADX WARN: Code duplicated, block: B:88:0x0166 A[Catch: NumberFormatException -> 0x0174, TRY_ENTER, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0174, blocks: (B:88:0x0166, B:96:0x017f), top: B:123:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0176  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f A[Catch: NumberFormatException -> 0x0174, TRY_ENTER, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0174, blocks: (B:88:0x0166, B:96:0x017f), top: B:123:0x0164 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Intent intent) {
        int iIntValue;
        Object[] objArr;
        long j11;
        FirebaseApp firebaseAppE;
        FirebaseOptions firebaseOptions;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        if (d(intent)) {
            c("_nr", intent.getExtras());
        }
        int i11 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : a()) {
            MessagingClientEvent.Event event = MessagingClientEvent.Event.MESSAGE_DELIVERED;
            TransportFactory transportFactory = (TransportFactory) FirebaseMessaging.m.get();
            if (transportFactory == null) {
                return;
            }
            MessagingClientEvent messagingClientEventA = null;
            str = null;
            String str4 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                int i12 = MessagingClientEvent.f20604n;
                MessagingClientEvent.Builder builder = new MessagingClientEvent.Builder();
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                builder.f20625i = iIntValue;
                builder.f20627k = event;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        FirebaseApp firebaseAppE2 = FirebaseApp.e();
                        try {
                            Object obj2 = FirebaseInstallations.m;
                            string = (String) Tasks.await(((FirebaseInstallations) firebaseAppE2.c(FirebaseInstallationsApi.class)).getId());
                        } catch (InterruptedException e8) {
                            e = e8;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e10) {
                        e = e10;
                    }
                }
                builder.f20619c = string;
                FirebaseApp firebaseAppE3 = FirebaseApp.e();
                firebaseAppE3.b();
                builder.f20622f = firebaseAppE3.f17714a.getPackageName();
                builder.f20621e = MessagingClientEvent.SDKPlatform.ANDROID;
                builder.f20620d = NotificationParams.j(extras) ? MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent.MessageType.DATA_MESSAGE;
                String string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if (com.adjust.sdk.Constants.HIGH.equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if (com.adjust.sdk.Constants.HIGH.equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i11 = 5;
                } else if (objArr == 1) {
                    i11 = 10;
                }
                builder.f20624h = i11;
                String string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    builder.f20618b = string3;
                }
                String string4 = extras.getString("from");
                if (string4 != null && string4.startsWith("/topics/")) {
                    str4 = string4;
                }
                if (str4 != null) {
                    builder.f20626j = str4;
                }
                String string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    builder.f20623g = string5;
                }
                String string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    builder.f20628l = string6;
                }
                String string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    builder.m = string7;
                }
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j11 = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException unused2) {
                        firebaseAppE = FirebaseApp.e();
                        firebaseOptions = firebaseAppE.f17716c;
                        firebaseAppE.b();
                        str = firebaseOptions.f17735e;
                        if (str != null) {
                            try {
                                j11 = Long.parseLong(str);
                            } catch (NumberFormatException unused3) {
                                firebaseAppE.b();
                                str2 = firebaseOptions.f17732b;
                                try {
                                    if (str2.startsWith("1:")) {
                                        strArrSplit = str2.split(":");
                                        if (strArrSplit.length >= 2) {
                                            str3 = strArrSplit[1];
                                            if (!str3.isEmpty()) {
                                                j11 = Long.parseLong(str3);
                                            }
                                        }
                                        j11 = 0;
                                    } else {
                                        j11 = Long.parseLong(str2);
                                    }
                                } catch (NumberFormatException unused4) {
                                }
                            }
                        } else {
                            firebaseAppE.b();
                            str2 = firebaseOptions.f17732b;
                            if (str2.startsWith("1:")) {
                                j11 = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length >= 2) {
                                    str3 = strArrSplit[1];
                                    if (!str3.isEmpty()) {
                                        j11 = Long.parseLong(str3);
                                    }
                                }
                                j11 = 0;
                            }
                        }
                    }
                } else {
                    firebaseAppE = FirebaseApp.e();
                    firebaseOptions = firebaseAppE.f17716c;
                    firebaseAppE.b();
                    str = firebaseOptions.f17735e;
                    if (str != null) {
                        j11 = Long.parseLong(str);
                    } else {
                        firebaseAppE.b();
                        str2 = firebaseOptions.f17732b;
                        if (str2.startsWith("1:")) {
                            j11 = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(":");
                            if (strArrSplit.length >= 2) {
                                str3 = strArrSplit[1];
                                if (!str3.isEmpty()) {
                                    j11 = Long.parseLong(str3);
                                }
                            }
                            j11 = 0;
                        }
                    }
                }
                if (j11 > 0) {
                    builder.f20617a = j11;
                }
                messagingClientEventA = builder.a();
            }
            if (messagingClientEventA == null) {
                return;
            }
            try {
                ProductData productDataB = ProductData.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                Transport transportB = transportFactory.b("FCM_CLIENT_EVENT_LOGGING", new Encoding("proto"), new a(3));
                int i13 = MessagingClientEventExtension.f20629b;
                MessagingClientEventExtension.Builder builder2 = new MessagingClientEventExtension.Builder();
                builder2.f20631a = messagingClientEventA;
                transportB.a(Event.f(new MessagingClientEventExtension(builder2.f20631a), productDataB));
            } catch (RuntimeException unused5) {
            }
        }
    }

    public static void c(String str, Bundle bundle) {
        try {
            FirebaseApp.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = NotificationParams.j(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.e().c(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.d("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static boolean d(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
