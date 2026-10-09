package jp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f36451c;

    public /* synthetic */ b(Object obj, int i11, View view) {
        this.f36449a = i11;
        this.f36450b = obj;
        this.f36451c = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f36449a) {
            case 0:
                AbsDialogModelAdapter absDialogModelAdapter = ((i) this.f36450b).f36486p;
                if (absDialogModelAdapter != null) {
                    absDialogModelAdapter.m(this.f36451c);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("mAdapter");
                    throw null;
                }
            default:
                zq.b bVar = (zq.b) this.f36450b;
                FrameLayout frameLayout = (FrameLayout) this.f36451c;
                bVar.getClass();
                frameLayout.setBackgroundResource(0);
                return;
        }
    }
}
