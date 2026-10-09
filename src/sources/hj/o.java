package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f33001b;

    public /* synthetic */ o(ViewGroup viewGroup, int i11) {
        this.f33000a = i11;
        this.f33001b = viewGroup;
    }

    public static o a(View view) {
        int i11 = R.id.hor_scroll_view;
        if (((HorizontalScrollView) fr.j3.q(view, R.id.hor_scroll_view)) != null) {
            i11 = R.id.iv_sentence_more;
            if (((ImageView) fr.j3.q(view, R.id.iv_sentence_more)) != null) {
                i11 = R.id.ll_word;
                if (((LinearLayout) fr.j3.q(view, R.id.ll_word)) != null) {
                    i11 = R.id.tv_bottom;
                    if (((TextView) fr.j3.q(view, R.id.tv_bottom)) != null) {
                        i11 = R.id.tv_middle;
                        if (((TextView) fr.j3.q(view, R.id.tv_middle)) != null) {
                            i11 = R.id.tv_top;
                            if (((TextView) fr.j3.q(view, R.id.tv_top)) != null) {
                                return new o((CardView) view, 1);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f33000a) {
            case 0:
                return (LinearLayout) this.f33001b;
            default:
                return (CardView) this.f33001b;
        }
    }
}
