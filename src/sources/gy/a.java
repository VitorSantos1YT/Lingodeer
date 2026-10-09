package gy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f29890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f29891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29892c;

    public a(int i11) {
        switch (i11) {
            case 1:
                Object[] objArr = new Object[5];
                this.f29890a = objArr;
                this.f29891b = objArr;
                break;
            default:
                Object[] objArr2 = new Object[5];
                this.f29890a = objArr2;
                this.f29891b = objArr2;
                break;
        }
    }

    public void a(Object obj) {
        int i11 = this.f29892c;
        if (i11 == 4) {
            Object[] objArr = new Object[5];
            this.f29891b[4] = objArr;
            this.f29891b = objArr;
            i11 = 0;
        }
        this.f29891b[i11] = obj;
        this.f29892c = i11 + 1;
    }
}
