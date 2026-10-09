package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f33640b;

    public /* synthetic */ z(ViewGroup viewGroup, int i11) {
        this.f33639a = i11;
        this.f33640b = viewGroup;
    }

    public static z a(View view) {
        int i11 = R.id.flex_container;
        if (((FlexboxLayout) fr.j3.q(view, R.id.flex_container)) != null) {
            i11 = R.id.iv_sentence_more;
            if (((ImageView) fr.j3.q(view, R.id.iv_sentence_more)) != null) {
                return new z((MaterialCardView) view, 1);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static z b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_lesson_test, (ViewGroup) null, false);
        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_container)) != null) {
            return new z((LinearLayout) viewInflate, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fl_container)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f33639a) {
            case 0:
                return (LinearLayout) this.f33640b;
            default:
                return (MaterialCardView) this.f33640b;
        }
    }
}
