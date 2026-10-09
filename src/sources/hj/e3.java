package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f32523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32525d;

    public /* synthetic */ e3(ViewGroup viewGroup, Object obj, View view, int i11) {
        this.f32522a = i11;
        this.f32523b = viewGroup;
        this.f32524c = obj;
        this.f32525d = view;
    }

    public static e3 a(View view) {
        ComposeView composeView = (ComposeView) fr.j3.q(view, R.id.compose_loading);
        if (composeView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.compose_loading)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new e3(linearLayout, composeView, linearLayout, 5);
    }

    public static e3 b(View view) {
        int i11 = R.id.include_deer_audio;
        View viewQ = fr.j3.q(view, R.id.include_deer_audio);
        if (viewQ != null) {
            b6 b6VarA = b6.a(viewQ);
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) fr.j3.q(view, R.id.tv_title);
            if (textView != null) {
                return new e3(linearLayout, b6VarA, textView, 8);
            }
            i11 = R.id.tv_title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static e3 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_test_card_syllable, viewGroup, false);
        int i11 = R.id.strokes_view;
        HwView hwView = (HwView) fr.j3.q(viewInflate, R.id.strokes_view);
        if (hwView != null) {
            i11 = R.id.tv_title;
            TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_title);
            if (textView != null) {
                return new e3((RelativeLayout) viewInflate, hwView, textView, 9);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public static e3 d(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        View viewInflate = layoutInflater.inflate(R.layout.include_sentence_ab_a, (ViewGroup) linearLayout, false);
        int i11 = R.id.flex_container;
        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_container);
        if (flexboxLayout != null) {
            i11 = R.id.frame_body;
            if (((FrameLayout) fr.j3.q(viewInflate, R.id.frame_body)) != null) {
                i11 = R.id.iv_panda;
                if (((ImageView) fr.j3.q(viewInflate, R.id.iv_panda)) != null) {
                    i11 = R.id.iv_play;
                    ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_play);
                    if (imageView != null) {
                        i11 = R.id.iv_top;
                        if (((ImageView) fr.j3.q(viewInflate, R.id.iv_top)) != null) {
                            return new e3((ConstraintLayout) viewInflate, flexboxLayout, imageView, 6);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32522a) {
            case 0:
                return (FrameLayout) this.f32523b;
            case 1:
                return (LinearLayout) this.f32523b;
            case 2:
                return (ConstraintLayout) this.f32523b;
            case 3:
                return (ConstraintLayout) this.f32523b;
            case 4:
                return (LinearLayout) this.f32523b;
            case 5:
                return (LinearLayout) this.f32523b;
            case 6:
                return (ConstraintLayout) this.f32523b;
            case 7:
                return (LinearLayout) this.f32523b;
            case 8:
                return (LinearLayout) this.f32523b;
            default:
                return (RelativeLayout) this.f32523b;
        }
    }
}
