package ex;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements n20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f25978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25979b;

    public c1(AtomicReference atomicReference, int i11) {
        this.f25978a = atomicReference;
        this.f25979b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n20.a
    public final void a(n20.b bVar) {
        e1 e1Var;
        d1 d1Var = new d1(bVar);
        bVar.c(d1Var);
        loop0: while (true) {
            e1 e1Var2 = (e1) this.f25978a.get();
            if (e1Var2 == null || e1Var2.e()) {
                e1 e1Var3 = new e1(this.f25978a, this.f25979b);
                AtomicReference atomicReference = this.f25978a;
                while (true) {
                    if (atomicReference.compareAndSet(e1Var2, e1Var3)) {
                        e1Var = e1Var3;
                    } else if (atomicReference.get() != e1Var2) {
                    }
                }
            } else {
                e1Var = e1Var2;
            }
            AtomicReference atomicReference2 = e1Var.f25999c;
            while (true) {
                d1[] d1VarArr = (d1[]) atomicReference2.get();
                if (d1VarArr == e1.L) {
                    break;
                }
                int length = d1VarArr.length;
                d1[] d1VarArr2 = new d1[length + 1];
                System.arraycopy(d1VarArr, 0, d1VarArr2, 0, length);
                d1VarArr2[length] = d1Var;
                do {
                    if (atomicReference2.compareAndSet(d1VarArr, d1VarArr2)) {
                        break loop0;
                    }
                } while (atomicReference2.get() == d1VarArr);
            }
        }
        if (d1Var.get() == Long.MIN_VALUE) {
            e1Var.f(d1Var);
        } else {
            d1Var.f25988b = e1Var;
        }
        e1Var.b();
    }
}
