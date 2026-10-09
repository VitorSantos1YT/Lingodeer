package c7;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6649e;

    public d(int i11, long j11) {
        super(i11, 0);
        this.f6647c = j11;
        this.f6648d = new ArrayList();
        this.f6649e = new ArrayList();
    }

    public final d n(int i11) {
        ArrayList arrayList = this.f6649e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) arrayList.get(i12);
            if (dVar.f6652b == i11) {
                return dVar;
            }
        }
        return null;
    }

    public final e o(int i11) {
        ArrayList arrayList = this.f6648d;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar = (e) arrayList.get(i12);
            if (eVar.f6652b == i11) {
                return eVar;
            }
        }
        return null;
    }

    @Override // c7.f
    public final String toString() {
        return f.c(this.f6652b) + " leaves: " + Arrays.toString(this.f6648d.toArray()) + " containers: " + Arrays.toString(this.f6649e.toArray());
    }
}
