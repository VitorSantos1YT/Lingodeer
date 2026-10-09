package m1;

import java.util.ArrayList;
import l1.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.s f40764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f40765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40766c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40770g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40775l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f40767d = new p0(0, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40768e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f40771h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40772i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40773j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40774k = -1;

    public b(l1.s sVar, a aVar) {
        this.f40764a = sVar;
        this.f40765b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f40771h;
        if (arrayList.isEmpty()) {
            this.f40770g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i11 = this.f40770g;
        if (i11 > 0) {
            l0 l0Var = this.f40765b.f40762d;
            l0Var.K(h0.f40789c);
            l0Var.f40799f[l0Var.f40800g - l0Var.f40797d[l0Var.f40798e - 1].f40793a] = i11;
            this.f40770g = 0;
        }
        ArrayList arrayList = this.f40771h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f40765b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = arrayList.get(i12);
        }
        aVar.getClass();
        if (size != 0) {
            l0 l0Var2 = aVar.f40762d;
            l0Var2.K(k.f40795c);
            qx.p.C(l0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i11 = this.f40775l;
        if (i11 > 0) {
            int i12 = this.f40772i;
            if (i12 >= 0) {
                b();
                l0 l0Var = this.f40765b.f40762d;
                l0Var.K(z.f40820c);
                int i13 = l0Var.f40800g - l0Var.f40797d[l0Var.f40798e - 1].f40793a;
                int[] iArr = l0Var.f40799f;
                iArr[i13] = i12;
                iArr[i13 + 1] = i11;
                this.f40772i = -1;
            } else {
                int i14 = this.f40774k;
                int i15 = this.f40773j;
                b();
                l0 l0Var2 = this.f40765b.f40762d;
                l0Var2.K(v.f40816c);
                int i16 = l0Var2.f40800g - l0Var2.f40797d[l0Var2.f40798e - 1].f40793a;
                int[] iArr2 = l0Var2.f40799f;
                iArr2[i16 + 1] = i14;
                iArr2[i16] = i15;
                iArr2[i16 + 2] = i11;
                this.f40773j = -1;
                this.f40774k = -1;
            }
            this.f40775l = 0;
        }
    }

    public final void d(boolean z11) {
        l1.s sVar = this.f40764a;
        int i11 = z11 ? sVar.G.f39348i : sVar.G.f39346g;
        int i12 = i11 - this.f40769f;
        if (i12 < 0) {
            l1.u.a("Tried to seek backward");
        }
        if (i12 > 0) {
            l0 l0Var = this.f40765b.f40762d;
            l0Var.K(d.f40780c);
            l0Var.f40799f[l0Var.f40800g - l0Var.f40797d[l0Var.f40798e - 1].f40793a] = i12;
            this.f40769f = i11;
        }
    }

    public final void e(int i11, int i12) {
        if (i12 > 0) {
            if (!(i11 >= 0)) {
                l1.u.a("Invalid remove index " + i11);
            }
            if (this.f40772i == i11) {
                this.f40775l += i12;
                return;
            }
            c();
            this.f40772i = i11;
            this.f40775l = i12;
        }
    }
}
