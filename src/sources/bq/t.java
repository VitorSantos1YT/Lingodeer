package bq;

import android.content.DialogInterface;
import android.widget.RelativeLayout;
import com.lingodeer.R;
import com.youth.banner.Banner;
import hj.x3;
import jp.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4985b;

    public /* synthetic */ t(Object obj, int i11) {
        this.f4984a = i11;
        this.f4985b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4984a) {
            case 0:
                ((Banner) this.f4985b).destroy();
                break;
            default:
                p0 p0Var = (p0) this.f4985b;
                ii.a aVar = p0Var.N;
                if (aVar != null) {
                    ((mp.a) aVar).v();
                    if (p0Var.f36398d != null) {
                        ta.a aVar2 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar2);
                        RelativeLayout rootParent = ((x3) aVar2).f33579l;
                        kotlin.jvm.internal.m.e(rootParent, "rootParent");
                        int i11 = p0Var.r().themeStyle;
                        if ((rootParent.getResources().getConfiguration().uiMode & 48) == 16) {
                            if (i11 == 0) {
                                rootParent.setBackgroundResource(R.color.color_F6F6F6);
                                break;
                            } else if (i11 == 1) {
                                rootParent.setBackgroundResource(R.color.color_F7F0E0);
                                break;
                            } else if (i11 == 2) {
                                rootParent.setBackgroundResource(R.color.color_CBF0CF);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
