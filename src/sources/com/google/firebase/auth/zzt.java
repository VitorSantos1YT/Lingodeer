package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzt implements com.google.firebase.auth.internal.zzat {
    @Override // com.google.firebase.auth.internal.zzaw
    public final void a(Status status) {
        int i11 = status.f8706a;
        if (i11 == 17011 || i11 == 17021 || i11 == 17005) {
            throw null;
        }
    }

    @Override // com.google.firebase.auth.internal.zzat
    public final void zza() {
        throw null;
    }
}
