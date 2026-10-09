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
public final class i0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f32677b;

    public /* synthetic */ i0(ViewGroup viewGroup, int i11) {
        this.f32676a = i11;
        this.f32677b = viewGroup;
    }

    public static i0 a(View view) {
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
                                return new i0((CardView) view, 1);
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
        switch (this.f32676a) {
            case 0:
                return (LinearLayout) this.f32677b;
            default:
                return (CardView) this.f32677b;
        }
    }
}
