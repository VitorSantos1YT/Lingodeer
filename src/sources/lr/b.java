package lr;

import android.os.Bundle;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitchLanguageActivity f40231b;

    public /* synthetic */ b(SwitchLanguageActivity switchLanguageActivity, int i11) {
        this.f40230a = i11;
        this.f40231b = switchLanguageActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f40230a;
        SwitchLanguageActivity switchLanguageActivity = this.f40231b;
        switch (i11) {
            case 0:
                int i12 = SwitchLanguageActivity.M;
                return (LanguageItem) switchLanguageActivity.getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
            case 1:
                int i13 = SwitchLanguageActivity.M;
                return Boolean.valueOf(switchLanguageActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, true));
            case 2:
                int i14 = SwitchLanguageActivity.M;
                String stringExtra = switchLanguageActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            case 3:
                int i15 = SwitchLanguageActivity.M;
                LanguageItem languageItem = (LanguageItem) switchLanguageActivity.f22232t.getValue();
                Boolean bool = (Boolean) switchLanguageActivity.H.getValue();
                bool.getClass();
                return new a20.a(2, l.l0(new Object[]{languageItem, bool, (String) switchLanguageActivity.K.getValue()}));
            default:
                int i16 = SwitchLanguageActivity.M;
                Bundle bundle = new Bundle();
                bundle.putString("source", (String) switchLanguageActivity.K.getValue());
                return bundle;
        }
    }
}
