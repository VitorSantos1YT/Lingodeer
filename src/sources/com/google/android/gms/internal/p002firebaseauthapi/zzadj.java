package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzj;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzadj extends zzaeq<Void, zzj> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        Preconditions.e(null, "idToken should not be empty.");
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        zzadx zzadxVar = new zzadx(zzaesVar, zzadw.f9835c);
        zzafo zzafoVar = zzadwVar.f9837b;
        if (zzafoVar.f9904b.get(null) != null) {
            zzafoVar.a(zzadxVar, null);
            return;
        }
        Preconditions.d(null);
        zzaie zzaieVar = new zzaie(null);
        zzadw.f9835c.b("App hash will not be appended to the request.", new Object[0]);
        Logger logger = zzafo.f9902c;
        HashMap map = zzafoVar.f9904b;
        map.put(null, new zzafr());
        zzafoVar.a(zzadxVar, null);
        ((zzafr) map.get(null)).getClass();
        logger.b("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzafp zzafpVar = new zzafp(zzafoVar, zzadxVar, null);
        zzaadVar.getClass();
        zzaen zzaenVar = zzaadVar.f9720a;
        zzabf zzabfVar = new zzabf(zzaadVar, zzaieVar, zzafpVar);
        zzaenVar.getClass();
        if (!TextUtils.isEmpty(null)) {
            zzaenVar.g().f9859f = null;
        }
        zzaeg zzaegVar = zzaenVar.f9861b;
        zzafg.a(zzaegVar.a("/accounts/mfaEnrollment:start", zzaenVar.f9865f), zzaieVar, zzabfVar, new zzahz(), zzaegVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
    }
}
