package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzacy extends IOException {
    public zzacy() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzacy(long j11, long j12, int i11, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbJ = c.j(j11, "Pos: ", ", limit: ");
        sbJ.append(j12);
        sbJ.append(", len: ");
        sbJ.append(i11);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbJ.toString()), indexOutOfBoundsException);
    }

    public zzacy(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
