package p7;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends y6.o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f46350g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y6.x f46354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y6.t f46355f;

    static {
        kw.b bVar = new kw.b();
        ImmutableMap.k();
        ImmutableList.s();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListS = ImmutableList.s();
        j7.t tVar = new j7.t();
        y6.v vVar = y6.v.f57368a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new y6.u(uri, null, null, list, immutableListS, -9223372036854775807L);
        }
        bVar.a();
        tVar.a();
        y6.a0 a0Var = y6.a0.B;
    }

    public d1(long j11, boolean z11, boolean z12, y6.x xVar) {
        y6.t tVar = z12 ? xVar.f57374c : null;
        this.f46351b = j11;
        this.f46352c = j11;
        this.f46353d = z11;
        xVar.getClass();
        this.f46354e = xVar;
        this.f46355f = tVar;
    }

    @Override // y6.o0
    public final int b(Object obj) {
        return f46350g.equals(obj) ? 0 : -1;
    }

    @Override // y6.o0
    public final y6.m0 f(int i11, y6.m0 m0Var, boolean z11) {
        b7.a.g(i11, 1);
        Object obj = z11 ? f46350g : null;
        m0Var.getClass();
        m0Var.h(null, obj, 0, this.f46351b, 0L, y6.b.f57174c, false);
        return m0Var;
    }

    @Override // y6.o0
    public final int h() {
        return 1;
    }

    @Override // y6.o0
    public final Object l(int i11) {
        b7.a.g(i11, 1);
        return f46350g;
    }

    @Override // y6.o0
    public final y6.n0 m(int i11, y6.n0 n0Var, long j11) {
        b7.a.g(i11, 1);
        Object obj = y6.n0.f57236q;
        n0Var.b(this.f46354e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f46353d, false, this.f46355f, 0L, this.f46352c, 0, 0L);
        return n0Var;
    }

    @Override // y6.o0
    public final int o() {
        return 1;
    }
}
