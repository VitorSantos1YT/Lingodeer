package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzadx implements zzadu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzadu f9838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f9839b;

    public zzadx(zzadu zzaduVar, Logger logger) {
        Preconditions.g(zzaduVar);
        this.f9838a = zzaduVar;
        Preconditions.g(logger);
        this.f9839b = logger;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public void a(Status status) {
        try {
            this.f9838a.a(status);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending failure result.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void b(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.f9838a.b(status, phoneAuthCredential);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending failure result.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void c(zzahz zzahzVar) {
        try {
            this.f9838a.c(zzahzVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending start mfa enrollment response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void d(String str) {
        try {
            this.f9838a.d(str);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending set account info response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void e(zzagd zzagdVar) {
        try {
            this.f9838a.e(zzagdVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending create auth uri response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void f(zzaab zzaabVar) {
        try {
            this.f9838a.f(zzaabVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending failure result with credential", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void g(zzahe zzaheVar) {
        try {
            this.f9838a.g(zzaheVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending get recaptcha config response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void h(zzahn zzahnVar) {
        try {
            this.f9838a.h(zzahnVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending password reset response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void i(zzaaa zzaaaVar) {
        try {
            this.f9838a.i(zzaaaVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending failure result for mfa", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void j(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.f9838a.j(phoneAuthCredential);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending verification completed response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void k(zzahd zzahdVar) {
        try {
            this.f9838a.k(zzahdVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending token result.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void l(zzagz zzagzVar) {
        try {
            this.f9838a.l(zzagzVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending Play Integrity Producer project response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void m(zzahd zzahdVar, zzagw zzagwVar) {
        try {
            this.f9838a.m(zzahdVar, zzagwVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending get token and account info user response", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void n(zzahs zzahsVar) {
        try {
            this.f9838a.n(zzahsVar);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending revoke token response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zza(String str) {
        try {
            this.f9838a.zza(str);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending auto retrieval timeout response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public void zzb(String str) {
        try {
            this.f9838a.zzb(str);
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending send verification code response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zzc() {
        try {
            this.f9838a.zzc();
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when setting FirebaseUI Version", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zza() {
        try {
            this.f9838a.zza();
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending delete account response.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zzb() {
        try {
            this.f9838a.zzb();
        } catch (RemoteException unused) {
            this.f9839b.b("RemoteException when sending email verification response.", new Object[0]);
        }
    }
}
