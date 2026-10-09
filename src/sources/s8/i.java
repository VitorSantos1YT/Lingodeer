package s8;

import b7.w;
import x7.e0;
import x7.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f51503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f51504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f51505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f51506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f51507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f51508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51510i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f51512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f51513l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f51502a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qp.b f51511j = new qp.b(3);

    public void a(long j11) {
        this.f51508g = j11;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j11, qp.b bVar);

    public void d(boolean z11) {
        if (z11) {
            this.f51511j = new qp.b(3);
            this.f51507f = 0L;
            this.f51509h = 0;
        } else {
            this.f51509h = 1;
        }
        this.f51506e = -1L;
        this.f51508g = 0L;
    }
}
