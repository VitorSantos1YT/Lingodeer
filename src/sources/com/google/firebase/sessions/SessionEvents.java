package com.google.firebase.sessions;

import a.ar.MFeWs;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionEvents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SessionEvents f20943a = new SessionEvents();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DataEncoder f20944b;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoSessionEventEncoder.f20816a.getClass();
        jsonDataEncoderBuilder.b(SessionEvent.class, AutoSessionEventEncoder.SessionEventEncoder.f20840a);
        jsonDataEncoderBuilder.b(SessionInfo.class, AutoSessionEventEncoder.SessionInfoEncoder.f20844a);
        jsonDataEncoderBuilder.b(DataCollectionStatus.class, AutoSessionEventEncoder.DataCollectionStatusEncoder.f20831a);
        jsonDataEncoderBuilder.b(ApplicationInfo.class, AutoSessionEventEncoder.ApplicationInfoEncoder.f20824a);
        jsonDataEncoderBuilder.b(AndroidApplicationInfo.class, AutoSessionEventEncoder.AndroidApplicationInfoEncoder.f20817a);
        jsonDataEncoderBuilder.b(ProcessDetails.class, AutoSessionEventEncoder.ProcessDetailsEncoder.f20835a);
        jsonDataEncoderBuilder.f19633d = true;
        f20944b = jsonDataEncoderBuilder.a();
    }

    private SessionEvents() {
    }

    public static ApplicationInfo a(FirebaseApp firebaseApp) throws PackageManager.NameNotFoundException {
        String strValueOf;
        String str;
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        m.e(context, MFeWs.UbxEhfNm);
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            strValueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = strValueOf;
        firebaseApp.b();
        String str3 = firebaseApp.f17716c.f17732b;
        m.e(str3, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        m.e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        m.e(RELEASE, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        m.c(packageName);
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str = str2;
        } else {
            str = str4;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        m.e(MANUFACTURER, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.f20927a;
        firebaseApp.b();
        processDetailsProvider.getClass();
        ProcessDetails processDetailsB = ProcessDetailsProvider.b(context);
        firebaseApp.b();
        return new ApplicationInfo(str3, logEnvironment, new AndroidApplicationInfo(packageName, str, str2, processDetailsB, ProcessDetailsProvider.a(context)));
    }
}
