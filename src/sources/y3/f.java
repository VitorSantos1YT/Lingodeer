package y3;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import qy.b0;
import y2.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f57067b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ViewFactoryHolder viewFactoryHolder, int i11) {
        super(0);
        this.f57066a = i11;
        this.f57067b = viewFactoryHolder;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f57066a) {
            case 0:
                this.f57067b.getLayoutNode().D();
                return b0.f48488a;
            case 1:
                ViewFactoryHolder viewFactoryHolder = this.f57067b;
                if (viewFactoryHolder.f1224e && viewFactoryHolder.isAttachedToWindow() && viewFactoryHolder.getView().getParent() == viewFactoryHolder) {
                    v1 snapshotObserver = viewFactoryHolder.getSnapshotObserver();
                    snapshotObserver.f57019a.d(viewFactoryHolder, b.f57052b, viewFactoryHolder.getUpdate());
                }
                return b0.f48488a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f57067b.f1228g0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                ViewFactoryHolder viewFactoryHolder2 = this.f57067b;
                viewFactoryHolder2.getReleaseBlock().invoke(viewFactoryHolder2.f1228g0);
                ViewFactoryHolder.o(viewFactoryHolder2);
                return b0.f48488a;
            case 4:
                ViewFactoryHolder viewFactoryHolder3 = this.f57067b;
                viewFactoryHolder3.getResetBlock().invoke(viewFactoryHolder3.f1228g0);
                return b0.f48488a;
            default:
                ViewFactoryHolder viewFactoryHolder4 = this.f57067b;
                viewFactoryHolder4.getUpdateBlock().invoke(viewFactoryHolder4.f1228g0);
                return b0.f48488a;
        }
    }
}
