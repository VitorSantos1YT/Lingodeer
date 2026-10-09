package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzafo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f9902c = new Logger("FirebaseAuth", "SmsRetrieverHelper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f9903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9904b = new HashMap();

    public zzafo(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f9903a = scheduledExecutorService;
    }

    public static void b(zzafo zzafoVar, String str) {
        zzafr zzafrVar = (zzafr) zzafoVar.f9904b.get(str);
        if (zzafrVar != null) {
            ArrayList arrayList = zzafrVar.f9907a;
            if (zzp.a(zzafrVar.f9908b) || zzp.a(zzafrVar.f9909c) || arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((zzadx) obj).j(new PhoneAuthCredential(zzafrVar.f9908b, zzafrVar.f9909c, null, null, true));
            }
            zzafrVar.f9911e = true;
        }
    }

    public final void a(zzadx zzadxVar, String str) {
        zzafr zzafrVar = (zzafr) this.f9904b.get(str);
        if (zzafrVar == null) {
            return;
        }
        zzafrVar.f9907a.add(zzadxVar);
        if (zzafrVar.f9910d) {
            zzadxVar.zzb(zzafrVar.f9908b);
        }
        if (zzafrVar.f9911e) {
            zzadxVar.j(new PhoneAuthCredential(zzafrVar.f9908b, zzafrVar.f9909c, null, null, true));
        }
        if (zzafrVar.f9912f) {
            zzadxVar.zza(zzafrVar.f9908b);
        }
    }

    public final void c(String str) {
        HashMap map = this.f9904b;
        zzafr zzafrVar = (zzafr) map.get(str);
        if (zzafrVar == null) {
            return;
        }
        zzafrVar.f9907a.clear();
        map.remove(str);
    }
}
