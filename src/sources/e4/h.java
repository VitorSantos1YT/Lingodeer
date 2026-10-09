package e4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class h extends g {
    public int m;

    public h(t tVar) {
        super(tVar);
        if (tVar instanceof m) {
            this.f24803e = f.HORIZONTAL_DIMENSION;
        } else {
            this.f24803e = f.VERTICAL_DIMENSION;
        }
    }

    @Override // e4.g
    public final void d(int i11) {
        if (this.f24808j) {
            return;
        }
        this.f24808j = true;
        this.f24805g = i11;
        ArrayList arrayList = this.f24809k;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
