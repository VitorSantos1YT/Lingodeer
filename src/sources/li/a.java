package li;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.billing.SubscriptionHelpActivity;
import com.lingo.lingoskill.billing.SubscriptionSuccessActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import kotlin.jvm.internal.m;
import qy.b0;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Subscription2Activity f40161b;

    public /* synthetic */ a(Subscription2Activity subscription2Activity, int i11) {
        this.f40160a = i11;
        this.f40161b = subscription2Activity;
    }

    @Override // fz.a
    public final Object invoke() {
        String str;
        int i11 = this.f40160a;
        b0 b0Var = b0.f48488a;
        Subscription2Activity subscription2Activity = this.f40161b;
        switch (i11) {
            case 0:
                int i12 = Subscription2Activity.K;
                String stringExtra = subscription2Activity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            case 1:
                int i13 = Subscription2Activity.K;
                subscription2Activity.finish();
                return b0Var;
            case 2:
                int i14 = Subscription2Activity.K;
                subscription2Activity.finish();
                subscription2Activity.startActivity(new Intent(subscription2Activity, (Class<?>) SubscriptionSuccessActivity.class));
                return b0Var;
            case 3:
                int i15 = Subscription2Activity.K;
                Intent intent = new Intent(subscription2Activity, (Class<?>) SubscriptionHelpActivity.class);
                intent.putExtra(INTENTS.EXTRA_STRING, "onContactUsClick");
                subscription2Activity.startActivity(intent);
                return b0Var;
            case 4:
                int i16 = Subscription2Activity.K;
                int i17 = ((o0) subscription2Activity.l()).f27733a.locateLanguage;
                if (i17 == 1) {
                    str = "https://lingodeer.freshdesk.com/ja-JP/support/home";
                } else if (i17 == 2) {
                    str = "https://lingodeer.freshdesk.com/ko/support/home";
                } else if (i17 != 18) {
                    switch (i17) {
                        case 4:
                            str = "https://lingodeer.freshdesk.com/es-LA/support/home";
                            break;
                        case 5:
                            str = "https://lingodeer.freshdesk.com/fr/support/home";
                            break;
                        case 6:
                            str = "https://lingodeer.freshdesk.com/de/support/home";
                            break;
                        case 7:
                        default:
                            str = "https://lingodeer.freshdesk.com/en/support/home";
                            break;
                        case 8:
                            str = "https://lingodeer.freshdesk.com/pt-BR/support/home";
                            break;
                        case 9:
                            str = "https://lingodeer.freshdesk.com/zh-TW/support/home";
                            break;
                        case 10:
                            str = "https://lingodeer.freshdesk.com/ru-RU/support/home";
                            break;
                    }
                } else {
                    str = "https://lingodeer.freshdesk.com/id/support/home";
                }
                String string = subscription2Activity.getString(R.string.faq);
                m.e(string, "getString(...)");
                Intent intent2 = new Intent(subscription2Activity, (Class<?>) RemoteUrlActivity.class);
                intent2.putExtra(INTENTS.EXTRA_STRING, str);
                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                subscription2Activity.startActivity(intent2);
                return b0Var;
            case 5:
                int i18 = Subscription2Activity.K;
                String url = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/terms-conditions-html");
                String string2 = subscription2Activity.getString(R.string.terms_of_use_login);
                m.e(string2, "getString(...)");
                m.f(url, "url");
                Intent intent3 = new Intent(subscription2Activity, (Class<?>) RemoteUrlActivity.class);
                intent3.putExtra(INTENTS.EXTRA_STRING, url);
                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                subscription2Activity.startActivity(intent3);
                return b0Var;
            case 6:
                int i19 = Subscription2Activity.K;
                String url2 = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/privacypolicy-html");
                String string3 = subscription2Activity.getString(R.string.privacy_policy_login);
                m.e(string3, "getString(...)");
                m.f(url2, "url");
                Intent intent4 = new Intent(subscription2Activity, (Class<?>) RemoteUrlActivity.class);
                intent4.putExtra(INTENTS.EXTRA_STRING, url2);
                intent4.putExtra(INTENTS.EXTRA_STRING_2, string3);
                subscription2Activity.startActivity(intent4);
                return b0Var;
            default:
                Bundle bundle = new Bundle();
                int i21 = Subscription2Activity.K;
                q qVar = subscription2Activity.H;
                if (((String) qVar.getValue()).length() > 0) {
                    bundle.putString("source", (String) qVar.getValue());
                }
                return bundle;
        }
    }
}
