package com.google.firebase.auth.internal;

import a4.Quyv.NpDRGrvGCBTIai;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.fragment.app.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaea;
import com.google.android.gms.internal.p002firebaseauthapi.zzaft;
import com.google.android.gms.internal.p002firebaseauthapi.zzafu;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.local.OLhn.iBOEkSbvCqGS;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import x6.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class GenericIdpActivity extends p0 implements zzaea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f17926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzcj f17927c = zzcj.f18010b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17928a = false;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final void a(Status status) {
        if (status == null) {
            k();
        } else {
            j(status);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0217 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri.Builder b(android.content.Intent r19, java.lang.String r20, java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.GenericIdpActivity.b(android.content.Intent, java.lang.String, java.lang.String):android.net.Uri$Builder");
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
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final void d(Uri uri, String str, Provider provider) {
        Task taskForResult;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) provider.get();
        if (interopAppCheckTokenProvider != null) {
            Task taskA = interopAppCheckTokenProvider.a(false);
            zzbh zzbhVar = new zzbh();
            zzbhVar.f17969a = uri;
            taskForResult = taskA.continueWith(zzbhVar);
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        zzbf zzbfVar = new zzbf();
        zzbfVar.f17966a = this;
        zzbfVar.f17967b = str;
        taskForResult.addOnCompleteListener(zzbfVar);
    }

    public final void j(Status status) {
        f17926b = 0L;
        this.f17928a = false;
        Intent intent = new Intent();
        HashMap map = zzck.f18012a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (b.a(this).c(intent)) {
            f17927c.a(this);
        } else {
            zzbm.a(getApplicationContext(), status);
        }
        finish();
    }

    public final void k() {
        f17926b = 0L;
        this.f17928a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (b.a(this).c(intent)) {
            f17927c.a(this);
        } else {
            zzbm.a(this, zzaq.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.p0, f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        NpDRGrvGCBTIai.PWr.invoke(null, this, bundle);
    }

    @Override // f.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onResume() throws IllegalAccessException, InvocationTargetException {
        iBOEkSbvCqGS.mLTFjVUNPWUILh.invoke(null, this);
    }

    @Override // f.n, n4.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f17928a);
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
