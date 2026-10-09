package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import fr.j3;
import hj.b5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f45641a = new c0(3, b5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSpeakTestBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_speak_test, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_next;
        AppCompatButton appCompatButton = (AppCompatButton) j3.q(viewInflate, R.id.btn_next);
        if (appCompatButton != null) {
            i11 = R.id.btn_pre;
            AppCompatButton appCompatButton2 = (AppCompatButton) j3.q(viewInflate, R.id.btn_pre);
            if (appCompatButton2 != null) {
                i11 = R.id.fl_audio;
                CardView cardView = (CardView) j3.q(viewInflate, R.id.fl_audio);
                if (cardView != null) {
                    i11 = R.id.fl_question;
                    FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.fl_question);
                    if (frameLayout != null) {
                        i11 = R.id.fl_sentence;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.fl_sentence);
                        if (flexboxLayout != null) {
                            i11 = R.id.iv_audio;
                            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_audio);
                            if (imageView != null) {
                                i11 = R.id.iv_pic;
                                ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_pic);
                                if (imageView2 != null) {
                                    i11 = R.id.progress_bar;
                                    ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
                                    if (progressBar != null) {
                                        i11 = R.id.tv_trans;
                                        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_trans);
                                        if (textView != null) {
                                            return new b5((LinearLayout) viewInflate, appCompatButton, appCompatButton2, cardView, frameLayout, flexboxLayout, imageView, imageView2, progressBar, textView);
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
