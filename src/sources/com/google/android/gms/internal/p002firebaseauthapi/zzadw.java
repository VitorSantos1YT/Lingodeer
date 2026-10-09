package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.EmailAuthCredential;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f9835c = new Logger("FirebaseAuth", "FirebaseAuthFallback:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaad f9836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzafo f9837b;

    public zzadw(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.g(firebaseApp);
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        Preconditions.g(context);
        this.f9836a = new zzaad(new zzaen(firebaseApp, zzaek.a()));
        this.f9837b = new zzafo(context, scheduledExecutorService);
    }

    public final void a(zzagf zzagfVar, zzadu zzaduVar) {
        Preconditions.g(zzaduVar);
        Preconditions.g(zzagfVar.f9923c);
        EmailAuthCredential emailAuthCredential = zzagfVar.f9923c;
        String str = zzagfVar.f9925e;
        zzadx zzadxVar = new zzadx(zzaduVar, f9835c);
        zzaad zzaadVar = this.f9836a;
        zzaadVar.getClass();
        Preconditions.g(emailAuthCredential);
        if (emailAuthCredential.f17876e) {
            zzaadVar.e(emailAuthCredential.f17875d, new zzaah(zzaadVar, emailAuthCredential, str, zzadxVar));
            return;
        }
        zzagf zzagfVar2 = new zzagf(emailAuthCredential, null, str);
        zzaen zzaenVar = zzaadVar.f9720a;
        zzaag zzaagVar = new zzaag(zzaadVar, zzadxVar);
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.a(zzaehVar.a("/emailLinkSignin", zzaenVar.f9865f), zzagfVar2, zzaagVar, new zzagi(), zzaehVar.f9852b);
    }

    public final void b(zzaij zzaijVar, zzadu zzaduVar) {
        Preconditions.g(zzaijVar);
        Preconditions.g(zzaduVar);
        zzadx zzadxVar = new zzadx(zzaduVar, f9835c);
        zzaad zzaadVar = this.f9836a;
        zzaadVar.getClass();
        zzaijVar.Q = true;
        zzaadVar.f9720a.e(zzaijVar, new zzabc(zzaadVar, zzadxVar));
    }

    public final void c(zzzz zzzzVar, zzadu zzaduVar) {
        Preconditions.g(zzaduVar);
        Preconditions.g(zzzzVar);
        zzais zzaisVarA = zzafi.a(zzzzVar.f11064a);
        zzadx zzadxVar = new zzadx(zzaduVar, f9835c);
        zzaad zzaadVar = this.f9836a;
        zzaadVar.getClass();
        zzaadVar.f9720a.f(zzaisVarA, new zzaaq(zzaadVar, zzadxVar));
    }

    public final void d(String str, String str2, String str3, String str4, zzadu zzaduVar) {
        Preconditions.d(str);
        Preconditions.d(str2);
        Preconditions.g(zzaduVar);
        zzadx zzadxVar = new zzadx(zzaduVar, f9835c);
        zzaad zzaadVar = this.f9836a;
        zzaadVar.getClass();
        Preconditions.d(str);
        Preconditions.d(str2);
        zzaiq zzaiqVar = new zzaiq(str, str2, str3, str4);
        zzaen zzaenVar = zzaadVar.f9720a;
        zzaae zzaaeVar = new zzaae(zzaadVar, zzadxVar);
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.a(zzaehVar.a("/verifyPassword", zzaenVar.f9865f), zzaiqVar, zzaaeVar, new zzaip(), zzaehVar.f9852b);
    }

    public final void e(zzadu zzaduVar) {
        Preconditions.d(null);
        Preconditions.g(zzaduVar);
        zzadx zzadxVar = new zzadx(zzaduVar, f9835c);
        zzaad zzaadVar = this.f9836a;
        zzaadVar.getClass();
        Preconditions.d(null);
        zzaho zzahoVar = new zzaho();
        Preconditions.d(null);
        zzaen zzaenVar = zzaadVar.f9720a;
        zzaam zzaamVar = new zzaam(zzaadVar, zzadxVar);
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.a(zzaehVar.a("/resetPassword", zzaenVar.f9865f), zzahoVar, zzaamVar, new zzahn(), zzaehVar.f9852b);
    }
}
