package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.x1;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f59246a = new h(3, x1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnPinyinTestModel02Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_pinyin_test_model_02, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_bottom;
        FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.flex_bottom);
        if (flexboxLayout != null) {
            i11 = R.id.flex_top;
            FlexboxLayout flexboxLayout2 = (FlexboxLayout) j3.q(viewInflate, R.id.flex_top);
            if (flexboxLayout2 != null) {
                i11 = R.id.include_deer_audio;
                View viewQ = j3.q(viewInflate, R.id.include_deer_audio);
                if (viewQ != null) {
                    return new x1((LinearLayout) viewInflate, flexboxLayout, flexboxLayout2, b6.a(viewQ));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
