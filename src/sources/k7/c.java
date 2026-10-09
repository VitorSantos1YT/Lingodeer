package k7;

import b7.f0;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p7.b0;
import p7.d0;
import p7.e0;
import p7.g0;
import p7.s;
import p7.x;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f37957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f37958c;

    public /* synthetic */ c(CopyOnWriteArrayList copyOnWriteArrayList, int i11, b0 b0Var) {
        this.f37958c = copyOnWriteArrayList;
        this.f37956a = i11;
        this.f37957b = b0Var;
    }

    public void a(b7.g gVar) {
        for (g0 g0Var : this.f37958c) {
            f0.O(g0Var.f46385a, new b2.c(28, gVar, g0Var.f46386b));
        }
    }

    public void b(int i11, p pVar, int i12, Object obj, long j11) {
        a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(15, this, new x(1, i11, pVar, i12, obj, f0.V(j11), -9223372036854775807L)));
    }

    public void c(s sVar, int i11, int i12, p pVar, int i13, Object obj, long j11, long j12) {
        a(new e0(this, sVar, new x(i11, i12, pVar, i13, obj, f0.V(j11), f0.V(j12)), 1));
    }

    public void d(s sVar, int i11, int i12, p pVar, int i13, Object obj, long j11, long j12) {
        a(new e0(this, sVar, new x(i11, i12, pVar, i13, obj, f0.V(j11), f0.V(j12)), 0));
    }

    public void e(s sVar, int i11, int i12, p pVar, int i13, Object obj, long j11, long j12, IOException iOException, boolean z11) {
        a(new p7.f0(this, sVar, new x(i11, i12, pVar, i13, obj, f0.V(j11), f0.V(j12)), iOException, z11));
    }

    public void f(s sVar, int i11, int i12, p pVar, int i13, Object obj, long j11, long j12, int i14) {
        a(new d0(this, sVar, new x(i11, i12, pVar, i13, obj, f0.V(j11), f0.V(j12)), i14));
    }
}
