package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzh extends zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f10505a;

    public zzh(char c11) {
        this.f10505a = c11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean b(char c11) {
        return c11 == this.f10505a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c11 = this.f10505a;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
            c11 = (char) (c11 >> 4);
        }
        return a.g("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
