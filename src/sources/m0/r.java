package m0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q[] f40624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.c f40625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f40626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40629g;

    public r(int i11, q[] qVarArr, ob.c cVar, List list, int i12) {
        this.f40623a = i11;
        this.f40624b = qVarArr;
        this.f40625c = cVar;
        this.f40626d = list;
        this.f40627e = i12;
        int iMax = 0;
        for (q qVar : qVarArr) {
            iMax = Math.max(iMax, qVar.f40616k);
        }
        this.f40628f = iMax;
        int i13 = iMax + this.f40627e;
        this.f40629g = i13 >= 0 ? i13 : 0;
    }

    public final q[] a(int i11, int i12, int i13) {
        q[] qVarArr = this.f40624b;
        int length = qVarArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            q qVar = qVarArr[i14];
            int i17 = i15 + 1;
            int i18 = (int) ((d) this.f40626d.get(i15)).f40543a;
            qVar.k(i11, ((int[]) this.f40625c.f44800c)[i16], i12, i13, this.f40623a, i16);
            i16 += i18;
            i14++;
            i15 = i17;
        }
        return qVarArr;
    }
}
