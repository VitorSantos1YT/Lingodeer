package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzahe;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbq<T> {
    public final Task a(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        boolean z11;
        String strA;
        zzbs zzbsVar = new zzbs();
        zzbsVar.f17986a = this;
        zzbv zzbvVarJ = firebaseAuth.j();
        if (zzbvVarJ != null) {
            synchronized (zzbvVarJ.f17987a) {
                zzahe zzaheVar = zzbvVarJ.f17989c;
                z11 = (zzaheVar == null || (strA = zzaheVar.a("EMAIL_PASSWORD_PROVIDER")) == null || (!strA.equals("ENFORCE") && !strA.equals("AUDIT"))) ? false : true;
            }
            if (z11) {
                return zzbvVarJ.a(str, Boolean.FALSE, recaptchaAction).continueWithTask(zzbsVar).continueWithTask(new zzbr(str, zzbvVarJ, recaptchaAction, zzbsVar));
            }
        }
        Task taskB = b(null);
        zzbp zzbpVar = new zzbp();
        zzbpVar.f17978a = recaptchaAction;
        zzbpVar.f17979b = firebaseAuth;
        zzbpVar.f17980c = str;
        zzbpVar.f17981d = zzbsVar;
        return taskB.continueWithTask(zzbpVar);
    }

    public abstract Task b(String str);
}
