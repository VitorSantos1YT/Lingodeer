package xl;

import android.content.Context;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ij.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        m.f(context, "context");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        this.f56105b = x.n().itDefaultLan;
        this.f56106c = 3;
        this.f56107d = "it_skill.zip";
        this.f56108e = BuildConfig.VERSION_NAME;
    }

    @Override // ij.f
    public final String d() {
        return this.f56107d;
    }

    @Override // ij.f
    public final String e() {
        return this.f56108e;
    }

    @Override // ij.f
    public final int f() {
        return this.f56105b;
    }

    @Override // ij.f
    public final int g() {
        return this.f56106c;
    }

    @Override // ij.f
    public final void j(int i11) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        x.n().itDefaultLan = i11;
        x.n().updateEntry("itDefaultLan");
    }
}
