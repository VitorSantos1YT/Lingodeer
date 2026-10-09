package tf;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e1;
import androidx.fragment.app.p0;
import com.facebook.FacebookException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class x extends androidx.fragment.app.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f52235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f52236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f52237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.c f52238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f52239e;

    @Override // androidx.fragment.app.k0
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        q().k(i11, i12, intent);
    }

    @Override // androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        w wVar = bundle != null ? (w) bundle.getParcelable("loginClient") : null;
        if (wVar == null) {
            wVar = new w();
            wVar.f52229b = -1;
            if (wVar.f52230c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            wVar.f52230c = this;
        } else {
            if (wVar.f52230c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            wVar.f52230c = this;
        }
        this.f52237c = wVar;
        q().f52231d = new hh.c(this, 23);
        p0 activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f52235a = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f52236b = (t) bundleExtra.getParcelable("request");
        }
        int i11 = 24;
        i.c cVarRegisterForActivityResult = registerForActivityResult(new e1(4), new hh.c(new a0.e(i11, this, activity), i11));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResul…andlerCallback(activity))");
        this.f52238d = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        kotlin.jvm.internal.m.e(viewFindViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.f52239e = viewFindViewById;
        q().f52232e = new o20.i(this, 24);
        return viewInflate;
    }

    @Override // androidx.fragment.app.k0
    public final void onDestroy() {
        e0 e0VarG = q().g();
        if (e0VarG != null) {
            e0VarG.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(R.id.com_facebook_login_fragment_progress_bar) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        if (this.f52235a == null) {
            p0 activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        w wVarQ = q();
        t tVar = this.f52236b;
        t tVar2 = wVarQ.f52234t;
        if ((tVar2 == null || wVarQ.f52229b < 0) && tVar != null) {
            h0 h0Var = tVar.N;
            if (tVar2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = re.b.N;
            if (!ns.o.F() || wVarQ.b()) {
                wVarQ.f52234t = tVar;
                ArrayList arrayList = new ArrayList();
                s sVar = tVar.f52214a;
                h0 h0Var2 = h0.INSTAGRAM;
                if (h0Var != h0Var2) {
                    if (sVar.c()) {
                        arrayList.add(new p(wVarQ));
                    }
                    if (!re.s.f49214o && sVar.f()) {
                        arrayList.add(new r(wVarQ));
                    }
                } else if (!re.s.f49214o && sVar.e()) {
                    arrayList.add(new q(wVarQ));
                }
                if (sVar.a()) {
                    arrayList.add(new c(wVarQ));
                }
                if (sVar.g()) {
                    arrayList.add(new l0(wVarQ));
                }
                if (h0Var != h0Var2 && sVar.b()) {
                    arrayList.add(new l(wVarQ));
                }
                wVarQ.f52228a = (e0[]) arrayList.toArray(new e0[0]);
                wVarQ.l();
            }
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", q());
    }

    public final w q() {
        w wVar = this.f52237c;
        if (wVar != null) {
            return wVar;
        }
        kotlin.jvm.internal.m.n("loginClient");
        throw null;
    }
}
