package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements Continuation<zzagz, Task<IntegrityTokenResponse>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<IntegrityTokenResponse> then(Task<zzagz> task) {
        if (task.isSuccessful()) {
            String str = task.getResult().f9954a;
            throw null;
        }
        zza zzaVar = zza.f17932a;
        task.getException().getMessage();
        return Tasks.forException(task.getException());
    }
}
