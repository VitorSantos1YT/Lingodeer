package r;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f48637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f48637d = appCompatTextView;
    }

    @Override // lp.b, r.p0
    public final void c(int i11, float f5) {
        super/*android.widget.TextView*/.setLineHeight(i11, f5);
    }
}
