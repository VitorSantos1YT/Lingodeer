package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.e3;
import hj.s3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f36465a = new e0(3, s3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentAudioLessonIndexBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_audio_lesson_index, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.include_audiolesson_card;
        View viewQ = j3.q(viewInflate, R.id.include_audiolesson_card);
        if (viewQ != null) {
            hj.j jVarA = hj.j.a(viewQ);
            i11 = R.id.iv_clear;
            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_clear);
            if (imageView != null) {
                i11 = R.id.iv_deer;
                if (((ImageView) j3.q(viewInflate, R.id.iv_deer)) != null) {
                    i11 = R.id.ll_download;
                    View viewQ2 = j3.q(viewInflate, R.id.ll_download);
                    if (viewQ2 != null) {
                        e3 e3VarA = e3.a(viewQ2);
                        i11 = R.id.recycler_lesson;
                        RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_lesson);
                        if (recyclerView != null) {
                            i11 = R.id.status_bar_view;
                            View viewQ3 = j3.q(viewInflate, R.id.status_bar_view);
                            if (viewQ3 != null) {
                                i11 = R.id.tv_unit_name;
                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_unit_name);
                                if (textView != null) {
                                    return new s3((ConstraintLayout) viewInflate, jVarA, imageView, e3VarA, recyclerView, viewQ3, textView);
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
