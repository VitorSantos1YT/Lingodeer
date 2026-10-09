package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzaq;
import com.google.firebase.auth.zzc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaen f9720a;

    public zzaad(zzaen zzaenVar) {
        this.f9720a = zzaenVar;
    }

    public static /* synthetic */ void a(zzaad zzaadVar, zzadx zzadxVar, zzafd zzafdVar, zzagw zzagwVar, zzahd zzahdVar, zzaht zzahtVar) {
        Preconditions.g(zzahdVar);
        Preconditions.g(zzagwVar);
        zzaadVar.f9720a.c(zzahtVar, new zzaai(zzaadVar, zzadxVar, zzafdVar, zzagwVar, zzahdVar, zzahtVar));
    }

    public static void b(zzaad zzaadVar, zzadx zzadxVar, zzafd zzafdVar, zzahd zzahdVar, zzaht zzahtVar) {
        Preconditions.g(zzahdVar);
        zzaadVar.f9720a.b(new zzagu(zzahdVar.f9959b), new zzaaj(zzaadVar, zzadxVar, zzafdVar, zzahdVar, zzahtVar));
    }

    public static void c(zzaad zzaadVar, zzail zzailVar, zzadx zzadxVar, zzafd zzafdVar) {
        if (!zzailVar.f10017a && TextUtils.isEmpty(zzailVar.N)) {
            zzaadVar.d(new zzahd(zzailVar.f10019c, zzailVar.f10018b, Long.valueOf(zzailVar.f10020d), "Bearer"), zzailVar.f10023t, zzailVar.f10022f, Boolean.valueOf(zzailVar.H), zzailVar.a(), zzadxVar, zzafdVar);
            return;
        }
        zzadxVar.f(new zzaab(zzailVar.f10017a ? new Status(17012, null, null, null) : zzaq.a(zzailVar.N), zzailVar.a(), zzailVar.f10021e, zzailVar.P));
    }

    public final void d(zzahd zzahdVar, String str, String str2, Boolean bool, zzc zzcVar, zzadx zzadxVar, zzafe zzafeVar) {
        Preconditions.g(zzafeVar);
        Preconditions.g(zzadxVar);
        this.f9720a.b(new zzagu(zzahdVar.f9959b), new zzaal(this, zzafeVar, str2, str, bool, zzcVar, zzadxVar, zzahdVar));
    }

    public final void e(String str, zzafd zzafdVar) {
        Preconditions.d(str);
        zzahd zzahdVarD1 = zzahd.D1(str);
        if (zzahdVarD1.zzg()) {
            zzafdVar.a(zzahdVarD1);
            return;
        }
        this.f9720a.a(new zzagr(zzahdVarD1.f9958a), new zzabw(this, zzafdVar));
    }
}
