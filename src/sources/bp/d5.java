package bp;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LawInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d5 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpActivity f4540b;

    public /* synthetic */ d5(SignUpActivity signUpActivity, int i11) {
        this.f4539a = i11;
        this.f4540b = signUpActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f4539a;
        qy.b0 b0Var = qy.b0.f48488a;
        SignUpActivity signUpActivity = this.f4540b;
        switch (i11) {
            case 0:
                int i12 = SignUpActivity.L;
                return (LawInfo) signUpActivity.getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
            case 1:
                int i13 = SignUpActivity.L;
                return Integer.valueOf(signUpActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, 0));
            case 2:
                int i14 = SignUpActivity.L;
                signUpActivity.finish();
                return b0Var;
            case 3:
                int i15 = SignUpActivity.L;
                String url = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/terms-conditions-html");
                String string = signUpActivity.getString(R.string.terms_of_use_login);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                kotlin.jvm.internal.m.f(url, "url");
                Intent intent = new Intent(signUpActivity, (Class<?>) RemoteUrlActivity.class);
                intent.putExtra(INTENTS.EXTRA_STRING, url);
                intent.putExtra(INTENTS.EXTRA_STRING_2, string);
                signUpActivity.startActivity(intent);
                return b0Var;
            case 4:
                int i16 = SignUpActivity.L;
                String url2 = ep.a.g("https://www.", FirebaseRemoteConfig.d().f("end_point"), "/privacypolicy-html");
                String string2 = signUpActivity.getString(R.string.privacy_policy_login);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                kotlin.jvm.internal.m.f(url2, "url");
                Intent intent2 = new Intent(signUpActivity, (Class<?>) RemoteUrlActivity.class);
                intent2.putExtra(INTENTS.EXTRA_STRING, url2);
                intent2.putExtra(INTENTS.EXTRA_STRING_2, string2);
                signUpActivity.startActivity(intent2);
                return b0Var;
            default:
                Bundle bundle = new Bundle();
                int i17 = SignUpActivity.L;
                if (((LawInfo) signUpActivity.H.getValue()) != null) {
                    bundle.putString("audience", "minor");
                } else {
                    bundle.putString("audience", "grownup");
                }
                return bundle;
        }
    }
}
