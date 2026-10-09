package ra;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r4.f[] f49022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f49023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49024c;

    public m() {
        this.f49022a = null;
        this.f49024c = 0;
    }

    public r4.f[] getPathData() {
        return this.f49022a;
    }

    public String getPathName() {
        return this.f49023b;
    }

    public void setPathData(r4.f[] fVarArr) {
        r4.f[] fVarArr2 = this.f49022a;
        boolean z11 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i11 = 0;
            while (true) {
                if (i11 >= fVarArr2.length) {
                    z11 = true;
                    break;
                }
                r4.f fVar = fVarArr2[i11];
                char c11 = fVar.f48798a;
                r4.f fVar2 = fVarArr[i11];
                if (c11 != fVar2.f48798a || fVar.f48799b.length != fVar2.f48799b.length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (!z11) {
            this.f49022a = j3.p(fVarArr);
            return;
        }
        r4.f[] fVarArr3 = this.f49022a;
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            fVarArr3[i12].f48798a = fVarArr[i12].f48798a;
            int i13 = 0;
            while (true) {
                float[] fArr = fVarArr[i12].f48799b;
                if (i13 < fArr.length) {
                    fVarArr3[i12].f48799b[i13] = fArr[i13];
                    i13++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f49022a = null;
        this.f49024c = 0;
        this.f49023b = mVar.f49023b;
        this.f49022a = j3.p(mVar.f49022a);
    }
}
