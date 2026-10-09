package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzv implements Continuation<zzahz, Task<TotpSecret>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<TotpSecret> then(Task<zzahz> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Preconditions.g(exception);
            return Tasks.forException(exception);
        }
        zzahz result = task.getResult();
        if (result instanceof zzaif) {
            zzaif zzaifVar = (zzaif) result;
            Preconditions.d(zzaifVar.f10007b);
            Preconditions.d(zzaifVar.f10008c);
            String str = zzaifVar.f10006a;
            Preconditions.d(str);
            Preconditions.e(str, ualZoVVCQs.NrENrIlYEHCQAMt);
            Preconditions.h(null, "firebaseAuth cannot be null.");
            throw null;
        }
        throw new IllegalArgumentException(a.g("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", result.getClass().getName(), "."));
    }
}
