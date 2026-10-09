package fx;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends AtomicInteger implements ww.b {
    private static final long serialVersionUID = -5556924161382950569L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.i f28272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw.c f28273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x[] f28274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f28275d;

    public w(uw.i iVar, int i11, tw.c cVar) {
        super(i11);
        this.f28272a = iVar;
        this.f28273b = cVar;
        x[] xVarArr = new x[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            xVarArr[i12] = new x(this, i12);
        }
        this.f28274c = xVarArr;
        this.f28275d = new Object[i11];
    }

    public final void a(int i11) {
        x[] xVarArr = this.f28274c;
        int length = xVarArr.length;
        for (int i12 = 0; i12 < i11; i12++) {
            x xVar = xVarArr[i12];
            xVar.getClass();
            zw.a.a(xVar);
        }
        while (true) {
            i11++;
            if (i11 >= length) {
                return;
            }
            x xVar2 = xVarArr[i11];
            xVar2.getClass();
            zw.a.a(xVar2);
        }
    }

    @Override // ww.b
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (x xVar : this.f28274c) {
                xVar.getClass();
                zw.a.a(xVar);
            }
        }
    }
}
