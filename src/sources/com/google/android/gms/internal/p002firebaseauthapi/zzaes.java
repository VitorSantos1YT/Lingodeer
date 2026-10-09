package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzaq;
import com.google.firebase.auth.zzc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaes implements zzadu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzaeq f9885a;

    public zzaes(zzaeq zzaeqVar) {
        this.f9885a = zzaeqVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.auth.internal.zzaw, java.lang.Object] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void a(Status status) {
        String str = status.f8707b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzaeq zzaeqVar = this.f9885a;
        if (zzaeqVar.f9867a == 8) {
            zzaeqVar.f9883r = true;
            o(new zzaew(this, status));
            throw null;
        }
        ?? r9 = zzaeqVar.f9872f;
        if (r9 != 0) {
            r9.a(status);
        }
        zzaeqVar.b(status);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.firebase.auth.internal.zzaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.firebase.auth.internal.zzaw, java.lang.Object] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void b(Status status, PhoneAuthCredential phoneAuthCredential) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 2);
        ?? r9 = zzaeqVar.f9872f;
        if (r9 != 0) {
            r9.a(status);
        }
        zzaeqVar.m = phoneAuthCredential;
        ?? r11 = zzaeqVar.f9872f;
        if (r11 != 0) {
            r11.a(status);
        }
        zzaeqVar.b(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void c(zzahz zzahzVar) {
        zzaeq zzaeqVar = this.f9885a;
        zzaeqVar.f9882q = zzahzVar;
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void d(String str) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 7);
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void e(zzagd zzagdVar) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 3);
        zzaeqVar.f9877k = zzagdVar;
        zzaeq.c(zzaeqVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.firebase.auth.internal.zzaw, java.lang.Object] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void f(zzaab zzaabVar) {
        Status status = zzaabVar.f9715a;
        zzc zzcVar = zzaabVar.f9716b;
        zzaeq zzaeqVar = this.f9885a;
        ?? r9 = zzaeqVar.f9872f;
        if (r9 != 0) {
            r9.a(status);
        }
        zzaeqVar.m = zzcVar;
        ?? r11 = zzaeqVar.f9872f;
        if (r11 != 0) {
            r11.a(status);
        }
        zzaeqVar.b(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void g(zzahe zzaheVar) {
        zzaeq zzaeqVar = this.f9885a;
        zzaeqVar.f9880o = zzaheVar;
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void h(zzahn zzahnVar) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 4);
        zzaeqVar.f9878l = zzahnVar;
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void i(zzaaa zzaaaVar) {
        zzaeq zzaeqVar = this.f9885a;
        zzaeqVar.f9879n = zzaaaVar;
        zzaeqVar.b(zzaq.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void j(PhoneAuthCredential phoneAuthCredential) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 8);
        zzaeqVar.f9883r = true;
        o(new zzaeu(this, phoneAuthCredential));
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void k(zzahd zzahdVar) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type: " + i11, i11 == 1);
        zzaeqVar.f9875i = zzahdVar;
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void l(zzagz zzagzVar) {
        zzaeq zzaeqVar = this.f9885a;
        zzaeqVar.f9881p = zzagzVar;
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void m(zzahd zzahdVar, zzagw zzagwVar) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type: " + i11, i11 == 2);
        zzaeqVar.f9875i = zzahdVar;
        zzaeqVar.f9876j = zzagwVar;
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void n(zzahs zzahsVar) {
        zzaeq.c(this.f9885a);
    }

    public final void o(zzaey zzaeyVar) {
        this.f9885a.getClass();
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zza(String str) {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 8);
        zzaeqVar.f9883r = true;
        o(new zzaet(this, str));
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zzb(String str) {
        int i11 = this.f9885a.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 8);
        o(new zzaer(this, str));
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zzc() {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 9);
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zzb() {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 6);
        zzaeq.c(zzaeqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zza() {
        zzaeq zzaeqVar = this.f9885a;
        int i11 = zzaeqVar.f9867a;
        Preconditions.i("Unexpected response type " + i11, i11 == 5);
        zzaeq.c(zzaeqVar);
    }
}
