package j7;

import android.net.Uri;
import b7.f0;
import java.util.ArrayList;
import java.util.List;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f36104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f36105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f36106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f36107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f36108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f36109l;
    public final List m;

    public c(long j11, long j12, long j13, boolean z11, long j14, long j15, long j16, long j17, i iVar, u uVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f36098a = j11;
        this.f36099b = j12;
        this.f36100c = j13;
        this.f36101d = z11;
        this.f36102e = j14;
        this.f36103f = j15;
        this.f36104g = j16;
        this.f36105h = j17;
        this.f36109l = iVar;
        this.f36106i = uVar;
        this.f36108k = uri;
        this.f36107j = tVar;
        this.m = arrayList;
    }

    public final h a(int i11) {
        return (h) this.m.get(i11);
    }

    public final long b(int i11) {
        long j11;
        long j12;
        List list = this.m;
        if (i11 == list.size() - 1) {
            j11 = this.f36099b;
            if (j11 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j12 = ((h) list.get(i11)).f36132b;
        } else {
            j11 = ((h) list.get(i11 + 1)).f36132b;
            j12 = ((h) list.get(i11)).f36132b;
        }
        return j11 - j12;
    }

    public final long c(int i11) {
        return f0.K(b(i11));
    }
}
