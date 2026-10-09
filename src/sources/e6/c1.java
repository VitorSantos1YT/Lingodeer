package e6;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f24885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i11, Context context, String str) {
        super(0);
        this.f24884a = i11;
        this.f24885b = context;
        this.f24886c = str;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f24884a) {
            case 0:
                return ub.a.P(this.f24885b, this.f24886c);
            case 1:
                return ef.e.v(this.f24885b, this.f24886c);
            default:
                SharedPreferences sharedPreferences = this.f24885b.getSharedPreferences(this.f24886c, 0);
                kotlin.jvm.internal.m.e(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
        }
    }
}
