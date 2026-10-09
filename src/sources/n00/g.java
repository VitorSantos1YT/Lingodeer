package n00;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import m00.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f43073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f43080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f43081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f43082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f43083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f43084l;
    public final Long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f43085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f43086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f43087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f43088q;

    public g(a0 canonicalPath, boolean z11, String comment, long j11, long j12, long j13, int i11, long j14, int i12, int i13, Long l9, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        m.f(canonicalPath, "canonicalPath");
        m.f(comment, "comment");
        this.f43073a = canonicalPath;
        this.f43074b = z11;
        this.f43075c = comment;
        this.f43076d = j11;
        this.f43077e = j12;
        this.f43078f = j13;
        this.f43079g = i11;
        this.f43080h = j14;
        this.f43081i = i12;
        this.f43082j = i13;
        this.f43083k = l9;
        this.f43084l = l11;
        this.m = l12;
        this.f43085n = num;
        this.f43086o = num2;
        this.f43087p = num3;
        this.f43088q = new ArrayList();
    }

    public /* synthetic */ g(a0 a0Var, boolean z11, String str, long j11, long j12, long j13, int i11, long j14, int i12, int i13, Long l9, Long l11, Long l12, int i14) {
        this(a0Var, z11, (i14 & 4) != 0 ? BuildConfig.VERSION_NAME : str, (i14 & 8) != 0 ? -1L : j11, (i14 & 16) != 0 ? -1L : j12, (i14 & 32) != 0 ? -1L : j13, (i14 & 64) != 0 ? -1 : i11, (i14 & 128) != 0 ? -1L : j14, (i14 & 256) != 0 ? -1 : i12, (i14 & 512) != 0 ? -1 : i13, (i14 & 1024) != 0 ? null : l9, (i14 & 2048) != 0 ? null : l11, (i14 & 4096) != 0 ? null : l12, null, null, null);
    }
}
