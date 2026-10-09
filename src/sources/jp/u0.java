package jp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends BottomSheetDialogFragment {
    public String S;
    public int T;
    public long U;
    public final n9.q V;
    public u3 W;
    public final Object X;

    public u0() {
        LearnType learnType = LearnType.LEARN;
        this.V = new n9.q(29, false);
        this.X = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new bj.a(this, 19));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_tips_bottom_dialog, viewGroup, false);
        int i11 = R.id.iv_plus;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_plus);
        if (imageView != null) {
            i11 = R.id.iv_reduse;
            ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_reduse);
            if (imageView2 != null) {
                i11 = R.id.tv_prompt;
                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_prompt);
                if (textView != null) {
                    i11 = R.id.web_view;
                    WebView webView = (WebView) j3.q(viewInflate, R.id.web_view);
                    if (webView != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        this.W = new u3(frameLayout, imageView, imageView2, textView, webView, 1);
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
        this.V.f();
        this.W = null;
    }

    @Override // androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        if (this.U > 0) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t0(2, 0, null), 3);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (cf.x.n().hasFindPerfectTime.booleanValue()) {
                return;
            }
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t0(2, 1, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qy.h] */
    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        this.U = System.currentTimeMillis();
        ((ur.a) this.X.getValue()).d("MainCourseInLessonTips");
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onViewCreated(view, bundle);
        this.S = requireArguments().getString(INTENTS.EXTRA_STRING);
        requireArguments().getLong(INTENTS.EXTRA_LONG);
        this.T = requireArguments().getInt(INTENTS.EXTRA_INT);
        u3 u3Var = this.W;
        kotlin.jvm.internal.m.c(u3Var);
        u3Var.f33390b.setVisibility(8);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 0) {
            if (cf.x.n().locateLanguage == 6 && this.T > 8) {
                u3 u3Var2 = this.W;
                kotlin.jvm.internal.m.c(u3Var2);
                u3Var2.f33390b.setVisibility(0);
            } else if (cf.x.n().locateLanguage == 2 && this.T > 6) {
                u3 u3Var3 = this.W;
                kotlin.jvm.internal.m.c(u3Var3);
                u3Var3.f33390b.setVisibility(0);
            } else if (cf.x.n().locateLanguage == 8 && this.T > 10) {
                u3 u3Var4 = this.W;
                kotlin.jvm.internal.m.c(u3Var4);
                u3Var4.f33390b.setVisibility(0);
            }
        } else if (cf.x.n().keyLanguage == 1) {
            if (cf.x.n().locateLanguage == 5 && this.T > 6) {
                u3 u3Var5 = this.W;
                kotlin.jvm.internal.m.c(u3Var5);
                u3Var5.f33390b.setVisibility(0);
            } else if (cf.x.n().locateLanguage == 6 && this.T > 6) {
                u3 u3Var6 = this.W;
                kotlin.jvm.internal.m.c(u3Var6);
                u3Var6.f33390b.setVisibility(0);
            } else if (cf.x.n().locateLanguage == 8 && this.T > 30) {
                u3 u3Var7 = this.W;
                kotlin.jvm.internal.m.c(u3Var7);
                u3Var7.f33390b.setVisibility(0);
            } else if (cf.x.n().locateLanguage == 10 && this.T > 12) {
                u3 u3Var8 = this.W;
                kotlin.jvm.internal.m.c(u3Var8);
                u3Var8.f33390b.setVisibility(0);
            }
        } else if (cf.x.n().keyLanguage == 2) {
            if (cf.x.n().locateLanguage == 5) {
                u3 u3Var9 = this.W;
                kotlin.jvm.internal.m.c(u3Var9);
                u3Var9.f33390b.setVisibility(0);
            } else if (cf.x.n().locateLanguage == 8 && this.T > 35) {
                u3 u3Var10 = this.W;
                kotlin.jvm.internal.m.c(u3Var10);
                u3Var10.f33390b.setVisibility(0);
            } else if (cf.x.n().locateLanguage == 10 && this.T > 13) {
                u3 u3Var11 = this.W;
                kotlin.jvm.internal.m.c(u3Var11);
                u3Var11.f33390b.setVisibility(0);
            }
        } else if (cf.x.n().keyLanguage == 14 && cf.x.n().locateLanguage == 8 && this.T > 4) {
            u3 u3Var12 = this.W;
            kotlin.jvm.internal.m.c(u3Var12);
            u3Var12.f33390b.setVisibility(0);
        }
        u3 u3Var13 = this.W;
        kotlin.jvm.internal.m.c(u3Var13);
        WebSettings settings = ((WebView) u3Var13.f33394f).getSettings();
        kotlin.jvm.internal.m.e(settings, "getSettings(...)");
        if ((getResources().getConfiguration().uiMode & 48) != 16) {
            if (se.k.s("ALGORITHMIC_DARKENING")) {
                va.a.b(settings);
            }
            if (se.k.s("FORCE_DARK")) {
                va.a.c(settings);
            }
        }
        u3 u3Var14 = this.W;
        kotlin.jvm.internal.m.c(u3Var14);
        WebView webView = (WebView) u3Var14.f33394f;
        String str = "<html>\n<body>\n" + this.S + "</body>\n</html>";
        kotlin.jvm.internal.m.e(str, "toString(...)");
        webView.loadDataWithBaseURL(null, oz.x.q0(oz.x.q0(str, "contenteditable=\"true\"", BuildConfig.VERSION_NAME), "<html>", "<html style=\"user-select: none !important;\">"), "text/html", "utf-8", null);
        u3 u3Var15 = this.W;
        kotlin.jvm.internal.m.c(u3Var15);
        bq.z.b((ImageView) u3Var15.f33392d, new hh.x0(settings, 2));
        u3 u3Var16 = this.W;
        kotlin.jvm.internal.m.c(u3Var16);
        bq.z.b((ImageView) u3Var16.f33393e, new hh.x0(settings, 3));
    }
}
