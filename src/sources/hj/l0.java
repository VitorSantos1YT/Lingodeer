package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f32835b;

    public /* synthetic */ l0(ViewGroup viewGroup, int i11) {
        this.f32834a = i11;
        this.f32835b = viewGroup;
    }

    public static l0 a(View view) {
        int i11 = R.id.flex_option;
        if (((FlexboxLayout) fr.j3.q(view, R.id.flex_option)) != null) {
            i11 = R.id.tv_word;
            if (((TextView) fr.j3.q(view, R.id.tv_word)) != null) {
                return new l0((CardView) view, 1);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32834a) {
            case 0:
                return (LinearLayout) this.f32835b;
            default:
                return (CardView) this.f32835b;
        }
    }
}
