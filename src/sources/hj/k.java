package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f32802b;

    public /* synthetic */ k(ViewGroup viewGroup, int i11) {
        this.f32801a = i11;
        this.f32802b = viewGroup;
    }

    public static k a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R.id.fl_recommend_app_list;
        if (((FlexboxLayout) fr.j3.q(view, R.id.fl_recommend_app_list)) != null) {
            i11 = R.id.tv_title;
            if (((TextView) fr.j3.q(view, R.id.tv_title)) != null) {
                return new k(constraintLayout, 1);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32801a) {
            case 0:
                return (LinearLayout) this.f32802b;
            default:
                return (ConstraintLayout) this.f32802b;
        }
    }
}
