package uz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends vz.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f53269f = AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tz.v f53270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f53271e;

    public /* synthetic */ d(tz.v vVar, boolean z11) {
        this(vVar, z11, vy.j.f54321a, -3, tz.a.SUSPEND);
    }

    @Override // vz.d, uz.i
    public final Object collect(j jVar, vy.d dVar) throws Throwable {
        if (this.f54333b == -3) {
            boolean z11 = this.f53271e;
            if (z11 && f53269f.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objR = x0.r(jVar, this.f53270d, z11, dVar);
            if (objR == wy.a.COROUTINE_SUSPENDED) {
                return objR;
            }
        } else {
            Object objCollect = super.collect(jVar, dVar);
            if (objCollect == wy.a.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return qy.b0.f48488a;
    }

    @Override // vz.d
    public final String e() {
        return "channel=" + this.f53270d;
    }

    @Override // vz.d
    public final Object f(tz.t tVar, vy.d dVar) throws Throwable {
        Object objR = x0.r(new vz.r(tVar), this.f53270d, this.f53271e, dVar);
        return objR == wy.a.COROUTINE_SUSPENDED ? objR : qy.b0.f48488a;
    }

    @Override // vz.d
    public final vz.d g(vy.i iVar, int i11, tz.a aVar) {
        return new d(this.f53270d, this.f53271e, iVar, i11, aVar);
    }

    @Override // vz.d
    public final i h() {
        return new d(this.f53270d, this.f53271e);
    }

    @Override // vz.d
    public final tz.v i(rz.b0 b0Var) {
        if (this.f53271e && f53269f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f54333b == -3 ? this.f53270d : super.i(b0Var);
    }

    public d(tz.v vVar, boolean z11, vy.i iVar, int i11, tz.a aVar) {
        super(iVar, i11, aVar);
        this.f53270d = vVar;
        this.f53271e = z11;
    }
}
