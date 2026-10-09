package ed;

import java.util.List;
import zc.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25472b;

    public d(b bVar, b bVar2) {
        this.f25471a = bVar;
        this.f25472b = bVar2;
    }

    @Override // ed.f
    public final zc.d I() {
        return new m(this.f25471a.I(), this.f25472b.I());
    }

    @Override // ed.f
    public final List O() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // ed.f
    public final boolean R() {
        return this.f25471a.R() && this.f25472b.R();
    }
}
