package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.fragment.app.p0;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaea;
import com.google.android.gms.internal.p002firebaseauthapi.zzaep;
import com.google.android.gms.internal.p002firebaseauthapi.zzaft;
import com.google.android.gms.internal.p002firebaseauthapi.zzafu;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.local.OLhn.iBOEkSbvCqGS;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.UUID;
import wh.Yzt.COaVv;
import x6.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RecaptchaActivity extends p0 implements zzaea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f17929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzcj f17930c = zzcj.f18010b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17931a = false;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final void a(Status status) {
        if (status == null) {
            k();
        } else {
            j(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final Uri.Builder b(Intent intent, String str, String str2) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(Constants.SCHEME).appendPath("__").appendPath("auth").appendPath("handler");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        FirebaseApp firebaseAppF = FirebaseApp.f(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseAppF);
        zzq zzqVar = zzq.f18024a;
        Context applicationContext = getApplicationContext();
        synchronized (zzqVar) {
            Preconditions.d(str);
            Preconditions.d(string);
            SharedPreferences sharedPreferencesA = zzq.a(applicationContext, str);
            zzq.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strB = zzs.a(getApplicationContext(), firebaseAppF.g()).b();
        String strA = null;
        if (TextUtils.isEmpty(strB)) {
            j(zzaq.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.f17884g) {
        }
        if (TextUtils.isEmpty(null)) {
            strA = zzaep.a();
        }
        builderAppendPath.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strA).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        return builderAppendPath;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final HttpURLConnection c(URL url) {
        com.google.android.gms.internal.p002firebaseauthapi.zza zzaVar;
        try {
            com.google.android.gms.internal.p002firebaseauthapi.zza zzaVar2 = com.google.android.gms.internal.p002firebaseauthapi.zza.f9707a;
            synchronized (com.google.android.gms.internal.p002firebaseauthapi.zza.class) {
                zzaVar = com.google.android.gms.internal.p002firebaseauthapi.zza.f9707a;
            }
            return (HttpURLConnection) zzaVar.a(url);
        } catch (IOException unused) {
            zzaea.f9848i.b("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final void d(Uri uri, String str, Provider provider) {
        Task taskForResult;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) provider.get();
        if (interopAppCheckTokenProvider != null) {
            Task taskA = interopAppCheckTokenProvider.a(false);
            zzbn zzbnVar = new zzbn();
            zzbnVar.f17975a = uri;
            taskForResult = taskA.continueWith(zzbnVar);
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        zzbo zzboVar = new zzbo();
        zzboVar.f17976a = this;
        zzboVar.f17977b = str;
        taskForResult.addOnCompleteListener(zzboVar);
    }

    public final void j(Status status) {
        f17929b = 0L;
        this.f17931a = false;
        Intent intent = new Intent();
        HashMap map = zzck.f18012a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b.a(this).c(intent);
        f17930c.a(this);
        finish();
    }

    public final void k() {
        f17929b = 0L;
        this.f17931a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b.a(this).c(intent);
        f17930c.a(this);
        finish();
    }

    @Override // androidx.fragment.app.p0, f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        iBOEkSbvCqGS.CinYxVvJq.invoke(null, this, bundle);
    }

    @Override // f.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onResume() throws IllegalAccessException, InvocationTargetException {
        COaVv.AZaJ.invoke(null, this);
    }

    @Override // f.n, n4.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f17931a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final String zza(String str) {
        String strA = zzafu.a("firebear.identityToolkit");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        zzaft.b(str);
        return "https://www.googleapis.com/identitytoolkit/v3/relyingparty";
    }
}
