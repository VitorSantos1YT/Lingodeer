package ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.s4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f52986a = new e0(3, s4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPinyinLessonStudy7Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pinyin_lesson_study_7, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.btn_practice;
            MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_practice);
            if (materialButton != null) {
                i11 = R.id.iv_audio_1;
                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_audio_1);
                if (imageView != null) {
                    i11 = R.id.iv_audio_2;
                    ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_audio_2);
                    if (imageView2 != null) {
                        i11 = R.id.iv_audio_3;
                        ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_audio_3);
                        if (imageView3 != null) {
                            i11 = R.id.iv_audio_4;
                            ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_audio_4);
                            if (imageView4 != null) {
                                i11 = R.id.iv_audio_5;
                                ImageView imageView5 = (ImageView) j3.q(viewInflate, R.id.iv_audio_5);
                                if (imageView5 != null) {
                                    i11 = R.id.tv_desc_1;
                                    if (((TextView) j3.q(viewInflate, R.id.tv_desc_1)) != null) {
                                        i11 = R.id.tv_first_tone_desc;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_first_tone_desc)) != null) {
                                            i11 = R.id.tv_fourth_tone_desc;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_fourth_tone_desc)) != null) {
                                                i11 = R.id.tv_second_tone_desc;
                                                if (((TextView) j3.q(viewInflate, R.id.tv_second_tone_desc)) != null) {
                                                    i11 = R.id.tv_third_tone_desc;
                                                    if (((TextView) j3.q(viewInflate, R.id.tv_third_tone_desc)) != null) {
                                                        i11 = R.id.tv_tips;
                                                        if (((TextView) j3.q(viewInflate, R.id.tv_tips)) != null) {
                                                            return new s4((ConstraintLayout) viewInflate, materialButton, imageView, imageView2, imageView3, imageView4, imageView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
