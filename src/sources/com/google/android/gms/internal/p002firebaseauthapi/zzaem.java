package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.zzad;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import defpackage.e;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzaff f9855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseApp f9857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9858e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9859f;

    public zzaem(Context context, FirebaseApp firebaseApp, String str) {
        Preconditions.g(context);
        this.f9854a = context;
        Preconditions.g(firebaseApp);
        this.f9857d = firebaseApp;
        this.f9856c = "Android/Fallback/".concat(str);
    }

    public final void a(HttpURLConnection httpURLConnection) {
        HeartBeatController heartBeatController;
        String str;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider;
        String strB;
        boolean z11 = this.f9858e;
        String str2 = this.f9856c;
        String strM = z11 ? e.m(str2, "/FirebaseUI-Android") : e.m(str2, "/FirebaseCore-Android");
        if (this.f9855b == null) {
            this.f9855b = new zzaff(this.f9854a);
        }
        httpURLConnection.setRequestProperty("X-Android-Package", this.f9855b.f9899a);
        httpURLConnection.setRequestProperty("X-Android-Cert", this.f9855b.f9900b);
        httpURLConnection.setRequestProperty("Accept-Language", zzaep.a());
        httpURLConnection.setRequestProperty("X-Client-Version", strM);
        httpURLConnection.setRequestProperty("X-Firebase-Locale", this.f9859f);
        FirebaseApp firebaseApp = this.f9857d;
        firebaseApp.b();
        httpURLConnection.setRequestProperty("X-Firebase-GMPID", firebaseApp.f17716c.f17732b);
        zzad zzadVar = (zzad) firebaseApp.c(zzad.class);
        if (zzadVar == null || (heartBeatController = (HeartBeatController) zzadVar.f18054c.get()) == null) {
            str = null;
        } else {
            try {
                str = (String) Tasks.await(heartBeatController.a());
            } catch (InterruptedException | ExecutionException e8) {
                e8.getMessage();
                str = null;
            }
        }
        httpURLConnection.setRequestProperty("X-Firebase-Client", str);
        zzad zzadVar2 = (zzad) firebaseApp.c(zzad.class);
        if (zzadVar2 == null || (interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) zzadVar2.f18053b.get()) == null) {
            strB = null;
        } else {
            try {
                AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) Tasks.await(interopAppCheckTokenProvider.a(false));
                if (appCheckTokenResult.a() != null) {
                    String.valueOf(appCheckTokenResult.a());
                }
                strB = appCheckTokenResult.b();
            } catch (InterruptedException e10) {
                e = e10;
                e.getMessage();
                strB = null;
            } catch (ExecutionException e11) {
                e = e11;
                e.getMessage();
                strB = null;
            }
        }
        if (!TextUtils.isEmpty(strB)) {
            httpURLConnection.setRequestProperty("X-Firebase-AppCheck", strB);
        }
        this.f9859f = null;
    }
}
