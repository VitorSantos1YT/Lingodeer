package androidx.media3.common;

import b7.f0;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2113b;

    static {
        c.s(0, 1, 2, 3, 4);
        f0.G(5);
    }

    public PlaybackException(String str, Throwable th2, int i11, long j11) {
        super(str, th2);
        this.f2112a = i11;
        this.f2113b = j11;
    }
}
