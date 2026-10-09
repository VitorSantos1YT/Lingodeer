package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h4 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4 f4622a = new h4(3, hj.y3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentDownloadMaterialsBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_download_materials, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_download;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_download);
        if (materialButton != null) {
            i11 = R.id.iv_progress_deer;
            ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_progress_deer);
            if (imageView != null) {
                i11 = R.id.pb_dl_progress;
                ProgressBar progressBar = (ProgressBar) fr.j3.q(viewInflate, R.id.pb_dl_progress);
                if (progressBar != null) {
                    i11 = R.id.tv_percent;
                    TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_percent);
                    if (textView != null) {
                        return new hj.y3((LinearLayout) viewInflate, materialButton, imageView, progressBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException(scNRoQgKSYX.vyRLIUIBnAfVnJ.concat(viewInflate.getResources().getResourceName(i11)));
    }
}
