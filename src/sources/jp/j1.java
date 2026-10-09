package jp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import bp.i3;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends BottomSheetDialogFragment {
    public String S = BuildConfig.VERSION_NAME;
    public String T = BuildConfig.VERSION_NAME;
    public e3 U;

    @Override // androidx.fragment.app.k0
    public final void onActivityCreated(Bundle bundle) {
        String string;
        String string2;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        String str = BuildConfig.VERSION_NAME;
        if (arguments == null || (string = arguments.getString(INTENTS.EXTRA_STRING)) == null) {
            string = BuildConfig.VERSION_NAME;
        }
        this.S = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString(INTENTS.EXTRA_STRING_2)) != null) {
            str = string2;
        }
        this.T = str;
        if (this.S.length() == 0) {
            v();
        }
        View viewFindViewById = requireView().findViewById(R.id.toolbar);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setTitle(this.T);
        androidx.fragment.app.p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((l.m) p0VarRequireActivity).setSupportActionBar(toolbar);
        androidx.fragment.app.p0 p0VarRequireActivity2 = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        l.a supportActionBar = ((l.m) p0VarRequireActivity2).getSupportActionBar();
        if (supportActionBar != null) {
            hh.p0.A(supportActionBar, true, R.drawable.ic_clear_black);
        }
        toolbar.setNavigationOnClickListener(new aj.b(this, 13));
        e3 e3Var = this.U;
        kotlin.jvm.internal.m.c(e3Var);
        ((LollipopFixedWebView) e3Var.f32525d).getSettings().setJavaScriptEnabled(true);
        e3 e3Var2 = this.U;
        kotlin.jvm.internal.m.c(e3Var2);
        ((LollipopFixedWebView) e3Var2.f32525d).getSettings().setDomStorageEnabled(true);
        e3 e3Var3 = this.U;
        kotlin.jvm.internal.m.c(e3Var3);
        ((LollipopFixedWebView) e3Var3.f32525d).setWebViewClient(new i3(this, 1));
        e3 e3Var4 = this.U;
        kotlin.jvm.internal.m.c(e3Var4);
        ((LollipopFixedWebView) e3Var4.f32525d).setWebChromeClient(new WebChromeClient());
        e3 e3Var5 = this.U;
        kotlin.jvm.internal.m.c(e3Var5);
        ((LollipopFixedWebView) e3Var5.f32525d).loadUrl(this.S);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.k0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.m.f(menu, "menu");
        kotlin.jvm.internal.m.f(inflater, "inflater");
        inflater.inflate(R.menu.menu_nevigation_webview, menu);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.dialog_fragment_remote_url, viewGroup, false);
        int i11 = R.id.app_bar;
        if (((AppBarLayout) j3.q(viewInflate, R.id.app_bar)) != null) {
            i11 = R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
            if (progressBar != null) {
                i11 = R.id.toolbar;
                if (((Toolbar) j3.q(viewInflate, R.id.toolbar)) != null) {
                    i11 = R.id.web_view;
                    LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) j3.q(viewInflate, R.id.web_view);
                    if (lollipopFixedWebView != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        this.U = new e3(frameLayout, progressBar, lollipopFixedWebView, 0);
                        kotlin.jvm.internal.m.e(frameLayout, "getRoot(...)");
                        return frameLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.U = null;
    }

    @Override // androidx.fragment.app.k0
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.m.f(item, "item");
        if (item.getItemId() == R.id.item_open_url) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.S));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
