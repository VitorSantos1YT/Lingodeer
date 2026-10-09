package com.google.firebase.auth.internal;

import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbr implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbv f17983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f17984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Continuation f17985d;

    public zzbr(String str, zzbv zzbvVar, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f17982a = str;
        this.f17983b = zzbvVar;
        this.f17984c = recaptchaAction;
        this.f17985d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        Preconditions.g(exception);
        SparseArray sparseArray = zzadz.f9847a;
        if (exception instanceof FirebaseAuthException ? ((FirebaseAuthException) exception).f17899a.endsWith("INVALID_RECAPTCHA_TOKEN") : false) {
            return this.f17983b.a(this.f17982a, Boolean.TRUE, this.f17984c).continueWithTask(this.f17985d);
        }
        return task;
    }
}
