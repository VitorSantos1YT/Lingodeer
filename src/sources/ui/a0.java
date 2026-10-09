package ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.r4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f52974a = new a0(3, r4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPinyinLessonStudy6Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pinyin_lesson_study_6, viewGroup, false);
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
                i11 = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
                if (recyclerView != null) {
                    i11 = R.id.recycler_view_2;
                    RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_2);
                    if (recyclerView2 != null) {
                        i11 = R.id.recycler_view_3;
                        RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_3);
                        if (recyclerView3 != null) {
                            i11 = R.id.tv_desc_1;
                            if (((TextView) j3.q(viewInflate, R.id.tv_desc_1)) != null) {
                                i11 = R.id.tv_tips;
                                if (((TextView) j3.q(viewInflate, R.id.tv_tips)) != null) {
                                    return new r4((ConstraintLayout) viewInflate, materialButton, recyclerView, recyclerView2, recyclerView3);
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
