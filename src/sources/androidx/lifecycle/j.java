package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b7.e0;
import cf.x;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.base.AboutLingodeerActivity;
import com.lingo.lingoskill.ui.base.MainActivity;
import com.lingo.lingoskill.ui.base.MoreLingodeerActivity;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.m;
import qy.b0;
import x1.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2095a;

    public /* synthetic */ j(int i11) {
        this.f2095a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f2095a) {
            case 0:
                return CreationExtras.Empty.INSTANCE;
            case 1:
                return LocalLifecycleOwnerKt.LocalLifecycleOwner$lambda$3$lambda$2();
            case 2:
                return LocalViewModelStoreOwner.LocalViewModelStoreOwner$lambda$0();
            case 3:
                Bundle bundleE = e0.e("type", "ad_last_1h");
                String str = new SimpleDateFormat("HH").format(new Date(System.currentTimeMillis()));
                m.e(str, "format(...)");
                bundleE.putString("time", String.valueOf(Long.parseLong(str)));
                return bundleE;
            case 4:
                Bundle bundleE2 = e0.e("type", "is_ld_worth_it");
                String str2 = new SimpleDateFormat("HH").format(new Date(System.currentTimeMillis()));
                m.e(str2, "format(...)");
                bundleE2.putString("time", String.valueOf(Long.parseLong(str2)));
                return bundleE2;
            case 5:
                return e0.e("type", "all");
            case 6:
                return e0.e("type", "video");
            case 7:
                u uVar = new u(new au.a(28));
                uVar.e();
                return uVar;
            case 8:
                return new dk.a();
            case 9:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().ruMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 10:
                int i11 = AboutLingodeerActivity.f22038t;
                return e0.e("type", "twitter");
            case 11:
                int i12 = AboutLingodeerActivity.f22038t;
                return e0.e("type", "blog");
            case 12:
                int i13 = AboutLingodeerActivity.f22038t;
                return e0.e("type", "rate us");
            case 13:
                int i14 = AboutLingodeerActivity.f22038t;
                return e0.e("source", "me_about");
            case 14:
                int i15 = AboutLingodeerActivity.f22038t;
                return e0.e("type", "what's new");
            case 15:
                int i16 = AboutLingodeerActivity.f22038t;
                return e0.e("type", "reddit");
            case 16:
                int i17 = AboutLingodeerActivity.f22038t;
                return e0.e("type", "instagram");
            case 17:
                int i18 = AboutLingodeerActivity.f22038t;
                return e0.e("type", "method");
            case 18:
                return e0.e("status", "success");
            case 19:
                return e0.e("status", "fail");
            case 20:
                Bundle bundle2 = new Bundle();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i19 = x.n().themeValue;
                if (i19 == 0) {
                    bundle2.putString("type", "light");
                } else if (i19 == 1) {
                    bundle2.putString("type", "dark");
                } else if (i19 == 2) {
                    bundle2.putString("type", "auto");
                }
                return bundle2;
            case 21:
                return e0.e("source", "manage_account");
            case 22:
                return e0.e("status", "fail");
            case 23:
                return e0.e("status", "success");
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return e0.e("status", "fail");
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i21 = MainActivity.U;
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                int i22 = MoreLingodeerActivity.P;
                return e0.e("source", "learn_topbar_more");
            case 27:
                int i23 = MoreLingodeerActivity.P;
                return e0.e("source", "learn_topbar_more");
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                int i24 = NewsFeedActivity.R;
                return e0.e("source", "subscribe_service");
            default:
                return e0.e("source", "lesson_billing_popup");
        }
    }
}
