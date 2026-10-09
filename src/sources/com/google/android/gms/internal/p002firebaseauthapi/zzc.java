package com.google.android.gms.internal.p002firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzc extends zza {
    public /* synthetic */ zzc(int i11) {
        this();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zza
    public final URLConnection a(URL url) {
        return url.openConnection();
    }

    private zzc() {
    }
}
