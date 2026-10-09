package com.google.firebase.auth.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbp implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ RecaptchaAction f17978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f17979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f17980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ zzbs f17981d;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        RecaptchaAction recaptchaAction = this.f17978a;
        FirebaseAuth firebaseAuth = this.f17979b;
        String str = this.f17980c;
        zzbs zzbsVar = this.f17981d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        Preconditions.g(exception);
        SparseArray sparseArray = zzadz.f9847a;
        if (!(exception instanceof FirebaseAuthException ? ((FirebaseAuthException) exception).f17899a.endsWith("MISSING_RECAPTCHA_TOKEN") : false)) {
            String.valueOf(recaptchaAction);
            exception.getMessage();
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            String.valueOf(recaptchaAction);
        }
        if (firebaseAuth.j() == null) {
            zzbv zzbvVar = new zzbv(firebaseAuth.f17878a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f17887j = zzbvVar;
            }
        }
        zzbv zzbvVarJ = firebaseAuth.j();
        return zzbvVarJ.a(str, Boolean.FALSE, recaptchaAction).continueWithTask(zzbsVar).continueWithTask(new zzbr(str, zzbvVarJ, recaptchaAction, zzbsVar));
    }
}
