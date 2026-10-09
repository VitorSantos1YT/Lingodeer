package jp;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.u3;
import java.util.Locale;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends BottomSheetDialogFragment {
    public u3 S;
    public final n9.q T = new n9.q(29, false);
    public ar.f U;

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_choose_en_lan_dialog, viewGroup, false);
        int i11 = R.id.btn_cancel;
        Button button = (Button) j3.q(viewInflate, R.id.btn_cancel);
        if (button != null) {
            i11 = R.id.btn_confirm;
            MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_confirm);
            if (materialButton != null) {
                i11 = R.id.tv_quit_subtitle;
                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_quit_subtitle);
                if (textView != null) {
                    i11 = R.id.tv_quit_title;
                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_quit_title);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.S = new u3(constraintLayout, button, materialButton, textView, textView2, 0);
                        kotlin.jvm.internal.m.e(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.T.f();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onStart() {
        super.onStart();
        if (this.N != null) {
            requireView().post(new b2.a(this, 25));
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        kotlin.jvm.internal.m.f(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(INTENTS.EXTRA_STRING)) == null) {
            string = BuildConfig.VERSION_NAME;
        }
        if (string.length() > 0) {
            Locale locale = string.equals("zh") ? Locale.TRADITIONAL_CHINESE : new Locale(string);
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            kotlin.jvm.internal.m.c(locale);
            Configuration configuration = contextRequireContext.getResources().getConfiguration();
            kotlin.jvm.internal.m.e(configuration, "getConfiguration(...)");
            Configuration configuration2 = new Configuration(configuration);
            configuration2.setLocale(locale);
            Resources resources = contextRequireContext.createConfigurationContext(configuration2).getResources();
            kotlin.jvm.internal.m.e(resources, "getResources(...)");
            u3 u3Var = this.S;
            kotlin.jvm.internal.m.c(u3Var);
            ((TextView) u3Var.f33394f).setText(resources.getString(R.string.choose_lan_no_translate_title));
            u3 u3Var2 = this.S;
            kotlin.jvm.internal.m.c(u3Var2);
            u3Var2.f33390b.setText(resources.getString(R.string.choose_lan_no_translate_subtitle));
            u3 u3Var3 = this.S;
            kotlin.jvm.internal.m.c(u3Var3);
            ((MaterialButton) u3Var3.f33393e).setText(resources.getString(R.string.choose_lan_no_translate_confirm));
            u3 u3Var4 = this.S;
            kotlin.jvm.internal.m.c(u3Var4);
            ((Button) u3Var4.f33392d).setText(resources.getString(R.string.cancel));
        }
        u3 u3Var5 = this.S;
        kotlin.jvm.internal.m.c(u3Var5);
        final int i11 = 0;
        ((Button) u3Var5.f33392d).setOnClickListener(new View.OnClickListener(this) { // from class: jp.x0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f36551b;

            {
                this.f36551b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                y0 y0Var = this.f36551b;
                switch (i12) {
                    case 0:
                        ar.f fVar = y0Var.U;
                        if (fVar != null) {
                            ((y0) fVar.f2849e).v();
                        }
                        break;
                    default:
                        ar.f fVar2 = y0Var.U;
                        if (fVar2 != null) {
                            Context context = ((ar.g) fVar2.f2848d).f2852c;
                            int i13 = SwitchLanguageActivity.M;
                            int i14 = fVar2.f2846b;
                            int i15 = fVar2.f2847c;
                            int[] iArr = bq.r.f4959a;
                            context.startActivity(tw.c.p(context, new LanguageItem(i14, i15, bq.m.s(context, i14)), (8 & 4) != 0, OYAvlbfUyD.xZnwOYMncSkzgRT));
                        }
                        break;
                }
            }
        });
        u3 u3Var6 = this.S;
        kotlin.jvm.internal.m.c(u3Var6);
        final int i12 = 1;
        ((MaterialButton) u3Var6.f33393e).setOnClickListener(new View.OnClickListener(this) { // from class: jp.x0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f36551b;

            {
                this.f36551b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                y0 y0Var = this.f36551b;
                switch (i13) {
                    case 0:
                        ar.f fVar = y0Var.U;
                        if (fVar != null) {
                            ((y0) fVar.f2849e).v();
                        }
                        break;
                    default:
                        ar.f fVar2 = y0Var.U;
                        if (fVar2 != null) {
                            Context context = ((ar.g) fVar2.f2848d).f2852c;
                            int i14 = SwitchLanguageActivity.M;
                            int i15 = fVar2.f2846b;
                            int i16 = fVar2.f2847c;
                            int[] iArr = bq.r.f4959a;
                            context.startActivity(tw.c.p(context, new LanguageItem(i15, i16, bq.m.s(context, i15)), (8 & 4) != 0, OYAvlbfUyD.xZnwOYMncSkzgRT));
                        }
                        break;
                }
            }
        });
    }
}
