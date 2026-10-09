package pp;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import jp.p0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements tx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46966a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f46967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f46968c;

    public /* synthetic */ a(Bundle bundle, e eVar) {
        this.f46967b = bundle;
        this.f46968c = eVar;
    }

    @Override // tx.a
    public final void run() {
        switch (this.f46966a) {
            case 0:
                this.f46968c.r(this.f46967b);
                break;
            default:
                e eVar = this.f46968c;
                p0 p0Var = eVar.f46976a;
                Bundle bundle = this.f46967b;
                if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                    eVar.H = bundle.getInt(INTENTS.EXTRA_INDEX) - 1;
                    eVar.Q = bundle.getInt(INTENTS.EXTRA_WRONG_COUNT);
                    Serializable serializable = bundle.getSerializable(INTENTS.EXTRA_MODEL_STR);
                    m.d(serializable, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                    eVar.P = c0.b(serializable);
                    Serializable serializable2 = bundle.getSerializable(INTENTS.EXTRA_KNOW_POINT);
                    m.d(serializable2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Int>");
                    eVar.L = (HashMap) serializable2;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(INTENTS.EXTRA_TEST_MODEL);
                    if (parcelableArrayList != null) {
                        lp.a aVarK = eVar.k();
                        aVarK.f40177a = parcelableArrayList;
                        aVarK.c();
                    }
                    p0Var.E(eVar.i());
                    p0Var.S(eVar.H + 1);
                    p0Var.B();
                    View viewFindViewById = p0Var.B().findViewById(R.id.ll_download);
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(8);
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) p0Var.B().findViewById(R.id.rl_body);
                    if (relativeLayout != null) {
                        LayoutTransition layoutTransition = new LayoutTransition();
                        layoutTransition.setAnimator(2, null);
                        layoutTransition.setAnimator(3, null);
                        layoutTransition.setDuration(0L);
                        relativeLayout.setLayoutTransition(layoutTransition);
                        eVar.t(relativeLayout);
                    }
                } else {
                    if (eVar.f46977b) {
                        qi.a aVar = new qi.a();
                        aVar.f47798a = -1;
                        aVar.f47799b = 0L;
                        aVar.f47800c = 2;
                        hi.a aVarL = eVar.k().l(aVar);
                        if (aVarL != null) {
                            eVar.k().f40177a.add(0, aVar);
                            eVar.k().f40178b.add(0, aVarL);
                        }
                    }
                    eVar.f(eVar.k().f40178b);
                    p0Var.E(eVar.i());
                }
                break;
        }
    }

    public /* synthetic */ a(e eVar, Bundle bundle) {
        this.f46968c = eVar;
        this.f46967b = bundle;
    }
}
