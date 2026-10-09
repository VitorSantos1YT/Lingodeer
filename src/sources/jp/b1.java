package jp;

import com.lingo.lingoskill.ui.learn.DebugTestActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DebugTestActivity f36453b;

    public /* synthetic */ b1(DebugTestActivity debugTestActivity, int i11) {
        this.f36452a = i11;
        this.f36453b = debugTestActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f36452a;
        qy.b0 b0Var = qy.b0.f48488a;
        DebugTestActivity debugTestActivity = this.f36453b;
        switch (i11) {
            case 0:
                int i12 = DebugTestActivity.H;
                String stringExtra = debugTestActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            case 1:
                int i13 = DebugTestActivity.H;
                debugTestActivity.finish();
                return b0Var;
            default:
                int i14 = DebugTestActivity.H;
                debugTestActivity.finish();
                return b0Var;
        }
    }
}
