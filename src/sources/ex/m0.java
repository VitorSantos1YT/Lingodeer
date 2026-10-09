package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 extends mx.b {
    private static final long serialVersionUID = -2252972430506210021L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f26044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f26046c;

    public m0(Object[] objArr) {
        this.f26044a = objArr;
    }

    @Override // bx.c
    public final int a(int i11) {
        return 1;
    }

    public abstract void b();

    public abstract void c(long j11);

    @Override // n20.c
    public final void cancel() {
        this.f26046c = true;
    }

    @Override // bx.g
    public final void clear() {
        this.f26045b = this.f26044a.length;
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f26045b == this.f26044a.length;
    }

    @Override // bx.g
    public final Object poll() {
        int i11 = this.f26045b;
        Object[] objArr = this.f26044a;
        if (i11 == objArr.length) {
            return null;
        }
        this.f26045b = i11 + 1;
        Object obj = objArr[i11];
        ax.d.a(obj, "array element is null");
        return obj;
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11) && ue.f.i(this, j11) == 0) {
            if (j11 == Long.MAX_VALUE) {
                b();
            } else {
                c(j11);
            }
        }
    }
}
