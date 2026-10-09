package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaah implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmailAuthCredential f9727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzadx f9729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzaad f9730d;

    public zzaah(zzaad zzaadVar, EmailAuthCredential emailAuthCredential, String str, zzadx zzadxVar) {
        this.f9727a = emailAuthCredential;
        this.f9728b = str;
        this.f9729c = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9730d = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzagf zzagfVar = new zzagf(this.f9727a, ((zzahd) zzaelVar).f9959b, this.f9728b);
        zzaad zzaadVar = this.f9730d;
        zzaen zzaenVar = zzaadVar.f9720a;
        zzaag zzaagVar = new zzaag(zzaadVar, this.f9729c);
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.a(zzaehVar.a("/emailLinkSignin", zzaenVar.f9865f), zzagfVar, zzaagVar, new zzagi(), zzaehVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9729c.a(zzaq.a(str));
    }
}
