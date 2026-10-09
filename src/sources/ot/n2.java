package ot;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n2 implements fv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f45917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f45918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz.t f45920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f45921e;

    public n2(Set set, AtomicInteger atomicInteger, int i11, tz.t tVar, long j11) {
        this.f45917a = set;
        this.f45918b = atomicInteger;
        this.f45919c = i11;
        this.f45920d = tVar;
        this.f45921e = j11;
    }

    @Override // fv.d
    public final void a(uv.b bVar) {
        mr.a.e(this.f45917a, this.f45918b, this.f45919c, this.f45920d, this.f45921e, bVar);
    }

    @Override // fv.d
    public final void c(uv.b bVar) {
        mr.a.e(this.f45917a, this.f45918b, this.f45919c, this.f45920d, this.f45921e, bVar);
    }

    @Override // fv.d
    public final void f(uv.b bVar, Throwable th2) {
        ((tz.s) this.f45920d).a0(th2);
    }

    @Override // fv.d
    public final void b(uv.b bVar) {
    }

    @Override // fv.d
    public final void d(uv.b bVar) {
    }

    @Override // fv.d
    public final void e(uv.b bVar, int i11, int i12) {
    }
}
