package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzj extends zzk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzf f10567b = new zzj();

    private zzj() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final int a(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            throw new IndexOutOfBoundsException(zzu.c(i11, length, "index"));
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean b(char c11) {
        return false;
    }
}
