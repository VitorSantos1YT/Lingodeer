package tp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager2.widget.ViewPager2;
import com.lingodeer.R;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52442a = new b(1, hj.f.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityAckCardBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_ack_card, (ViewGroup) null, false);
        int i11 = R.id.back;
        ImageButton imageButton = (ImageButton) j3.q(viewInflate, R.id.back);
        if (imageButton != null) {
            i11 = R.id.btn_show_all;
            AppCompatButton appCompatButton = (AppCompatButton) j3.q(viewInflate, R.id.btn_show_all);
            if (appCompatButton != null) {
                i11 = R.id.btn_show_fav;
                AppCompatButton appCompatButton2 = (AppCompatButton) j3.q(viewInflate, R.id.btn_show_fav);
                if (appCompatButton2 != null) {
                    i11 = R.id.iv_search;
                    ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_search);
                    if (imageView != null) {
                        i11 = R.id.status_bar_view;
                        View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                        if (viewQ != null) {
                            i11 = R.id.title_bar;
                            if (((LinearLayout) j3.q(viewInflate, R.id.title_bar)) != null) {
                                i11 = R.id.tv_all;
                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_all);
                                if (textView != null) {
                                    i11 = R.id.tv_fav;
                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_fav);
                                    if (textView2 != null) {
                                        i11 = R.id.tv_index;
                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_index);
                                        if (textView3 != null) {
                                            i11 = R.id.txt_unit_name_top;
                                            TextView textView4 = (TextView) j3.q(viewInflate, R.id.txt_unit_name_top);
                                            if (textView4 != null) {
                                                i11 = R.id.f22246vp;
                                                ViewPager2 viewPager2 = (ViewPager2) j3.q(viewInflate, R.id.f22246vp);
                                                if (viewPager2 != null) {
                                                    return new hj.f((LinearLayout) viewInflate, imageButton, appCompatButton, appCompatButton2, imageView, viewQ, textView, textView2, textView3, textView4, viewPager2);
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
