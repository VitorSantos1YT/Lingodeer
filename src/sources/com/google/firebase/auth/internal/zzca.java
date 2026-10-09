package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.android.e;
import com.google.firebase.internal.InternalTokenResult;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzca extends FirebaseAuth {
    @Override // com.google.firebase.auth.FirebaseAuth, com.google.firebase.auth.internal.InternalAuthProvider
    public final void a(e eVar) {
        zzcg zzcgVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17881d;
        copyOnWriteArrayList.add(eVar);
        synchronized (this) {
            if (this.f17893q == null) {
                FirebaseApp firebaseApp = this.f17878a;
                Preconditions.g(firebaseApp);
                this.f17893q = new zzcg(firebaseApp);
            }
            zzcgVar = this.f17893q;
        }
        zzcgVar.a(copyOnWriteArrayList.size());
    }

    @Override // com.google.firebase.auth.FirebaseAuth, com.google.firebase.auth.internal.InternalAuthProvider
    public final Task b(boolean z11) {
        return Tasks.forException(zzadz.a(new Status(17495, null, null, null)));
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final FirebaseUser c() {
        throw new UnsupportedOperationException("Regionalized functionality not yet supported for this method.");
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final String d() {
        throw new UnsupportedOperationException("Regionalized functionality not yet supported for this method.");
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final void e(String str) {
        throw new UnsupportedOperationException("Setting tenantId dynamically is not supported when using regionalized FirebaseAuth. Instead, set tenantId directly in the constructor via TenantConfig.");
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final Task f(com.google.firebase.auth.zzc zzcVar) {
        throw new UnsupportedOperationException("Regionalized functionality not yet supported for this method.");
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final Task g(String str) {
        throw new UnsupportedOperationException("Regionalized functionality not yet supported for this method.");
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final void h() {
        zzcg zzcgVar;
        m();
        synchronized (this) {
            if (this.f17893q == null) {
                FirebaseApp firebaseApp = this.f17878a;
                Preconditions.g(firebaseApp);
                this.f17893q = new zzcg(firebaseApp);
            }
            zzcgVar = this.f17893q;
        }
        zzas zzasVar = zzcgVar.f18008b;
        zzasVar.f17961d.removeCallbacks(zzasVar.f17962e);
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final void k() {
        zzcc zzccVar = new zzcc();
        zzccVar.f18001a = this;
        this.f17896t.execute(zzccVar);
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final void l() {
        InternalTokenResult internalTokenResult = new InternalTokenResult(null);
        zzbz zzbzVar = new zzbz();
        zzbzVar.f17996a = this;
        zzbzVar.f17997b = internalTokenResult;
        this.f17896t.execute(zzbzVar);
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final void m() {
        Preconditions.g(this.f17890n);
        l();
        k();
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final void n() {
        if (this.f17890n == null) {
            return;
        }
        com.google.firebase.auth.zzad.d(this.f17878a).getClass();
        Preconditions.g(null);
        throw null;
    }

    @Override // com.google.firebase.auth.FirebaseAuth
    public final boolean o() {
        return false;
    }
}
