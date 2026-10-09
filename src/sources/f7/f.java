package f7;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f26725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26726l;

    public final String toString() {
        int i11 = this.f26715a;
        int i12 = this.f26716b;
        int i13 = this.f26717c;
        int i14 = this.f26718d;
        int i15 = this.f26719e;
        int i16 = this.f26720f;
        int i17 = this.f26721g;
        int i18 = this.f26722h;
        int i19 = this.f26723i;
        int i21 = this.f26724j;
        long j11 = this.f26725k;
        int i22 = this.f26726l;
        String str = b7.f0.f3975a;
        Locale locale = Locale.US;
        StringBuilder sbK = w4.c.k("DecoderCounters {\n decoderInits=", i11, ",\n decoderReleases=", i12, "\n queuedInputBuffers=");
        ep.a.v(i13, i14, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbK);
        ep.a.v(i15, i16, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbK);
        ep.a.v(i17, i18, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbK);
        ep.a.v(i19, i21, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbK);
        sbK.append(j11);
        sbK.append("\n videoFrameProcessingOffsetCount=");
        sbK.append(i22);
        sbK.append("\n}");
        return sbK.toString();
    }
}
