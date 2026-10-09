package gr;

import android.content.Intent;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.splash.SplashIndexActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashIndexActivity f29747b;

    public /* synthetic */ t(SplashIndexActivity splashIndexActivity, int i11) {
        this.f29746a = i11;
        this.f29747b = splashIndexActivity;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, qy.h] */
    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f29746a;
        b0 b0Var = b0.f48488a;
        SplashIndexActivity splashIndexActivity = this.f29747b;
        switch (i11) {
            case 0:
                int i12 = SplashIndexActivity.M;
                String url = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/terms-conditions-html");
                String string = splashIndexActivity.getString(R.string.terms_of_use_login);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                kotlin.jvm.internal.m.f(url, "url");
                Intent intent = new Intent(splashIndexActivity, (Class<?>) RemoteUrlActivity.class);
                intent.putExtra(INTENTS.EXTRA_STRING, url);
                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                splashIndexActivity.startActivity(intent);
                break;
            case 1:
                int i13 = SplashIndexActivity.M;
                String url2 = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/privacypolicy-html");
                String string2 = splashIndexActivity.getString(R.string.privacy_policy_login);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                kotlin.jvm.internal.m.f(url2, "url");
                Intent intent2 = new Intent(splashIndexActivity, (Class<?>) RemoteUrlActivity.class);
                intent2.putExtra(INTENTS.EXTRA_STRING, url2);
                intent2.putExtra(INTENTS.EXTRA_STRING_2, string2);
                splashIndexActivity.startActivity(intent2);
                break;
            case 2:
                int i14 = SplashIndexActivity.M;
                ff.h.C(ff.h.y(splashIndexActivity, R.string.error));
                break;
            case 3:
                i.c cVar = splashIndexActivity.L;
                Intent intent3 = new Intent(splashIndexActivity, (Class<?>) LoginActivity.class);
                intent3.putExtra(INTENTS.EXTRA_INT, 1);
                cVar.a(intent3);
                break;
            default:
                int i15 = SplashIndexActivity.M;
                hr.d dVar = (hr.d) splashIndexActivity.f22230t.getValue();
                t tVar = new t(splashIndexActivity, 2);
                dVar.getClass();
                e0.B(ViewModelKt.getViewModelScope(dVar), null, null, new gu.b(11, dVar, tVar, (vy.d) null), 3);
                break;
        }
        return b0Var;
    }
}
