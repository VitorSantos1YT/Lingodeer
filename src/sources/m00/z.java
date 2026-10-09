package m00;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends ry.e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l[] f40760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f40761b;

    public z(l[] lVarArr, int[] iArr) {
        this.f40760a = lVarArr;
        this.f40761b = iArr;
    }

    @Override // ry.a
    public final int b() {
        return this.f40760a.length;
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return super.contains((l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        return this.f40760a[i11];
    }

    @Override // ry.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return super.indexOf((l) obj);
        }
        return -1;
    }

    @Override // ry.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return super.lastIndexOf((l) obj);
        }
        return -1;
    }
}
