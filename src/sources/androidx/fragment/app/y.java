package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class y extends k0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean L;
    public Dialog N;
    public boolean O;
    public boolean P;
    public boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f1869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1870b = new t(this, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f1871c = new u(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f1872d = new v(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1873e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1874f = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1875t = true;
    public boolean H = true;
    public int K = -1;
    public final w M = new w(this);
    public boolean R = false;

    @Override // androidx.fragment.app.k0
    public final s0 createFragmentContainer() {
        return new x(this, super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.k0
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.M);
        if (this.Q) {
            return;
        }
        this.P = false;
    }

    @Override // androidx.fragment.app.k0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1869a = new Handler();
        this.H = this.mContainerId == 0;
        if (bundle != null) {
            this.f1873e = bundle.getInt("android:style", 0);
            this.f1874f = bundle.getInt("android:theme", 0);
            this.f1875t = bundle.getBoolean("android:cancelable", true);
            this.H = bundle.getBoolean("android:showsDialog", this.H);
            this.K = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.k0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.N;
        if (dialog != null) {
            this.O = true;
            dialog.setOnDismissListener(null);
            this.N.dismiss();
            if (!this.P) {
                onDismiss(this.N);
            }
            this.N = null;
            this.R = false;
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onDetach() {
        super.onDetach();
        if (!this.Q && !this.P) {
            this.P = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.M);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.O) {
            return;
        }
        if (k1.L(3)) {
            toString();
        }
        q(true, true);
    }

    @Override // androidx.fragment.app.k0
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z11 = this.H;
        if (z11 && !this.L) {
            if (z11 && !this.R) {
                try {
                    this.L = true;
                    Dialog dialogR = r(bundle);
                    this.N = dialogR;
                    if (this.H) {
                        t(dialogR, this.f1873e);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.N.setOwnerActivity((Activity) context);
                        }
                        this.N.setCancelable(this.f1875t);
                        this.N.setOnCancelListener(this.f1871c);
                        this.N.setOnDismissListener(this.f1872d);
                        this.R = true;
                    } else {
                        this.N = null;
                    }
                    this.L = false;
                } catch (Throwable th2) {
                    this.L = false;
                    throw th2;
                }
            }
            if (k1.L(2)) {
                toString();
            }
            Dialog dialog = this.N;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (k1.L(2)) {
            toString();
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.k0
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.N;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i11 = this.f1873e;
        if (i11 != 0) {
            bundle.putInt("android:style", i11);
        }
        int i12 = this.f1874f;
        if (i12 != 0) {
            bundle.putInt("android:theme", i12);
        }
        boolean z11 = this.f1875t;
        if (!z11) {
            bundle.putBoolean("android:cancelable", z11);
        }
        boolean z12 = this.H;
        if (!z12) {
            bundle.putBoolean("android:showsDialog", z12);
        }
        int i13 = this.K;
        if (i13 != -1) {
            bundle.putInt("android:backStackId", i13);
        }
    }

    @Override // androidx.fragment.app.k0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.N;
        if (dialog != null) {
            this.O = false;
            dialog.show();
            View decorView = this.N.getWindow().getDecorView();
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            fb.g0.B(decorView, this);
        }
    }

    @Override // androidx.fragment.app.k0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.N;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.N == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.N.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.k0
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.N == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.N.onRestoreInstanceState(bundle2);
    }

    public final void q(boolean z11, boolean z12) {
        if (this.P) {
            return;
        }
        this.P = true;
        this.Q = false;
        Dialog dialog = this.N;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.N.dismiss();
            if (!z12) {
                if (Looper.myLooper() == this.f1869a.getLooper()) {
                    onDismiss(this.N);
                } else {
                    this.f1869a.post(this.f1870b);
                }
            }
        }
        this.O = true;
        if (this.K >= 0) {
            k1 parentFragmentManager = getParentFragmentManager();
            int i11 = this.K;
            parentFragmentManager.getClass();
            if (i11 < 0) {
                throw new IllegalArgumentException(nv.p.j(i11, "Bad id: "));
            }
            parentFragmentManager.x(new i1(parentFragmentManager, i11), z11);
            this.K = -1;
            return;
        }
        k1 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        a aVar = new a(parentFragmentManager2);
        aVar.f1905p = true;
        aVar.l(this);
        if (z11) {
            aVar.i(true, true);
        } else {
            aVar.h();
        }
    }

    public Dialog r(Bundle bundle) {
        if (k1.L(3)) {
            toString();
        }
        return new f.o(requireContext(), this.f1874f);
    }

    public final void s(int i11) {
        if (k1.L(2)) {
            toString();
        }
        this.f1873e = 0;
        if (i11 != 0) {
            this.f1874f = i11;
        }
    }

    public void t(Dialog dialog, int i11) {
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void u(k1 k1Var, String str) {
        this.P = false;
        this.Q = true;
        k1Var.getClass();
        a aVar = new a(k1Var);
        aVar.f1905p = true;
        aVar.d(0, this, str, 1);
        aVar.h();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
