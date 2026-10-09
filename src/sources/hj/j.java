package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.lingo.fluent.widget.DonutProgress;
import com.lingo.lingoskill.ui.learn.widget.MovedConstraintLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f32736b;

    public /* synthetic */ j(ViewGroup viewGroup, int i11) {
        this.f32735a = i11;
        this.f32736b = viewGroup;
    }

    public static j a(View view) {
        MovedConstraintLayout movedConstraintLayout = (MovedConstraintLayout) view;
        int i11 = R.id.donut_pb;
        if (((DonutProgress) fr.j3.q(view, R.id.donut_pb)) != null) {
            i11 = R.id.fl_control;
            if (((FrameLayout) fr.j3.q(view, R.id.fl_control)) != null) {
                i11 = R.id.iv_control;
                if (((ImageView) fr.j3.q(view, R.id.iv_control)) != null) {
                    i11 = R.id.iv_video_card_close;
                    if (((ImageView) fr.j3.q(view, R.id.iv_video_card_close)) != null) {
                        return new j(movedConstraintLayout, 1);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static j b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_container, (ViewGroup) null, false);
        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_container)) != null) {
            return new j((LinearLayout) viewInflate, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fl_container)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32735a) {
            case 0:
                return (LinearLayout) this.f32736b;
            default:
                return (MovedConstraintLayout) this.f32736b;
        }
    }
}
