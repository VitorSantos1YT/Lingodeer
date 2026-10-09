package h7;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f31890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.a f31892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f31896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f31897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f31898i;

    public l(AudioTrack audioTrack, dm.a aVar) {
        this.f31890a = new k(audioTrack);
        this.f31891b = audioTrack.getSampleRate();
        this.f31892c = aVar;
        a(0);
    }

    public final void a(int i11) {
        this.f31893d = i11;
        if (i11 == 0) {
            this.f31896g = 0L;
            this.f31897h = -1L;
            this.f31898i = -9223372036854775807L;
            this.f31894e = System.nanoTime() / 1000;
            this.f31895f = 10000L;
            return;
        }
        if (i11 == 1) {
            this.f31895f = 10000L;
            return;
        }
        if (i11 == 2 || i11 == 3) {
            this.f31895f = 10000000L;
        } else {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            this.f31895f = 500000L;
        }
    }
}
