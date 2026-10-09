package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaae implements zzafd<zzaip> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9722b;

    public zzaae(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9721a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9722b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzaip zzaipVar = (zzaip) zzaelVar;
        boolean zIsEmpty = TextUtils.isEmpty(zzaipVar.f10034e);
        zzadx zzadxVar = this.f9721a;
        if (!zIsEmpty) {
            zzadxVar.i(new zzaaa(zzaipVar.f10034e, zzaipVar.f10033d, null));
            return;
        }
        this.f9722b.d(new zzahd(zzaipVar.f10031b, zzaipVar.f10030a, Long.valueOf(zzaipVar.f10032c), "Bearer"), null, null, Boolean.FALSE, null, zzadxVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9721a.a(zzaq.a(str));
    }
}
