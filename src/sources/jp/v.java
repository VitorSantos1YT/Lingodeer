package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.r3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f36546a = new v(3, r3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentAudioLessonBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_audio_lesson, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.fl_audio_ctrl;
        FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.fl_audio_ctrl);
        if (frameLayout != null) {
            i11 = R.id.include_deer_audio;
            View viewQ = j3.q(viewInflate, R.id.include_deer_audio);
            if (viewQ != null) {
                b6 b6VarA = b6.a(viewQ);
                i11 = R.id.iv_audio_ctrl;
                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_audio_ctrl);
                if (imageView != null) {
                    i11 = R.id.iv_clear;
                    ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_clear);
                    if (imageView2 != null) {
                        i11 = R.id.seekbar;
                        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) j3.q(viewInflate, R.id.seekbar);
                        if (appCompatSeekBar != null) {
                            i11 = R.id.status_bar_view;
                            View viewQ2 = j3.q(viewInflate, R.id.status_bar_view);
                            if (viewQ2 != null) {
                                i11 = R.id.tv_current_time;
                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_current_time);
                                if (textView != null) {
                                    i11 = R.id.tv_lesson_name;
                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_lesson_name);
                                    if (textView2 != null) {
                                        i11 = R.id.tv_total_time;
                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_total_time);
                                        if (textView3 != null) {
                                            i11 = R.id.tv_unit_name;
                                            TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_unit_name);
                                            if (textView4 != null) {
                                                return new r3((ConstraintLayout) viewInflate, frameLayout, b6VarA, imageView, imageView2, appCompatSeekBar, viewQ2, textView, textView2, textView3, textView4);
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
