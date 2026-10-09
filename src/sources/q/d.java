package q;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47253b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f47252a = i11;
        this.f47253b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        androidx.appcompat.widget.c cVar;
        u uVar;
        switch (this.f47252a) {
            case 0:
                f fVar = (f) this.f47253b;
                ArrayList arrayList = fVar.H;
                if (fVar.b() && arrayList.size() > 0) {
                    int i11 = 0;
                    if (!((e) arrayList.get(0)).f47254a.f1093a0) {
                        View view = fVar.Q;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                ((e) obj).f47254a.a();
                            }
                        } else {
                            fVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            case 1:
                a0 a0Var = (a0) this.f47253b;
                androidx.appcompat.widget.i iVar = a0Var.H;
                if (a0Var.b() && !iVar.f1093a0) {
                    View view2 = a0Var.O;
                    if (view2 != null && view2.isShown()) {
                        iVar.a();
                    } else {
                        a0Var.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.f47253b;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        break;
                    } else {
                        activityChooserView.getListPopupWindow().a();
                        z4.c cVar2 = activityChooserView.f890t;
                        if (cVar2 != null && (cVar = cVar2.f58815a) != null && (uVar = cVar.f1072e) != null) {
                            uVar.q(cVar.f1070c);
                            break;
                        }
                    }
                }
                break;
            case 3:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.f47253b;
                if (!appCompatSpinner.getInternalPopup().b()) {
                    appCompatSpinner.f931f.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                androidx.appcompat.widget.d dVar = (androidx.appcompat.widget.d) this.f47253b;
                AppCompatSpinner appCompatSpinner2 = dVar.f1079i0;
                dVar.getClass();
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(dVar.f1077g0)) {
                    dVar.s();
                    dVar.a();
                } else {
                    dVar.dismiss();
                }
                break;
        }
    }
}
