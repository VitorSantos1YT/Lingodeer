package androidx.appcompat.widget;

import android.view.View;
import z4.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1064a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbsActionBarView f1066c;

    public a(AbsActionBarView absActionBarView) {
        this.f1066c = absActionBarView;
    }

    @Override // z4.x0
    public final void a() {
        this.f1064a = true;
    }

    @Override // z4.x0
    public final void b(View view) {
        if (this.f1064a) {
            return;
        }
        AbsActionBarView absActionBarView = this.f1066c;
        absActionBarView.f851f = null;
        super/*android.view.View*/.setVisibility(this.f1065b);
    }

    @Override // z4.x0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f1064a = false;
    }
}
