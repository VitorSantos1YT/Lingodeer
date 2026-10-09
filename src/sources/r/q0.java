package r;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends lp.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f48630c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, 24);
        this.f48630c = appCompatTextView;
    }

    @Override // lp.b, r.p0
    public final void a(int i11) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i11);
    }

    @Override // lp.b, r.p0
    public final void b(int i11) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i11);
    }
}
