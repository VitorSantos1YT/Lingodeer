package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.internal.zzaq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaag implements zzafd<zzagi> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9726b;

    public zzaag(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9725a = zzadxVar;
        this.f9726b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzagi zzagiVar = (zzagi) zzaelVar;
        boolean zIsEmpty = TextUtils.isEmpty(zzagiVar.f9932f);
        zzadx zzadxVar = this.f9725a;
        if (!zIsEmpty) {
            zzadxVar.i(new zzaaa(zzagiVar.f9932f, zzagiVar.f9931e, null));
            return;
        }
        this.f9726b.d(new zzahd(zzagiVar.f9928b, zzagiVar.f9927a, Long.valueOf(zzagiVar.f9930d), "Bearer"), null, null, Boolean.valueOf(zzagiVar.f9929c), null, zzadxVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9725a.a(zzaq.a(str));
    }
}
