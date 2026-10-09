package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaau implements zzafd<zzair> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzafd f9764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaav f9765c;

    public zzaau(zzaav zzaavVar, zzadx zzadxVar, zzafd zzafdVar) {
        this.f9763a = zzadxVar;
        this.f9764b = zzafdVar;
        this.f9765c = zzaavVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzair zzairVar = (zzair) zzaelVar;
        boolean zIsEmpty = TextUtils.isEmpty(zzairVar.f10044e);
        zzadx zzadxVar = this.f9763a;
        if (!zIsEmpty) {
            zzadxVar.b(new Status(17025, null, null, null), new PhoneAuthCredential(null, null, zzairVar.f10045f, zzairVar.f10044e, true));
        } else {
            this.f9765c.f9768c.d(new zzahd(zzairVar.f10041b, zzairVar.f10040a, Long.valueOf(zzairVar.f10042c), "Bearer"), null, "phone", Boolean.valueOf(zzairVar.f10043d), null, zzadxVar, this.f9764b);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        ((zzaav) this.f9764b).zza(str);
    }
}
