package r;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f48696b;

    public /* synthetic */ w1(SearchView searchView, int i11) {
        this.f48695a = i11;
        this.f48696b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48695a) {
            case 0:
                this.f48696b.s();
                break;
            default:
                i5.c cVar = this.f48696b.f987t0;
                if (cVar instanceof g2) {
                    cVar.b(null);
                }
                break;
        }
    }
}
