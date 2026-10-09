package androidx.media3.exoplayer.source;

import b7.a;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource$IllegalClippingException extends IOException {
    public ClippingMediaSource$IllegalClippingException(int i11) {
        this(-9223372036854775807L, i11, -9223372036854775807L);
    }

    public ClippingMediaSource$IllegalClippingException(long j11, int i11, long j12) {
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i11 != 0) {
            if (i11 == 1) {
                str = "not seekable to start";
            } else if (i11 != 2) {
                str = "unknown";
            } else {
                a.j((j11 == -9223372036854775807L || j12 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j11 + ", End time: " + j12;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
        super(sb2.toString());
    }
}
