package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzf {
    public int a(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            throw new IndexOutOfBoundsException(zzu.c(i11, length, "index"));
        }
        while (i11 < length) {
            if (b(charSequence.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public abstract boolean b(char c11);
}
