package pi;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ay.x;
import bp.g4;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fr.j3;
import hj.j6;
import kotlin.jvm.internal.m;
import lf.i0;
import n9.q;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends BottomSheetDialogFragment {
    public boolean T;
    public th.e V;
    public j6 W;
    public long S = -1;
    public final q U = new q(29, false);

    @Override // androidx.fragment.app.k0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.S = requireArguments().getLong(INTENTS.EXTRA_LONG);
        this.T = requireArguments().getBoolean(INTENTS.EXTRA_BOOLEAN);
        Context contextRequireContext = requireContext();
        m.e(contextRequireContext, "requireContext(...)");
        this.V = new th.e(contextRequireContext);
        j.a(new x(new g4(this, 11)).k(ky.e.f38937b).g(px.b.a()).h(new q(this, 8), vx.b.f54316e), this.U);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.popup_character_anim, viewGroup, false);
        int i11 = R.id.iv_audio;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_audio);
        if (imageView != null) {
            i11 = R.id.iv_close;
            ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_close);
            if (imageView2 != null) {
                i11 = R.id.iv_replay;
                ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_replay);
                if (imageView3 != null) {
                    i11 = R.id.lottie_anim;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) j3.q(viewInflate, R.id.lottie_anim);
                    if (lottieAnimationView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i11 = R.id.tv_char;
                        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_char);
                        if (textView != null) {
                            i11 = R.id.tv_explains;
                            TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_explains);
                            if (textView2 != null) {
                                this.W = new j6(constraintLayout, imageView, imageView2, imageView3, lottieAnimationView, constraintLayout, textView, textView2);
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.W = null;
        this.U.f();
        th.e eVar = this.V;
        if (eVar != null) {
            eVar.b();
        } else {
            m.n("audioPlayer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onStart() {
        super.onStart();
        if (this.N != null) {
            requireView().post(new i0(this, 7));
        }
    }
}
