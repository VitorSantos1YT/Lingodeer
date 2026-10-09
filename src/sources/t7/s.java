package t7;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bq.h f52109g = new bq.h(25);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bq.h f52110h = new bq.h(26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52116f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r[] f52112b = new r[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f52111a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52113c = -1;

    public final void a(int i11, float f5) {
        r rVar;
        int i12 = this.f52113c;
        ArrayList arrayList = this.f52111a;
        if (i12 != 1) {
            Collections.sort(arrayList, f52109g);
            this.f52113c = 1;
        }
        int i13 = this.f52116f;
        r[] rVarArr = this.f52112b;
        if (i13 > 0) {
            int i14 = i13 - 1;
            this.f52116f = i14;
            rVar = rVarArr[i14];
        } else {
            rVar = new r();
        }
        int i15 = this.f52114d;
        this.f52114d = i15 + 1;
        rVar.f52106a = i15;
        rVar.f52107b = i11;
        rVar.f52108c = f5;
        arrayList.add(rVar);
        this.f52115e += i11;
        while (true) {
            int i16 = this.f52115e;
            if (i16 <= 2000) {
                return;
            }
            int i17 = i16 - 2000;
            r rVar2 = (r) arrayList.get(0);
            int i18 = rVar2.f52107b;
            if (i18 <= i17) {
                this.f52115e -= i18;
                arrayList.remove(0);
                int i19 = this.f52116f;
                if (i19 < 5) {
                    this.f52116f = i19 + 1;
                    rVarArr[i19] = rVar2;
                }
            } else {
                rVar2.f52107b = i18 - i17;
                this.f52115e -= i17;
            }
        }
    }

    public final float b() {
        int i11 = this.f52113c;
        ArrayList arrayList = this.f52111a;
        if (i11 != 0) {
            Collections.sort(arrayList, f52110h);
            this.f52113c = 0;
        }
        float f5 = 0.5f * this.f52115e;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            r rVar = (r) arrayList.get(i13);
            i12 += rVar.f52107b;
            if (i12 >= f5) {
                return rVar.f52108c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) nv.p.f(1, arrayList)).f52108c;
    }
}
