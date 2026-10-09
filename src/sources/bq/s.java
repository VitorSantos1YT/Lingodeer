package bq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4983b;

    public /* synthetic */ s(Context context, int i11) {
        this.f4982a = i11;
        this.f4983b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f4982a;
        Context context = this.f4983b;
        switch (i11) {
            case 0:
                int[] iArr = r.f4959a;
                m.C(context, "lesson_billing_popup");
                break;
            case 1:
                int[] iArr2 = r.f4959a;
                m.D(context, BuildConfig.VERSION_NAME);
                xt.b.d().c("jxz_click_ad", new androidx.lifecycle.j(29));
                break;
            case 2:
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication);
                intent.setData(Uri.fromParts("package", lingoSkillApplication.getPackageName(), null));
                ((Activity) context).startActivity(intent);
                break;
            default:
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication2);
                intent2.setData(Uri.fromParts("package", lingoSkillApplication2.getPackageName(), null));
                ((Activity) context).startActivity(intent2);
                break;
        }
    }
}
