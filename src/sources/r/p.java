package r;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f48621a;

    public p(ActivityChooserView activityChooserView) {
        this.f48621a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.f48621a;
        o oVar = activityChooserView.f884a;
        if (view == activityChooserView.f889f) {
            activityChooserView.a();
            oVar.getClass();
            throw null;
        }
        if (view != activityChooserView.f887d) {
            throw new IllegalArgumentException();
        }
        oVar.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        androidx.appcompat.widget.c cVar;
        q.l lVar;
        ActivityChooserView activityChooserView = this.f48621a;
        PopupWindow.OnDismissListener onDismissListener = activityChooserView.L;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        z4.c cVar2 = activityChooserView.f890t;
        if (cVar2 == null || (cVar = cVar2.f58815a) == null || (lVar = cVar.f1070c) == null) {
            return;
        }
        lVar.c(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        ((o) adapterView.getAdapter()).getClass();
        ActivityChooserView activityChooserView = this.f48621a;
        activityChooserView.a();
        activityChooserView.f884a.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.f48621a;
        if (view != activityChooserView.f889f) {
            throw new IllegalArgumentException();
        }
        activityChooserView.f884a.getClass();
        throw null;
    }
}
