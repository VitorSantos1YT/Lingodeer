package n9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ry.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43684c;

    public r(ArrayList arrayList, int i11, int i12) {
        this.f43682a = i11;
        this.f43683b = i12;
        this.f43684c = arrayList;
    }

    @Override // ry.a
    public final int b() {
        return this.f43684c.size() + this.f43682a + this.f43683b;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        int i12 = this.f43682a;
        if (i11 >= 0 && i11 < i12) {
            return null;
        }
        ArrayList arrayList = this.f43684c;
        if (i11 < arrayList.size() + i12 && i12 <= i11) {
            return arrayList.get(i11 - i12);
        }
        int size = arrayList.size() + i12;
        if (i11 < b() && size <= i11) {
            return null;
        }
        StringBuilder sbI = w4.c.i(i11, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        sbI.append(b());
        throw new IndexOutOfBoundsException(sbI.toString());
    }
}
