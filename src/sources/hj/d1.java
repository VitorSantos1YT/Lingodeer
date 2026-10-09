package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32479a;

    public d1(LinearLayout linearLayout) {
        this.f32479a = linearLayout;
    }

    public static d1 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_with_fragment, (ViewGroup) null, false);
        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_container)) != null) {
            return new d1((LinearLayout) viewInflate);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fl_container)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32479a;
    }
}
