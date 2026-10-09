package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzar f17963a;

    public zzau(zzar zzarVar) {
        this.f17963a = zzarVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        long j11;
        if (exc instanceof FirebaseNetworkException) {
            Logger logger = zzas.f17957f;
            logger.c("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            zzas zzasVar = this.f17963a.f17956b;
            int i11 = (int) zzasVar.f17960c;
            if (i11 == 30 || i11 == 60 || i11 == 120 || i11 == 240 || i11 == 480) {
                j11 = 2 * zzasVar.f17960c;
            } else {
                j11 = i11 != 960 ? 30L : 960L;
            }
            zzasVar.f17960c = j11;
            DefaultClock.f9117a.getClass();
            zzasVar.f17959b = (zzasVar.f17960c * 1000) + System.currentTimeMillis();
            logger.c(e.h(zzasVar.f17959b, "Scheduling refresh for "), new Object[0]);
            zzasVar.f17961d.postDelayed(zzasVar.f17962e, zzasVar.f17960c * 1000);
        }
    }
}
