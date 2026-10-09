package bq;

import a0.b2;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebView;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import b0.a1;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.playintegrity.PlayIntegrityAppCheckProviderFactory;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.OkHttpClient;
import r.x2;
import rz.b1;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4956a;

    public o(Context application) {
        kotlin.jvm.internal.m.f(application, "application");
        this.f4956a = application;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[Catch: Exception -> 0x0073, TryCatch #2 {Exception -> 0x0073, blocks: (B:3:0x0002, B:13:0x0020, B:15:0x0028, B:20:0x0050, B:19:0x004d, B:12:0x001d, B:16:0x002d, B:5:0x000a, B:7:0x0012, B:9:0x0018), top: B:30:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #2 {Exception -> 0x0073, blocks: (B:3:0x0002, B:13:0x0020, B:15:0x0028, B:20:0x0050, B:19:0x004d, B:12:0x001d, B:16:0x002d, B:5:0x000a, B:7:0x0012, B:9:0x0018), top: B:30:0x0002, inners: #0, #1 }] */
    public static void a(o oVar) {
        Context context = oVar.f4956a;
        try {
            int[] iArr = r.f4959a;
            String strZ = m.z(context);
            if (strZ != null) {
                try {
                    if (strZ.equals("com.lingodeer:filedownloader") && Build.VERSION.SDK_INT >= 28) {
                        WebView.setDataDirectorySuffix(strZ);
                        if (kotlin.jvm.internal.m.a(strZ, "com.lingodeer")) {
                            System.currentTimeMillis();
                            SharedPreferences sharedPreferences = context.getSharedPreferences("simple-data", 0);
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString("deviceLanguage", Locale.getDefault().getLanguage());
                            editorEdit.commit();
                            sharedPreferences.getString("deviceLanguage", BuildConfig.VERSION_NAME);
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            Rive.INSTANCE.init(context, RendererType.Canvas);
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            oVar.b();
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            oVar.c();
                            System.currentTimeMillis();
                        }
                    } else if (kotlin.jvm.internal.m.a(strZ, "com.lingodeer")) {
                        System.currentTimeMillis();
                        try {
                            SharedPreferences sharedPreferences2 = context.getSharedPreferences("simple-data", 0);
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            editorEdit2.putString("deviceLanguage", Locale.getDefault().getLanguage());
                            editorEdit2.commit();
                            sharedPreferences2.getString("deviceLanguage", BuildConfig.VERSION_NAME);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        Rive.INSTANCE.init(context, RendererType.Canvas);
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        oVar.b();
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        oVar.c();
                        System.currentTimeMillis();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else if (kotlin.jvm.internal.m.a(strZ, "com.lingodeer")) {
                System.currentTimeMillis();
                SharedPreferences sharedPreferences3 = context.getSharedPreferences("simple-data", 0);
                SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                editorEdit3.putString("deviceLanguage", Locale.getDefault().getLanguage());
                editorEdit3.commit();
                sharedPreferences3.getString("deviceLanguage", BuildConfig.VERSION_NAME);
                System.currentTimeMillis();
                System.currentTimeMillis();
                Rive.INSTANCE.init(context, RendererType.Canvas);
                System.currentTimeMillis();
                System.currentTimeMillis();
                oVar.b();
                System.currentTimeMillis();
                System.currentTimeMillis();
                oVar.c();
                System.currentTimeMillis();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        LingoSkillApplication.L.postValue(Boolean.TRUE);
    }

    public final void c() {
        Context context = this.f4956a;
        try {
            FirebaseApp.j(context);
            if (oz.q.v0("release", "debug", false)) {
                FirebaseCrashlytics.a().b(false);
            } else {
                FirebaseCrashlytics.a().b(true);
            }
            int[] iArr = r.f4959a;
            String strN = com.bumptech.glide.d.n(m.o(context));
            kotlin.jvm.internal.m.c(strN);
            String strSubstring = strN.substring(0, 16);
            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            byte[] encoded = new SecretKeySpec(strSubstring.getBytes(Constants.ENCODING), "AES").getEncoded();
            kotlin.jvm.internal.m.e(encoded, "getEncoded(...)");
            String str = new String(encoded, oz.a.f46133a);
            String strF = v10.c.f(str, "MM2nWVjaj1WRdpCBWZH/Bzvq3YEGsNez3bjOE+8UGYQUtEH7fF54mnMjqYAIkv1m");
            String strF2 = v10.c.f(str, "52iRYOZ9+Z3s0eVWrqv2gn9xG4h4WphteZ1VOi1qXkdPOghLyV7xrMeFHVYpP3R4");
            String strF3 = v10.c.f(str, "UcRhf5XvPRbslqdJVG1Y9adTwz69ivXx6Yt+XiQDwMeCgJjZZgQxr6TPvEnduhGv");
            FirebaseOptions.Builder builder = new FirebaseOptions.Builder();
            builder.f17739b = "lingodeer-db-c5748";
            Preconditions.e(strF, "ApplicationId must be set.");
            builder.f17738a = strF;
            Preconditions.e(strF2, "ApiKey must be set.");
            FirebaseApp.i(context, new FirebaseOptions(builder.f17738a, strF2, strF3, null, "11202749909", null, builder.f17739b), "USER-INFO");
            FirebaseAppCheck firebaseAppCheck = (FirebaseAppCheck) FirebaseApp.f("USER-INFO").c(FirebaseAppCheck.class);
            kotlin.jvm.internal.m.e(firebaseAppCheck, "getInstance(...)");
            PlayIntegrityAppCheckProviderFactory playIntegrityAppCheckProviderFactory = PlayIntegrityAppCheckProviderFactory.f17848a;
            firebaseAppCheck.c(playIntegrityAppCheckProviderFactory);
            firebaseAppCheck.d();
            FirebaseAppCheck firebaseAppCheck2 = (FirebaseAppCheck) FirebaseApp.e().c(FirebaseAppCheck.class);
            kotlin.jvm.internal.m.e(firebaseAppCheck2, "getInstance(...)");
            firebaseAppCheck2.c(playIntegrityAppCheckProviderFactory);
            firebaseAppCheck2.d();
            Object obj = FirebaseInstallations.m;
            ((FirebaseInstallations) FirebaseApp.e().c(FirebaseInstallationsApi.class)).getId().addOnCompleteListener(new a10.b(27));
            FirebaseMessaging.c().e().addOnCompleteListener(new a10.b(28));
            e0.B(b1.f50869a, null, null, new a1(this, null, 10), 3);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.a(20000L, timeUnit);
        builder.b(20000L, timeUnit);
        builder.f45114f = true;
        Context applicationContext = this.f4956a.getApplicationContext();
        kotlin.jvm.internal.m.d(applicationContext, SemtNwfPgIhi.aLkZ);
        ns.o.f44007a = ((Application) applicationContext).getApplicationContext();
        b2 b2Var = new b2(8);
        x2 x2Var = xv.c.f56595a;
        synchronized (x2Var) {
            x2Var.f48709a = new hd.b(b2Var, 8);
            x2Var.f48711c = null;
            x2Var.f48712d = null;
            x2Var.f48713e = null;
            x2Var.f48714f = null;
        }
        ql.a aVar = new ql.a();
        aVar.f47806b = builder;
        b2Var.f27b = aVar;
    }
}
