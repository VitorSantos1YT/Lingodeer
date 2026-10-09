package w2;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f54565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f54566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f54567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f54568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f54569f;

    public q(String str) {
        this.f54564a = 1;
        this.f54569f = str;
        this.f54565b = new p(1, null);
        this.f54566c = new p(0, null);
        this.f54567d = new p(1, null);
        this.f54568e = new p(0, null);
    }

    public final p a() {
        switch (this.f54564a) {
            case 0:
                break;
        }
        return this.f54568e;
    }

    public final p b() {
        switch (this.f54564a) {
            case 0:
                break;
        }
        return this.f54565b;
    }

    public final p c() {
        switch (this.f54564a) {
            case 0:
                break;
        }
        return this.f54567d;
    }

    public final p d() {
        switch (this.f54564a) {
            case 0:
                break;
        }
        return this.f54566c;
    }

    public final String toString() {
        switch (this.f54564a) {
            case 0:
                return ry.l.b0((q[]) this.f54569f, "innermostOf(", ")", 57);
            default:
                String str = (String) this.f54569f;
                return str != null ? nv.p.q("RectRulers(", str, ')') : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(q[] qVarArr) {
        this.f54564a = 0;
        this.f54569f = qVarArr;
        int length = qVarArr.length;
        p[] pVarArr = new p[length];
        for (int i11 = 0; i11 < length; i11++) {
            pVarArr[i11] = ((q[]) this.f54569f)[i11].b();
        }
        this.f54565b = new p(1, new t1(pVarArr, 0));
        int length2 = ((q[]) this.f54569f).length;
        p[] pVarArr2 = new p[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            pVarArr2[i12] = ((q[]) this.f54569f)[i12].d();
        }
        this.f54566c = new p(0, new o(pVarArr2, 0));
        int length3 = ((q[]) this.f54569f).length;
        p[] pVarArr3 = new p[length3];
        for (int i13 = 0; i13 < length3; i13++) {
            pVarArr3[i13] = ((q[]) this.f54569f)[i13].c();
        }
        this.f54567d = new p(1, new t1(pVarArr3, 1));
        int length4 = ((q[]) this.f54569f).length;
        p[] pVarArr4 = new p[length4];
        for (int i14 = 0; i14 < length4; i14++) {
            pVarArr4[i14] = ((q[]) this.f54569f)[i14].a();
        }
        this.f54568e = new p(0, new o(pVarArr4, 1));
    }
}
