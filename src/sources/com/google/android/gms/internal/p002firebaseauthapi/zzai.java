package com.google.android.gms.internal.p002firebaseauthapi;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzai<E> {
    public static int a(int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(MzwEyWCkjXL.FExLSaUPBxaINK);
        }
        if (i12 <= i11) {
            return i11;
        }
        int iHighestOneBit = i11 + (i11 >> 1) + 1;
        if (iHighestOneBit < i12) {
            iHighestOneBit = Integer.highestOneBit(i12 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }
}
