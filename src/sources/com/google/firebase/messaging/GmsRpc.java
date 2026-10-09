package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.cloudmessaging.zzw;
import com.google.android.gms.cloudmessaging.zzy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class GmsRpc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Metadata f20489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rpc f20490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f20491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f20492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FirebaseInstallationsApi f20493f;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp.b();
        Rpc rpc = new Rpc(firebaseApp.f17714a);
        this.f20488a = firebaseApp;
        this.f20489b = metadata;
        this.f20490c = rpc;
        this.f20491d = provider;
        this.f20492e = provider2;
        this.f20493f = firebaseInstallationsApi;
    }

    public final Task a(Task task) {
        return task.continueWith(new s.a(1), new k(this, 0));
    }

    public final Task c(String str, String str2, final Bundle bundle) {
        try {
            b(str, str2, bundle);
            zzy zzyVar = Rpc.f8568j;
            final Rpc rpc = this.f20490c;
            zzw zzwVar = rpc.f8572c;
            if (zzwVar.a() < 12000000) {
                return zzwVar.b() != 0 ? rpc.a(bundle).continueWithTask(zzyVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Bundle bundle2;
                        Rpc rpc2 = rpc;
                        rpc2.getClass();
                        return (task.isSuccessful() && (bundle2 = (Bundle) task.getResult()) != null && bundle2.containsKey("google.messenger")) ? rpc2.a(bundle).onSuccessTask(Rpc.f8568j, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            public final Task then(Object obj) {
                                Bundle bundle3 = (Bundle) obj;
                                int i11 = Rpc.f8566h;
                                return (bundle3 == null || !bundle3.containsKey("google.messenger")) ? Tasks.forResult(bundle3) : Tasks.forResult(null);
                            }
                        }) : task;
                    }
                }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return zzv.a(rpc.f8571b).c(1, bundle).continueWith(zzyVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws IOException {
                    if (task.isSuccessful()) {
                        return (Bundle) task.getResult();
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        "Error making request: ".concat(String.valueOf(task.getException()));
                    }
                    throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
                }
            });
        } catch (InterruptedException | ExecutionException e8) {
            return Tasks.forException(e8);
        }
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i11;
        String str3;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatB;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        FirebaseApp firebaseApp = this.f20488a;
        firebaseApp.b();
        bundle.putString("gmp_app_id", firebaseApp.f17716c.f17732b);
        Metadata metadata = this.f20489b;
        synchronized (metadata) {
            try {
                if (metadata.f20500d == 0) {
                    try {
                        packageInfo = metadata.f20497a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e8) {
                        e8.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        metadata.f20500d = packageInfo.versionCode;
                    }
                }
                i11 = metadata.f20500d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("gmsv", Integer.toString(i11));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f20489b.a());
        Metadata metadata2 = this.f20489b;
        synchronized (metadata2) {
            try {
                if (metadata2.f20499c == null) {
                    metadata2.d();
                }
                str3 = metadata2.f20499c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        bundle.putString("app_ver_name", str3);
        FirebaseApp firebaseApp2 = this.f20488a;
        firebaseApp2.b();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(firebaseApp2.f17715b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((InstallationTokenResult) Tasks.await(this.f20493f.a())).a();
            if (!TextUtils.isEmpty(strA)) {
                bundle.putString(aYZzTH.XrpTT, strA);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) Tasks.await(this.f20493f.getId()));
        bundle.putString("cliv", "fcm-25.0.2");
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.f20492e.get();
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) this.f20491d.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (heartBeatB = heartBeatInfo.b()) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatB.a()));
        bundle.putString("Firebase-Client", userAgentPublisher.a());
    }
}
