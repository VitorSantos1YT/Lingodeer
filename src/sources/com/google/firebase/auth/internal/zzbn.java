package com.google.firebase.auth.internal;

import android.net.Uri;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbn implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Uri f17975a;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Uri uri = this.f17975a;
        zzcj zzcjVar = RecaptchaActivity.f17930c;
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) task.getResult();
            if (appCheckTokenResult.a() != null) {
                String.valueOf(appCheckTokenResult.a());
            }
            builderBuildUpon.fragment("fac=" + appCheckTokenResult.b());
        } else {
            task.getException().getMessage();
        }
        return builderBuildUpon.build();
    }
}
