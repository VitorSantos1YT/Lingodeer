package com.google.firebase.auth.internal;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahe;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.FirebaseApp;
import ep.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzby implements Continuation<zzahe, Task<RecaptchaTasksClient>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbv f17995b;

    public zzby(zzbv zzbvVar, String str) {
        this.f17994a = str;
        this.f17995b = zzbvVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Task<RecaptchaTasksClient> then(Task<zzahe> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Preconditions.g(exception);
            String message = exception.getMessage();
            Preconditions.g(message);
            return Tasks.forException(new zzbw(message));
        }
        zzahe result = task.getResult();
        String str = result.f9963a;
        if (com.google.android.gms.internal.p002firebaseauthapi.zzac.d(str)) {
            return Tasks.forException(new zzbw(a.e("No Recaptcha Enterprise siteKey configured for tenant/project ", this.f17994a)));
        }
        List listC = com.google.android.gms.internal.p002firebaseauthapi.zzt.b('/').c(str);
        String str2 = listC.size() != 4 ? null : (String) listC.get(3);
        if (TextUtils.isEmpty(str2)) {
            return Tasks.forException(new Exception("Invalid siteKey format ".concat(str)));
        }
        zzbv zzbvVar = this.f17995b;
        zzbu zzbuVar = zzbvVar.f17992f;
        FirebaseApp firebaseApp = zzbvVar.f17990d;
        firebaseApp.b();
        Application application = (Application) firebaseApp.f17714a;
        ((zzbt) zzbuVar).getClass();
        Task<RecaptchaTasksClient> taskFetchTaskClient = Recaptcha.fetchTaskClient(application, str2);
        zzbv zzbvVar2 = this.f17995b;
        String str3 = this.f17994a;
        synchronized (zzbvVar2.f17987a) {
            zzbvVar2.f17989c = result;
            zzbvVar2.f17988b.put(str3, taskFetchTaskClient);
        }
        return taskFetchTaskClient;
    }
}
