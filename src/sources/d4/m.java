package d4;

import e4.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class m extends g {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public g[] f23195u0 = new g[4];

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f23196v0 = 0;

    public final void S(g gVar) {
        if (gVar == this || gVar == null) {
            return;
        }
        int i11 = this.f23196v0 + 1;
        g[] gVarArr = this.f23195u0;
        if (i11 > gVarArr.length) {
            this.f23195u0 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
        }
        g[] gVarArr2 = this.f23195u0;
        int i12 = this.f23196v0;
        gVarArr2[i12] = gVar;
        this.f23196v0 = i12 + 1;
    }

    public final void T(int i11, q qVar, ArrayList arrayList) {
        for (int i12 = 0; i12 < this.f23196v0; i12++) {
            g gVar = this.f23195u0[i12];
            ArrayList arrayList2 = qVar.f24820a;
            if (!arrayList2.contains(gVar)) {
                arrayList2.add(gVar);
            }
        }
        for (int i13 = 0; i13 < this.f23196v0; i13++) {
            e4.i.b(this.f23195u0[i13], i11, arrayList, qVar);
        }
    }

    @Override // d4.g
    public void g(g gVar, HashMap map) {
        super.g(gVar, map);
        m mVar = (m) gVar;
        this.f23196v0 = 0;
        int i11 = mVar.f23196v0;
        for (int i12 = 0; i12 < i11; i12++) {
            S((g) map.get(mVar.f23195u0[i12]));
        }
    }

    public void U() {
    }
}
