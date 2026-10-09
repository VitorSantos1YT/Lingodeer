package rt;

import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f50317b;

    public /* synthetic */ qf(int i11, fz.a aVar) {
        this.f50316a = i11;
        this.f50317b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f50316a;
        fz.a aVar = this.f50317b;
        switch (i11) {
            case 0:
                aVar.invoke();
                break;
            case 1:
                aVar.invoke();
                break;
            case 2:
                aVar.invoke();
                break;
            case 3:
                int i12 = AndroidViewHolder.f1215f0;
                aVar.invoke();
                break;
            case 4:
                aVar.invoke();
                break;
            case 5:
                aVar.invoke();
                break;
            case 6:
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
