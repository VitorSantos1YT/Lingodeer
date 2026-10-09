package androidx.media3.exoplayer.mediacodec;

import com.tbruyelle.rxpermissions3.BuildConfig;
import m7.n;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f2142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2143d;

    public MediaCodecRenderer$DecoderInitializationException(p pVar, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z11, int i11) {
        this("Decoder init failed: [" + i11 + "], " + pVar, mediaCodecUtil$DecoderQueryException, pVar.f57291n, z11, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i11 < 0 ? "neg_" : BuildConfig.VERSION_NAME) + Math.abs(i11));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th2, String str2, boolean z11, n nVar, String str3) {
        super(str, th2);
        this.f2140a = str2;
        this.f2141b = z11;
        this.f2142c = nVar;
        this.f2143d = str3;
    }
}
