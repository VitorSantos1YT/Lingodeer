package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Locale;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzakd extends IOException {
    public zzakd() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzakd(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzakd(int i11, int i12, int i13, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbJ = c.j(i11, "Pos: ", ", limit: ");
        sbJ.append(i12);
        sbJ.append(", len: ");
        sbJ.append(i13);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbJ.toString()), indexOutOfBoundsException);
    }
}
