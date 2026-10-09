package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabc implements zzafd<zzail> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9788b;

    public zzabc(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9787a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9788b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzail zzailVar = (zzail) zzaelVar;
        boolean zIsEmpty = TextUtils.isEmpty(zzailVar.R);
        zzadx zzadxVar = this.f9787a;
        if (zIsEmpty) {
            zzaad.c(this.f9788b, zzailVar, zzadxVar, this);
        } else {
            zzadxVar.i(new zzaaa(zzailVar.R, zzailVar.Q, zzailVar.a()));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9787a.a(zzaq.a(str));
    }
}
