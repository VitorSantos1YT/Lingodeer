package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzb implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zza zzaVar = zza.f17932a;
        if (!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            if (task.getException() == null) {
                throw null;
            }
            task.getException().getMessage();
            throw null;
        }
        zzo zzoVar = new zzo();
        zzoVar.f18017b = ((IntegrityTokenResponse) task.getResult()).token();
        zzoVar.a();
        throw null;
    }
}
