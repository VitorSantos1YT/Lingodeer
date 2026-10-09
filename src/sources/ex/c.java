package ex;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends AtomicInteger implements uw.g, g, n20.c {
    private static final long serialVersionUID = -3511336836796789179L;
    public volatile boolean H;
    public volatile boolean K;
    public volatile boolean M;
    public int N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw.c f25970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n20.c f25973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25974f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public bx.g f25975t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f25969a = new f(this);
    public final nx.b L = new nx.b();

    public c(yw.c cVar, int i11) {
        this.f25970b = cVar;
        this.f25971c = i11;
        this.f25972d = i11;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f25973e, cVar)) {
            this.f25973e = cVar;
            if (cVar instanceof bx.d) {
                bx.d dVar = (bx.d) cVar;
                int iA = dVar.a(7);
                if (iA == 1) {
                    this.N = iA;
                    this.f25975t = dVar;
                    this.H = true;
                    f();
                    e();
                    return;
                }
                if (iA == 2) {
                    this.N = iA;
                    this.f25975t = dVar;
                    f();
                    cVar.request(this.f25971c);
                    return;
                }
            }
            this.f25975t = new jx.a(this.f25971c);
            f();
            cVar.request(this.f25971c);
        }
    }

    public abstract void e();

    public abstract void f();

    @Override // n20.b
    public final void onComplete() {
        this.H = true;
        e();
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.N == 2 || this.f25975t.offer(obj)) {
            e();
        } else {
            this.f25973e.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }
}
