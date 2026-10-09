package q1;

import l2.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f47391d;

    public o(f0 f0Var) {
        this.f47391d = f0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f47389c;
        this.f47389c = i11 + 2;
        Object[] objArr = this.f47387a;
        return new b(this.f47391d, objArr[i11], objArr[i11 + 1]);
    }
}
