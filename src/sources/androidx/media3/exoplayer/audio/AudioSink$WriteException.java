package androidx.media3.exoplayer.audio;

import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f2129c;

    public AudioSink$WriteException(int i11, p pVar, boolean z11) {
        super(nv.p.j(i11, "AudioTrack write failed: "));
        this.f2128b = z11;
        this.f2127a = i11;
        this.f2129c = pVar;
    }
}
