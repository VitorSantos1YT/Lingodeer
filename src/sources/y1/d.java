package y1;

import java.util.List;
import l1.s;
import m1.k0;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k0, vy.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f56814b = new g0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f56815a;

    public d(s sVar) {
        this.f56815a = sVar;
    }

    @Override // m1.k0
    public final List d(Integer num) {
        return this.f56815a.J();
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final /* bridge */ vy.g get(vy.h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // vy.g
    public final vy.h getKey() {
        return f56814b;
    }

    @Override // vy.i
    public final /* bridge */ vy.i minusKey(vy.h hVar) {
        return ew.a.s(this, hVar);
    }

    @Override // vy.i
    public final /* bridge */ vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }
}
