package i5;

import android.database.DataSetObserver;
import androidx.appcompat.widget.h;
import androidx.viewpager.widget.ViewPager;
import r.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34150b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f34149a = i11;
        this.f34150b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f34149a) {
            case 0:
                g2 g2Var = (g2) this.f34150b;
                g2Var.f34151a = true;
                g2Var.notifyDataSetChanged();
                break;
            case 1:
                h hVar = (h) this.f34150b;
                if (hVar.f1095b0.isShowing()) {
                    hVar.a();
                }
                break;
            default:
                ((ViewPager) this.f34150b).e();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f34149a) {
            case 0:
                g2 g2Var = (g2) this.f34150b;
                g2Var.f34151a = false;
                g2Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((h) this.f34150b).dismiss();
                break;
            default:
                ((ViewPager) this.f34150b).e();
                break;
        }
    }
}
