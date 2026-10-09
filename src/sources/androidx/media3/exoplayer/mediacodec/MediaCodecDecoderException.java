package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import m7.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2139a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, n nVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(nVar == null ? null : nVar.f40984a);
        super(sb2.toString(), illegalStateException);
        boolean z11 = illegalStateException instanceof MediaCodec.CodecException;
        if (z11) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f2139a = z11 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
