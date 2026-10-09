package hj;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f32471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RelativeLayout f32472c;

    public /* synthetic */ c6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, int i11) {
        this.f32470a = i11;
        this.f32471b = relativeLayout;
        this.f32472c = relativeLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32470a) {
            case 0:
                break;
        }
        return this.f32471b;
    }
}
