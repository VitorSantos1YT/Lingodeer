package qp;

import android.view.View;
import android.widget.FrameLayout;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f47818j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(mp.b bVar, long j11, int i11) {
        super(bVar, j11);
        this.f47817i = i11;
        switch (i11) {
            case 1:
                super(bVar, j11);
                break;
            default:
                this.f47818j = com.bumptech.glide.d.v(new dt.k2(this, j11, 2));
                break;
        }
    }

    public static void t(View view, boolean z11) {
        kotlin.jvm.internal.m.f(view, "view");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frame_layout);
        if (z11) {
            frameLayout.setBackgroundResource(R.drawable.bg_word_model_correct);
        } else {
            frameLayout.setBackgroundResource(R.drawable.bg_word_model_wrong);
        }
        frameLayout.setVisibility(0);
    }

    @Override // hi.a
    public boolean a() {
        return true;
    }

    @Override // hi.a
    public String c() {
        return (String) ((qy.q) this.f47818j).getValue();
    }

    @Override // qp.d, hi.a
    public void f() {
        switch (this.f47817i) {
            case 1:
                super.f();
                this.f47818j = null;
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // qp.d, hi.a
    public String h() {
        switch (this.f47817i) {
            case 0:
                return BuildConfig.VERSION_NAME;
            default:
                return super.h();
        }
    }

    public void r(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frame_layout);
        frameLayout.setBackgroundResource(R.drawable.bg_word_model_select);
        frameLayout.setVisibility(8);
    }

    public void s(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frame_layout);
        frameLayout.setBackgroundResource(R.drawable.bg_word_model_select);
        frameLayout.setVisibility(0);
    }
}
