package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o4 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o4 f4749a = new o4(1, hj.g4.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/FragmentOfflineManagerBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_offline_manager, (ViewGroup) null, false);
        int i11 = R.id.app_bar;
        View viewQ = fr.j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            hj.d3.a(viewQ);
            i11 = R.id.tv_lesson_female;
            TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_lesson_female);
            if (textView != null) {
                i11 = R.id.tv_lesson_male;
                TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_lesson_male);
                if (textView2 != null) {
                    i11 = R.id.tv_lesson_offline_title;
                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_lesson_offline_title)) != null) {
                        i11 = R.id.tv_lesson_pic;
                        TextView textView3 = (TextView) fr.j3.q(viewInflate, R.id.tv_lesson_pic);
                        if (textView3 != null) {
                            i11 = R.id.tv_story_female;
                            TextView textView4 = (TextView) fr.j3.q(viewInflate, R.id.tv_story_female);
                            if (textView4 != null) {
                                i11 = R.id.tv_story_male;
                                TextView textView5 = (TextView) fr.j3.q(viewInflate, R.id.tv_story_male);
                                if (textView5 != null) {
                                    i11 = R.id.tv_story_offline_title;
                                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_story_offline_title)) != null) {
                                        i11 = R.id.tv_story_pic;
                                        TextView textView6 = (TextView) fr.j3.q(viewInflate, R.id.tv_story_pic);
                                        if (textView6 != null) {
                                            return new hj.g4((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6);
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
