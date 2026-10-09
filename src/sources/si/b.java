package si;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import fr.j3;
import hj.u1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f51702a = new b(3, u1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnCharacterStrokeViewNewBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_character_stroke_view_new, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.const_bg;
        if (((ConstraintLayout) j3.q(viewInflate, R.id.const_bg)) != null) {
            MotionLayout motionLayout = (MotionLayout) viewInflate;
            i11 = R.id.iv_arrow;
            if (((FrameLayout) j3.q(viewInflate, R.id.iv_arrow)) != null) {
                i11 = R.id.iv_audio;
                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_audio);
                if (imageView != null) {
                    i11 = R.id.iv_fav;
                    ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_fav);
                    if (imageView2 != null) {
                        i11 = R.id.iv_refresh;
                        ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_refresh);
                        if (imageView3 != null) {
                            i11 = R.id.iv_show_anim;
                            ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_show_anim);
                            if (imageView4 != null) {
                                i11 = R.id.iv_show_arrow;
                                ImageView imageView5 = (ImageView) j3.q(viewInflate, R.id.iv_show_arrow);
                                if (imageView5 != null) {
                                    i11 = R.id.strokes_order_native_txt;
                                    TextView textView = (TextView) j3.q(viewInflate, R.id.strokes_order_native_txt);
                                    if (textView != null) {
                                        i11 = R.id.strokes_order_pinyin_txt;
                                        TextView textView2 = (TextView) j3.q(viewInflate, R.id.strokes_order_pinyin_txt);
                                        if (textView2 != null) {
                                            i11 = R.id.strokes_order_tian;
                                            if (((ImageView) j3.q(viewInflate, R.id.strokes_order_tian)) != null) {
                                                i11 = R.id.strokes_order_user_write;
                                                HwViewNew hwViewNew = (HwViewNew) j3.q(viewInflate, R.id.strokes_order_user_write);
                                                if (hwViewNew != null) {
                                                    i11 = R.id.strokes_view;
                                                    HwViewNew hwViewNew2 = (HwViewNew) j3.q(viewInflate, R.id.strokes_view);
                                                    if (hwViewNew2 != null) {
                                                        return new u1(motionLayout, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, hwViewNew, hwViewNew2);
                                                    }
                                                }
                                            }
                                        }
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
