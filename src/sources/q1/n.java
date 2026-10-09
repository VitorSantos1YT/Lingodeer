package q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47390d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f47390d) {
            case 0:
                int i11 = this.f47389c;
                this.f47389c = i11 + 2;
                Object[] objArr = this.f47387a;
                return new a(0, objArr[i11], objArr[i11 + 1]);
            case 1:
                int i12 = this.f47389c;
                this.f47389c = i12 + 2;
                return this.f47387a[i12];
            default:
                int i13 = this.f47389c;
                this.f47389c = i13 + 2;
                return this.f47387a[i13 + 1];
        }
    }
}
