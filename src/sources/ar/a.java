package ar;

import android.os.Bundle;
import b7.e0;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;
import com.lingo.main.ui.MainComposeActivity;
import j9.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.m;
import l1.t;
import o3.w;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2831b;

    public /* synthetic */ a(String str, int i11) {
        this.f2830a = i11;
        this.f2831b = str;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f2830a;
        String str = aYZzTH.zPgYMlSmwCYHA;
        String str2 = this.f2831b;
        switch (i11) {
            case 0:
                Bundle bundleE = e0.e(str, str2);
                String str3 = new SimpleDateFormat("HH").format(new Date(System.currentTimeMillis()));
                m.e(str3, "format(...)");
                bundleE.putString("time", String.valueOf(Long.parseLong(str3)));
                return bundleE;
            case 1:
                int i12 = LoginActivity.Q;
                Bundle bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString("source", str2);
                }
                return bundle;
            case 2:
                Bundle bundle2 = new Bundle();
                if (str2.length() > 0) {
                    bundle2.putString("source", str2);
                }
                return bundle2;
            case 3:
                return e0.e("id", str2);
            case 4:
                return e0.e("source", str2);
            case 5:
                int i13 = MainComposeActivity.U;
                return e0.e(str, str2);
            case 6:
                Bundle bundleE2 = e0.e(str, str2);
                String str4 = new SimpleDateFormat("HH").format(new Date(System.currentTimeMillis()));
                m.e(str4, "format(...)");
                bundleE2.putString("time", String.valueOf(Long.parseLong(str4)));
                return bundleE2;
            case 7:
                int i14 = AdVideoPromptActivity.V;
                return e0.e("id", str2);
            case 8:
                return e0.e("id", str2);
            case 9:
                return new o(str2);
            case 10:
                return com.bumptech.glide.d.G(str2);
            case 11:
                int length = str2.length();
                return t.B(new w(str2, j3.t.b(length, length), 4));
            case 12:
                Bundle bundleE3 = e0.e("status", "success");
                if (str2.length() > 0) {
                    bundleE3.putString(str, str2);
                }
                return bundleE3;
            default:
                return e0.e("source", str2);
        }
    }
}
