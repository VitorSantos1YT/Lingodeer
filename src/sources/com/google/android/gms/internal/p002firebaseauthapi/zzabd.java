package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.internal.zzaq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabd implements zzafd<zzait> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaba f9790b;

    public zzabd(zzaba zzabaVar, zzadx zzadxVar) {
        this.f9789a = zzadxVar;
        this.f9790b = zzabaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzait zzaitVar = (zzait) zzaelVar;
        boolean zIsEmpty = TextUtils.isEmpty(zzaitVar.f10052a);
        zzadx zzadxVar = this.f9789a;
        if (zIsEmpty || TextUtils.isEmpty(zzaitVar.f10053b)) {
            zzadxVar.a(zzaq.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        this.f9790b.f9782b.d(new zzahd(zzaitVar.f10053b, zzaitVar.f10052a, Long.valueOf(zzahf.a(zzaitVar.f10052a)), "Bearer"), null, null, Boolean.FALSE, null, zzadxVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9789a.a(zzaq.a(str));
    }
}
