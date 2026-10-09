package x0;

import android.app.PendingIntent;
import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55575c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f55573a = i11;
        this.f55574b = obj;
        this.f55575c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        switch (this.f55573a) {
            case 0:
                ((v0.d) this.f55574b).f53456d.invoke(((d) this.f55575c).f55576a);
                break;
            default:
                z6.c.o((Context) this.f55574b, (TextClassification) this.f55575c);
                break;
        }
        return true;
    }
}
