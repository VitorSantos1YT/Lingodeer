package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f9913a = new e(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f9914b = new e(0);

    public static String b(String str) {
        zzafw zzafwVar;
        e eVar = f9913a;
        synchronized (eVar) {
            zzafwVar = (zzafw) eVar.get(str);
        }
        if (zzafwVar == null) {
            return "https://www.googleapis.com/identitytoolkit/v3/relyingparty";
        }
        throw null;
    }

    public static void a(String str) {
        zzafw zzafwVar;
        e eVar = f9913a;
        synchronized (eVar) {
            zzafwVar = (zzafw) eVar.get(str);
        }
        if (zzafwVar != null) {
            throw null;
        }
        throw new IllegalStateException(scqhIrGXy.Hoxa);
    }
}
