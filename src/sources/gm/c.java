package gm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import fr.j3;
import hj.t1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f29284a = new c(3, t1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnCharacterStrokeViewBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_character_stroke_view, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.iv_fav;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_fav);
        if (imageView != null) {
            i11 = R.id.strokes_order_native_txt;
            TextView textView = (TextView) j3.q(viewInflate, R.id.strokes_order_native_txt);
            if (textView != null) {
                i11 = R.id.strokes_order_pinyin_txt;
                TextView textView2 = (TextView) j3.q(viewInflate, R.id.strokes_order_pinyin_txt);
                if (textView2 != null) {
                    i11 = R.id.strokes_order_tian;
                    if (((ImageView) j3.q(viewInflate, R.id.strokes_order_tian)) != null) {
                        i11 = R.id.strokes_replay_btn;
                        ImageButton imageButton = (ImageButton) j3.q(viewInflate, R.id.strokes_replay_btn);
                        if (imageButton != null) {
                            i11 = R.id.strokes_view;
                            HwView hwView = (HwView) j3.q(viewInflate, R.id.strokes_view);
                            if (hwView != null) {
                                i11 = R.id.strokes_write_btn;
                                ImageButton imageButton2 = (ImageButton) j3.q(viewInflate, R.id.strokes_write_btn);
                                if (imageButton2 != null) {
                                    i11 = R.id.strokes_writing2_btn;
                                    ImageButton imageButton3 = (ImageButton) j3.q(viewInflate, R.id.strokes_writing2_btn);
                                    if (imageButton3 != null) {
                                        return new t1((ConstraintLayout) viewInflate, imageView, textView, textView2, imageButton, hwView, imageButton2, imageButton3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
