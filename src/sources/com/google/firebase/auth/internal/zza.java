package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zza f17932a = new zza();

    public final void a(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException());
    }
}
