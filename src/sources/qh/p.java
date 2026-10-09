package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.a4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f47780a = new p(3, a4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentGameReviewBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_game_review, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_review;
        AppCompatButton appCompatButton = (AppCompatButton) j3.q(viewInflate, R.id.btn_review);
        if (appCompatButton != null) {
            i11 = R.id.iv_close;
            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_close);
            if (imageView != null) {
                i11 = R.id.ll_download_layout;
                LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_download_layout);
                if (linearLayout != null) {
                    i11 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
                    if (recyclerView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i11 = R.id.tv_loading_progress;
                        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_loading_progress);
                        if (textView != null) {
                            return new a4(constraintLayout, appCompatButton, imageView, linearLayout, recyclerView, constraintLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
