package androidx.media3.exoplayer.audio;

import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import w4.c;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2126b;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i11, int i12, int i13, int i14, int i15, p pVar, boolean z11, RuntimeException runtimeException) {
        StringBuilder sbK = c.k("AudioTrack init failed ", i11, " Config(", i12, ", ");
        a.v(i13, i14, ", ", ", ", sbK);
        sbK.append(i15);
        sbK.append(") ");
        sbK.append(pVar);
        sbK.append(z11 ? " (recoverable)" : BuildConfig.VERSION_NAME);
        super(sbK.toString(), runtimeException);
        this.f2125a = i11;
        this.f2126b = z11;
    }
}
