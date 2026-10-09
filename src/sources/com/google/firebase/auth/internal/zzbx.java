package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbx implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f17993a;

    public zzbx(zzbv zzbvVar, RecaptchaAction recaptchaAction) {
        this.f17993a = recaptchaAction;
        Objects.requireNonNull(zzbvVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.f17993a);
        }
        Exception exception = task.getException();
        Preconditions.g(exception);
        if (!(exception instanceof zzbw)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            exception.getMessage();
        }
        return Tasks.forResult(BuildConfig.VERSION_NAME);
    }
}
