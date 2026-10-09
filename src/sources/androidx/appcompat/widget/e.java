package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1081b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f1080a = i11;
        this.f1081b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1080a) {
            case 0:
                DropDownListView dropDownListView = (DropDownListView) this.f1081b;
                dropDownListView.N = null;
                dropDownListView.drawableStateChanged();
                break;
            default:
                DropDownListView dropDownListView2 = ((h) this.f1081b).f1096c;
                if (dropDownListView2 != null) {
                    dropDownListView2.setListSelectionHidden(true);
                    dropDownListView2.requestLayout();
                }
                break;
        }
    }
}
