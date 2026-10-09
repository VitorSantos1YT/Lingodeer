package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f2437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2438b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2439c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2440d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2441e = null;

    public d(s0 s0Var) {
        this.f2437a = s0Var;
    }

    public final void a() {
        int i11 = this.f2438b;
        if (i11 == 0) {
            return;
        }
        s0 s0Var = this.f2437a;
        if (i11 == 1) {
            s0Var.onInserted(this.f2439c, this.f2440d);
        } else if (i11 == 2) {
            s0Var.onRemoved(this.f2439c, this.f2440d);
        } else if (i11 == 3) {
            s0Var.onChanged(this.f2439c, this.f2440d, this.f2441e);
        }
        this.f2441e = null;
        this.f2438b = 0;
    }

    @Override // androidx.recyclerview.widget.s0
    public final void onChanged(int i11, int i12, Object obj) {
        int i13;
        int i14;
        int i15;
        if (this.f2438b == 3 && i11 <= (i14 = this.f2440d + (i13 = this.f2439c)) && (i15 = i11 + i12) >= i13 && this.f2441e == obj) {
            this.f2439c = Math.min(i11, i13);
            this.f2440d = Math.max(i14, i15) - this.f2439c;
            return;
        }
        a();
        this.f2439c = i11;
        this.f2440d = i12;
        this.f2441e = obj;
        this.f2438b = 3;
    }

    @Override // androidx.recyclerview.widget.s0
    public final void onInserted(int i11, int i12) {
        int i13;
        if (this.f2438b == 1 && i11 >= (i13 = this.f2439c)) {
            int i14 = this.f2440d;
            if (i11 <= i13 + i14) {
                this.f2440d = i14 + i12;
                this.f2439c = Math.min(i11, i13);
                return;
            }
        }
        a();
        this.f2439c = i11;
        this.f2440d = i12;
        this.f2438b = 1;
    }

    @Override // androidx.recyclerview.widget.s0
    public final void onMoved(int i11, int i12) {
        a();
        this.f2437a.onMoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.s0
    public final void onRemoved(int i11, int i12) {
        int i13;
        if (this.f2438b == 2 && (i13 = this.f2439c) >= i11 && i13 <= i11 + i12) {
            this.f2440d += i12;
            this.f2439c = i11;
        } else {
            a();
            this.f2439c = i11;
            this.f2440d = i12;
            this.f2438b = 2;
        }
    }
}
