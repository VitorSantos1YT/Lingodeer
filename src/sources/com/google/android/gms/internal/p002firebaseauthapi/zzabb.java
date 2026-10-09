package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzaq;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabb implements zzafd<zzagt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzafd f9783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzahd f9784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzadx f9785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzaay f9786d;

    public zzabb(zzaay zzaayVar, zzafd zzafdVar, zzahd zzahdVar, zzadx zzadxVar) {
        this.f9783a = zzafdVar;
        this.f9784b = zzahdVar;
        this.f9785c = zzadxVar;
        this.f9786d = zzaayVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        List list = ((zzagt) zzaelVar).f9939a.f9941a;
        zzafd zzafdVar = this.f9783a;
        if (list == null || list.isEmpty()) {
            ((zzaay) zzafdVar).zza("No users.");
            return;
        }
        zzagw zzagwVar = (zzagw) list.get(0);
        zzaht zzahtVar = new zzaht();
        String str = this.f9784b.f9959b;
        Preconditions.d(str);
        zzahtVar.f9986a = str;
        Preconditions.d(null);
        zzahtVar.f9988c.f10009a.add(null);
        zzaad.a(this.f9786d.f9776b, this.f9785c, zzafdVar, zzagwVar, this.f9784b, zzahtVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9785c.a(zzaq.a(str));
    }
}
