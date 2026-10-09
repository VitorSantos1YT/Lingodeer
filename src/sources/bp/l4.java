package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l4 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l4 f4695a = new l4(3, hj.f4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentOfflineIndexBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_offline_index, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.app_bar;
        View viewQ = fr.j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            hj.d3.a(viewQ);
            i11 = R.id.tv_manage_download;
            TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_manage_download);
            if (textView != null) {
                i11 = R.id.tv_offline_all;
                TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_offline_all);
                if (textView2 != null) {
                    i11 = R.id.tv_offline_all_title;
                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_offline_all_title)) != null) {
                        return new hj.f4((LinearLayout) viewInflate, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
