package lf;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.fragment.app.y {
    public Dialog S;

    @Override // androidx.fragment.app.k0, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.m.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.S instanceof p1) && isResumed()) {
            Dialog dialog = this.S;
            kotlin.jvm.internal.m.d(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((p1) dialog).d();
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        androidx.fragment.app.p0 activity;
        String string;
        p1 p1Var;
        super.onCreate(bundle);
        if (this.S == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            kotlin.jvm.internal.m.e(intent, "intent");
            Bundle bundleM = c1.m(intent);
            final int i11 = 0;
            if (bundleM != null ? bundleM.getBoolean("is_fallback", false) : false) {
                string = bundleM != null ? bundleM.getString("url") : null;
                if (j1.y(string)) {
                    re.s sVar = re.s.f49201a;
                    activity.finish();
                    return;
                }
                final int i12 = 1;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{re.s.b()}, 1));
                int i13 = t.Q;
                kotlin.jvm.internal.m.d(string, "null cannot be cast to non-null type kotlin.String");
                p1.b(activity);
                v0.m();
                int i14 = p1.O;
                if (i14 == 0) {
                    v0.m();
                    i14 = p1.O;
                }
                t tVar = new t(activity, i14);
                tVar.f40090a = string;
                tVar.f40091b = str;
                tVar.f40092c = new l1(this) { // from class: lf.o

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p f40081b;

                    {
                        this.f40081b = this;
                    }

                    @Override // lf.l1
                    public final void b(Bundle bundle2, FacebookException facebookException) {
                        switch (i12) {
                            case 0:
                                androidx.fragment.app.p0 activity2 = this.f40081b.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    kotlin.jvm.internal.m.e(intent2, "fragmentActivity.intent");
                                    activity2.setResult(facebookException == null ? -1 : 0, c1.f(intent2, bundle2, facebookException));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                p this$0 = this.f40081b;
                                kotlin.jvm.internal.m.f(this$0, "this$0");
                                androidx.fragment.app.p0 activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent3.putExtras(bundle2);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                p1Var = tVar;
            } else {
                String string2 = bundleM != null ? bundleM.getString("action") : null;
                Bundle bundle2 = bundleM != null ? bundleM.getBundle("params") : null;
                if (j1.y(string2)) {
                    re.s sVar2 = re.s.f49201a;
                    activity.finish();
                    return;
                }
                kotlin.jvm.internal.m.d(string2, "null cannot be cast to non-null type kotlin.String");
                Date date = re.b.N;
                re.b bVarX = ns.o.x();
                string = ns.o.F() ? null : re.s.b();
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                l1 l1Var = new l1(this) { // from class: lf.o

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p f40081b;

                    {
                        this.f40081b = this;
                    }

                    @Override // lf.l1
                    public final void b(Bundle bundle3, FacebookException facebookException) {
                        switch (i11) {
                            case 0:
                                androidx.fragment.app.p0 activity2 = this.f40081b.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    kotlin.jvm.internal.m.e(intent2, "fragmentActivity.intent");
                                    activity2.setResult(facebookException == null ? -1 : 0, c1.f(intent2, bundle3, facebookException));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                p this$0 = this.f40081b;
                                kotlin.jvm.internal.m.f(this$0, "this$0");
                                androidx.fragment.app.p0 activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle3 == null) {
                                        bundle3 = new Bundle();
                                    }
                                    intent3.putExtras(bundle3);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (bVarX != null) {
                    bundle2.putString("app_id", bVarX.H);
                    bundle2.putString("access_token", bVarX.f49119e);
                } else {
                    bundle2.putString("app_id", string);
                }
                p1.b(activity);
                p1Var = new p1(activity, string2, bundle2, tf.h0.FACEBOOK, l1Var);
            }
            this.S = p1Var;
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        Dialog dialog = this.N;
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.S;
        if (dialog instanceof p1) {
            kotlin.jvm.internal.m.d(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((p1) dialog).d();
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        Dialog dialog = this.S;
        if (dialog != null) {
            return dialog;
        }
        androidx.fragment.app.p0 activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            kotlin.jvm.internal.m.e(intent, "fragmentActivity.intent");
            activity.setResult(-1, c1.f(intent, null, null));
            activity.finish();
        }
        this.H = false;
        return super.r(bundle);
    }
}
