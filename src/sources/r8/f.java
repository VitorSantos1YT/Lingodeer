package r8;

import b7.f0;
import b7.w;
import x7.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f48863a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f48866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f48867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y6.p f48872j;
    public boolean m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f48864b = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f48865c = new w();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f48873k = new w(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f48874l = new w();

    public f(e0 e0Var, q qVar, d dVar, y6.p pVar) {
        this.f48863a = e0Var;
        this.f48866d = qVar;
        this.f48867e = dVar;
        this.f48872j = pVar;
        this.f48866d = qVar;
        this.f48867e = dVar;
        e0Var.b(pVar);
        e();
    }

    public final int a() {
        int i11;
        if (this.m) {
            i11 = this.f48864b.f48967j[this.f48868f] ? 1 : 0;
        } else {
            i11 = this.f48866d.f48980g[this.f48868f];
        }
        return b() != null ? i11 | 1073741824 : i11;
    }

    public final o b() {
        if (!this.m) {
            return null;
        }
        p pVar = this.f48864b;
        d dVar = pVar.f48958a;
        String str = f0.f3975a;
        int i11 = dVar.f48856a;
        o oVar = pVar.m;
        if (oVar == null) {
            oVar = this.f48866d.f48974a.f48952l[i11];
        }
        if (oVar == null || !oVar.f48953a) {
            return null;
        }
        return oVar;
    }

    public final boolean c() {
        this.f48868f++;
        if (!this.m) {
            return false;
        }
        int i11 = this.f48869g + 1;
        this.f48869g = i11;
        int[] iArr = this.f48864b.f48964g;
        int i12 = this.f48870h;
        if (i11 != iArr[i12]) {
            return true;
        }
        this.f48870h = i12 + 1;
        this.f48869g = 0;
        return false;
    }

    public final int d(int i11, int i12) {
        w wVar;
        o oVarB = b();
        if (oVarB == null) {
            return 0;
        }
        int length = oVarB.f48956d;
        p pVar = this.f48864b;
        if (length != 0) {
            wVar = pVar.f48970n;
        } else {
            byte[] bArr = oVarB.f48957e;
            String str = f0.f3975a;
            int length2 = bArr.length;
            w wVar2 = this.f48874l;
            wVar2.G(bArr, length2);
            length = bArr.length;
            wVar = wVar2;
        }
        boolean z11 = pVar.f48968k && pVar.f48969l[this.f48868f];
        boolean z12 = z11 || i12 != 0;
        w wVar3 = this.f48873k;
        wVar3.f4039a[0] = (byte) ((z12 ? 128 : 0) | length);
        wVar3.I(0);
        e0 e0Var = this.f48863a;
        e0Var.a(wVar3, 1, 1);
        e0Var.a(wVar, length, 1);
        if (!z12) {
            return length + 1;
        }
        w wVar4 = this.f48865c;
        if (!z11) {
            wVar4.F(8);
            byte[] bArr2 = wVar4.f4039a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i12 & 255);
            bArr2[4] = (byte) ((i11 >> 24) & 255);
            bArr2[5] = (byte) ((i11 >> 16) & 255);
            bArr2[6] = (byte) ((i11 >> 8) & 255);
            bArr2[7] = (byte) (i11 & 255);
            e0Var.a(wVar4, 8, 1);
            return length + 9;
        }
        w wVar5 = pVar.f48970n;
        int iC = wVar5.C();
        wVar5.J(-2);
        int i13 = (iC * 6) + 2;
        if (i12 != 0) {
            wVar4.F(i13);
            byte[] bArr3 = wVar4.f4039a;
            wVar5.h(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i12;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            wVar4 = wVar5;
        }
        e0Var.a(wVar4, i13, 1);
        return length + 1 + i13;
    }

    public final void e() {
        p pVar = this.f48864b;
        pVar.f48961d = 0;
        pVar.f48972p = 0L;
        pVar.f48973q = false;
        pVar.f48968k = false;
        pVar.f48971o = false;
        pVar.m = null;
        this.f48868f = 0;
        this.f48870h = 0;
        this.f48869g = 0;
        this.f48871i = 0;
        this.m = false;
    }
}
