package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends m0 {
    private static final long serialVersionUID = 2587302975077663557L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx.a f26038d;

    public k0(bx.a aVar, Object[] objArr) {
        super(objArr);
        this.f26038d = aVar;
    }

    @Override // ex.m0
    public final void b() {
        Object[] objArr = this.f26044a;
        int length = objArr.length;
        bx.a aVar = this.f26038d;
        for (int i11 = this.f26045b; i11 != length; i11++) {
            if (this.f26046c) {
                return;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                aVar.onError(new NullPointerException(hh.p0.h(i11, "The element at index ", " is null")));
                return;
            }
            aVar.d(obj);
        }
        if (this.f26046c) {
            return;
        }
        aVar.onComplete();
    }

    @Override // ex.m0
    public final void c(long j11) {
        Object[] objArr = this.f26044a;
        int length = objArr.length;
        int i11 = this.f26045b;
        bx.a aVar = this.f26038d;
        do {
            long j12 = 0;
            while (true) {
                if (j12 == j11 || i11 == length) {
                    if (i11 == length) {
                        if (this.f26046c) {
                            return;
                        }
                        aVar.onComplete();
                        return;
                    } else {
                        j11 = get();
                        if (j12 == j11) {
                            break;
                        }
                    }
                } else {
                    if (this.f26046c) {
                        return;
                    }
                    Object obj = objArr[i11];
                    if (obj == null) {
                        aVar.onError(new NullPointerException(hh.p0.h(i11, "The element at index ", " is null")));
                        return;
                    } else {
                        if (aVar.d(obj)) {
                            j12++;
                        }
                        i11++;
                    }
                }
            }
            this.f26045b = i11;
            j11 = addAndGet(-j12);
        } while (j11 != 0);
    }
}
