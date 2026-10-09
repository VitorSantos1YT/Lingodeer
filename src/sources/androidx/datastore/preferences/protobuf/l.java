package androidx.datastore.preferences.protobuf;

import java.util.List;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1510b;

    public l(int i11) {
        this.f1509a = i11;
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i11);

    public void E() {
        boolean zD;
        do {
            int iA = A();
            if (iA == 0) {
                return;
            }
            int i11 = this.f1509a;
            if (i11 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f1509a = i11 + 1;
            zD = D(iA);
            this.f1509a--;
        } while (zD);
    }

    public abstract void a(int i11);

    public abstract int b();

    public abstract boolean c();

    public abstract z4.v1 g(z4.v1 v1Var, List list);

    public abstract o2 h(z4.g1 g1Var, o2 o2Var);

    public abstract void i(int i11);

    public abstract int j(int i11);

    public abstract boolean k();

    public abstract h l();

    public abstract androidx.glance.appwidget.protobuf.g m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();

    public void d(z4.g1 g1Var) {
    }

    public void f(z4.g1 g1Var) {
    }
}
