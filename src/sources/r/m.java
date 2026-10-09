package r;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f48600b;

    public /* synthetic */ m(ActivityChooserView activityChooserView, int i11) {
        this.f48599a = i11;
        this.f48600b = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f48599a) {
            case 0:
                super.onChanged();
                this.f48600b.f884a.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                this.f48600b.f884a.getClass();
                throw null;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.f48599a) {
            case 0:
                super.onInvalidated();
                this.f48600b.f884a.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
